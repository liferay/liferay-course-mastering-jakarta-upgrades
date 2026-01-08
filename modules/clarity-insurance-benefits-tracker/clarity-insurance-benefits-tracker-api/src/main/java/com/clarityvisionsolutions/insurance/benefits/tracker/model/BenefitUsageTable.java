/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;CIBT_BenefitUsage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsage
 * @generated
 */
public class BenefitUsageTable extends BaseTable<BenefitUsageTable> {

	public static final BenefitUsageTable INSTANCE = new BenefitUsageTable();

	public final Column<BenefitUsageTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<BenefitUsageTable, Long> ctCollectionId = createColumn(
		"ctCollectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BenefitUsageTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> externalReferenceCode =
		createColumn(
			"externalReferenceCode", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Long> benefitUsageId = createColumn(
		"benefitUsageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BenefitUsageTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Long> planEnrollmentId =
		createColumn(
			"planEnrollmentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> benefitType = createColumn(
		"benefitType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Long> amountUsedCents = createColumn(
		"amountUsedCents", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Date> serviceDate = createColumn(
		"serviceDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> reference = createColumn(
		"reference", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> notes = createColumn(
		"notes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> sourceType = createColumn(
		"sourceType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> sourceReference =
		createColumn(
			"sourceReference", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Long> statusByUserId = createColumn(
		"statusByUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, String> statusByUserName =
		createColumn(
			"statusByUserName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BenefitUsageTable, Date> statusDate = createColumn(
		"statusDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private BenefitUsageTable() {
		super("CIBT_BenefitUsage", BenefitUsageTable::new);
	}

}