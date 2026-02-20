/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.http;

import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>PlanEnrollmentServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PlanEnrollmentServiceHttp {

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment addPlanEnrollment(
					HttpPrincipal httpPrincipal, long insurancePlanId,
					long memberUserId, String memberId, String groupNumber,
					java.util.Date startDate, java.util.Date endDate,
					int enrollmentStatus, String notes,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "addPlanEnrollment",
				_addPlanEnrollmentParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, insurancePlanId, memberUserId, memberId, groupNumber,
				startDate, endDate, enrollmentStatus, notes, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.clarityvisionsolutions.insurance.benefits.tracker.model.
				PlanEnrollment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment deletePlanEnrollment(
					HttpPrincipal httpPrincipal, long planEnrollmentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "deletePlanEnrollment",
				_deletePlanEnrollmentParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, planEnrollmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.clarityvisionsolutions.insurance.benefits.tracker.model.
				PlanEnrollment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment getPlanEnrollment(
					HttpPrincipal httpPrincipal, long planEnrollmentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "getPlanEnrollment",
				_getPlanEnrollmentParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, planEnrollmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.clarityvisionsolutions.insurance.benefits.tracker.model.
				PlanEnrollment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment> getGroupMemberPlanEnrollments(
					HttpPrincipal httpPrincipal, long groupId,
					long insurancePlanId, long memberUserId, int status)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class,
				"getGroupMemberPlanEnrollments",
				_getGroupMemberPlanEnrollmentsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, insurancePlanId, memberUserId, status);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.clarityvisionsolutions.insurance.benefits.tracker.model.
					PlanEnrollment>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment> getActiveGroupEnrollments(
					HttpPrincipal httpPrincipal, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "getActiveGroupEnrollments",
				_getActiveGroupEnrollmentsParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.clarityvisionsolutions.insurance.benefits.tracker.model.
					PlanEnrollment>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment> getMemberPlanEnrollments(
					HttpPrincipal httpPrincipal, long groupId,
					long memberUserId, int enrollmentStatus)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "getMemberPlanEnrollments",
				_getMemberPlanEnrollmentsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, memberUserId, enrollmentStatus);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.clarityvisionsolutions.insurance.benefits.tracker.model.
					PlanEnrollment>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment updatePlanEnrollment(
					HttpPrincipal httpPrincipal, long planEnrollmentId,
					String memberId, String groupNumber,
					java.util.Date startDate, java.util.Date endDate,
					int enrollmentStatus, String notes,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "updatePlanEnrollment",
				_updatePlanEnrollmentParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, planEnrollmentId, memberId, groupNumber, startDate,
				endDate, enrollmentStatus, notes, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.clarityvisionsolutions.insurance.benefits.tracker.model.
				PlanEnrollment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment movePlanEnrollmentToTrash(
					HttpPrincipal httpPrincipal, long userId,
					long planEnrollmentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class, "movePlanEnrollmentToTrash",
				_movePlanEnrollmentToTrashParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, planEnrollmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.clarityvisionsolutions.insurance.benefits.tracker.model.
				PlanEnrollment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			PlanEnrollment restorePlanEnrollmentFromTrash(
					HttpPrincipal httpPrincipal, long userId,
					long planEnrollmentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PlanEnrollmentServiceUtil.class,
				"restorePlanEnrollmentFromTrash",
				_restorePlanEnrollmentFromTrashParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, planEnrollmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.clarityvisionsolutions.insurance.benefits.tracker.model.
				PlanEnrollment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		PlanEnrollmentServiceHttp.class);

	private static final Class<?>[] _addPlanEnrollmentParameterTypes0 =
		new Class[] {
			long.class, long.class, String.class, String.class,
			java.util.Date.class, java.util.Date.class, int.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deletePlanEnrollmentParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getPlanEnrollmentParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getGroupMemberPlanEnrollmentsParameterTypes3 = new Class[] {
			long.class, long.class, long.class, int.class
		};
	private static final Class<?>[] _getActiveGroupEnrollmentsParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getMemberPlanEnrollmentsParameterTypes5 =
		new Class[] {long.class, long.class, int.class};
	private static final Class<?>[] _updatePlanEnrollmentParameterTypes6 =
		new Class[] {
			long.class, String.class, String.class, java.util.Date.class,
			java.util.Date.class, int.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _movePlanEnrollmentToTrashParameterTypes7 =
		new Class[] {long.class, long.class};
	private static final Class<?>[]
		_restorePlanEnrollmentFromTrashParameterTypes8 = new Class[] {
			long.class, long.class
		};

}