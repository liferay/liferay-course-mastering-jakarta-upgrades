/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PlanEnrollment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PlanEnrollmentCacheModel
	implements CacheModel<PlanEnrollment>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PlanEnrollmentCacheModel)) {
			return false;
		}

		PlanEnrollmentCacheModel planEnrollmentCacheModel =
			(PlanEnrollmentCacheModel)object;

		if ((planEnrollmentId == planEnrollmentCacheModel.planEnrollmentId) &&
			(mvccVersion == planEnrollmentCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, planEnrollmentId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", ctCollectionId=");
		sb.append(ctCollectionId);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", externalReferenceCode=");
		sb.append(externalReferenceCode);
		sb.append(", planEnrollmentId=");
		sb.append(planEnrollmentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", insurancePlanId=");
		sb.append(insurancePlanId);
		sb.append(", memberUserId=");
		sb.append(memberUserId);
		sb.append(", memberUserName=");
		sb.append(memberUserName);
		sb.append(", memberId=");
		sb.append(memberId);
		sb.append(", groupNumber=");
		sb.append(groupNumber);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", enrollmentStatus=");
		sb.append(enrollmentStatus);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PlanEnrollment toEntityModel() {
		PlanEnrollmentImpl planEnrollmentImpl = new PlanEnrollmentImpl();

		planEnrollmentImpl.setMvccVersion(mvccVersion);
		planEnrollmentImpl.setCtCollectionId(ctCollectionId);

		if (uuid == null) {
			planEnrollmentImpl.setUuid("");
		}
		else {
			planEnrollmentImpl.setUuid(uuid);
		}

		if (externalReferenceCode == null) {
			planEnrollmentImpl.setExternalReferenceCode("");
		}
		else {
			planEnrollmentImpl.setExternalReferenceCode(externalReferenceCode);
		}

		planEnrollmentImpl.setPlanEnrollmentId(planEnrollmentId);
		planEnrollmentImpl.setGroupId(groupId);
		planEnrollmentImpl.setCompanyId(companyId);
		planEnrollmentImpl.setUserId(userId);

		if (userName == null) {
			planEnrollmentImpl.setUserName("");
		}
		else {
			planEnrollmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			planEnrollmentImpl.setCreateDate(null);
		}
		else {
			planEnrollmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			planEnrollmentImpl.setModifiedDate(null);
		}
		else {
			planEnrollmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		planEnrollmentImpl.setInsurancePlanId(insurancePlanId);
		planEnrollmentImpl.setMemberUserId(memberUserId);

		if (memberUserName == null) {
			planEnrollmentImpl.setMemberUserName("");
		}
		else {
			planEnrollmentImpl.setMemberUserName(memberUserName);
		}

		if (memberId == null) {
			planEnrollmentImpl.setMemberId("");
		}
		else {
			planEnrollmentImpl.setMemberId(memberId);
		}

		if (groupNumber == null) {
			planEnrollmentImpl.setGroupNumber("");
		}
		else {
			planEnrollmentImpl.setGroupNumber(groupNumber);
		}

		if (startDate == Long.MIN_VALUE) {
			planEnrollmentImpl.setStartDate(null);
		}
		else {
			planEnrollmentImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			planEnrollmentImpl.setEndDate(null);
		}
		else {
			planEnrollmentImpl.setEndDate(new Date(endDate));
		}

		planEnrollmentImpl.setEnrollmentStatus(enrollmentStatus);

		if (notes == null) {
			planEnrollmentImpl.setNotes("");
		}
		else {
			planEnrollmentImpl.setNotes(notes);
		}

		planEnrollmentImpl.setStatus(status);
		planEnrollmentImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			planEnrollmentImpl.setStatusByUserName("");
		}
		else {
			planEnrollmentImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			planEnrollmentImpl.setStatusDate(null);
		}
		else {
			planEnrollmentImpl.setStatusDate(new Date(statusDate));
		}

		planEnrollmentImpl.resetOriginalValues();

		return planEnrollmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();

		ctCollectionId = objectInput.readLong();
		uuid = objectInput.readUTF();
		externalReferenceCode = objectInput.readUTF();

		planEnrollmentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		insurancePlanId = objectInput.readLong();

		memberUserId = objectInput.readLong();
		memberUserName = objectInput.readUTF();
		memberId = objectInput.readUTF();
		groupNumber = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();

		enrollmentStatus = objectInput.readInt();
		notes = objectInput.readUTF();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		objectOutput.writeLong(ctCollectionId);

		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (externalReferenceCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(externalReferenceCode);
		}

		objectOutput.writeLong(planEnrollmentId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(insurancePlanId);

		objectOutput.writeLong(memberUserId);

		if (memberUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(memberUserName);
		}

		if (memberId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(memberId);
		}

		if (groupNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(groupNumber);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		objectOutput.writeInt(enrollmentStatus);

		if (notes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notes);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public long mvccVersion;
	public long ctCollectionId;
	public String uuid;
	public String externalReferenceCode;
	public long planEnrollmentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long insurancePlanId;
	public long memberUserId;
	public String memberUserName;
	public String memberId;
	public String groupNumber;
	public long startDate;
	public long endDate;
	public int enrollmentStatus;
	public String notes;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}