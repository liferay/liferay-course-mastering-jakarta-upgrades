package com.clarityvisionsolutions.insurance.benefits.tracker.internal.search;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;

@Component(
        property = "indexer.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan",
        service = ModelDocumentContributor.class
)
public class InsurancePlanModelDocumentContributor implements ModelDocumentContributor<InsurancePlan> {
    @Override
    public void contribute(Document document, InsurancePlan baseModel) {

        StringBuilder sb = new StringBuilder();

        sb.append(baseModel.getPlanName());
        sb.append(" offered by ");
        sb.append(baseModel.getProviderName());

        String content = sb.toString();

        document.addText(
                Field.CONTENT, content);
        document.addText(Field.DESCRIPTION, content);
        document.addText(Field.TITLE, content);

        document.addKeyword("titleKeyword", content, true);
    }
}
