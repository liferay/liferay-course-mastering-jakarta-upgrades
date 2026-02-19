package com.clarityvisionsolutions.insurance.benefits.tracker.internal.search;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.liferay.petra.string.CharPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component(
        property = "indexer.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage",
        service = ModelDocumentContributor.class
)
public class BenefitUsageModelDocumentContributor implements ModelDocumentContributor<BenefitUsage> {
    @Override
    public void contribute(Document document, BenefitUsage baseModel) {
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder sb = new StringBuilder();

        PlanEnrollment enrollment = _planEnrollmentLocalService.fetchPlanEnrollment(baseModel.getPlanEnrollmentId());
        InsurancePlan plan = null;
        if (enrollment != null) {
            plan = _insurancePlanLocalService.fetchInsurancePlan(enrollment.getInsurancePlanId());
        }

        // okay, so let's build out the content for the benefit usage.
        sb.append(enrollment.getMemberUserName());
        sb.append(" spent $");
        sb.append(baseModel.getAmountUsedCents() / 100);
        sb.append('.');
        long cents = baseModel.getAmountUsedCents() % 100;
        if (cents < 10) {
            sb.append('0');
        }
        sb.append(cents);
        String title = sb.toString();

        sb.append(" on ");
        sb.append(dateFormatter.format(baseModel.getServiceDate()));
        sb.append(" for ");
        sb.append(baseModel.getBenefitType());
        if (plan != null) {
            sb.append(" for ");
            sb.append(plan.getPlanName());
            sb.append(" offered by ");
            sb.append(plan.getProviderName());
        }

        String content = sb.toString();

        document.addText(
                Field.CONTENT, content);
        document.addText(Field.DESCRIPTION, title);
        document.addText(Field.TITLE, title);

        document.addKeyword("titleKeyword", title, true);
    }

    @Reference
    private PlanEnrollmentLocalService _planEnrollmentLocalService;
    @Reference
    private InsurancePlanLocalService _insurancePlanLocalService;
}
