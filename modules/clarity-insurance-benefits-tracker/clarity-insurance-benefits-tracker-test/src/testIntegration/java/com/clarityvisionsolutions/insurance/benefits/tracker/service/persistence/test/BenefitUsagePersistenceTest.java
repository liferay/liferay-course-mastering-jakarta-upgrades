/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.test;

import com.clarityvisionsolutions.insurance.benefits.tracker.exception.DuplicateBenefitUsageExternalReferenceCodeException;
import com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchBenefitUsageException;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageLocalServiceUtil;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.BenefitUsagePersistence;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.BenefitUsageUtil;

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
public class BenefitUsagePersistenceTest {

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
		_persistence = BenefitUsageUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BenefitUsage> iterator = _benefitUsages.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BenefitUsage benefitUsage = _persistence.create(pk);

		Assert.assertNotNull(benefitUsage);

		Assert.assertEquals(benefitUsage.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		_persistence.remove(newBenefitUsage);

		BenefitUsage existingBenefitUsage = _persistence.fetchByPrimaryKey(
			newBenefitUsage.getPrimaryKey());

		Assert.assertNull(existingBenefitUsage);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBenefitUsage();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BenefitUsage newBenefitUsage = _persistence.create(pk);

		newBenefitUsage.setMvccVersion(RandomTestUtil.nextLong());

		newBenefitUsage.setCtCollectionId(RandomTestUtil.nextLong());

		newBenefitUsage.setUuid(RandomTestUtil.randomString());

		newBenefitUsage.setExternalReferenceCode(RandomTestUtil.randomString());

		newBenefitUsage.setGroupId(RandomTestUtil.nextLong());

		newBenefitUsage.setCompanyId(RandomTestUtil.nextLong());

		newBenefitUsage.setUserId(RandomTestUtil.nextLong());

		newBenefitUsage.setUserName(RandomTestUtil.randomString());

		newBenefitUsage.setCreateDate(RandomTestUtil.nextDate());

		newBenefitUsage.setModifiedDate(RandomTestUtil.nextDate());

		newBenefitUsage.setPlanEnrollmentId(RandomTestUtil.nextLong());

		newBenefitUsage.setBenefitType(RandomTestUtil.randomString());

		newBenefitUsage.setAmountUsedCents(RandomTestUtil.nextLong());

		newBenefitUsage.setServiceDate(RandomTestUtil.nextDate());

		newBenefitUsage.setReference(RandomTestUtil.randomString());

		newBenefitUsage.setNotes(RandomTestUtil.randomString());

		newBenefitUsage.setSourceType(RandomTestUtil.randomString());

		newBenefitUsage.setSourceReference(RandomTestUtil.randomString());

		newBenefitUsage.setStatus(RandomTestUtil.nextInt());

		newBenefitUsage.setStatusByUserId(RandomTestUtil.nextLong());

		newBenefitUsage.setStatusByUserName(RandomTestUtil.randomString());

		newBenefitUsage.setStatusDate(RandomTestUtil.nextDate());

		_benefitUsages.add(_persistence.update(newBenefitUsage));

		BenefitUsage existingBenefitUsage = _persistence.findByPrimaryKey(
			newBenefitUsage.getPrimaryKey());

		Assert.assertEquals(
			existingBenefitUsage.getMvccVersion(),
			newBenefitUsage.getMvccVersion());
		Assert.assertEquals(
			existingBenefitUsage.getCtCollectionId(),
			newBenefitUsage.getCtCollectionId());
		Assert.assertEquals(
			existingBenefitUsage.getUuid(), newBenefitUsage.getUuid());
		Assert.assertEquals(
			existingBenefitUsage.getExternalReferenceCode(),
			newBenefitUsage.getExternalReferenceCode());
		Assert.assertEquals(
			existingBenefitUsage.getBenefitUsageId(),
			newBenefitUsage.getBenefitUsageId());
		Assert.assertEquals(
			existingBenefitUsage.getGroupId(), newBenefitUsage.getGroupId());
		Assert.assertEquals(
			existingBenefitUsage.getCompanyId(),
			newBenefitUsage.getCompanyId());
		Assert.assertEquals(
			existingBenefitUsage.getUserId(), newBenefitUsage.getUserId());
		Assert.assertEquals(
			existingBenefitUsage.getUserName(), newBenefitUsage.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBenefitUsage.getCreateDate()),
			Time.getShortTimestamp(newBenefitUsage.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingBenefitUsage.getModifiedDate()),
			Time.getShortTimestamp(newBenefitUsage.getModifiedDate()));
		Assert.assertEquals(
			existingBenefitUsage.getPlanEnrollmentId(),
			newBenefitUsage.getPlanEnrollmentId());
		Assert.assertEquals(
			existingBenefitUsage.getBenefitType(),
			newBenefitUsage.getBenefitType());
		Assert.assertEquals(
			existingBenefitUsage.getAmountUsedCents(),
			newBenefitUsage.getAmountUsedCents());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBenefitUsage.getServiceDate()),
			Time.getShortTimestamp(newBenefitUsage.getServiceDate()));
		Assert.assertEquals(
			existingBenefitUsage.getReference(),
			newBenefitUsage.getReference());
		Assert.assertEquals(
			existingBenefitUsage.getNotes(), newBenefitUsage.getNotes());
		Assert.assertEquals(
			existingBenefitUsage.getSourceType(),
			newBenefitUsage.getSourceType());
		Assert.assertEquals(
			existingBenefitUsage.getSourceReference(),
			newBenefitUsage.getSourceReference());
		Assert.assertEquals(
			existingBenefitUsage.getStatus(), newBenefitUsage.getStatus());
		Assert.assertEquals(
			existingBenefitUsage.getStatusByUserId(),
			newBenefitUsage.getStatusByUserId());
		Assert.assertEquals(
			existingBenefitUsage.getStatusByUserName(),
			newBenefitUsage.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingBenefitUsage.getStatusDate()),
			Time.getShortTimestamp(newBenefitUsage.getStatusDate()));
	}

	@Test(expected = DuplicateBenefitUsageExternalReferenceCodeException.class)
	public void testUpdateWithExistingExternalReferenceCode() throws Exception {
		BenefitUsage benefitUsage = addBenefitUsage();

		BenefitUsage newBenefitUsage = addBenefitUsage();

		newBenefitUsage.setGroupId(benefitUsage.getGroupId());

		newBenefitUsage = _persistence.update(newBenefitUsage);

		Session session = _persistence.getCurrentSession();

		session.evict(newBenefitUsage);

		newBenefitUsage.setExternalReferenceCode(
			benefitUsage.getExternalReferenceCode());

		_persistence.update(newBenefitUsage);
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
	public void testCountByPE_S() throws Exception {
		_persistence.countByPE_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByPE_S(0L, 0);
	}

	@Test
	public void testCountByPE_NotS() throws Exception {
		_persistence.countByPE_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByPE_NotS(0L, 0);
	}

	@Test
	public void testCountByG_PE_S() throws Exception {
		_persistence.countByG_PE_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextInt());

		_persistence.countByG_PE_S(0L, 0L, 0);
	}

	@Test
	public void testCountByG_PE_NotS() throws Exception {
		_persistence.countByG_PE_NotS(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextInt());

		_persistence.countByG_PE_NotS(0L, 0L, 0);
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
	public void testCountByPlanEnrollment() throws Exception {
		_persistence.countByPlanEnrollment(RandomTestUtil.nextLong());

		_persistence.countByPlanEnrollment(0L);
	}

	@Test
	public void testCountByPlanEnrollmentServiceDate() throws Exception {
		_persistence.countByPlanEnrollmentServiceDate(
			RandomTestUtil.nextLong(), RandomTestUtil.nextDate());

		_persistence.countByPlanEnrollmentServiceDate(
			0L, RandomTestUtil.nextDate());
	}

	@Test
	public void testCountByERC_G() throws Exception {
		_persistence.countByERC_G("", RandomTestUtil.nextLong());

		_persistence.countByERC_G("null", 0L);

		_persistence.countByERC_G((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		BenefitUsage existingBenefitUsage = _persistence.findByPrimaryKey(
			newBenefitUsage.getPrimaryKey());

		Assert.assertEquals(existingBenefitUsage, newBenefitUsage);
	}

	@Test(expected = NoSuchBenefitUsageException.class)
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

	protected OrderByComparator<BenefitUsage> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"CIBT_BenefitUsage", "mvccVersion", true, "ctCollectionId", true,
			"uuid", true, "externalReferenceCode", true, "benefitUsageId", true,
			"groupId", true, "companyId", true, "userId", true, "userName",
			true, "createDate", true, "modifiedDate", true, "planEnrollmentId",
			true, "benefitType", true, "amountUsedCents", true, "serviceDate",
			true, "reference", true, "notes", true, "sourceType", true,
			"sourceReference", true, "status", true, "statusByUserId", true,
			"statusByUserName", true, "statusDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		BenefitUsage existingBenefitUsage = _persistence.fetchByPrimaryKey(
			newBenefitUsage.getPrimaryKey());

		Assert.assertEquals(existingBenefitUsage, newBenefitUsage);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BenefitUsage missingBenefitUsage = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBenefitUsage);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		BenefitUsage newBenefitUsage1 = addBenefitUsage();
		BenefitUsage newBenefitUsage2 = addBenefitUsage();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBenefitUsage1.getPrimaryKey());
		primaryKeys.add(newBenefitUsage2.getPrimaryKey());

		Map<Serializable, BenefitUsage> benefitUsages =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, benefitUsages.size());
		Assert.assertEquals(
			newBenefitUsage1,
			benefitUsages.get(newBenefitUsage1.getPrimaryKey()));
		Assert.assertEquals(
			newBenefitUsage2,
			benefitUsages.get(newBenefitUsage2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BenefitUsage> benefitUsages =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(benefitUsages.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		BenefitUsage newBenefitUsage = addBenefitUsage();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBenefitUsage.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BenefitUsage> benefitUsages =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, benefitUsages.size());
		Assert.assertEquals(
			newBenefitUsage,
			benefitUsages.get(newBenefitUsage.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BenefitUsage> benefitUsages =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(benefitUsages.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBenefitUsage.getPrimaryKey());

		Map<Serializable, BenefitUsage> benefitUsages =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, benefitUsages.size());
		Assert.assertEquals(
			newBenefitUsage,
			benefitUsages.get(newBenefitUsage.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			BenefitUsageLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<BenefitUsage>() {

				@Override
				public void performAction(BenefitUsage benefitUsage) {
					Assert.assertNotNull(benefitUsage);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BenefitUsage.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"benefitUsageId", newBenefitUsage.getBenefitUsageId()));

		List<BenefitUsage> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		BenefitUsage existingBenefitUsage = result.get(0);

		Assert.assertEquals(existingBenefitUsage, newBenefitUsage);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BenefitUsage.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"benefitUsageId", RandomTestUtil.nextLong()));

		List<BenefitUsage> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BenefitUsage.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("benefitUsageId"));

		Object newBenefitUsageId = newBenefitUsage.getBenefitUsageId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"benefitUsageId", new Object[] {newBenefitUsageId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingBenefitUsageId = result.get(0);

		Assert.assertEquals(existingBenefitUsageId, newBenefitUsageId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BenefitUsage.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("benefitUsageId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"benefitUsageId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		BenefitUsage newBenefitUsage = addBenefitUsage();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newBenefitUsage.getPrimaryKey()));
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

		BenefitUsage newBenefitUsage = addBenefitUsage();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BenefitUsage.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"benefitUsageId", newBenefitUsage.getBenefitUsageId()));

		List<BenefitUsage> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(BenefitUsage benefitUsage) {
		Assert.assertEquals(
			benefitUsage.getUuid(),
			ReflectionTestUtil.invoke(
				benefitUsage, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(benefitUsage.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				benefitUsage, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));

		Assert.assertEquals(
			benefitUsage.getExternalReferenceCode(),
			ReflectionTestUtil.invoke(
				benefitUsage, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "externalReferenceCode"));
		Assert.assertEquals(
			Long.valueOf(benefitUsage.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				benefitUsage, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected BenefitUsage addBenefitUsage() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BenefitUsage benefitUsage = _persistence.create(pk);

		benefitUsage.setMvccVersion(RandomTestUtil.nextLong());

		benefitUsage.setCtCollectionId(RandomTestUtil.nextLong());

		benefitUsage.setUuid(RandomTestUtil.randomString());

		benefitUsage.setExternalReferenceCode(RandomTestUtil.randomString());

		benefitUsage.setGroupId(RandomTestUtil.nextLong());

		benefitUsage.setCompanyId(RandomTestUtil.nextLong());

		benefitUsage.setUserId(RandomTestUtil.nextLong());

		benefitUsage.setUserName(RandomTestUtil.randomString());

		benefitUsage.setCreateDate(RandomTestUtil.nextDate());

		benefitUsage.setModifiedDate(RandomTestUtil.nextDate());

		benefitUsage.setPlanEnrollmentId(RandomTestUtil.nextLong());

		benefitUsage.setBenefitType(RandomTestUtil.randomString());

		benefitUsage.setAmountUsedCents(RandomTestUtil.nextLong());

		benefitUsage.setServiceDate(RandomTestUtil.nextDate());

		benefitUsage.setReference(RandomTestUtil.randomString());

		benefitUsage.setNotes(RandomTestUtil.randomString());

		benefitUsage.setSourceType(RandomTestUtil.randomString());

		benefitUsage.setSourceReference(RandomTestUtil.randomString());

		benefitUsage.setStatus(RandomTestUtil.nextInt());

		benefitUsage.setStatusByUserId(RandomTestUtil.nextLong());

		benefitUsage.setStatusByUserName(RandomTestUtil.randomString());

		benefitUsage.setStatusDate(RandomTestUtil.nextDate());

		_benefitUsages.add(_persistence.update(benefitUsage));

		return benefitUsage;
	}

	private List<BenefitUsage> _benefitUsages = new ArrayList<BenefitUsage>();
	private BenefitUsagePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}