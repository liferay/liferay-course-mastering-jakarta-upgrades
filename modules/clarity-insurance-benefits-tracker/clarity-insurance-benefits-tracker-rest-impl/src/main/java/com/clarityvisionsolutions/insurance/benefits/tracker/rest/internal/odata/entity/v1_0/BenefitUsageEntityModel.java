package com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.odata.entity.v1_0;

import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.odata.entity.*;

import java.util.Map;

public class BenefitUsageEntityModel implements EntityModel {

    public BenefitUsageEntityModel() {
        _entityFieldsMap = EntityModel.toEntityFieldsMap(
                new DateTimeEntityField("dateCreated", locale -> Field.getSortableFieldName(Field.CREATE_DATE),
                        locale -> Field.CREATE_DATE),
                new DateTimeEntityField("dateModified", locale -> Field.getSortableFieldName(Field.MODIFIED_DATE),
                        locale -> Field.MODIFIED_DATE),
                new IntegerEntityField("userId", locale -> Field.USER_ID),
                new StringEntityField("name", locale -> Field.getSortableFieldName(Field.NAME))
        );
    }

    @Override
    public Map<String, EntityField> getEntityFieldsMap() {
        return _entityFieldsMap;
    }

    private final Map<String, EntityField> _entityFieldsMap;
}
