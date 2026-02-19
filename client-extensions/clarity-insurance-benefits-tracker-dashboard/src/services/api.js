const BASE_URL = '/o/clarity-insurance-benefits-tracker-rest/v1.0';

function fetchWithLiferay(url, options = {}) {
	const fetchFn =
		typeof Liferay !== 'undefined' && Liferay.Util && Liferay.Util.fetch
			? Liferay.Util.fetch
			: fetch;

	return fetchFn(url, {
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json',
		},
		...options,
	});
}

export async function getActiveEnrollments(siteId) {
	const url = `${BASE_URL}/sites/${siteId}/plan-enrollments?filter=${encodeURIComponent(
		'enrollmentStatus eq 1'
	)}&pageSize=200`;

	const response = await fetchWithLiferay(url);

	if (!response.ok) {
		throw new Error(`Failed to fetch enrollments: ${response.status}`);
	}

	const data = await response.json();

	return data.items || [];
}

export async function getUsageDetails(planEnrollmentId) {
	const url = `${BASE_URL}/plan-enrollment/${planEnrollmentId}/usage-details`;

	const response = await fetchWithLiferay(url);

	if (!response.ok) {
		throw new Error(`Failed to fetch usage details: ${response.status}`);
	}

	return response.json();
}
