package com.clarityvisionsolutions.insurance.benefits.tracker.rest.resource.v1_0.test;

import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.dto.v1_0.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.dto.v1_0.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.http.HttpInvoker;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.pagination.Page;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.pagination.Pagination;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.resource.v1_0.PlanEnrollmentResource;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.client.serdes.v1_0.PlanEnrollmentSerDes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.function.UnsafeTriConsumer;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.search.test.rule.SearchTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.lang.reflect.Method;

import java.text.Format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author dnebinger
 * @generated
 */
@Generated("")
public abstract class BasePlanEnrollmentResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_format = FastDateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_planEnrollmentResource.setContextCompany(testCompany);

		_testCompanyAdminUser = UserTestUtil.getAdminUser(
			testCompany.getCompanyId());

		planEnrollmentResource = PlanEnrollmentResource.builder(
		).authentication(
			_testCompanyAdminUser.getEmailAddress(),
			PropsValues.DEFAULT_ADMIN_PASSWORD
		).endpoint(
			testCompany.getVirtualHostname(), 8080, "http"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		PlanEnrollment planEnrollment1 = randomPlanEnrollment();

		String json = objectMapper.writeValueAsString(planEnrollment1);

		PlanEnrollment planEnrollment2 = PlanEnrollmentSerDes.toDTO(json);

		Assert.assertTrue(equals(planEnrollment1, planEnrollment2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		PlanEnrollment planEnrollment = randomPlanEnrollment();

		String json1 = objectMapper.writeValueAsString(planEnrollment);
		String json2 = PlanEnrollmentSerDes.toJSON(planEnrollment);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	protected ObjectMapper getClientSerDesObjectMapper() {
		return new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		PlanEnrollment planEnrollment = randomPlanEnrollment();

		planEnrollment.setExternalReferenceCode(regex);
		planEnrollment.setGroupNumber(regex);
		planEnrollment.setInsurancePlanERC(regex);
		planEnrollment.setMemberId(regex);
		planEnrollment.setNotes(regex);

		String json = PlanEnrollmentSerDes.toJSON(planEnrollment);

		Assert.assertFalse(json.contains(regex));

		planEnrollment = PlanEnrollmentSerDes.toDTO(json);

		Assert.assertEquals(regex, planEnrollment.getExternalReferenceCode());
		Assert.assertEquals(regex, planEnrollment.getGroupNumber());
		Assert.assertEquals(regex, planEnrollment.getInsurancePlanERC());
		Assert.assertEquals(regex, planEnrollment.getMemberId());
		Assert.assertEquals(regex, planEnrollment.getNotes());
	}

	@Test
	public void testDeletePlanEnrollment() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		PlanEnrollment planEnrollment =
			testDeletePlanEnrollment_addPlanEnrollment();

		assertHttpResponseStatusCode(
			204,
			planEnrollmentResource.deletePlanEnrollmentHttpResponse(
				planEnrollment.getId()));

		assertHttpResponseStatusCode(
			404,
			planEnrollmentResource.getPlanEnrollmentHttpResponse(
				planEnrollment.getId()));
		assertHttpResponseStatusCode(
			404, planEnrollmentResource.getPlanEnrollmentHttpResponse(0L));
	}

	protected PlanEnrollment testDeletePlanEnrollment_addPlanEnrollment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeletePlanEnrollment() throws Exception {

		// No namespace

		PlanEnrollment planEnrollment1 =
			testGraphQLDeletePlanEnrollment_addPlanEnrollment();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deletePlanEnrollment",
						new HashMap<String, Object>() {
							{
								put(
									"planEnrollmentId",
									planEnrollment1.getId());
							}
						})),
				"JSONObject/data", "Object/deletePlanEnrollment"));

		JSONArray errorsJSONArray1 = JSONUtil.getValueAsJSONArray(
			invokeGraphQLQuery(
				new GraphQLField(
					"planEnrollment",
					new HashMap<String, Object>() {
						{
							put("planEnrollmentId", planEnrollment1.getId());
						}
					},
					new GraphQLField("id"))),
			"JSONArray/errors");

		Assert.assertTrue(errorsJSONArray1.length() > 0);

		// Using the namespace clarityInsuranceBenefitsTracker_v1_0

		PlanEnrollment planEnrollment2 =
			testGraphQLDeletePlanEnrollment_addPlanEnrollment();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"clarityInsuranceBenefitsTracker_v1_0",
						new GraphQLField(
							"deletePlanEnrollment",
							new HashMap<String, Object>() {
								{
									put(
										"planEnrollmentId",
										planEnrollment2.getId());
								}
							}))),
				"JSONObject/data",
				"JSONObject/clarityInsuranceBenefitsTracker_v1_0",
				"Object/deletePlanEnrollment"));

		JSONArray errorsJSONArray2 = JSONUtil.getValueAsJSONArray(
			invokeGraphQLQuery(
				new GraphQLField(
					"clarityInsuranceBenefitsTracker_v1_0",
					new GraphQLField(
						"planEnrollment",
						new HashMap<String, Object>() {
							{
								put(
									"planEnrollmentId",
									planEnrollment2.getId());
							}
						},
						new GraphQLField("id")))),
			"JSONArray/errors");

		Assert.assertTrue(errorsJSONArray2.length() > 0);
	}

	protected PlanEnrollment testGraphQLDeletePlanEnrollment_addPlanEnrollment()
		throws Exception {

		return testGraphQLPlanEnrollment_addPlanEnrollment();
	}

	@Test
	public void testGetPlanEnrollment() throws Exception {
		PlanEnrollment postPlanEnrollment =
			testGetPlanEnrollment_addPlanEnrollment();

		PlanEnrollment getPlanEnrollment =
			planEnrollmentResource.getPlanEnrollment(
				postPlanEnrollment.getId());

		assertEquals(postPlanEnrollment, getPlanEnrollment);
		assertValid(getPlanEnrollment);
	}

	protected PlanEnrollment testGetPlanEnrollment_addPlanEnrollment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetPlanEnrollment() throws Exception {
		PlanEnrollment planEnrollment =
			testGraphQLGetPlanEnrollment_addPlanEnrollment();

		// No namespace

		Assert.assertTrue(
			equals(
				planEnrollment,
				PlanEnrollmentSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"planEnrollment",
								new HashMap<String, Object>() {
									{
										put(
											"planEnrollmentId",
											planEnrollment.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/planEnrollment"))));

		// Using the namespace clarityInsuranceBenefitsTracker_v1_0

		Assert.assertTrue(
			equals(
				planEnrollment,
				PlanEnrollmentSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"clarityInsuranceBenefitsTracker_v1_0",
								new GraphQLField(
									"planEnrollment",
									new HashMap<String, Object>() {
										{
											put(
												"planEnrollmentId",
												planEnrollment.getId());
										}
									},
									getGraphQLFields()))),
						"JSONObject/data",
						"JSONObject/clarityInsuranceBenefitsTracker_v1_0",
						"Object/planEnrollment"))));
	}

	@Test
	public void testGraphQLGetPlanEnrollmentNotFound() throws Exception {
		Long irrelevantPlanEnrollmentId = RandomTestUtil.randomLong();

		// No namespace

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"planEnrollment",
						new HashMap<String, Object>() {
							{
								put(
									"planEnrollmentId",
									irrelevantPlanEnrollmentId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));

		// Using the namespace clarityInsuranceBenefitsTracker_v1_0

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"clarityInsuranceBenefitsTracker_v1_0",
						new GraphQLField(
							"planEnrollment",
							new HashMap<String, Object>() {
								{
									put(
										"planEnrollmentId",
										irrelevantPlanEnrollmentId);
								}
							},
							getGraphQLFields()))),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	protected PlanEnrollment testGraphQLGetPlanEnrollment_addPlanEnrollment()
		throws Exception {

		return testGraphQLPlanEnrollment_addPlanEnrollment();
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPage() throws Exception {
		Long planEnrollmentId =
			testGetPlanEnrollmentBenefitUsagesPage_getPlanEnrollmentId();
		Long irrelevantPlanEnrollmentId =
			testGetPlanEnrollmentBenefitUsagesPage_getIrrelevantPlanEnrollmentId();

		Page<PlanEnrollment> page =
			planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
				planEnrollmentId, null, null, null, Pagination.of(1, 10), null);

		long totalCount = page.getTotalCount();

		if (irrelevantPlanEnrollmentId != null) {
			PlanEnrollment irrelevantPlanEnrollment =
				testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
					irrelevantPlanEnrollmentId,
					randomIrrelevantPlanEnrollment());

			page = planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
				irrelevantPlanEnrollmentId, null, null, null,
				Pagination.of(1, (int)totalCount + 1), null);

			Assert.assertEquals(totalCount + 1, page.getTotalCount());

			assertContains(
				irrelevantPlanEnrollment,
				(List<PlanEnrollment>)page.getItems());
			assertValid(
				page,
				testGetPlanEnrollmentBenefitUsagesPage_getExpectedActions(
					irrelevantPlanEnrollmentId));
		}

		PlanEnrollment planEnrollment1 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		PlanEnrollment planEnrollment2 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		page = planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
			planEnrollmentId, null, null, null, Pagination.of(1, 10), null);

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(planEnrollment1, (List<PlanEnrollment>)page.getItems());
		assertContains(planEnrollment2, (List<PlanEnrollment>)page.getItems());
		assertValid(
			page,
			testGetPlanEnrollmentBenefitUsagesPage_getExpectedActions(
				planEnrollmentId));

		planEnrollmentResource.deletePlanEnrollment(planEnrollment1.getId());

		planEnrollmentResource.deletePlanEnrollment(planEnrollment2.getId());
	}

	protected Map<String, Map<String, String>>
			testGetPlanEnrollmentBenefitUsagesPage_getExpectedActions(
				Long planEnrollmentId)
		throws Exception {

		Map<String, Map<String, String>> expectedActions = new HashMap<>();

		return expectedActions;
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithFilterDateTimeEquals()
		throws Exception {

		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		Long planEnrollmentId =
			testGetPlanEnrollmentBenefitUsagesPage_getPlanEnrollmentId();

		PlanEnrollment planEnrollment1 = randomPlanEnrollment();

		planEnrollment1 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, planEnrollment1);

		for (EntityField entityField : entityFields) {
			Page<PlanEnrollment> page =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null,
					getFilterString(entityField, "between", planEnrollment1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(planEnrollment1),
				(List<PlanEnrollment>)page.getItems());
		}
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithFilterDoubleEquals()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithFilter(
			"eq", EntityField.Type.DOUBLE);
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithFilterStringContains()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithFilter(
			"contains", EntityField.Type.STRING);
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithFilterStringEquals()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithFilter(
			"eq", EntityField.Type.STRING);
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithFilterStringStartsWith()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithFilter(
			"startswith", EntityField.Type.STRING);
	}

	protected void testGetPlanEnrollmentBenefitUsagesPageWithFilter(
			String operator, EntityField.Type type)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Long planEnrollmentId =
			testGetPlanEnrollmentBenefitUsagesPage_getPlanEnrollmentId();

		PlanEnrollment planEnrollment1 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		PlanEnrollment planEnrollment2 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		for (EntityField entityField : entityFields) {
			Page<PlanEnrollment> page =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null,
					getFilterString(entityField, operator, planEnrollment1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(planEnrollment1),
				(List<PlanEnrollment>)page.getItems());
		}
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithPagination()
		throws Exception {

		Long planEnrollmentId =
			testGetPlanEnrollmentBenefitUsagesPage_getPlanEnrollmentId();

		Page<PlanEnrollment> planEnrollmentsPage =
			planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
				planEnrollmentId, null, null, null, null, null);

		int totalCount = GetterUtil.getInteger(
			planEnrollmentsPage.getTotalCount());

		PlanEnrollment planEnrollment1 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		PlanEnrollment planEnrollment2 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		PlanEnrollment planEnrollment3 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, randomPlanEnrollment());

		// See com.liferay.portal.vulcan.internal.configuration.HeadlessAPICompanyConfiguration#pageSizeLimit

		int pageSizeLimit = 500;

		if (totalCount >= (pageSizeLimit - 2)) {
			Page<PlanEnrollment> page1 =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(
						(int)Math.ceil((totalCount + 1.0) / pageSizeLimit),
						pageSizeLimit),
					null);

			Assert.assertEquals(totalCount + 3, page1.getTotalCount());

			assertContains(
				planEnrollment1, (List<PlanEnrollment>)page1.getItems());

			Page<PlanEnrollment> page2 =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(
						(int)Math.ceil((totalCount + 2.0) / pageSizeLimit),
						pageSizeLimit),
					null);

			assertContains(
				planEnrollment2, (List<PlanEnrollment>)page2.getItems());

			Page<PlanEnrollment> page3 =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(
						(int)Math.ceil((totalCount + 3.0) / pageSizeLimit),
						pageSizeLimit),
					null);

			assertContains(
				planEnrollment3, (List<PlanEnrollment>)page3.getItems());
		}
		else {
			Page<PlanEnrollment> page1 =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(1, totalCount + 2), null);

			List<PlanEnrollment> planEnrollments1 =
				(List<PlanEnrollment>)page1.getItems();

			Assert.assertEquals(
				planEnrollments1.toString(), totalCount + 2,
				planEnrollments1.size());

			Page<PlanEnrollment> page2 =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(2, totalCount + 2), null);

			Assert.assertEquals(totalCount + 3, page2.getTotalCount());

			List<PlanEnrollment> planEnrollments2 =
				(List<PlanEnrollment>)page2.getItems();

			Assert.assertEquals(
				planEnrollments2.toString(), 1, planEnrollments2.size());

			Page<PlanEnrollment> page3 =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(1, (int)totalCount + 3), null);

			assertContains(
				planEnrollment1, (List<PlanEnrollment>)page3.getItems());
			assertContains(
				planEnrollment2, (List<PlanEnrollment>)page3.getItems());
			assertContains(
				planEnrollment3, (List<PlanEnrollment>)page3.getItems());
		}
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithSortDateTime()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, planEnrollment1, planEnrollment2) -> {
				BeanTestUtil.setProperty(
					planEnrollment1, entityField.getName(),
					new Date(System.currentTimeMillis() - (2 * Time.MINUTE)));
			});
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithSortDouble()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithSort(
			EntityField.Type.DOUBLE,
			(entityField, planEnrollment1, planEnrollment2) -> {
				BeanTestUtil.setProperty(
					planEnrollment1, entityField.getName(), 0.1);
				BeanTestUtil.setProperty(
					planEnrollment2, entityField.getName(), 0.5);
			});
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithSortInteger()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithSort(
			EntityField.Type.INTEGER,
			(entityField, planEnrollment1, planEnrollment2) -> {
				BeanTestUtil.setProperty(
					planEnrollment1, entityField.getName(), 0);
				BeanTestUtil.setProperty(
					planEnrollment2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetPlanEnrollmentBenefitUsagesPageWithSortString()
		throws Exception {

		testGetPlanEnrollmentBenefitUsagesPageWithSort(
			EntityField.Type.STRING,
			(entityField, planEnrollment1, planEnrollment2) -> {
				Class<?> clazz = planEnrollment1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanTestUtil.setProperty(
						planEnrollment1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanTestUtil.setProperty(
						planEnrollment2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanTestUtil.setProperty(
						planEnrollment1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanTestUtil.setProperty(
						planEnrollment2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanTestUtil.setProperty(
						planEnrollment1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanTestUtil.setProperty(
						planEnrollment2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetPlanEnrollmentBenefitUsagesPageWithSort(
			EntityField.Type type,
			UnsafeTriConsumer
				<EntityField, PlanEnrollment, PlanEnrollment, Exception>
					unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Long planEnrollmentId =
			testGetPlanEnrollmentBenefitUsagesPage_getPlanEnrollmentId();

		PlanEnrollment planEnrollment1 = randomPlanEnrollment();
		PlanEnrollment planEnrollment2 = randomPlanEnrollment();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(
				entityField, planEnrollment1, planEnrollment2);
		}

		planEnrollment1 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, planEnrollment1);

		planEnrollment2 =
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				planEnrollmentId, planEnrollment2);

		Page<PlanEnrollment> page =
			planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
				planEnrollmentId, null, null, null, null, null);

		for (EntityField entityField : entityFields) {
			Page<PlanEnrollment> ascPage =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(1, (int)page.getTotalCount() + 1),
					entityField.getName() + ":asc");

			assertContains(
				planEnrollment1, (List<PlanEnrollment>)ascPage.getItems());
			assertContains(
				planEnrollment2, (List<PlanEnrollment>)ascPage.getItems());

			Page<PlanEnrollment> descPage =
				planEnrollmentResource.getPlanEnrollmentBenefitUsagesPage(
					planEnrollmentId, null, null, null,
					Pagination.of(1, (int)page.getTotalCount() + 1),
					entityField.getName() + ":desc");

			assertContains(
				planEnrollment2, (List<PlanEnrollment>)descPage.getItems());
			assertContains(
				planEnrollment1, (List<PlanEnrollment>)descPage.getItems());
		}
	}

	protected PlanEnrollment
			testGetPlanEnrollmentBenefitUsagesPage_addPlanEnrollment(
				Long planEnrollmentId, PlanEnrollment planEnrollment)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Long testGetPlanEnrollmentBenefitUsagesPage_getPlanEnrollmentId()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Long
			testGetPlanEnrollmentBenefitUsagesPage_getIrrelevantPlanEnrollmentId()
		throws Exception {

		return null;
	}

	@Test
	public void testGetSitePlanEnrollmentByExternalReferenceCode()
		throws Exception {

		PlanEnrollment postPlanEnrollment =
			testGetSitePlanEnrollmentByExternalReferenceCode_addPlanEnrollment();

		PlanEnrollment getPlanEnrollment =
			planEnrollmentResource.getSitePlanEnrollmentByExternalReferenceCode(
				postPlanEnrollment.getSiteId(),
				postPlanEnrollment.getExternalReferenceCode());

		assertEquals(postPlanEnrollment, getPlanEnrollment);
		assertValid(getPlanEnrollment);
	}

	protected PlanEnrollment
			testGetSitePlanEnrollmentByExternalReferenceCode_addPlanEnrollment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetSitePlanEnrollmentByExternalReferenceCode()
		throws Exception {

		PlanEnrollment planEnrollment =
			testGraphQLGetSitePlanEnrollmentByExternalReferenceCode_addPlanEnrollment();

		// No namespace

		Assert.assertTrue(
			equals(
				planEnrollment,
				PlanEnrollmentSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"planEnrollmentByExternalReferenceCode",
								new HashMap<String, Object>() {
									{
										put(
											"siteKey",
											"\"" + planEnrollment.getSiteId() +
												"\"");
										put(
											"externalReferenceCode",
											"\"" +
												planEnrollment.
													getExternalReferenceCode() +
														"\"");
									}
								},
								getGraphQLFields())),
						"JSONObject/data",
						"Object/planEnrollmentByExternalReferenceCode"))));

		// Using the namespace clarityInsuranceBenefitsTracker_v1_0

		Assert.assertTrue(
			equals(
				planEnrollment,
				PlanEnrollmentSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"clarityInsuranceBenefitsTracker_v1_0",
								new GraphQLField(
									"planEnrollmentByExternalReferenceCode",
									new HashMap<String, Object>() {
										{
											put(
												"siteKey",
												"\"" +
													planEnrollment.getSiteId() +
														"\"");
											put(
												"externalReferenceCode",
												"\"" +
													planEnrollment.
														getExternalReferenceCode() +
															"\"");
										}
									},
									getGraphQLFields()))),
						"JSONObject/data",
						"JSONObject/clarityInsuranceBenefitsTracker_v1_0",
						"Object/planEnrollmentByExternalReferenceCode"))));
	}

	@Test
	public void testGraphQLGetSitePlanEnrollmentByExternalReferenceCodeNotFound()
		throws Exception {

		String irrelevantExternalReferenceCode =
			"\"" + RandomTestUtil.randomString() + "\"";

		// No namespace

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"planEnrollmentByExternalReferenceCode",
						new HashMap<String, Object>() {
							{
								put(
									"siteKey",
									"\"" + irrelevantGroup.getGroupId() + "\"");
								put(
									"externalReferenceCode",
									irrelevantExternalReferenceCode);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));

		// Using the namespace clarityInsuranceBenefitsTracker_v1_0

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"clarityInsuranceBenefitsTracker_v1_0",
						new GraphQLField(
							"planEnrollmentByExternalReferenceCode",
							new HashMap<String, Object>() {
								{
									put(
										"siteKey",
										"\"" + irrelevantGroup.getGroupId() +
											"\"");
									put(
										"externalReferenceCode",
										irrelevantExternalReferenceCode);
								}
							},
							getGraphQLFields()))),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	protected PlanEnrollment
			testGraphQLGetSitePlanEnrollmentByExternalReferenceCode_addPlanEnrollment()
		throws Exception {

		return testGraphQLPlanEnrollment_addPlanEnrollment();
	}

	@Test
	public void testGetSitePlanEnrollmentsPage() throws Exception {
		Long siteId = testGetSitePlanEnrollmentsPage_getSiteId();
		Long irrelevantSiteId =
			testGetSitePlanEnrollmentsPage_getIrrelevantSiteId();

		Page<PlanEnrollment> page =
			planEnrollmentResource.getSitePlanEnrollmentsPage(
				siteId, null, null, null, Pagination.of(1, 10), null);

		long totalCount = page.getTotalCount();

		if (irrelevantSiteId != null) {
			PlanEnrollment irrelevantPlanEnrollment =
				testGetSitePlanEnrollmentsPage_addPlanEnrollment(
					irrelevantSiteId, randomIrrelevantPlanEnrollment());

			page = planEnrollmentResource.getSitePlanEnrollmentsPage(
				irrelevantSiteId, null, null, null,
				Pagination.of(1, (int)totalCount + 1), null);

			Assert.assertEquals(totalCount + 1, page.getTotalCount());

			assertContains(
				irrelevantPlanEnrollment,
				(List<PlanEnrollment>)page.getItems());
			assertValid(
				page,
				testGetSitePlanEnrollmentsPage_getExpectedActions(
					irrelevantSiteId));
		}

		PlanEnrollment planEnrollment1 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		PlanEnrollment planEnrollment2 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		page = planEnrollmentResource.getSitePlanEnrollmentsPage(
			siteId, null, null, null, Pagination.of(1, 10), null);

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(planEnrollment1, (List<PlanEnrollment>)page.getItems());
		assertContains(planEnrollment2, (List<PlanEnrollment>)page.getItems());
		assertValid(
			page, testGetSitePlanEnrollmentsPage_getExpectedActions(siteId));

		planEnrollmentResource.deletePlanEnrollment(planEnrollment1.getId());

		planEnrollmentResource.deletePlanEnrollment(planEnrollment2.getId());
	}

	protected Map<String, Map<String, String>>
			testGetSitePlanEnrollmentsPage_getExpectedActions(Long siteId)
		throws Exception {

		Map<String, Map<String, String>> expectedActions = new HashMap<>();

		return expectedActions;
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithFilterDateTimeEquals()
		throws Exception {

		List<EntityField> entityFields = getEntityFields(
			EntityField.Type.DATE_TIME);

		if (entityFields.isEmpty()) {
			return;
		}

		Long siteId = testGetSitePlanEnrollmentsPage_getSiteId();

		PlanEnrollment planEnrollment1 = randomPlanEnrollment();

		planEnrollment1 = testGetSitePlanEnrollmentsPage_addPlanEnrollment(
			siteId, planEnrollment1);

		for (EntityField entityField : entityFields) {
			Page<PlanEnrollment> page =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null,
					getFilterString(entityField, "between", planEnrollment1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(planEnrollment1),
				(List<PlanEnrollment>)page.getItems());
		}
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithFilterDoubleEquals()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithFilter("eq", EntityField.Type.DOUBLE);
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithFilterStringContains()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithFilter(
			"contains", EntityField.Type.STRING);
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithFilterStringEquals()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithFilter("eq", EntityField.Type.STRING);
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithFilterStringStartsWith()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithFilter(
			"startswith", EntityField.Type.STRING);
	}

	protected void testGetSitePlanEnrollmentsPageWithFilter(
			String operator, EntityField.Type type)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Long siteId = testGetSitePlanEnrollmentsPage_getSiteId();

		PlanEnrollment planEnrollment1 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		@SuppressWarnings("PMD.UnusedLocalVariable")
		PlanEnrollment planEnrollment2 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		for (EntityField entityField : entityFields) {
			Page<PlanEnrollment> page =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null,
					getFilterString(entityField, operator, planEnrollment1),
					Pagination.of(1, 2), null);

			assertEquals(
				Collections.singletonList(planEnrollment1),
				(List<PlanEnrollment>)page.getItems());
		}
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithPagination()
		throws Exception {

		Long siteId = testGetSitePlanEnrollmentsPage_getSiteId();

		Page<PlanEnrollment> planEnrollmentsPage =
			planEnrollmentResource.getSitePlanEnrollmentsPage(
				siteId, null, null, null, null, null);

		int totalCount = GetterUtil.getInteger(
			planEnrollmentsPage.getTotalCount());

		PlanEnrollment planEnrollment1 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		PlanEnrollment planEnrollment2 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		PlanEnrollment planEnrollment3 =
			testGetSitePlanEnrollmentsPage_addPlanEnrollment(
				siteId, randomPlanEnrollment());

		// See com.liferay.portal.vulcan.internal.configuration.HeadlessAPICompanyConfiguration#pageSizeLimit

		int pageSizeLimit = 500;

		if (totalCount >= (pageSizeLimit - 2)) {
			Page<PlanEnrollment> page1 =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null,
					Pagination.of(
						(int)Math.ceil((totalCount + 1.0) / pageSizeLimit),
						pageSizeLimit),
					null);

			Assert.assertEquals(totalCount + 3, page1.getTotalCount());

			assertContains(
				planEnrollment1, (List<PlanEnrollment>)page1.getItems());

			Page<PlanEnrollment> page2 =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null,
					Pagination.of(
						(int)Math.ceil((totalCount + 2.0) / pageSizeLimit),
						pageSizeLimit),
					null);

			assertContains(
				planEnrollment2, (List<PlanEnrollment>)page2.getItems());

			Page<PlanEnrollment> page3 =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null,
					Pagination.of(
						(int)Math.ceil((totalCount + 3.0) / pageSizeLimit),
						pageSizeLimit),
					null);

			assertContains(
				planEnrollment3, (List<PlanEnrollment>)page3.getItems());
		}
		else {
			Page<PlanEnrollment> page1 =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null, Pagination.of(1, totalCount + 2),
					null);

			List<PlanEnrollment> planEnrollments1 =
				(List<PlanEnrollment>)page1.getItems();

			Assert.assertEquals(
				planEnrollments1.toString(), totalCount + 2,
				planEnrollments1.size());

			Page<PlanEnrollment> page2 =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null, Pagination.of(2, totalCount + 2),
					null);

			Assert.assertEquals(totalCount + 3, page2.getTotalCount());

			List<PlanEnrollment> planEnrollments2 =
				(List<PlanEnrollment>)page2.getItems();

			Assert.assertEquals(
				planEnrollments2.toString(), 1, planEnrollments2.size());

			Page<PlanEnrollment> page3 =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null,
					Pagination.of(1, (int)totalCount + 3), null);

			assertContains(
				planEnrollment1, (List<PlanEnrollment>)page3.getItems());
			assertContains(
				planEnrollment2, (List<PlanEnrollment>)page3.getItems());
			assertContains(
				planEnrollment3, (List<PlanEnrollment>)page3.getItems());
		}
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithSortDateTime()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, planEnrollment1, planEnrollment2) -> {
				BeanTestUtil.setProperty(
					planEnrollment1, entityField.getName(),
					new Date(System.currentTimeMillis() - (2 * Time.MINUTE)));
			});
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithSortDouble()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithSort(
			EntityField.Type.DOUBLE,
			(entityField, planEnrollment1, planEnrollment2) -> {
				BeanTestUtil.setProperty(
					planEnrollment1, entityField.getName(), 0.1);
				BeanTestUtil.setProperty(
					planEnrollment2, entityField.getName(), 0.5);
			});
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithSortInteger()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithSort(
			EntityField.Type.INTEGER,
			(entityField, planEnrollment1, planEnrollment2) -> {
				BeanTestUtil.setProperty(
					planEnrollment1, entityField.getName(), 0);
				BeanTestUtil.setProperty(
					planEnrollment2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetSitePlanEnrollmentsPageWithSortString()
		throws Exception {

		testGetSitePlanEnrollmentsPageWithSort(
			EntityField.Type.STRING,
			(entityField, planEnrollment1, planEnrollment2) -> {
				Class<?> clazz = planEnrollment1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanTestUtil.setProperty(
						planEnrollment1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanTestUtil.setProperty(
						planEnrollment2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanTestUtil.setProperty(
						planEnrollment1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanTestUtil.setProperty(
						planEnrollment2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanTestUtil.setProperty(
						planEnrollment1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanTestUtil.setProperty(
						planEnrollment2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetSitePlanEnrollmentsPageWithSort(
			EntityField.Type type,
			UnsafeTriConsumer
				<EntityField, PlanEnrollment, PlanEnrollment, Exception>
					unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		Long siteId = testGetSitePlanEnrollmentsPage_getSiteId();

		PlanEnrollment planEnrollment1 = randomPlanEnrollment();
		PlanEnrollment planEnrollment2 = randomPlanEnrollment();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(
				entityField, planEnrollment1, planEnrollment2);
		}

		planEnrollment1 = testGetSitePlanEnrollmentsPage_addPlanEnrollment(
			siteId, planEnrollment1);

		planEnrollment2 = testGetSitePlanEnrollmentsPage_addPlanEnrollment(
			siteId, planEnrollment2);

		Page<PlanEnrollment> page =
			planEnrollmentResource.getSitePlanEnrollmentsPage(
				siteId, null, null, null, null, null);

		for (EntityField entityField : entityFields) {
			Page<PlanEnrollment> ascPage =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null,
					Pagination.of(1, (int)page.getTotalCount() + 1),
					entityField.getName() + ":asc");

			assertContains(
				planEnrollment1, (List<PlanEnrollment>)ascPage.getItems());
			assertContains(
				planEnrollment2, (List<PlanEnrollment>)ascPage.getItems());

			Page<PlanEnrollment> descPage =
				planEnrollmentResource.getSitePlanEnrollmentsPage(
					siteId, null, null, null,
					Pagination.of(1, (int)page.getTotalCount() + 1),
					entityField.getName() + ":desc");

			assertContains(
				planEnrollment2, (List<PlanEnrollment>)descPage.getItems());
			assertContains(
				planEnrollment1, (List<PlanEnrollment>)descPage.getItems());
		}
	}

	protected PlanEnrollment testGetSitePlanEnrollmentsPage_addPlanEnrollment(
			Long siteId, PlanEnrollment planEnrollment)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Long testGetSitePlanEnrollmentsPage_getSiteId() throws Exception {
		return testGroup.getGroupId();
	}

	protected Long testGetSitePlanEnrollmentsPage_getIrrelevantSiteId()
		throws Exception {

		return irrelevantGroup.getGroupId();
	}

	@Test
	public void testGraphQLGetSitePlanEnrollmentsPage() throws Exception {
		Long siteId = testGetSitePlanEnrollmentsPage_getSiteId();

		GraphQLField graphQLField = new GraphQLField(
			"planEnrollments",
			new HashMap<String, Object>() {
				{
					put("page", 1);
					put("pageSize", 10);

					put("siteKey", "\"" + siteId + "\"");
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		// No namespace

		JSONObject planEnrollmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/planEnrollments");

		long totalCount = planEnrollmentsJSONObject.getLong("totalCount");

		PlanEnrollment planEnrollment1 =
			testGraphQLGetSitePlanEnrollmentsPage_addPlanEnrollment();
		PlanEnrollment planEnrollment2 =
			testGraphQLGetSitePlanEnrollmentsPage_addPlanEnrollment();

		planEnrollmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/planEnrollments");

		Assert.assertEquals(
			totalCount + 2, planEnrollmentsJSONObject.getLong("totalCount"));

		assertContains(
			planEnrollment1,
			Arrays.asList(
				PlanEnrollmentSerDes.toDTOs(
					planEnrollmentsJSONObject.getString("items"))));
		assertContains(
			planEnrollment2,
			Arrays.asList(
				PlanEnrollmentSerDes.toDTOs(
					planEnrollmentsJSONObject.getString("items"))));

		// Using the namespace clarityInsuranceBenefitsTracker_v1_0

		planEnrollmentsJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(
				new GraphQLField(
					"clarityInsuranceBenefitsTracker_v1_0", graphQLField)),
			"JSONObject/data",
			"JSONObject/clarityInsuranceBenefitsTracker_v1_0",
			"JSONObject/planEnrollments");

		Assert.assertEquals(
			totalCount + 2, planEnrollmentsJSONObject.getLong("totalCount"));

		assertContains(
			planEnrollment1,
			Arrays.asList(
				PlanEnrollmentSerDes.toDTOs(
					planEnrollmentsJSONObject.getString("items"))));
		assertContains(
			planEnrollment2,
			Arrays.asList(
				PlanEnrollmentSerDes.toDTOs(
					planEnrollmentsJSONObject.getString("items"))));
	}

	protected PlanEnrollment
			testGraphQLGetSitePlanEnrollmentsPage_addPlanEnrollment()
		throws Exception {

		return testGraphQLPlanEnrollment_addPlanEnrollment();
	}

	@Test
	public void testPatchPlanEnrollment() throws Exception {
		PlanEnrollment postPlanEnrollment =
			testPatchPlanEnrollment_addPlanEnrollment();

		PlanEnrollment randomPatchPlanEnrollment = randomPatchPlanEnrollment();

		@SuppressWarnings("PMD.UnusedLocalVariable")
		PlanEnrollment patchPlanEnrollment =
			planEnrollmentResource.patchPlanEnrollment(
				postPlanEnrollment.getId(), randomPatchPlanEnrollment);

		PlanEnrollment expectedPatchPlanEnrollment = postPlanEnrollment.clone();

		BeanTestUtil.copyProperties(
			randomPatchPlanEnrollment, expectedPatchPlanEnrollment);

		PlanEnrollment getPlanEnrollment =
			planEnrollmentResource.getPlanEnrollment(
				patchPlanEnrollment.getId());

		assertEquals(expectedPatchPlanEnrollment, getPlanEnrollment);
		assertValid(getPlanEnrollment);
	}

	protected PlanEnrollment testPatchPlanEnrollment_addPlanEnrollment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPutPlanEnrollment() throws Exception {
		PlanEnrollment postPlanEnrollment =
			testPutPlanEnrollment_addPlanEnrollment();

		PlanEnrollment randomPlanEnrollment = randomPlanEnrollment();

		PlanEnrollment putPlanEnrollment =
			planEnrollmentResource.putPlanEnrollment(
				postPlanEnrollment.getId(), randomPlanEnrollment);

		assertEquals(randomPlanEnrollment, putPlanEnrollment);
		assertValid(putPlanEnrollment);

		PlanEnrollment getPlanEnrollment =
			planEnrollmentResource.getPlanEnrollment(putPlanEnrollment.getId());

		assertEquals(randomPlanEnrollment, getPlanEnrollment);
		assertValid(getPlanEnrollment);
	}

	protected PlanEnrollment testPutPlanEnrollment_addPlanEnrollment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	@Test
	public void testPostPlanEnrollment() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostPlanEnrollmentBenefitUsage() throws Exception {
		Assert.assertTrue(true);
	}

	protected PlanEnrollment testGraphQLPlanEnrollment_addPlanEnrollment()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		PlanEnrollment planEnrollment, List<PlanEnrollment> planEnrollments) {

		boolean contains = false;

		for (PlanEnrollment item : planEnrollments) {
			if (equals(planEnrollment, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			planEnrollments + " does not contain " + planEnrollment, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		PlanEnrollment planEnrollment1, PlanEnrollment planEnrollment2) {

		Assert.assertTrue(
			planEnrollment1 + " does not equal " + planEnrollment2,
			equals(planEnrollment1, planEnrollment2));
	}

	protected void assertEquals(
		List<PlanEnrollment> planEnrollments1,
		List<PlanEnrollment> planEnrollments2) {

		Assert.assertEquals(planEnrollments1.size(), planEnrollments2.size());

		for (int i = 0; i < planEnrollments1.size(); i++) {
			PlanEnrollment planEnrollment1 = planEnrollments1.get(i);
			PlanEnrollment planEnrollment2 = planEnrollments2.get(i);

			assertEquals(planEnrollment1, planEnrollment2);
		}
	}

	protected void assertEquals(
		BenefitUsage benefitUsage1, BenefitUsage benefitUsage2) {

		Assert.assertTrue(
			benefitUsage1 + " does not equal " + benefitUsage2,
			equals(benefitUsage1, benefitUsage2));
	}

	protected void assertEqualsIgnoringOrder(
		List<PlanEnrollment> planEnrollments1,
		List<PlanEnrollment> planEnrollments2) {

		Assert.assertEquals(planEnrollments1.size(), planEnrollments2.size());

		for (PlanEnrollment planEnrollment1 : planEnrollments1) {
			boolean contains = false;

			for (PlanEnrollment planEnrollment2 : planEnrollments2) {
				if (equals(planEnrollment1, planEnrollment2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				planEnrollments2 + " does not contain " + planEnrollment1,
				contains);
		}
	}

	protected void assertValid(PlanEnrollment planEnrollment) throws Exception {
		boolean valid = true;

		if (planEnrollment.getDateCreated() == null) {
			valid = false;
		}

		if (planEnrollment.getDateModified() == null) {
			valid = false;
		}

		if (planEnrollment.getId() == null) {
			valid = false;
		}

		if (!Objects.equals(
				planEnrollment.getSiteId(), testGroup.getGroupId())) {

			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (planEnrollment.getActions() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("creator", additionalAssertFieldName)) {
				if (planEnrollment.getCreator() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("endDate", additionalAssertFieldName)) {
				if (planEnrollment.getEndDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("enrollmentStatus", additionalAssertFieldName)) {
				if (planEnrollment.getEnrollmentStatus() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"externalReferenceCode", additionalAssertFieldName)) {

				if (planEnrollment.getExternalReferenceCode() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("groupNumber", additionalAssertFieldName)) {
				if (planEnrollment.getGroupNumber() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("insurancePlanERC", additionalAssertFieldName)) {
				if (planEnrollment.getInsurancePlanERC() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("insurancePlanId", additionalAssertFieldName)) {
				if (planEnrollment.getInsurancePlanId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("member", additionalAssertFieldName)) {
				if (planEnrollment.getMember() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("memberId", additionalAssertFieldName)) {
				if (planEnrollment.getMemberId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("notes", additionalAssertFieldName)) {
				if (planEnrollment.getNotes() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("startDate", additionalAssertFieldName)) {
				if (planEnrollment.getStartDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (planEnrollment.getStatus() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<PlanEnrollment> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<PlanEnrollment> page,
		Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<PlanEnrollment> planEnrollments = page.getItems();

		int size = planEnrollments.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);

		assertValid(page.getActions(), expectedActions);
	}

	protected void assertValid(
		Map<String, Map<String, String>> actions1,
		Map<String, Map<String, String>> actions2) {

		for (String key : actions2.keySet()) {
			Map action = actions1.get(key);

			Assert.assertNotNull(key + " does not contain an action", action);

			Map<String, String> expectedAction = actions2.get(key);

			Assert.assertEquals(
				expectedAction.get("method"), action.get("method"));
			Assert.assertEquals(expectedAction.get("href"), action.get("href"));
		}
	}

	protected void assertValid(BenefitUsage benefitUsage) {
		boolean valid = true;

		if (benefitUsage.getDateCreated() == null) {
			valid = false;
		}

		if (benefitUsage.getDateModified() == null) {
			valid = false;
		}

		if (benefitUsage.getExternalReferenceCode() == null) {
			valid = false;
		}

		if (benefitUsage.getId() == null) {
			valid = false;
		}

		if (!Objects.equals(benefitUsage.getSiteId(), testGroup.getGroupId())) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalBenefitUsageAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (benefitUsage.getActions() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("amountUsedCents", additionalAssertFieldName)) {
				if (benefitUsage.getAmountUsedCents() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("benefitType", additionalAssertFieldName)) {
				if (benefitUsage.getBenefitType() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("creator", additionalAssertFieldName)) {
				if (benefitUsage.getCreator() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"externalReferenceCode", additionalAssertFieldName)) {

				if (benefitUsage.getExternalReferenceCode() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("notes", additionalAssertFieldName)) {
				if (benefitUsage.getNotes() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"planEnrollmentERC", additionalAssertFieldName)) {

				if (benefitUsage.getPlanEnrollmentERC() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("planEnrollmentId", additionalAssertFieldName)) {
				if (benefitUsage.getPlanEnrollmentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("reference", additionalAssertFieldName)) {
				if (benefitUsage.getReference() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("serviceDate", additionalAssertFieldName)) {
				if (benefitUsage.getServiceDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("sourceReference", additionalAssertFieldName)) {
				if (benefitUsage.getSourceReference() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("sourceType", additionalAssertFieldName)) {
				if (benefitUsage.getSourceType() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (benefitUsage.getStatus() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected String[] getAdditionalBenefitUsageAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		graphQLFields.add(new GraphQLField("siteId"));

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.clarityvisionsolutions.insurance.benefits.tracker.rest.
						dto.v1_0.PlanEnrollment.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		PlanEnrollment planEnrollment1, PlanEnrollment planEnrollment2) {

		if (planEnrollment1 == planEnrollment2) {
			return true;
		}

		if (!Objects.equals(
				planEnrollment1.getSiteId(), planEnrollment2.getSiteId())) {

			return false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (!equals(
						(Map)planEnrollment1.getActions(),
						(Map)planEnrollment2.getActions())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("creator", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getCreator(),
						planEnrollment2.getCreator())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateCreated", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getDateCreated(),
						planEnrollment2.getDateCreated())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateModified", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getDateModified(),
						planEnrollment2.getDateModified())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("endDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getEndDate(),
						planEnrollment2.getEndDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("enrollmentStatus", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getEnrollmentStatus(),
						planEnrollment2.getEnrollmentStatus())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"externalReferenceCode", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						planEnrollment1.getExternalReferenceCode(),
						planEnrollment2.getExternalReferenceCode())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("groupNumber", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getGroupNumber(),
						planEnrollment2.getGroupNumber())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getId(), planEnrollment2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("insurancePlanERC", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getInsurancePlanERC(),
						planEnrollment2.getInsurancePlanERC())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("insurancePlanId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getInsurancePlanId(),
						planEnrollment2.getInsurancePlanId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("member", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getMember(),
						planEnrollment2.getMember())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("memberId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getMemberId(),
						planEnrollment2.getMemberId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("notes", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getNotes(),
						planEnrollment2.getNotes())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("startDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getStartDate(),
						planEnrollment2.getStartDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						planEnrollment1.getStatus(),
						planEnrollment2.getStatus())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected boolean equals(
		BenefitUsage benefitUsage1, BenefitUsage benefitUsage2) {

		if (benefitUsage1 == benefitUsage2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalBenefitUsageAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getActions(),
						benefitUsage2.getActions())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("amountUsedCents", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getAmountUsedCents(),
						benefitUsage2.getAmountUsedCents())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("benefitType", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getBenefitType(),
						benefitUsage2.getBenefitType())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("creator", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getCreator(),
						benefitUsage2.getCreator())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateCreated", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getDateCreated(),
						benefitUsage2.getDateCreated())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateModified", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getDateModified(),
						benefitUsage2.getDateModified())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"externalReferenceCode", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						benefitUsage1.getExternalReferenceCode(),
						benefitUsage2.getExternalReferenceCode())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getId(), benefitUsage2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("notes", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getNotes(), benefitUsage2.getNotes())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"planEnrollmentERC", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						benefitUsage1.getPlanEnrollmentERC(),
						benefitUsage2.getPlanEnrollmentERC())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("planEnrollmentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getPlanEnrollmentId(),
						benefitUsage2.getPlanEnrollmentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("reference", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getReference(),
						benefitUsage2.getReference())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serviceDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getServiceDate(),
						benefitUsage2.getServiceDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("siteId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getSiteId(), benefitUsage2.getSiteId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("sourceReference", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getSourceReference(),
						benefitUsage2.getSourceReference())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("sourceType", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getSourceType(),
						benefitUsage2.getSourceType())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						benefitUsage1.getStatus(), benefitUsage2.getStatus())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		if (clazz.getClassLoader() == null) {
			return new java.lang.reflect.Field[0];
		}

		return TransformUtil.transform(
			ReflectionUtil.getDeclaredFields(clazz),
			field -> {
				if (field.isSynthetic()) {
					return null;
				}

				return field;
			},
			java.lang.reflect.Field.class);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_planEnrollmentResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_planEnrollmentResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		if (entityModel == null) {
			return Collections.emptyList();
		}

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		return TransformUtil.transform(
			getEntityFields(),
			entityField -> {
				if (!Objects.equals(entityField.getType(), type) ||
					ArrayUtil.contains(
						getIgnoredEntityFieldNames(), entityField.getName())) {

					return null;
				}

				return entityField;
			});
	}

	protected String getFilterString(
		EntityField entityField, String operator,
		PlanEnrollment planEnrollment) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("actions")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("creator")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("dateCreated")) {
			if (operator.equals("between")) {
				Date date = planEnrollment.getDateCreated();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(_format.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(_format.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_format.format(planEnrollment.getDateCreated()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("dateModified")) {
			if (operator.equals("between")) {
				Date date = planEnrollment.getDateModified();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(_format.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(_format.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_format.format(planEnrollment.getDateModified()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("endDate")) {
			if (operator.equals("between")) {
				Date date = planEnrollment.getEndDate();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(_format.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(_format.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_format.format(planEnrollment.getEndDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("enrollmentStatus")) {
			sb.append(String.valueOf(planEnrollment.getEnrollmentStatus()));

			return sb.toString();
		}

		if (entityFieldName.equals("externalReferenceCode")) {
			Object object = planEnrollment.getExternalReferenceCode();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("groupNumber")) {
			Object object = planEnrollment.getGroupNumber();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("insurancePlanERC")) {
			Object object = planEnrollment.getInsurancePlanERC();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("insurancePlanId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("member")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("memberId")) {
			Object object = planEnrollment.getMemberId();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("notes")) {
			Object object = planEnrollment.getNotes();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("siteId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("startDate")) {
			if (operator.equals("between")) {
				Date date = planEnrollment.getStartDate();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(_format.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(_format.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_format.format(planEnrollment.getStartDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("status")) {
			sb.append(String.valueOf(planEnrollment.getStatus()));

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword(
			"test@liferay.com:" + PropsValues.DEFAULT_ADMIN_PASSWORD);

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected PlanEnrollment randomPlanEnrollment() throws Exception {
		return new PlanEnrollment() {
			{
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				endDate = RandomTestUtil.nextDate();
				enrollmentStatus = RandomTestUtil.randomInt();
				externalReferenceCode = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				groupNumber = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				insurancePlanERC = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				insurancePlanId = RandomTestUtil.randomLong();
				memberId = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				notes = StringUtil.toLowerCase(RandomTestUtil.randomString());
				siteId = testGroup.getGroupId();
				startDate = RandomTestUtil.nextDate();
				status = RandomTestUtil.randomInt();
			}
		};
	}

	protected PlanEnrollment randomIrrelevantPlanEnrollment() throws Exception {
		PlanEnrollment randomIrrelevantPlanEnrollment = randomPlanEnrollment();

		randomIrrelevantPlanEnrollment.setSiteId(irrelevantGroup.getGroupId());

		return randomIrrelevantPlanEnrollment;
	}

	protected PlanEnrollment randomPatchPlanEnrollment() throws Exception {
		return randomPlanEnrollment();
	}

	protected BenefitUsage randomBenefitUsage() throws Exception {
		return new BenefitUsage() {
			{
				amountUsedCents = RandomTestUtil.randomLong();
				benefitType = RandomTestUtil.randomString();
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				externalReferenceCode = RandomTestUtil.randomString();
				id = RandomTestUtil.randomLong();
				notes = RandomTestUtil.randomString();
				planEnrollmentERC = RandomTestUtil.randomString();
				planEnrollmentId = RandomTestUtil.randomLong();
				reference = RandomTestUtil.randomString();
				serviceDate = RandomTestUtil.nextDate();
				siteId = RandomTestUtil.randomLong();
				sourceReference = RandomTestUtil.randomString();
				sourceType = RandomTestUtil.randomString();
				status = RandomTestUtil.randomInteger();
			}
		};
	}

	protected PlanEnrollmentResource planEnrollmentResource;
	protected com.liferay.portal.kernel.model.Group irrelevantGroup;
	protected com.liferay.portal.kernel.model.Company testCompany;
	protected com.liferay.portal.kernel.model.Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = source.getClass();

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					_getAllDeclaredFields(sourceClass)) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				try {
					Method setMethod = _getMethod(
						targetClass, field.getName(), "set",
						getMethod.getReturnType());

					setMethod.invoke(target, getMethod.invoke(source));
				}
				catch (Exception e) {
					continue;
				}
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static List<java.lang.reflect.Field> _getAllDeclaredFields(
			Class<?> clazz) {

			List<java.lang.reflect.Field> fields = new ArrayList<>();

			while ((clazz != null) && (clazz != Object.class)) {
				for (java.lang.reflect.Field field :
						clazz.getDeclaredFields()) {

					fields.add(field);
				}

				clazz = clazz.getSuperclass();
			}

			return fields;
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BasePlanEnrollmentResourceTestCase.class);

	private static Format _format;

	private com.liferay.portal.kernel.model.User _testCompanyAdminUser;

	@Inject
	private
		com.clarityvisionsolutions.insurance.benefits.tracker.rest.resource.
			v1_0.PlanEnrollmentResource _planEnrollmentResource;

}