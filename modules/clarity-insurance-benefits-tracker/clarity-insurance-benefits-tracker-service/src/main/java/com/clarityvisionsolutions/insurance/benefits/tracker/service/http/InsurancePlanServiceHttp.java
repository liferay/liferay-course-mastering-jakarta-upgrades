/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.http;

import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>InsurancePlanServiceUtil</code> service
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
public class InsurancePlanServiceHttp {

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan addInsurancePlan(
					HttpPrincipal httpPrincipal, String providerName,
					String planName, long annualExamAllowanceCents,
					long annualFramesAllowanceCents,
					long annualLensesAllowanceCents,
					long annualContactsAllowanceCents,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "addInsurancePlan",
				_addInsurancePlanParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, providerName, planName, annualExamAllowanceCents,
				annualFramesAllowanceCents, annualLensesAllowanceCents,
				annualContactsAllowanceCents, serviceContext);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan addInsurancePlan(
					HttpPrincipal httpPrincipal, String providerName,
					String planName, long annualExamAllowanceCents,
					long annualFramesAllowanceCents,
					long annualLensesAllowanceCents,
					long annualContactsAllowanceCents, int coveragePeriodMonths,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "addInsurancePlan",
				_addInsurancePlanParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, providerName, planName, annualExamAllowanceCents,
				annualFramesAllowanceCents, annualLensesAllowanceCents,
				annualContactsAllowanceCents, coveragePeriodMonths,
				serviceContext);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan addInsurancePlan(
					HttpPrincipal httpPrincipal, String providerName,
					String planName, boolean active,
					long annualExamAllowanceCents,
					long annualFramesAllowanceCents,
					long annualLensesAllowanceCents,
					long annualContactsAllowanceCents, int coveragePeriodMonths,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "addInsurancePlan",
				_addInsurancePlanParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, providerName, planName, active,
				annualExamAllowanceCents, annualFramesAllowanceCents,
				annualLensesAllowanceCents, annualContactsAllowanceCents,
				coveragePeriodMonths, serviceContext);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan deleteInsurancePlan(
					HttpPrincipal httpPrincipal, long insurancePlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "deleteInsurancePlan",
				_deleteInsurancePlanParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, insurancePlanId);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan getInsurancePlan(
					HttpPrincipal httpPrincipal, long insurancePlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "getInsurancePlan",
				_getInsurancePlanParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, insurancePlanId);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan> getGroupInsurancePlans(
				HttpPrincipal httpPrincipal, long groupId, int status,
				int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "getGroupInsurancePlans",
				_getGroupInsurancePlansParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, status, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.clarityvisionsolutions.insurance.benefits.tracker.model.
					InsurancePlan>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getGroupInsurancePlansCount(
		HttpPrincipal httpPrincipal, long groupId, int status) {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "getGroupInsurancePlansCount",
				_getGroupInsurancePlansCountParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, status);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan updateInsurancePlan(
					HttpPrincipal httpPrincipal, long insurancePlanId,
					String providerName, String planName,
					long annualExamAllowanceCents,
					long annualFramesAllowanceCents,
					long annualLensesAllowanceCents,
					long annualContactsAllowanceCents,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "updateInsurancePlan",
				_updateInsurancePlanParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, insurancePlanId, providerName, planName,
				annualExamAllowanceCents, annualFramesAllowanceCents,
				annualLensesAllowanceCents, annualContactsAllowanceCents,
				serviceContext);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan updateInsurancePlan(
					HttpPrincipal httpPrincipal, long insurancePlanId,
					String providerName, String planName,
					long annualExamAllowanceCents,
					long annualFramesAllowanceCents,
					long annualLensesAllowanceCents,
					long annualContactsAllowanceCents, int coveragePeriodMonths,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "updateInsurancePlan",
				_updateInsurancePlanParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, insurancePlanId, providerName, planName,
				annualExamAllowanceCents, annualFramesAllowanceCents,
				annualLensesAllowanceCents, annualContactsAllowanceCents,
				coveragePeriodMonths, serviceContext);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan updateInsurancePlan(
					HttpPrincipal httpPrincipal, long insurancePlanId,
					String providerName, String planName, boolean active,
					long annualExamAllowanceCents,
					long annualFramesAllowanceCents,
					long annualLensesAllowanceCents,
					long annualContactsAllowanceCents, int coveragePeriodMonths,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "updateInsurancePlan",
				_updateInsurancePlanParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, insurancePlanId, providerName, planName, active,
				annualExamAllowanceCents, annualFramesAllowanceCents,
				annualLensesAllowanceCents, annualContactsAllowanceCents,
				coveragePeriodMonths, serviceContext);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan moveInsurancePlanToTrash(
					HttpPrincipal httpPrincipal, long userId,
					long insurancePlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "moveInsurancePlanToTrash",
				_moveInsurancePlanToTrashParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, insurancePlanId);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.
			InsurancePlan restoreInsurancePlanFromTrash(
					HttpPrincipal httpPrincipal, long userId,
					long insurancePlanId)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				InsurancePlanServiceUtil.class, "restoreInsurancePlanFromTrash",
				_restoreInsurancePlanFromTrashParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, insurancePlanId);

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
				InsurancePlan)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		InsurancePlanServiceHttp.class);

	private static final Class<?>[] _addInsurancePlanParameterTypes0 =
		new Class[] {
			String.class, String.class, long.class, long.class, long.class,
			long.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _addInsurancePlanParameterTypes1 =
		new Class[] {
			String.class, String.class, long.class, long.class, long.class,
			long.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _addInsurancePlanParameterTypes2 =
		new Class[] {
			String.class, String.class, boolean.class, long.class, long.class,
			long.class, long.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteInsurancePlanParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getInsurancePlanParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getGroupInsurancePlansParameterTypes5 =
		new Class[] {long.class, int.class, int.class, int.class};
	private static final Class<?>[]
		_getGroupInsurancePlansCountParameterTypes6 = new Class[] {
			long.class, int.class
		};
	private static final Class<?>[] _updateInsurancePlanParameterTypes7 =
		new Class[] {
			long.class, String.class, String.class, long.class, long.class,
			long.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateInsurancePlanParameterTypes8 =
		new Class[] {
			long.class, String.class, String.class, long.class, long.class,
			long.class, long.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateInsurancePlanParameterTypes9 =
		new Class[] {
			long.class, String.class, String.class, boolean.class, long.class,
			long.class, long.class, long.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _moveInsurancePlanToTrashParameterTypes10 =
		new Class[] {long.class, long.class};
	private static final Class<?>[]
		_restoreInsurancePlanFromTrashParameterTypes11 = new Class[] {
			long.class, long.class
		};

}