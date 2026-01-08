/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

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
 * The cache model class for representing BenefitUsage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BenefitUsageCacheModel
	implements CacheModel<BenefitUsage>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BenefitUsageCacheModel)) {
			return false;
		}

		BenefitUsageCacheModel benefitUsageCacheModel =
			(BenefitUsageCacheModel)object;

		if ((benefitUsageId == benefitUsageCacheModel.benefitUsageId) &&
			(mvccVersion == benefitUsageCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, benefitUsageId);

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
		sb.append(", benefitUsageId=");
		sb.append(benefitUsageId);
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
		sb.append(", planEnrollmentId=");
		sb.append(planEnrollmentId);
		sb.append(", benefitType=");
		sb.append(benefitType);
		sb.append(", amountUsedCents=");
		sb.append(amountUsedCents);
		sb.append(", serviceDate=");
		sb.append(serviceDate);
		sb.append(", reference=");
		sb.append(reference);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", sourceType=");
		sb.append(sourceType);
		sb.append(", sourceReference=");
		sb.append(sourceReference);
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
	public BenefitUsage toEntityModel() {
		BenefitUsageImpl benefitUsageImpl = new BenefitUsageImpl();

		benefitUsageImpl.setMvccVersion(mvccVersion);
		benefitUsageImpl.setCtCollectionId(ctCollectionId);

		if (uuid == null) {
			benefitUsageImpl.setUuid("");
		}
		else {
			benefitUsageImpl.setUuid(uuid);
		}

		if (externalReferenceCode == null) {
			benefitUsageImpl.setExternalReferenceCode("");
		}
		else {
			benefitUsageImpl.setExternalReferenceCode(externalReferenceCode);
		}

		benefitUsageImpl.setBenefitUsageId(benefitUsageId);
		benefitUsageImpl.setGroupId(groupId);
		benefitUsageImpl.setCompanyId(companyId);
		benefitUsageImpl.setUserId(userId);

		if (userName == null) {
			benefitUsageImpl.setUserName("");
		}
		else {
			benefitUsageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			benefitUsageImpl.setCreateDate(null);
		}
		else {
			benefitUsageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			benefitUsageImpl.setModifiedDate(null);
		}
		else {
			benefitUsageImpl.setModifiedDate(new Date(modifiedDate));
		}

		benefitUsageImpl.setPlanEnrollmentId(planEnrollmentId);

		if (benefitType == null) {
			benefitUsageImpl.setBenefitType("");
		}
		else {
			benefitUsageImpl.setBenefitType(benefitType);
		}

		benefitUsageImpl.setAmountUsedCents(amountUsedCents);

		if (serviceDate == Long.MIN_VALUE) {
			benefitUsageImpl.setServiceDate(null);
		}
		else {
			benefitUsageImpl.setServiceDate(new Date(serviceDate));
		}

		if (reference == null) {
			benefitUsageImpl.setReference("");
		}
		else {
			benefitUsageImpl.setReference(reference);
		}

		if (notes == null) {
			benefitUsageImpl.setNotes("");
		}
		else {
			benefitUsageImpl.setNotes(notes);
		}

		if (sourceType == null) {
			benefitUsageImpl.setSourceType("");
		}
		else {
			benefitUsageImpl.setSourceType(sourceType);
		}

		if (sourceReference == null) {
			benefitUsageImpl.setSourceReference("");
		}
		else {
			benefitUsageImpl.setSourceReference(sourceReference);
		}

		benefitUsageImpl.setStatus(status);
		benefitUsageImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			benefitUsageImpl.setStatusByUserName("");
		}
		else {
			benefitUsageImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			benefitUsageImpl.setStatusDate(null);
		}
		else {
			benefitUsageImpl.setStatusDate(new Date(statusDate));
		}

		benefitUsageImpl.resetOriginalValues();

		return benefitUsageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();

		ctCollectionId = objectInput.readLong();
		uuid = objectInput.readUTF();
		externalReferenceCode = objectInput.readUTF();

		benefitUsageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		planEnrollmentId = objectInput.readLong();
		benefitType = objectInput.readUTF();

		amountUsedCents = objectInput.readLong();
		serviceDate = objectInput.readLong();
		reference = objectInput.readUTF();
		notes = objectInput.readUTF();
		sourceType = objectInput.readUTF();
		sourceReference = objectInput.readUTF();

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

		objectOutput.writeLong(benefitUsageId);

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

		objectOutput.writeLong(planEnrollmentId);

		if (benefitType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(benefitType);
		}

		objectOutput.writeLong(amountUsedCents);
		objectOutput.writeLong(serviceDate);

		if (reference == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reference);
		}

		if (notes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notes);
		}

		if (sourceType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceType);
		}

		if (sourceReference == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceReference);
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
	public long benefitUsageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long planEnrollmentId;
	public String benefitType;
	public long amountUsedCents;
	public long serviceDate;
	public String reference;
	public String notes;
	public String sourceType;
	public String sourceReference;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}