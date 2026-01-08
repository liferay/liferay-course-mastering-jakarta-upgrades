/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

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
 * The cache model class for representing InsurancePlan in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InsurancePlanCacheModel
	implements CacheModel<InsurancePlan>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InsurancePlanCacheModel)) {
			return false;
		}

		InsurancePlanCacheModel insurancePlanCacheModel =
			(InsurancePlanCacheModel)object;

		if ((insurancePlanId == insurancePlanCacheModel.insurancePlanId) &&
			(mvccVersion == insurancePlanCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, insurancePlanId);

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
		StringBundler sb = new StringBundler(47);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", ctCollectionId=");
		sb.append(ctCollectionId);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", externalReferenceCode=");
		sb.append(externalReferenceCode);
		sb.append(", insurancePlanId=");
		sb.append(insurancePlanId);
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
		sb.append(", planName=");
		sb.append(planName);
		sb.append(", providerName=");
		sb.append(providerName);
		sb.append(", active=");
		sb.append(active);
		sb.append(", annualExamAllowanceCents=");
		sb.append(annualExamAllowanceCents);
		sb.append(", annualFramesAllowanceCents=");
		sb.append(annualFramesAllowanceCents);
		sb.append(", annualLensesAllowanceCents=");
		sb.append(annualLensesAllowanceCents);
		sb.append(", annualContactsAllowanceCents=");
		sb.append(annualContactsAllowanceCents);
		sb.append(", coveragePeriodMonths=");
		sb.append(coveragePeriodMonths);
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
	public InsurancePlan toEntityModel() {
		InsurancePlanImpl insurancePlanImpl = new InsurancePlanImpl();

		insurancePlanImpl.setMvccVersion(mvccVersion);
		insurancePlanImpl.setCtCollectionId(ctCollectionId);

		if (uuid == null) {
			insurancePlanImpl.setUuid("");
		}
		else {
			insurancePlanImpl.setUuid(uuid);
		}

		if (externalReferenceCode == null) {
			insurancePlanImpl.setExternalReferenceCode("");
		}
		else {
			insurancePlanImpl.setExternalReferenceCode(externalReferenceCode);
		}

		insurancePlanImpl.setInsurancePlanId(insurancePlanId);
		insurancePlanImpl.setGroupId(groupId);
		insurancePlanImpl.setCompanyId(companyId);
		insurancePlanImpl.setUserId(userId);

		if (userName == null) {
			insurancePlanImpl.setUserName("");
		}
		else {
			insurancePlanImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			insurancePlanImpl.setCreateDate(null);
		}
		else {
			insurancePlanImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			insurancePlanImpl.setModifiedDate(null);
		}
		else {
			insurancePlanImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (planName == null) {
			insurancePlanImpl.setPlanName("");
		}
		else {
			insurancePlanImpl.setPlanName(planName);
		}

		if (providerName == null) {
			insurancePlanImpl.setProviderName("");
		}
		else {
			insurancePlanImpl.setProviderName(providerName);
		}

		insurancePlanImpl.setActive(active);
		insurancePlanImpl.setAnnualExamAllowanceCents(annualExamAllowanceCents);
		insurancePlanImpl.setAnnualFramesAllowanceCents(
			annualFramesAllowanceCents);
		insurancePlanImpl.setAnnualLensesAllowanceCents(
			annualLensesAllowanceCents);
		insurancePlanImpl.setAnnualContactsAllowanceCents(
			annualContactsAllowanceCents);
		insurancePlanImpl.setCoveragePeriodMonths(coveragePeriodMonths);
		insurancePlanImpl.setStatus(status);
		insurancePlanImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			insurancePlanImpl.setStatusByUserName("");
		}
		else {
			insurancePlanImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			insurancePlanImpl.setStatusDate(null);
		}
		else {
			insurancePlanImpl.setStatusDate(new Date(statusDate));
		}

		insurancePlanImpl.resetOriginalValues();

		return insurancePlanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();

		ctCollectionId = objectInput.readLong();
		uuid = objectInput.readUTF();
		externalReferenceCode = objectInput.readUTF();

		insurancePlanId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		planName = objectInput.readUTF();
		providerName = objectInput.readUTF();

		active = objectInput.readBoolean();

		annualExamAllowanceCents = objectInput.readLong();

		annualFramesAllowanceCents = objectInput.readLong();

		annualLensesAllowanceCents = objectInput.readLong();

		annualContactsAllowanceCents = objectInput.readLong();

		coveragePeriodMonths = objectInput.readInt();

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

		objectOutput.writeLong(insurancePlanId);

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

		if (planName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(planName);
		}

		if (providerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(providerName);
		}

		objectOutput.writeBoolean(active);

		objectOutput.writeLong(annualExamAllowanceCents);

		objectOutput.writeLong(annualFramesAllowanceCents);

		objectOutput.writeLong(annualLensesAllowanceCents);

		objectOutput.writeLong(annualContactsAllowanceCents);

		objectOutput.writeInt(coveragePeriodMonths);

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
	public long insurancePlanId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String planName;
	public String providerName;
	public boolean active;
	public long annualExamAllowanceCents;
	public long annualFramesAllowanceCents;
	public long annualLensesAllowanceCents;
	public long annualContactsAllowanceCents;
	public int coveragePeriodMonths;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}