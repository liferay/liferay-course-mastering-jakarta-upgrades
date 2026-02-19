package com.clarityvisionsolutions.insurance.benefits.tracker.internal.search;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component(
        property = "indexer.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment",
        service = ModelDocumentContributor.class
)
public class PlanEnrollmentModelDocumentContributor implements ModelDocumentContributor<PlanEnrollment> {
    @Override
    public void contribute(Document document, PlanEnrollment baseModel) {
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

        InsurancePlan plan = _insurancePlanLocalService.fetchInsurancePlan(baseModel.getInsurancePlanId());

        StringBuilder sb = new StringBuilder();

        if (Validator.isNotNull(plan)) {
            sb.append("Enrollment for ");
            sb.append(baseModel.getMemberUserName());
            sb.append(" into plan ");
            sb.append(plan.getPlanName());
            sb.append(" offered by ");
            sb.append(plan.getProviderName());
            sb.append(" beginning ");
            sb.append(dateFormatter.format(baseModel.getStartDate()));
            sb.append(" and ending ");
            sb.append(dateFormatter.format(baseModel.getEndDate()));
        } else {
            sb.append("Plan Enrollment for ");
            sb.append(baseModel.getMemberUserName());
            sb.append(" beginning ");
            sb.append(dateFormatter.format(baseModel.getStartDate()));
            sb.append(" and ending ");
            sb.append(dateFormatter.format(baseModel.getEndDate()));
        }

        String content = sb.toString();

        _log.info("Have content: " + content);

        document.addText(
                Field.CONTENT, content);

        document.addText(Field.DESCRIPTION, "Plan Enrollment for " + baseModel.getMemberUserName());
        document.addText(Field.TITLE, "Plan Enrollment for " + baseModel.getMemberUserName());

        document.addKeyword("titleKeyword", "Plan Enrollment for " + baseModel.getMemberUserName(), true);

    }

    @Reference
    private InsurancePlanLocalService _insurancePlanLocalService;

    private static final Log _log = LogFactoryUtil.getLog(PlanEnrollmentModelDocumentContributor.class);
}
