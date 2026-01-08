/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * <p>
 * This class is a wrapper for {@link BenefitUsage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsage
 * @generated
 */
public class BenefitUsageWrapper
	extends BaseModelWrapper<BenefitUsage>
	implements BenefitUsage, ModelWrapper<BenefitUsage> {

	public BenefitUsageWrapper(BenefitUsage benefitUsage) {
		super(benefitUsage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("ctCollectionId", getCtCollectionId());
		attributes.put("uuid", getUuid());
		attributes.put("externalReferenceCode", getExternalReferenceCode());
		attributes.put("benefitUsageId", getBenefitUsageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("planEnrollmentId", getPlanEnrollmentId());
		attributes.put("benefitType", getBenefitType());
		attributes.put("amountUsedCents", getAmountUsedCents());
		attributes.put("serviceDate", getServiceDate());
		attributes.put("reference", getReference());
		attributes.put("notes", getNotes());
		attributes.put("sourceType", getSourceType());
		attributes.put("sourceReference", getSourceReference());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long ctCollectionId = (Long)attributes.get("ctCollectionId");

		if (ctCollectionId != null) {
			setCtCollectionId(ctCollectionId);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String externalReferenceCode = (String)attributes.get(
			"externalReferenceCode");

		if (externalReferenceCode != null) {
			setExternalReferenceCode(externalReferenceCode);
		}

		Long benefitUsageId = (Long)attributes.get("benefitUsageId");

		if (benefitUsageId != null) {
			setBenefitUsageId(benefitUsageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long planEnrollmentId = (Long)attributes.get("planEnrollmentId");

		if (planEnrollmentId != null) {
			setPlanEnrollmentId(planEnrollmentId);
		}

		String benefitType = (String)attributes.get("benefitType");

		if (benefitType != null) {
			setBenefitType(benefitType);
		}

		Long amountUsedCents = (Long)attributes.get("amountUsedCents");

		if (amountUsedCents != null) {
			setAmountUsedCents(amountUsedCents);
		}

		Date serviceDate = (Date)attributes.get("serviceDate");

		if (serviceDate != null) {
			setServiceDate(serviceDate);
		}

		String reference = (String)attributes.get("reference");

		if (reference != null) {
			setReference(reference);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}

		String sourceType = (String)attributes.get("sourceType");

		if (sourceType != null) {
			setSourceType(sourceType);
		}

		String sourceReference = (String)attributes.get("sourceReference");

		if (sourceReference != null) {
			setSourceReference(sourceReference);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public BenefitUsage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount used cents of this benefit usage.
	 *
	 * @return the amount used cents of this benefit usage
	 */
	@Override
	public long getAmountUsedCents() {
		return model.getAmountUsedCents();
	}

	/**
	 * Returns the benefit type of this benefit usage.
	 *
	 * @return the benefit type of this benefit usage
	 */
	@Override
	public String getBenefitType() {
		return model.getBenefitType();
	}

	/**
	 * Returns the benefit usage ID of this benefit usage.
	 *
	 * @return the benefit usage ID of this benefit usage
	 */
	@Override
	public long getBenefitUsageId() {
		return model.getBenefitUsageId();
	}

	/**
	 * Returns the company ID of this benefit usage.
	 *
	 * @return the company ID of this benefit usage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this benefit usage.
	 *
	 * @return the create date of this benefit usage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the ct collection ID of this benefit usage.
	 *
	 * @return the ct collection ID of this benefit usage
	 */
	@Override
	public long getCtCollectionId() {
		return model.getCtCollectionId();
	}

	/**
	 * Returns the external reference code of this benefit usage.
	 *
	 * @return the external reference code of this benefit usage
	 */
	@Override
	public String getExternalReferenceCode() {
		return model.getExternalReferenceCode();
	}

	/**
	 * Returns the group ID of this benefit usage.
	 *
	 * @return the group ID of this benefit usage
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this benefit usage.
	 *
	 * @return the modified date of this benefit usage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this benefit usage.
	 *
	 * @return the mvcc version of this benefit usage
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the notes of this benefit usage.
	 *
	 * @return the notes of this benefit usage
	 */
	@Override
	public String getNotes() {
		return model.getNotes();
	}

	/**
	 * Returns the plan enrollment ID of this benefit usage.
	 *
	 * @return the plan enrollment ID of this benefit usage
	 */
	@Override
	public long getPlanEnrollmentId() {
		return model.getPlanEnrollmentId();
	}

	/**
	 * Returns the primary key of this benefit usage.
	 *
	 * @return the primary key of this benefit usage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reference of this benefit usage.
	 *
	 * @return the reference of this benefit usage
	 */
	@Override
	public String getReference() {
		return model.getReference();
	}

	/**
	 * Returns the service date of this benefit usage.
	 *
	 * @return the service date of this benefit usage
	 */
	@Override
	public Date getServiceDate() {
		return model.getServiceDate();
	}

	/**
	 * Returns the source reference of this benefit usage.
	 *
	 * @return the source reference of this benefit usage
	 */
	@Override
	public String getSourceReference() {
		return model.getSourceReference();
	}

	/**
	 * Returns the source type of this benefit usage.
	 *
	 * @return the source type of this benefit usage
	 */
	@Override
	public String getSourceType() {
		return model.getSourceType();
	}

	/**
	 * Returns the status of this benefit usage.
	 *
	 * @return the status of this benefit usage
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this benefit usage.
	 *
	 * @return the status by user ID of this benefit usage
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this benefit usage.
	 *
	 * @return the status by user name of this benefit usage
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this benefit usage.
	 *
	 * @return the status by user uuid of this benefit usage
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this benefit usage.
	 *
	 * @return the status date of this benefit usage
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	@Override
	public String getSummary() {
		return model.getSummary();
	}

	/**
	 * Returns the class primary key of the trash entry for this benefit usage.
	 *
	 * @return the class primary key of the trash entry for this benefit usage
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the user ID of this benefit usage.
	 *
	 * @return the user ID of this benefit usage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this benefit usage.
	 *
	 * @return the user name of this benefit usage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this benefit usage.
	 *
	 * @return the user uuid of this benefit usage
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this benefit usage.
	 *
	 * @return the uuid of this benefit usage
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is approved.
	 *
	 * @return <code>true</code> if this benefit usage is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is denied.
	 *
	 * @return <code>true</code> if this benefit usage is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is a draft.
	 *
	 * @return <code>true</code> if this benefit usage is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is expired.
	 *
	 * @return <code>true</code> if this benefit usage is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is inactive.
	 *
	 * @return <code>true</code> if this benefit usage is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is incomplete.
	 *
	 * @return <code>true</code> if this benefit usage is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this benefit usage is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is pending.
	 *
	 * @return <code>true</code> if this benefit usage is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this benefit usage is scheduled.
	 *
	 * @return <code>true</code> if this benefit usage is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the amount used cents of this benefit usage.
	 *
	 * @param amountUsedCents the amount used cents of this benefit usage
	 */
	@Override
	public void setAmountUsedCents(long amountUsedCents) {
		model.setAmountUsedCents(amountUsedCents);
	}

	/**
	 * Sets the benefit type of this benefit usage.
	 *
	 * @param benefitType the benefit type of this benefit usage
	 */
	@Override
	public void setBenefitType(String benefitType) {
		model.setBenefitType(benefitType);
	}

	/**
	 * Sets the benefit usage ID of this benefit usage.
	 *
	 * @param benefitUsageId the benefit usage ID of this benefit usage
	 */
	@Override
	public void setBenefitUsageId(long benefitUsageId) {
		model.setBenefitUsageId(benefitUsageId);
	}

	/**
	 * Sets the company ID of this benefit usage.
	 *
	 * @param companyId the company ID of this benefit usage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this benefit usage.
	 *
	 * @param createDate the create date of this benefit usage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the ct collection ID of this benefit usage.
	 *
	 * @param ctCollectionId the ct collection ID of this benefit usage
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId) {
		model.setCtCollectionId(ctCollectionId);
	}

	/**
	 * Sets the external reference code of this benefit usage.
	 *
	 * @param externalReferenceCode the external reference code of this benefit usage
	 */
	@Override
	public void setExternalReferenceCode(String externalReferenceCode) {
		model.setExternalReferenceCode(externalReferenceCode);
	}

	/**
	 * Sets the group ID of this benefit usage.
	 *
	 * @param groupId the group ID of this benefit usage
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this benefit usage.
	 *
	 * @param modifiedDate the modified date of this benefit usage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this benefit usage.
	 *
	 * @param mvccVersion the mvcc version of this benefit usage
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the notes of this benefit usage.
	 *
	 * @param notes the notes of this benefit usage
	 */
	@Override
	public void setNotes(String notes) {
		model.setNotes(notes);
	}

	/**
	 * Sets the plan enrollment ID of this benefit usage.
	 *
	 * @param planEnrollmentId the plan enrollment ID of this benefit usage
	 */
	@Override
	public void setPlanEnrollmentId(long planEnrollmentId) {
		model.setPlanEnrollmentId(planEnrollmentId);
	}

	/**
	 * Sets the primary key of this benefit usage.
	 *
	 * @param primaryKey the primary key of this benefit usage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reference of this benefit usage.
	 *
	 * @param reference the reference of this benefit usage
	 */
	@Override
	public void setReference(String reference) {
		model.setReference(reference);
	}

	/**
	 * Sets the service date of this benefit usage.
	 *
	 * @param serviceDate the service date of this benefit usage
	 */
	@Override
	public void setServiceDate(Date serviceDate) {
		model.setServiceDate(serviceDate);
	}

	/**
	 * Sets the source reference of this benefit usage.
	 *
	 * @param sourceReference the source reference of this benefit usage
	 */
	@Override
	public void setSourceReference(String sourceReference) {
		model.setSourceReference(sourceReference);
	}

	/**
	 * Sets the source type of this benefit usage.
	 *
	 * @param sourceType the source type of this benefit usage
	 */
	@Override
	public void setSourceType(String sourceType) {
		model.setSourceType(sourceType);
	}

	/**
	 * Sets the status of this benefit usage.
	 *
	 * @param status the status of this benefit usage
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this benefit usage.
	 *
	 * @param statusByUserId the status by user ID of this benefit usage
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this benefit usage.
	 *
	 * @param statusByUserName the status by user name of this benefit usage
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this benefit usage.
	 *
	 * @param statusByUserUuid the status by user uuid of this benefit usage
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this benefit usage.
	 *
	 * @param statusDate the status date of this benefit usage
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this benefit usage.
	 *
	 * @param userId the user ID of this benefit usage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this benefit usage.
	 *
	 * @param userName the user name of this benefit usage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this benefit usage.
	 *
	 * @param userUuid the user uuid of this benefit usage
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this benefit usage.
	 *
	 * @param uuid the uuid of this benefit usage
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public Map<String, Function<BenefitUsage, Object>>
		getAttributeGetterFunctions() {

		return model.getAttributeGetterFunctions();
	}

	@Override
	public Map<String, BiConsumer<BenefitUsage, Object>>
		getAttributeSetterBiConsumers() {

		return model.getAttributeSetterBiConsumers();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected BenefitUsageWrapper wrap(BenefitUsage benefitUsage) {
		return new BenefitUsageWrapper(benefitUsage);
	}

}