/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.clarityvisionsolutions.insurance.benefits.tracker.exception;

import com.liferay.portal.kernel.exception.DuplicateExternalReferenceCodeException;

/**
 * @author Brian Wing Shun Chan
 */
public class DuplicateBenefitUsageExternalReferenceCodeException extends DuplicateExternalReferenceCodeException {

	public DuplicateBenefitUsageExternalReferenceCodeException() {
	}

	public DuplicateBenefitUsageExternalReferenceCodeException(String msg) {
		super(msg);
	}

	public DuplicateBenefitUsageExternalReferenceCodeException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public DuplicateBenefitUsageExternalReferenceCodeException(Throwable throwable) {
		super(throwable);
	}

}