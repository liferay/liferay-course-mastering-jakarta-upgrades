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
 * The table class for the &quot;CIBT_InsurancePlan&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlan
 * @generated
 */
public class InsurancePlanTable extends BaseTable<InsurancePlanTable> {

	public static final InsurancePlanTable INSTANCE = new InsurancePlanTable();

	public final Column<InsurancePlanTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<InsurancePlanTable, Long> ctCollectionId = createColumn(
		"ctCollectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<InsurancePlanTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, String> externalReferenceCode =
		createColumn(
			"externalReferenceCode", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> insurancePlanId =
		createColumn(
			"insurancePlanId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<InsurancePlanTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, String> planName = createColumn(
		"planName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, String> providerName = createColumn(
		"providerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Boolean> active = createColumn(
		"active_", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> annualExamAllowanceCents =
		createColumn(
			"annualExamAllowanceCents", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> annualFramesAllowanceCents =
		createColumn(
			"annualFramesAllowanceCents", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> annualLensesAllowanceCents =
		createColumn(
			"annualLensesAllowanceCents", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> annualContactsAllowanceCents =
		createColumn(
			"annualContactsAllowanceCents", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Integer> coveragePeriodMonths =
		createColumn(
			"coveragePeriodMonths", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Long> statusByUserId = createColumn(
		"statusByUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, String> statusByUserName =
		createColumn(
			"statusByUserName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<InsurancePlanTable, Date> statusDate = createColumn(
		"statusDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private InsurancePlanTable() {
		super("CIBT_InsurancePlan", InsurancePlanTable::new);
	}

}