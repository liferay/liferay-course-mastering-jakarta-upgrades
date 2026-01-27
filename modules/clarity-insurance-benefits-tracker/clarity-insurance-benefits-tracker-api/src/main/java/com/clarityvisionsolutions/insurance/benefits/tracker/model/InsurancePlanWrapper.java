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
 * This class is a wrapper for {@link InsurancePlan}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlan
 * @generated
 */
public class InsurancePlanWrapper
	extends BaseModelWrapper<InsurancePlan>
	implements InsurancePlan, ModelWrapper<InsurancePlan> {

	public InsurancePlanWrapper(InsurancePlan insurancePlan) {
		super(insurancePlan);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("ctCollectionId", getCtCollectionId());
		attributes.put("uuid", getUuid());
		attributes.put("externalReferenceCode", getExternalReferenceCode());
		attributes.put("insurancePlanId", getInsurancePlanId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("planName", getPlanName());
		attributes.put("providerName", getProviderName());
		attributes.put("active", isActive());
		attributes.put(
			"annualExamAllowanceCents", getAnnualExamAllowanceCents());
		attributes.put(
			"annualFramesAllowanceCents", getAnnualFramesAllowanceCents());
		attributes.put(
			"annualLensesAllowanceCents", getAnnualLensesAllowanceCents());
		attributes.put(
			"annualContactsAllowanceCents", getAnnualContactsAllowanceCents());
		attributes.put("coveragePeriodMonths", getCoveragePeriodMonths());
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

		Long insurancePlanId = (Long)attributes.get("insurancePlanId");

		if (insurancePlanId != null) {
			setInsurancePlanId(insurancePlanId);
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

		String planName = (String)attributes.get("planName");

		if (planName != null) {
			setPlanName(planName);
		}

		String providerName = (String)attributes.get("providerName");

		if (providerName != null) {
			setProviderName(providerName);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long annualExamAllowanceCents = (Long)attributes.get(
			"annualExamAllowanceCents");

		if (annualExamAllowanceCents != null) {
			setAnnualExamAllowanceCents(annualExamAllowanceCents);
		}

		Long annualFramesAllowanceCents = (Long)attributes.get(
			"annualFramesAllowanceCents");

		if (annualFramesAllowanceCents != null) {
			setAnnualFramesAllowanceCents(annualFramesAllowanceCents);
		}

		Long annualLensesAllowanceCents = (Long)attributes.get(
			"annualLensesAllowanceCents");

		if (annualLensesAllowanceCents != null) {
			setAnnualLensesAllowanceCents(annualLensesAllowanceCents);
		}

		Long annualContactsAllowanceCents = (Long)attributes.get(
			"annualContactsAllowanceCents");

		if (annualContactsAllowanceCents != null) {
			setAnnualContactsAllowanceCents(annualContactsAllowanceCents);
		}

		Integer coveragePeriodMonths = (Integer)attributes.get(
			"coveragePeriodMonths");

		if (coveragePeriodMonths != null) {
			setCoveragePeriodMonths(coveragePeriodMonths);
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
	public InsurancePlan cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the active of this Insurance Plan.
	 *
	 * @return the active of this Insurance Plan
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the annual contacts allowance cents of this Insurance Plan.
	 *
	 * @return the annual contacts allowance cents of this Insurance Plan
	 */
	@Override
	public long getAnnualContactsAllowanceCents() {
		return model.getAnnualContactsAllowanceCents();
	}

	/**
	 * Returns the annual exam allowance cents of this Insurance Plan.
	 *
	 * @return the annual exam allowance cents of this Insurance Plan
	 */
	@Override
	public long getAnnualExamAllowanceCents() {
		return model.getAnnualExamAllowanceCents();
	}

	/**
	 * Returns the annual frames allowance cents of this Insurance Plan.
	 *
	 * @return the annual frames allowance cents of this Insurance Plan
	 */
	@Override
	public long getAnnualFramesAllowanceCents() {
		return model.getAnnualFramesAllowanceCents();
	}

	/**
	 * Returns the annual lenses allowance cents of this Insurance Plan.
	 *
	 * @return the annual lenses allowance cents of this Insurance Plan
	 */
	@Override
	public long getAnnualLensesAllowanceCents() {
		return model.getAnnualLensesAllowanceCents();
	}

	/**
	 * Returns the company ID of this Insurance Plan.
	 *
	 * @return the company ID of this Insurance Plan
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the container model ID of this Insurance Plan.
	 *
	 * @return the container model ID of this Insurance Plan
	 */
	@Override
	public long getContainerModelId() {
		return model.getContainerModelId();
	}

	/**
	 * Returns the container name of this Insurance Plan.
	 *
	 * @return the container name of this Insurance Plan
	 */
	@Override
	public String getContainerModelName() {
		return model.getContainerModelName();
	}

	/**
	 * Returns the coverage period months of this Insurance Plan.
	 *
	 * @return the coverage period months of this Insurance Plan
	 */
	@Override
	public int getCoveragePeriodMonths() {
		return model.getCoveragePeriodMonths();
	}

	/**
	 * Returns the create date of this Insurance Plan.
	 *
	 * @return the create date of this Insurance Plan
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the ct collection ID of this Insurance Plan.
	 *
	 * @return the ct collection ID of this Insurance Plan
	 */
	@Override
	public long getCtCollectionId() {
		return model.getCtCollectionId();
	}

	/**
	 * Returns the external reference code of this Insurance Plan.
	 *
	 * @return the external reference code of this Insurance Plan
	 */
	@Override
	public String getExternalReferenceCode() {
		return model.getExternalReferenceCode();
	}

	/**
	 * Returns the group ID of this Insurance Plan.
	 *
	 * @return the group ID of this Insurance Plan
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insurance plan ID of this Insurance Plan.
	 *
	 * @return the insurance plan ID of this Insurance Plan
	 */
	@Override
	public long getInsurancePlanId() {
		return model.getInsurancePlanId();
	}

	/**
	 * Returns the modified date of this Insurance Plan.
	 *
	 * @return the modified date of this Insurance Plan
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this Insurance Plan.
	 *
	 * @return the mvcc version of this Insurance Plan
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the parent container model ID of this Insurance Plan.
	 *
	 * @return the parent container model ID of this Insurance Plan
	 */
	@Override
	public long getParentContainerModelId() {
		return model.getParentContainerModelId();
	}

	/**
	 * Returns the plan name of this Insurance Plan.
	 *
	 * @return the plan name of this Insurance Plan
	 */
	@Override
	public String getPlanName() {
		return model.getPlanName();
	}

	/**
	 * Returns the primary key of this Insurance Plan.
	 *
	 * @return the primary key of this Insurance Plan
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the provider name of this Insurance Plan.
	 *
	 * @return the provider name of this Insurance Plan
	 */
	@Override
	public String getProviderName() {
		return model.getProviderName();
	}

	/**
	 * Returns the status of this Insurance Plan.
	 *
	 * @return the status of this Insurance Plan
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this Insurance Plan.
	 *
	 * @return the status by user ID of this Insurance Plan
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this Insurance Plan.
	 *
	 * @return the status by user name of this Insurance Plan
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this Insurance Plan.
	 *
	 * @return the status by user uuid of this Insurance Plan
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this Insurance Plan.
	 *
	 * @return the status date of this Insurance Plan
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
	 * Returns the class primary key of the trash entry for this Insurance Plan.
	 *
	 * @return the class primary key of the trash entry for this Insurance Plan
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the user ID of this Insurance Plan.
	 *
	 * @return the user ID of this Insurance Plan
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this Insurance Plan.
	 *
	 * @return the user name of this Insurance Plan
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this Insurance Plan.
	 *
	 * @return the user uuid of this Insurance Plan
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this Insurance Plan.
	 *
	 * @return the uuid of this Insurance Plan
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is active.
	 *
	 * @return <code>true</code> if this Insurance Plan is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is approved.
	 *
	 * @return <code>true</code> if this Insurance Plan is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is denied.
	 *
	 * @return <code>true</code> if this Insurance Plan is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is a draft.
	 *
	 * @return <code>true</code> if this Insurance Plan is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is expired.
	 *
	 * @return <code>true</code> if this Insurance Plan is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is inactive.
	 *
	 * @return <code>true</code> if this Insurance Plan is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is incomplete.
	 *
	 * @return <code>true</code> if this Insurance Plan is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this Insurance Plan is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is pending.
	 *
	 * @return <code>true</code> if this Insurance Plan is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this Insurance Plan is scheduled.
	 *
	 * @return <code>true</code> if this Insurance Plan is scheduled; <code>false</code> otherwise
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
	 * Sets whether this Insurance Plan is active.
	 *
	 * @param active the active of this Insurance Plan
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the annual contacts allowance cents of this Insurance Plan.
	 *
	 * @param annualContactsAllowanceCents the annual contacts allowance cents of this Insurance Plan
	 */
	@Override
	public void setAnnualContactsAllowanceCents(
		long annualContactsAllowanceCents) {

		model.setAnnualContactsAllowanceCents(annualContactsAllowanceCents);
	}

	/**
	 * Sets the annual exam allowance cents of this Insurance Plan.
	 *
	 * @param annualExamAllowanceCents the annual exam allowance cents of this Insurance Plan
	 */
	@Override
	public void setAnnualExamAllowanceCents(long annualExamAllowanceCents) {
		model.setAnnualExamAllowanceCents(annualExamAllowanceCents);
	}

	/**
	 * Sets the annual frames allowance cents of this Insurance Plan.
	 *
	 * @param annualFramesAllowanceCents the annual frames allowance cents of this Insurance Plan
	 */
	@Override
	public void setAnnualFramesAllowanceCents(long annualFramesAllowanceCents) {
		model.setAnnualFramesAllowanceCents(annualFramesAllowanceCents);
	}

	/**
	 * Sets the annual lenses allowance cents of this Insurance Plan.
	 *
	 * @param annualLensesAllowanceCents the annual lenses allowance cents of this Insurance Plan
	 */
	@Override
	public void setAnnualLensesAllowanceCents(long annualLensesAllowanceCents) {
		model.setAnnualLensesAllowanceCents(annualLensesAllowanceCents);
	}

	/**
	 * Sets the company ID of this Insurance Plan.
	 *
	 * @param companyId the company ID of this Insurance Plan
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the container model ID of this Insurance Plan.
	 *
	 * @param containerModelId the container model ID of this Insurance Plan
	 */
	@Override
	public void setContainerModelId(long containerModelId) {
		model.setContainerModelId(containerModelId);
	}

	/**
	 * Sets the coverage period months of this Insurance Plan.
	 *
	 * @param coveragePeriodMonths the coverage period months of this Insurance Plan
	 */
	@Override
	public void setCoveragePeriodMonths(int coveragePeriodMonths) {
		model.setCoveragePeriodMonths(coveragePeriodMonths);
	}

	/**
	 * Sets the create date of this Insurance Plan.
	 *
	 * @param createDate the create date of this Insurance Plan
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the ct collection ID of this Insurance Plan.
	 *
	 * @param ctCollectionId the ct collection ID of this Insurance Plan
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId) {
		model.setCtCollectionId(ctCollectionId);
	}

	/**
	 * Sets the external reference code of this Insurance Plan.
	 *
	 * @param externalReferenceCode the external reference code of this Insurance Plan
	 */
	@Override
	public void setExternalReferenceCode(String externalReferenceCode) {
		model.setExternalReferenceCode(externalReferenceCode);
	}

	/**
	 * Sets the group ID of this Insurance Plan.
	 *
	 * @param groupId the group ID of this Insurance Plan
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insurance plan ID of this Insurance Plan.
	 *
	 * @param insurancePlanId the insurance plan ID of this Insurance Plan
	 */
	@Override
	public void setInsurancePlanId(long insurancePlanId) {
		model.setInsurancePlanId(insurancePlanId);
	}

	/**
	 * Sets the modified date of this Insurance Plan.
	 *
	 * @param modifiedDate the modified date of this Insurance Plan
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this Insurance Plan.
	 *
	 * @param mvccVersion the mvcc version of this Insurance Plan
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the parent container model ID of this Insurance Plan.
	 *
	 * @param parentContainerModelId the parent container model ID of this Insurance Plan
	 */
	@Override
	public void setParentContainerModelId(long parentContainerModelId) {
		model.setParentContainerModelId(parentContainerModelId);
	}

	/**
	 * Sets the plan name of this Insurance Plan.
	 *
	 * @param planName the plan name of this Insurance Plan
	 */
	@Override
	public void setPlanName(String planName) {
		model.setPlanName(planName);
	}

	/**
	 * Sets the primary key of this Insurance Plan.
	 *
	 * @param primaryKey the primary key of this Insurance Plan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the provider name of this Insurance Plan.
	 *
	 * @param providerName the provider name of this Insurance Plan
	 */
	@Override
	public void setProviderName(String providerName) {
		model.setProviderName(providerName);
	}

	/**
	 * Sets the status of this Insurance Plan.
	 *
	 * @param status the status of this Insurance Plan
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this Insurance Plan.
	 *
	 * @param statusByUserId the status by user ID of this Insurance Plan
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this Insurance Plan.
	 *
	 * @param statusByUserName the status by user name of this Insurance Plan
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this Insurance Plan.
	 *
	 * @param statusByUserUuid the status by user uuid of this Insurance Plan
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this Insurance Plan.
	 *
	 * @param statusDate the status date of this Insurance Plan
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this Insurance Plan.
	 *
	 * @param userId the user ID of this Insurance Plan
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this Insurance Plan.
	 *
	 * @param userName the user name of this Insurance Plan
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this Insurance Plan.
	 *
	 * @param userUuid the user uuid of this Insurance Plan
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this Insurance Plan.
	 *
	 * @param uuid the uuid of this Insurance Plan
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
	public Map<String, Function<InsurancePlan, Object>>
		getAttributeGetterFunctions() {

		return model.getAttributeGetterFunctions();
	}

	@Override
	public Map<String, BiConsumer<InsurancePlan, Object>>
		getAttributeSetterBiConsumers() {

		return model.getAttributeSetterBiConsumers();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected InsurancePlanWrapper wrap(InsurancePlan insurancePlan) {
		return new InsurancePlanWrapper(insurancePlan);
	}

}