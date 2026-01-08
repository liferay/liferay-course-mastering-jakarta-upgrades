/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.clarityvisionsolutions.insurance.benefits.tracker.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Brian Wing Shun Chan
 */
public class BenefitUsageExceptionException extends PortalException {

	public BenefitUsageExceptionException() {
	}

	public BenefitUsageExceptionException(String msg) {
		super(msg);
	}

	public BenefitUsageExceptionException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public BenefitUsageExceptionException(Throwable throwable) {
		super(throwable);
	}

}