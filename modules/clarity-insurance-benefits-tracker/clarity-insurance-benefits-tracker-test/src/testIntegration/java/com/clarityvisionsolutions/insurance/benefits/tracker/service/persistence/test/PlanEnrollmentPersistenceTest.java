/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.test;

import com.clarityvisionsolutions.insurance.benefits.tracker.exception.DuplicatePlanEnrollmentExternalReferenceCodeException;
import com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchPlanEnrollmentException;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalServiceUtil;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.PlanEnrollmentPersistence;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.PlanEnrollmentUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.security.permission.SimplePermissionChecker;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class PlanEnrollmentPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED,
				"com.clarityvisionsolutions.insurance.benefits.tracker.service"));

	@Before
	public void setUp() {
		_persistence = PlanEnrollmentUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<PlanEnrollment> iterator = _planEnrollments.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PlanEnrollment planEnrollment = _persistence.create(pk);

		Assert.assertNotNull(planEnrollment);

		Assert.assertEquals(planEnrollment.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		_persistence.remove(newPlanEnrollment);

		PlanEnrollment existingPlanEnrollment = _persistence.fetchByPrimaryKey(
			newPlanEnrollment.getPrimaryKey());

		Assert.assertNull(existingPlanEnrollment);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addPlanEnrollment();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PlanEnrollment newPlanEnrollment = _persistence.create(pk);

		newPlanEnrollment.setMvccVersion(RandomTestUtil.nextLong());

		newPlanEnrollment.setCtCollectionId(RandomTestUtil.nextLong());

		newPlanEnrollment.setUuid(RandomTestUtil.randomString());

		newPlanEnrollment.setExternalReferenceCode(
			RandomTestUtil.randomString());

		newPlanEnrollment.setGroupId(RandomTestUtil.nextLong());

		newPlanEnrollment.setCompanyId(RandomTestUtil.nextLong());

		newPlanEnrollment.setUserId(RandomTestUtil.nextLong());

		newPlanEnrollment.setUserName(RandomTestUtil.randomString());

		newPlanEnrollment.setCreateDate(RandomTestUtil.nextDate());

		newPlanEnrollment.setModifiedDate(RandomTestUtil.nextDate());

		newPlanEnrollment.setInsurancePlanId(RandomTestUtil.nextLong());

		newPlanEnrollment.setMemberUserId(RandomTestUtil.nextLong());

		newPlanEnrollment.setMemberUserName(RandomTestUtil.randomString());

		newPlanEnrollment.setMemberId(RandomTestUtil.randomString());

		newPlanEnrollment.setGroupNumber(RandomTestUtil.randomString());

		newPlanEnrollment.setStartDate(RandomTestUtil.nextDate());

		newPlanEnrollment.setEndDate(RandomTestUtil.nextDate());

		newPlanEnrollment.setEnrollmentStatus(RandomTestUtil.nextInt());

		newPlanEnrollment.setNotes(RandomTestUtil.randomString());

		newPlanEnrollment.setStatus(RandomTestUtil.nextInt());

		newPlanEnrollment.setStatusByUserId(RandomTestUtil.nextLong());

		newPlanEnrollment.setStatusByUserName(RandomTestUtil.randomString());

		newPlanEnrollment.setStatusDate(RandomTestUtil.nextDate());

		_planEnrollments.add(_persistence.update(newPlanEnrollment));

		PlanEnrollment existingPlanEnrollment = _persistence.findByPrimaryKey(
			newPlanEnrollment.getPrimaryKey());

		Assert.assertEquals(
			existingPlanEnrollment.getMvccVersion(),
			newPlanEnrollment.getMvccVersion());
		Assert.assertEquals(
			existingPlanEnrollment.getCtCollectionId(),
			newPlanEnrollment.getCtCollectionId());
		Assert.assertEquals(
			existingPlanEnrollment.getUuid(), newPlanEnrollment.getUuid());
		Assert.assertEquals(
			existingPlanEnrollment.getExternalReferenceCode(),
			newPlanEnrollment.getExternalReferenceCode());
		Assert.assertEquals(
			existingPlanEnrollment.getPlanEnrollmentId(),
			newPlanEnrollment.getPlanEnrollmentId());
		Assert.assertEquals(
			existingPlanEnrollment.getGroupId(),
			newPlanEnrollment.getGroupId());
		Assert.assertEquals(
			existingPlanEnrollment.getCompanyId(),
			newPlanEnrollment.getCompanyId());
		Assert.assertEquals(
			existingPlanEnrollment.getUserId(), newPlanEnrollment.getUserId());
		Assert.assertEquals(
			existingPlanEnrollment.getUserName(),
			newPlanEnrollment.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingPlanEnrollment.getCreateDate()),
			Time.getShortTimestamp(newPlanEnrollment.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingPlanEnrollment.getModifiedDate()),
			Time.getShortTimestamp(newPlanEnrollment.getModifiedDate()));
		Assert.assertEquals(
			existingPlanEnrollment.getInsurancePlanId(),
			newPlanEnrollment.getInsurancePlanId());
		Assert.assertEquals(
			existingPlanEnrollment.getMemberUserId(),
			newPlanEnrollment.getMemberUserId());
		Assert.assertEquals(
			existingPlanEnrollment.getMemberUserName(),
			newPlanEnrollment.getMemberUserName());
		Assert.assertEquals(
			existingPlanEnrollment.getMemberId(),
			newPlanEnrollment.getMemberId());
		Assert.assertEquals(
			existingPlanEnrollment.getGroupNumber(),
			newPlanEnrollment.getGroupNumber());
		Assert.assertEquals(
			Time.getShortTimestamp(existingPlanEnrollment.getStartDate()),
			Time.getShortTimestamp(newPlanEnrollment.getStartDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingPlanEnrollment.getEndDate()),
			Time.getShortTimestamp(newPlanEnrollment.getEndDate()));
		Assert.assertEquals(
			existingPlanEnrollment.getEnrollmentStatus(),
			newPlanEnrollment.getEnrollmentStatus());
		Assert.assertEquals(
			existingPlanEnrollment.getNotes(), newPlanEnrollment.getNotes());
		Assert.assertEquals(
			existingPlanEnrollment.getStatus(), newPlanEnrollment.getStatus());
		Assert.assertEquals(
			existingPlanEnrollment.getStatusByUserId(),
			newPlanEnrollment.getStatusByUserId());
		Assert.assertEquals(
			existingPlanEnrollment.getStatusByUserName(),
			newPlanEnrollment.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingPlanEnrollment.getStatusDate()),
			Time.getShortTimestamp(newPlanEnrollment.getStatusDate()));
	}

	@Test(
		expected = DuplicatePlanEnrollmentExternalReferenceCodeException.class
	)
	public void testUpdateWithExistingExternalReferenceCode() throws Exception {
		PlanEnrollment planEnrollment = addPlanEnrollment();

		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		newPlanEnrollment.setGroupId(planEnrollment.getGroupId());

		newPlanEnrollment = _persistence.update(newPlanEnrollment);

		Session session = _persistence.getCurrentSession();

		session.evict(newPlanEnrollment);

		newPlanEnrollment.setExternalReferenceCode(
			planEnrollment.getExternalReferenceCode());

		_persistence.update(newPlanEnrollment);
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByCompanyId() throws Exception {
		_persistence.countByCompanyId(RandomTestUtil.nextLong());

		_persistence.countByCompanyId(0L);
	}

	@Test
	public void testCountByG_S() throws Exception {
		_persistence.countByG_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_S(0L, 0);
	}

	@Test
	public void testCountByG_NotS() throws Exception {
		_persistence.countByG_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_NotS(0L, 0);
	}

	@Test
	public void testCountByIP_S() throws Exception {
		_persistence.countByIP_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByIP_S(0L, 0);
	}

	@Test
	public void testCountByIP_NotS() throws Exception {
		_persistence.countByIP_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByIP_NotS(0L, 0);
	}

	@Test
	public void testCountByG_IP_M_S() throws Exception {
		_persistence.countByG_IP_M_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_IP_M_S(0L, 0L, 0L, 0);
	}

	@Test
	public void testCountByG_IP_M_NotS() throws Exception {
		_persistence.countByG_IP_M_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_IP_M_NotS(0L, 0L, 0L, 0);
	}

	@Test
	public void testCountByC_S() throws Exception {
		_persistence.countByC_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByC_S(0L, 0);
	}

	@Test
	public void testCountByC_NotS() throws Exception {
		_persistence.countByC_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByC_NotS(0L, 0);
	}

	@Test
	public void testCountByG_U_S() throws Exception {
		_persistence.countByG_U_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextInt());

		_persistence.countByG_U_S(0L, 0L, 0);
	}

	@Test
	public void testCountByG_U_SArrayable() throws Exception {
		_persistence.countByG_U_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			new int[] {RandomTestUtil.nextInt(), 0});
	}

	@Test
	public void testCountByG_U_NotS() throws Exception {
		_persistence.countByG_U_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextInt());

		_persistence.countByG_U_NotS(0L, 0L, 0);
	}

	@Test
	public void testCountByUserId() throws Exception {
		_persistence.countByUserId(RandomTestUtil.nextLong());

		_persistence.countByUserId(0L);
	}

	@Test
	public void testCountByUserIdEnrollmentStatus() throws Exception {
		_persistence.countByUserIdEnrollmentStatus(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByUserIdEnrollmentStatus(0L, 0);
	}

	@Test
	public void testCountByGroupIdEnrollmentStatus() throws Exception {
		_persistence.countByGroupIdEnrollmentStatus(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByGroupIdEnrollmentStatus(0L, 0);
	}

	@Test
	public void testCountByMemberUserId() throws Exception {
		_persistence.countByMemberUserId(RandomTestUtil.nextLong());

		_persistence.countByMemberUserId(0L);
	}

	@Test
	public void testCountByMemberId() throws Exception {
		_persistence.countByMemberId("");

		_persistence.countByMemberId("null");

		_persistence.countByMemberId((String)null);
	}

	@Test
	public void testCountByInsurancePlan() throws Exception {
		_persistence.countByInsurancePlan(RandomTestUtil.nextLong());

		_persistence.countByInsurancePlan(0L);
	}

	@Test
	public void testCountByERC_G() throws Exception {
		_persistence.countByERC_G("", RandomTestUtil.nextLong());

		_persistence.countByERC_G("null", 0L);

		_persistence.countByERC_G((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		PlanEnrollment existingPlanEnrollment = _persistence.findByPrimaryKey(
			newPlanEnrollment.getPrimaryKey());

		Assert.assertEquals(existingPlanEnrollment, newPlanEnrollment);
	}

	@Test(expected = NoSuchPlanEnrollmentException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	@Test
	public void testFilterFindByGroupId() throws Exception {
		PermissionThreadLocal.setPermissionChecker(
			new SimplePermissionChecker() {
				{
					init(TestPropsValues.getUser());
				}

				@Override
				public boolean isCompanyAdmin(long companyId) {
					return false;
				}

			});

		Assert.assertTrue(InlineSQLHelperUtil.isEnabled(0));

		_persistence.filterFindByGroupId(
			0, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);

		_persistence.filterFindByGroupId(
			0, QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<PlanEnrollment> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"CIBT_PlanEnrollment", "mvccVersion", true, "ctCollectionId", true,
			"uuid", true, "externalReferenceCode", true, "planEnrollmentId",
			true, "groupId", true, "companyId", true, "userId", true,
			"userName", true, "createDate", true, "modifiedDate", true,
			"insurancePlanId", true, "memberUserId", true, "memberUserName",
			true, "memberId", true, "groupNumber", true, "startDate", true,
			"endDate", true, "enrollmentStatus", true, "notes", true, "status",
			true, "statusByUserId", true, "statusByUserName", true,
			"statusDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		PlanEnrollment existingPlanEnrollment = _persistence.fetchByPrimaryKey(
			newPlanEnrollment.getPrimaryKey());

		Assert.assertEquals(existingPlanEnrollment, newPlanEnrollment);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PlanEnrollment missingPlanEnrollment = _persistence.fetchByPrimaryKey(
			pk);

		Assert.assertNull(missingPlanEnrollment);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		PlanEnrollment newPlanEnrollment1 = addPlanEnrollment();
		PlanEnrollment newPlanEnrollment2 = addPlanEnrollment();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPlanEnrollment1.getPrimaryKey());
		primaryKeys.add(newPlanEnrollment2.getPrimaryKey());

		Map<Serializable, PlanEnrollment> planEnrollments =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, planEnrollments.size());
		Assert.assertEquals(
			newPlanEnrollment1,
			planEnrollments.get(newPlanEnrollment1.getPrimaryKey()));
		Assert.assertEquals(
			newPlanEnrollment2,
			planEnrollments.get(newPlanEnrollment2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, PlanEnrollment> planEnrollments =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(planEnrollments.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPlanEnrollment.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, PlanEnrollment> planEnrollments =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, planEnrollments.size());
		Assert.assertEquals(
			newPlanEnrollment,
			planEnrollments.get(newPlanEnrollment.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, PlanEnrollment> planEnrollments =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(planEnrollments.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPlanEnrollment.getPrimaryKey());

		Map<Serializable, PlanEnrollment> planEnrollments =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, planEnrollments.size());
		Assert.assertEquals(
			newPlanEnrollment,
			planEnrollments.get(newPlanEnrollment.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			PlanEnrollmentLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<PlanEnrollment>() {

				@Override
				public void performAction(PlanEnrollment planEnrollment) {
					Assert.assertNotNull(planEnrollment);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PlanEnrollment.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"planEnrollmentId", newPlanEnrollment.getPlanEnrollmentId()));

		List<PlanEnrollment> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		PlanEnrollment existingPlanEnrollment = result.get(0);

		Assert.assertEquals(existingPlanEnrollment, newPlanEnrollment);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PlanEnrollment.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"planEnrollmentId", RandomTestUtil.nextLong()));

		List<PlanEnrollment> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PlanEnrollment.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("planEnrollmentId"));

		Object newPlanEnrollmentId = newPlanEnrollment.getPlanEnrollmentId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"planEnrollmentId", new Object[] {newPlanEnrollmentId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingPlanEnrollmentId = result.get(0);

		Assert.assertEquals(existingPlanEnrollmentId, newPlanEnrollmentId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PlanEnrollment.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("planEnrollmentId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"planEnrollmentId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newPlanEnrollment.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		PlanEnrollment newPlanEnrollment = addPlanEnrollment();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PlanEnrollment.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"planEnrollmentId", newPlanEnrollment.getPlanEnrollmentId()));

		List<PlanEnrollment> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(PlanEnrollment planEnrollment) {
		Assert.assertEquals(
			planEnrollment.getUuid(),
			ReflectionTestUtil.invoke(
				planEnrollment, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(planEnrollment.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				planEnrollment, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));

		Assert.assertEquals(
			planEnrollment.getExternalReferenceCode(),
			ReflectionTestUtil.invoke(
				planEnrollment, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "externalReferenceCode"));
		Assert.assertEquals(
			Long.valueOf(planEnrollment.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				planEnrollment, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected PlanEnrollment addPlanEnrollment() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PlanEnrollment planEnrollment = _persistence.create(pk);

		planEnrollment.setMvccVersion(RandomTestUtil.nextLong());

		planEnrollment.setCtCollectionId(RandomTestUtil.nextLong());

		planEnrollment.setUuid(RandomTestUtil.randomString());

		planEnrollment.setExternalReferenceCode(RandomTestUtil.randomString());

		planEnrollment.setGroupId(RandomTestUtil.nextLong());

		planEnrollment.setCompanyId(RandomTestUtil.nextLong());

		planEnrollment.setUserId(RandomTestUtil.nextLong());

		planEnrollment.setUserName(RandomTestUtil.randomString());

		planEnrollment.setCreateDate(RandomTestUtil.nextDate());

		planEnrollment.setModifiedDate(RandomTestUtil.nextDate());

		planEnrollment.setInsurancePlanId(RandomTestUtil.nextLong());

		planEnrollment.setMemberUserId(RandomTestUtil.nextLong());

		planEnrollment.setMemberUserName(RandomTestUtil.randomString());

		planEnrollment.setMemberId(RandomTestUtil.randomString());

		planEnrollment.setGroupNumber(RandomTestUtil.randomString());

		planEnrollment.setStartDate(RandomTestUtil.nextDate());

		planEnrollment.setEndDate(RandomTestUtil.nextDate());

		planEnrollment.setEnrollmentStatus(RandomTestUtil.nextInt());

		planEnrollment.setNotes(RandomTestUtil.randomString());

		planEnrollment.setStatus(RandomTestUtil.nextInt());

		planEnrollment.setStatusByUserId(RandomTestUtil.nextLong());

		planEnrollment.setStatusByUserName(RandomTestUtil.randomString());

		planEnrollment.setStatusDate(RandomTestUtil.nextDate());

		_planEnrollments.add(_persistence.update(planEnrollment));

		return planEnrollment;
	}

	private List<PlanEnrollment> _planEnrollments =
		new ArrayList<PlanEnrollment>();
	private PlanEnrollmentPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}