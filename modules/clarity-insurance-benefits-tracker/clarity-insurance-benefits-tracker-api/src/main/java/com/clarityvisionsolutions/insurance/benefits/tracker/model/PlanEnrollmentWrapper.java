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
 * This class is a wrapper for {@link PlanEnrollment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollment
 * @generated
 */
public class PlanEnrollmentWrapper
	extends BaseModelWrapper<PlanEnrollment>
	implements ModelWrapper<PlanEnrollment>, PlanEnrollment {

	public PlanEnrollmentWrapper(PlanEnrollment planEnrollment) {
		super(planEnrollment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("ctCollectionId", getCtCollectionId());
		attributes.put("uuid", getUuid());
		attributes.put("externalReferenceCode", getExternalReferenceCode());
		attributes.put("planEnrollmentId", getPlanEnrollmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("insurancePlanId", getInsurancePlanId());
		attributes.put("memberUserId", getMemberUserId());
		attributes.put("memberUserName", getMemberUserName());
		attributes.put("memberId", getMemberId());
		attributes.put("groupNumber", getGroupNumber());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("enrollmentStatus", getEnrollmentStatus());
		attributes.put("notes", getNotes());
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

		Long planEnrollmentId = (Long)attributes.get("planEnrollmentId");

		if (planEnrollmentId != null) {
			setPlanEnrollmentId(planEnrollmentId);
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

		Long insurancePlanId = (Long)attributes.get("insurancePlanId");

		if (insurancePlanId != null) {
			setInsurancePlanId(insurancePlanId);
		}

		Long memberUserId = (Long)attributes.get("memberUserId");

		if (memberUserId != null) {
			setMemberUserId(memberUserId);
		}

		String memberUserName = (String)attributes.get("memberUserName");

		if (memberUserName != null) {
			setMemberUserName(memberUserName);
		}

		String memberId = (String)attributes.get("memberId");

		if (memberId != null) {
			setMemberId(memberId);
		}

		String groupNumber = (String)attributes.get("groupNumber");

		if (groupNumber != null) {
			setGroupNumber(groupNumber);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Integer enrollmentStatus = (Integer)attributes.get("enrollmentStatus");

		if (enrollmentStatus != null) {
			setEnrollmentStatus(enrollmentStatus);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
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
	public PlanEnrollment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this plan enrollment.
	 *
	 * @return the company ID of this plan enrollment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the container model ID of this plan enrollment.
	 *
	 * @return the container model ID of this plan enrollment
	 */
	@Override
	public long getContainerModelId() {
		return model.getContainerModelId();
	}

	/**
	 * Returns the container name of this plan enrollment.
	 *
	 * @return the container name of this plan enrollment
	 */
	@Override
	public String getContainerModelName() {
		return model.getContainerModelName();
	}

	/**
	 * Returns the create date of this plan enrollment.
	 *
	 * @return the create date of this plan enrollment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the ct collection ID of this plan enrollment.
	 *
	 * @return the ct collection ID of this plan enrollment
	 */
	@Override
	public long getCtCollectionId() {
		return model.getCtCollectionId();
	}

	/**
	 * Returns the end date of this plan enrollment.
	 *
	 * @return the end date of this plan enrollment
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the enrollment status of this plan enrollment.
	 *
	 * @return the enrollment status of this plan enrollment
	 */
	@Override
	public int getEnrollmentStatus() {
		return model.getEnrollmentStatus();
	}

	/**
	 * Returns the external reference code of this plan enrollment.
	 *
	 * @return the external reference code of this plan enrollment
	 */
	@Override
	public String getExternalReferenceCode() {
		return model.getExternalReferenceCode();
	}

	/**
	 * Returns the group ID of this plan enrollment.
	 *
	 * @return the group ID of this plan enrollment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the group number of this plan enrollment.
	 *
	 * @return the group number of this plan enrollment
	 */
	@Override
	public String getGroupNumber() {
		return model.getGroupNumber();
	}

	/**
	 * Returns the insurance plan ID of this plan enrollment.
	 *
	 * @return the insurance plan ID of this plan enrollment
	 */
	@Override
	public long getInsurancePlanId() {
		return model.getInsurancePlanId();
	}

	/**
	 * Returns the member ID of this plan enrollment.
	 *
	 * @return the member ID of this plan enrollment
	 */
	@Override
	public String getMemberId() {
		return model.getMemberId();
	}

	/**
	 * Returns the member user ID of this plan enrollment.
	 *
	 * @return the member user ID of this plan enrollment
	 */
	@Override
	public long getMemberUserId() {
		return model.getMemberUserId();
	}

	/**
	 * Returns the member user name of this plan enrollment.
	 *
	 * @return the member user name of this plan enrollment
	 */
	@Override
	public String getMemberUserName() {
		return model.getMemberUserName();
	}

	/**
	 * Returns the member user uuid of this plan enrollment.
	 *
	 * @return the member user uuid of this plan enrollment
	 */
	@Override
	public String getMemberUserUuid() {
		return model.getMemberUserUuid();
	}

	/**
	 * Returns the modified date of this plan enrollment.
	 *
	 * @return the modified date of this plan enrollment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this plan enrollment.
	 *
	 * @return the mvcc version of this plan enrollment
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the notes of this plan enrollment.
	 *
	 * @return the notes of this plan enrollment
	 */
	@Override
	public String getNotes() {
		return model.getNotes();
	}

	/**
	 * Returns the parent container model ID of this plan enrollment.
	 *
	 * @return the parent container model ID of this plan enrollment
	 */
	@Override
	public long getParentContainerModelId() {
		return model.getParentContainerModelId();
	}

	/**
	 * Returns the plan enrollment ID of this plan enrollment.
	 *
	 * @return the plan enrollment ID of this plan enrollment
	 */
	@Override
	public long getPlanEnrollmentId() {
		return model.getPlanEnrollmentId();
	}

	/**
	 * Returns the primary key of this plan enrollment.
	 *
	 * @return the primary key of this plan enrollment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the start date of this plan enrollment.
	 *
	 * @return the start date of this plan enrollment
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the status of this plan enrollment.
	 *
	 * @return the status of this plan enrollment
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this plan enrollment.
	 *
	 * @return the status by user ID of this plan enrollment
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this plan enrollment.
	 *
	 * @return the status by user name of this plan enrollment
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this plan enrollment.
	 *
	 * @return the status by user uuid of this plan enrollment
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this plan enrollment.
	 *
	 * @return the status date of this plan enrollment
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
	 * Returns the class primary key of the trash entry for this plan enrollment.
	 *
	 * @return the class primary key of the trash entry for this plan enrollment
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the user ID of this plan enrollment.
	 *
	 * @return the user ID of this plan enrollment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this plan enrollment.
	 *
	 * @return the user name of this plan enrollment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this plan enrollment.
	 *
	 * @return the user uuid of this plan enrollment
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this plan enrollment.
	 *
	 * @return the uuid of this plan enrollment
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is approved.
	 *
	 * @return <code>true</code> if this plan enrollment is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is denied.
	 *
	 * @return <code>true</code> if this plan enrollment is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is a draft.
	 *
	 * @return <code>true</code> if this plan enrollment is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is expired.
	 *
	 * @return <code>true</code> if this plan enrollment is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is inactive.
	 *
	 * @return <code>true</code> if this plan enrollment is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is incomplete.
	 *
	 * @return <code>true</code> if this plan enrollment is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this plan enrollment is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is pending.
	 *
	 * @return <code>true</code> if this plan enrollment is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this plan enrollment is scheduled.
	 *
	 * @return <code>true</code> if this plan enrollment is scheduled; <code>false</code> otherwise
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
	 * Sets the company ID of this plan enrollment.
	 *
	 * @param companyId the company ID of this plan enrollment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the container model ID of this plan enrollment.
	 *
	 * @param containerModelId the container model ID of this plan enrollment
	 */
	@Override
	public void setContainerModelId(long containerModelId) {
		model.setContainerModelId(containerModelId);
	}

	/**
	 * Sets the create date of this plan enrollment.
	 *
	 * @param createDate the create date of this plan enrollment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the ct collection ID of this plan enrollment.
	 *
	 * @param ctCollectionId the ct collection ID of this plan enrollment
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId) {
		model.setCtCollectionId(ctCollectionId);
	}

	/**
	 * Sets the end date of this plan enrollment.
	 *
	 * @param endDate the end date of this plan enrollment
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the enrollment status of this plan enrollment.
	 *
	 * @param enrollmentStatus the enrollment status of this plan enrollment
	 */
	@Override
	public void setEnrollmentStatus(int enrollmentStatus) {
		model.setEnrollmentStatus(enrollmentStatus);
	}

	/**
	 * Sets the external reference code of this plan enrollment.
	 *
	 * @param externalReferenceCode the external reference code of this plan enrollment
	 */
	@Override
	public void setExternalReferenceCode(String externalReferenceCode) {
		model.setExternalReferenceCode(externalReferenceCode);
	}

	/**
	 * Sets the group ID of this plan enrollment.
	 *
	 * @param groupId the group ID of this plan enrollment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the group number of this plan enrollment.
	 *
	 * @param groupNumber the group number of this plan enrollment
	 */
	@Override
	public void setGroupNumber(String groupNumber) {
		model.setGroupNumber(groupNumber);
	}

	/**
	 * Sets the insurance plan ID of this plan enrollment.
	 *
	 * @param insurancePlanId the insurance plan ID of this plan enrollment
	 */
	@Override
	public void setInsurancePlanId(long insurancePlanId) {
		model.setInsurancePlanId(insurancePlanId);
	}

	/**
	 * Sets the member ID of this plan enrollment.
	 *
	 * @param memberId the member ID of this plan enrollment
	 */
	@Override
	public void setMemberId(String memberId) {
		model.setMemberId(memberId);
	}

	/**
	 * Sets the member user ID of this plan enrollment.
	 *
	 * @param memberUserId the member user ID of this plan enrollment
	 */
	@Override
	public void setMemberUserId(long memberUserId) {
		model.setMemberUserId(memberUserId);
	}

	/**
	 * Sets the member user name of this plan enrollment.
	 *
	 * @param memberUserName the member user name of this plan enrollment
	 */
	@Override
	public void setMemberUserName(String memberUserName) {
		model.setMemberUserName(memberUserName);
	}

	/**
	 * Sets the member user uuid of this plan enrollment.
	 *
	 * @param memberUserUuid the member user uuid of this plan enrollment
	 */
	@Override
	public void setMemberUserUuid(String memberUserUuid) {
		model.setMemberUserUuid(memberUserUuid);
	}

	/**
	 * Sets the modified date of this plan enrollment.
	 *
	 * @param modifiedDate the modified date of this plan enrollment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this plan enrollment.
	 *
	 * @param mvccVersion the mvcc version of this plan enrollment
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the notes of this plan enrollment.
	 *
	 * @param notes the notes of this plan enrollment
	 */
	@Override
	public void setNotes(String notes) {
		model.setNotes(notes);
	}

	/**
	 * Sets the parent container model ID of this plan enrollment.
	 *
	 * @param parentContainerModelId the parent container model ID of this plan enrollment
	 */
	@Override
	public void setParentContainerModelId(long parentContainerModelId) {
		model.setParentContainerModelId(parentContainerModelId);
	}

	/**
	 * Sets the plan enrollment ID of this plan enrollment.
	 *
	 * @param planEnrollmentId the plan enrollment ID of this plan enrollment
	 */
	@Override
	public void setPlanEnrollmentId(long planEnrollmentId) {
		model.setPlanEnrollmentId(planEnrollmentId);
	}

	/**
	 * Sets the primary key of this plan enrollment.
	 *
	 * @param primaryKey the primary key of this plan enrollment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the start date of this plan enrollment.
	 *
	 * @param startDate the start date of this plan enrollment
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the status of this plan enrollment.
	 *
	 * @param status the status of this plan enrollment
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this plan enrollment.
	 *
	 * @param statusByUserId the status by user ID of this plan enrollment
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this plan enrollment.
	 *
	 * @param statusByUserName the status by user name of this plan enrollment
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this plan enrollment.
	 *
	 * @param statusByUserUuid the status by user uuid of this plan enrollment
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this plan enrollment.
	 *
	 * @param statusDate the status date of this plan enrollment
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this plan enrollment.
	 *
	 * @param userId the user ID of this plan enrollment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this plan enrollment.
	 *
	 * @param userName the user name of this plan enrollment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this plan enrollment.
	 *
	 * @param userUuid the user uuid of this plan enrollment
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this plan enrollment.
	 *
	 * @param uuid the uuid of this plan enrollment
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
	public Map<String, Function<PlanEnrollment, Object>>
		getAttributeGetterFunctions() {

		return model.getAttributeGetterFunctions();
	}

	@Override
	public Map<String, BiConsumer<PlanEnrollment, Object>>
		getAttributeSetterBiConsumers() {

		return model.getAttributeSetterBiConsumers();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PlanEnrollmentWrapper wrap(PlanEnrollment planEnrollment) {
		return new PlanEnrollmentWrapper(planEnrollment);
	}

}