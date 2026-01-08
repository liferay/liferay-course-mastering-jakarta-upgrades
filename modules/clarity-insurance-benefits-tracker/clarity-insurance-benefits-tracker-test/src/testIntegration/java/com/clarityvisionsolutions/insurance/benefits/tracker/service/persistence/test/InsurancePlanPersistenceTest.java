/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.test;

import com.clarityvisionsolutions.insurance.benefits.tracker.exception.DuplicateInsurancePlanExternalReferenceCodeException;
import com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchInsurancePlanException;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalServiceUtil;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.InsurancePlanPersistence;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.InsurancePlanUtil;

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
public class InsurancePlanPersistenceTest {

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
		_persistence = InsurancePlanUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<InsurancePlan> iterator = _insurancePlans.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		InsurancePlan insurancePlan = _persistence.create(pk);

		Assert.assertNotNull(insurancePlan);

		Assert.assertEquals(insurancePlan.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		_persistence.remove(newInsurancePlan);

		InsurancePlan existingInsurancePlan = _persistence.fetchByPrimaryKey(
			newInsurancePlan.getPrimaryKey());

		Assert.assertNull(existingInsurancePlan);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addInsurancePlan();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		InsurancePlan newInsurancePlan = _persistence.create(pk);

		newInsurancePlan.setMvccVersion(RandomTestUtil.nextLong());

		newInsurancePlan.setCtCollectionId(RandomTestUtil.nextLong());

		newInsurancePlan.setUuid(RandomTestUtil.randomString());

		newInsurancePlan.setExternalReferenceCode(
			RandomTestUtil.randomString());

		newInsurancePlan.setGroupId(RandomTestUtil.nextLong());

		newInsurancePlan.setCompanyId(RandomTestUtil.nextLong());

		newInsurancePlan.setUserId(RandomTestUtil.nextLong());

		newInsurancePlan.setUserName(RandomTestUtil.randomString());

		newInsurancePlan.setCreateDate(RandomTestUtil.nextDate());

		newInsurancePlan.setModifiedDate(RandomTestUtil.nextDate());

		newInsurancePlan.setPlanName(RandomTestUtil.randomString());

		newInsurancePlan.setProviderName(RandomTestUtil.randomString());

		newInsurancePlan.setActive(RandomTestUtil.randomBoolean());

		newInsurancePlan.setAnnualExamAllowanceCents(RandomTestUtil.nextLong());

		newInsurancePlan.setAnnualFramesAllowanceCents(
			RandomTestUtil.nextLong());

		newInsurancePlan.setAnnualLensesAllowanceCents(
			RandomTestUtil.nextLong());

		newInsurancePlan.setAnnualContactsAllowanceCents(
			RandomTestUtil.nextLong());

		newInsurancePlan.setCoveragePeriodMonths(RandomTestUtil.nextInt());

		newInsurancePlan.setStatus(RandomTestUtil.nextInt());

		newInsurancePlan.setStatusByUserId(RandomTestUtil.nextLong());

		newInsurancePlan.setStatusByUserName(RandomTestUtil.randomString());

		newInsurancePlan.setStatusDate(RandomTestUtil.nextDate());

		_insurancePlans.add(_persistence.update(newInsurancePlan));

		InsurancePlan existingInsurancePlan = _persistence.findByPrimaryKey(
			newInsurancePlan.getPrimaryKey());

		Assert.assertEquals(
			existingInsurancePlan.getMvccVersion(),
			newInsurancePlan.getMvccVersion());
		Assert.assertEquals(
			existingInsurancePlan.getCtCollectionId(),
			newInsurancePlan.getCtCollectionId());
		Assert.assertEquals(
			existingInsurancePlan.getUuid(), newInsurancePlan.getUuid());
		Assert.assertEquals(
			existingInsurancePlan.getExternalReferenceCode(),
			newInsurancePlan.getExternalReferenceCode());
		Assert.assertEquals(
			existingInsurancePlan.getInsurancePlanId(),
			newInsurancePlan.getInsurancePlanId());
		Assert.assertEquals(
			existingInsurancePlan.getGroupId(), newInsurancePlan.getGroupId());
		Assert.assertEquals(
			existingInsurancePlan.getCompanyId(),
			newInsurancePlan.getCompanyId());
		Assert.assertEquals(
			existingInsurancePlan.getUserId(), newInsurancePlan.getUserId());
		Assert.assertEquals(
			existingInsurancePlan.getUserName(),
			newInsurancePlan.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingInsurancePlan.getCreateDate()),
			Time.getShortTimestamp(newInsurancePlan.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingInsurancePlan.getModifiedDate()),
			Time.getShortTimestamp(newInsurancePlan.getModifiedDate()));
		Assert.assertEquals(
			existingInsurancePlan.getPlanName(),
			newInsurancePlan.getPlanName());
		Assert.assertEquals(
			existingInsurancePlan.getProviderName(),
			newInsurancePlan.getProviderName());
		Assert.assertEquals(
			existingInsurancePlan.isActive(), newInsurancePlan.isActive());
		Assert.assertEquals(
			existingInsurancePlan.getAnnualExamAllowanceCents(),
			newInsurancePlan.getAnnualExamAllowanceCents());
		Assert.assertEquals(
			existingInsurancePlan.getAnnualFramesAllowanceCents(),
			newInsurancePlan.getAnnualFramesAllowanceCents());
		Assert.assertEquals(
			existingInsurancePlan.getAnnualLensesAllowanceCents(),
			newInsurancePlan.getAnnualLensesAllowanceCents());
		Assert.assertEquals(
			existingInsurancePlan.getAnnualContactsAllowanceCents(),
			newInsurancePlan.getAnnualContactsAllowanceCents());
		Assert.assertEquals(
			existingInsurancePlan.getCoveragePeriodMonths(),
			newInsurancePlan.getCoveragePeriodMonths());
		Assert.assertEquals(
			existingInsurancePlan.getStatus(), newInsurancePlan.getStatus());
		Assert.assertEquals(
			existingInsurancePlan.getStatusByUserId(),
			newInsurancePlan.getStatusByUserId());
		Assert.assertEquals(
			existingInsurancePlan.getStatusByUserName(),
			newInsurancePlan.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingInsurancePlan.getStatusDate()),
			Time.getShortTimestamp(newInsurancePlan.getStatusDate()));
	}

	@Test(expected = DuplicateInsurancePlanExternalReferenceCodeException.class)
	public void testUpdateWithExistingExternalReferenceCode() throws Exception {
		InsurancePlan insurancePlan = addInsurancePlan();

		InsurancePlan newInsurancePlan = addInsurancePlan();

		newInsurancePlan.setGroupId(insurancePlan.getGroupId());

		newInsurancePlan = _persistence.update(newInsurancePlan);

		Session session = _persistence.getCurrentSession();

		session.evict(newInsurancePlan);

		newInsurancePlan.setExternalReferenceCode(
			insurancePlan.getExternalReferenceCode());

		_persistence.update(newInsurancePlan);
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
	public void testCountByCompanyIdActive() throws Exception {
		_persistence.countByCompanyIdActive(
			RandomTestUtil.nextLong(), RandomTestUtil.randomBoolean());

		_persistence.countByCompanyIdActive(0L, RandomTestUtil.randomBoolean());
	}

	@Test
	public void testCountByGroupIdActive() throws Exception {
		_persistence.countByGroupIdActive(
			RandomTestUtil.nextLong(), RandomTestUtil.randomBoolean());

		_persistence.countByGroupIdActive(0L, RandomTestUtil.randomBoolean());
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
	public void testCountByExternalReferenceCode() throws Exception {
		_persistence.countByExternalReferenceCode("");

		_persistence.countByExternalReferenceCode("null");

		_persistence.countByExternalReferenceCode((String)null);
	}

	@Test
	public void testCountByERC_G() throws Exception {
		_persistence.countByERC_G("", RandomTestUtil.nextLong());

		_persistence.countByERC_G("null", 0L);

		_persistence.countByERC_G((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		InsurancePlan existingInsurancePlan = _persistence.findByPrimaryKey(
			newInsurancePlan.getPrimaryKey());

		Assert.assertEquals(existingInsurancePlan, newInsurancePlan);
	}

	@Test(expected = NoSuchInsurancePlanException.class)
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

	protected OrderByComparator<InsurancePlan> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"CIBT_InsurancePlan", "mvccVersion", true, "ctCollectionId", true,
			"uuid", true, "externalReferenceCode", true, "insurancePlanId",
			true, "groupId", true, "companyId", true, "userId", true,
			"userName", true, "createDate", true, "modifiedDate", true,
			"planName", true, "providerName", true, "active", true,
			"annualExamAllowanceCents", true, "annualFramesAllowanceCents",
			true, "annualLensesAllowanceCents", true,
			"annualContactsAllowanceCents", true, "coveragePeriodMonths", true,
			"status", true, "statusByUserId", true, "statusByUserName", true,
			"statusDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		InsurancePlan existingInsurancePlan = _persistence.fetchByPrimaryKey(
			newInsurancePlan.getPrimaryKey());

		Assert.assertEquals(existingInsurancePlan, newInsurancePlan);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		InsurancePlan missingInsurancePlan = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingInsurancePlan);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		InsurancePlan newInsurancePlan1 = addInsurancePlan();
		InsurancePlan newInsurancePlan2 = addInsurancePlan();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newInsurancePlan1.getPrimaryKey());
		primaryKeys.add(newInsurancePlan2.getPrimaryKey());

		Map<Serializable, InsurancePlan> insurancePlans =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, insurancePlans.size());
		Assert.assertEquals(
			newInsurancePlan1,
			insurancePlans.get(newInsurancePlan1.getPrimaryKey()));
		Assert.assertEquals(
			newInsurancePlan2,
			insurancePlans.get(newInsurancePlan2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, InsurancePlan> insurancePlans =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(insurancePlans.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		InsurancePlan newInsurancePlan = addInsurancePlan();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newInsurancePlan.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, InsurancePlan> insurancePlans =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, insurancePlans.size());
		Assert.assertEquals(
			newInsurancePlan,
			insurancePlans.get(newInsurancePlan.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, InsurancePlan> insurancePlans =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(insurancePlans.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newInsurancePlan.getPrimaryKey());

		Map<Serializable, InsurancePlan> insurancePlans =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, insurancePlans.size());
		Assert.assertEquals(
			newInsurancePlan,
			insurancePlans.get(newInsurancePlan.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			InsurancePlanLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<InsurancePlan>() {

				@Override
				public void performAction(InsurancePlan insurancePlan) {
					Assert.assertNotNull(insurancePlan);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			InsurancePlan.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"insurancePlanId", newInsurancePlan.getInsurancePlanId()));

		List<InsurancePlan> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		InsurancePlan existingInsurancePlan = result.get(0);

		Assert.assertEquals(existingInsurancePlan, newInsurancePlan);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			InsurancePlan.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"insurancePlanId", RandomTestUtil.nextLong()));

		List<InsurancePlan> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			InsurancePlan.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("insurancePlanId"));

		Object newInsurancePlanId = newInsurancePlan.getInsurancePlanId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"insurancePlanId", new Object[] {newInsurancePlanId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingInsurancePlanId = result.get(0);

		Assert.assertEquals(existingInsurancePlanId, newInsurancePlanId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			InsurancePlan.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("insurancePlanId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"insurancePlanId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		InsurancePlan newInsurancePlan = addInsurancePlan();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newInsurancePlan.getPrimaryKey()));
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

		InsurancePlan newInsurancePlan = addInsurancePlan();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			InsurancePlan.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"insurancePlanId", newInsurancePlan.getInsurancePlanId()));

		List<InsurancePlan> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(InsurancePlan insurancePlan) {
		Assert.assertEquals(
			insurancePlan.getUuid(),
			ReflectionTestUtil.invoke(
				insurancePlan, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(insurancePlan.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				insurancePlan, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));

		Assert.assertEquals(
			insurancePlan.getExternalReferenceCode(),
			ReflectionTestUtil.invoke(
				insurancePlan, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "externalReferenceCode"));

		Assert.assertEquals(
			insurancePlan.getExternalReferenceCode(),
			ReflectionTestUtil.invoke(
				insurancePlan, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "externalReferenceCode"));
		Assert.assertEquals(
			Long.valueOf(insurancePlan.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				insurancePlan, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected InsurancePlan addInsurancePlan() throws Exception {
		long pk = RandomTestUtil.nextLong();

		InsurancePlan insurancePlan = _persistence.create(pk);

		insurancePlan.setMvccVersion(RandomTestUtil.nextLong());

		insurancePlan.setCtCollectionId(RandomTestUtil.nextLong());

		insurancePlan.setUuid(RandomTestUtil.randomString());

		insurancePlan.setExternalReferenceCode(RandomTestUtil.randomString());

		insurancePlan.setGroupId(RandomTestUtil.nextLong());

		insurancePlan.setCompanyId(RandomTestUtil.nextLong());

		insurancePlan.setUserId(RandomTestUtil.nextLong());

		insurancePlan.setUserName(RandomTestUtil.randomString());

		insurancePlan.setCreateDate(RandomTestUtil.nextDate());

		insurancePlan.setModifiedDate(RandomTestUtil.nextDate());

		insurancePlan.setPlanName(RandomTestUtil.randomString());

		insurancePlan.setProviderName(RandomTestUtil.randomString());

		insurancePlan.setActive(RandomTestUtil.randomBoolean());

		insurancePlan.setAnnualExamAllowanceCents(RandomTestUtil.nextLong());

		insurancePlan.setAnnualFramesAllowanceCents(RandomTestUtil.nextLong());

		insurancePlan.setAnnualLensesAllowanceCents(RandomTestUtil.nextLong());

		insurancePlan.setAnnualContactsAllowanceCents(
			RandomTestUtil.nextLong());

		insurancePlan.setCoveragePeriodMonths(RandomTestUtil.nextInt());

		insurancePlan.setStatus(RandomTestUtil.nextInt());

		insurancePlan.setStatusByUserId(RandomTestUtil.nextLong());

		insurancePlan.setStatusByUserName(RandomTestUtil.randomString());

		insurancePlan.setStatusDate(RandomTestUtil.nextDate());

		_insurancePlans.add(_persistence.update(insurancePlan));

		return insurancePlan;
	}

	private List<InsurancePlan> _insurancePlans =
		new ArrayList<InsurancePlan>();
	private InsurancePlanPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}