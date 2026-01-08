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
 * The table class for the &quot;CIBT_PlanEnrollment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollment
 * @generated
 */
public class PlanEnrollmentTable extends BaseTable<PlanEnrollmentTable> {

	public static final PlanEnrollmentTable INSTANCE =
		new PlanEnrollmentTable();

	public final Column<PlanEnrollmentTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<PlanEnrollmentTable, Long> ctCollectionId =
		createColumn(
			"ctCollectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PlanEnrollmentTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> externalReferenceCode =
		createColumn(
			"externalReferenceCode", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Long> planEnrollmentId =
		createColumn(
			"planEnrollmentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PlanEnrollmentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Long> insurancePlanId =
		createColumn(
			"insurancePlanId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Long> memberUserId = createColumn(
		"memberUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> memberUserName =
		createColumn(
			"memberUserName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> memberId = createColumn(
		"memberId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> groupNumber = createColumn(
		"groupNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Date> startDate = createColumn(
		"startDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Date> endDate = createColumn(
		"endDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Integer> enrollmentStatus =
		createColumn(
			"enrollmentStatus", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> notes = createColumn(
		"notes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Long> statusByUserId =
		createColumn(
			"statusByUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, String> statusByUserName =
		createColumn(
			"statusByUserName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PlanEnrollmentTable, Date> statusDate = createColumn(
		"statusDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private PlanEnrollmentTable() {
		super("CIBT_PlanEnrollment", PlanEnrollmentTable::new);
	}

}