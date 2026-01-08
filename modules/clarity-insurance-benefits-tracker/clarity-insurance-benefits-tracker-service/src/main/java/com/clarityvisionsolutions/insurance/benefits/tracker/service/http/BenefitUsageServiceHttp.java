/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.http;

import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>BenefitUsageServiceUtil</code> service
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
public class BenefitUsageServiceHttp {

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage
				addBenefitUsage(
					HttpPrincipal httpPrincipal, long planEnrollmentId,
					String benefitType, long amountUsedCents,
					java.util.Date serviceDate, String reference, String notes,
					String sourceType, String sourceReference,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class, "addBenefitUsage",
				_addBenefitUsageParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, planEnrollmentId, benefitType, amountUsedCents,
				serviceDate, reference, notes, sourceType, sourceReference,
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
				BenefitUsage)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage
				deleteBenefitUsage(
					HttpPrincipal httpPrincipal, long benefitUsageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class, "deleteBenefitUsage",
				_deleteBenefitUsageParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, benefitUsageId);

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
				BenefitUsage)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage
				getBenefitUsage(
					HttpPrincipal httpPrincipal, long benefitUsageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class, "getBenefitUsage",
				_getBenefitUsageParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, benefitUsageId);

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
				BenefitUsage)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<com.clarityvisionsolutions.insurance.benefits.tracker.model.
			BenefitUsage> getGroupPlanEnrollmentBenefitUsages(
					HttpPrincipal httpPrincipal, long groupId,
					long planEnrollmentId, int status)
				throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class,
				"getGroupPlanEnrollmentBenefitUsages",
				_getGroupPlanEnrollmentBenefitUsagesParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, planEnrollmentId, status);

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
					BenefitUsage>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage
				updateBenefitUsage(
					HttpPrincipal httpPrincipal, long benefitUsageId,
					String benefitType, long amountUsedCents,
					java.util.Date serviceDate, String reference, String notes,
					String sourceType, String sourceReference,
					com.liferay.portal.kernel.service.ServiceContext
						serviceContext)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class, "updateBenefitUsage",
				_updateBenefitUsageParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, benefitUsageId, benefitType, amountUsedCents,
				serviceDate, reference, notes, sourceType, sourceReference,
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
				BenefitUsage)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage
				moveBenefitUsageToTrash(
					HttpPrincipal httpPrincipal, long userId,
					long benefitUsageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class, "moveBenefitUsageToTrash",
				_moveBenefitUsageToTrashParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, benefitUsageId);

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
				BenefitUsage)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage
				restoreBenefitUsageFromTrash(
					HttpPrincipal httpPrincipal, long userId,
					long benefitUsageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				BenefitUsageServiceUtil.class, "restoreBenefitUsageFromTrash",
				_restoreBenefitUsageFromTrashParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, benefitUsageId);

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
				BenefitUsage)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		BenefitUsageServiceHttp.class);

	private static final Class<?>[] _addBenefitUsageParameterTypes0 =
		new Class[] {
			long.class, String.class, long.class, java.util.Date.class,
			String.class, String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteBenefitUsageParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getBenefitUsageParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getGroupPlanEnrollmentBenefitUsagesParameterTypes3 = new Class[] {
			long.class, long.class, int.class
		};
	private static final Class<?>[] _updateBenefitUsageParameterTypes4 =
		new Class[] {
			long.class, String.class, long.class, java.util.Date.class,
			String.class, String.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _moveBenefitUsageToTrashParameterTypes5 =
		new Class[] {long.class, long.class};
	private static final Class<?>[]
		_restoreBenefitUsageFromTrashParameterTypes6 = new Class[] {
			long.class, long.class
		};

}