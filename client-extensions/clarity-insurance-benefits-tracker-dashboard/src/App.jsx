import React, {useEffect, useState} from 'react';

import BenefitChart from './components/BenefitChart';
import DashboardSummary from './components/DashboardSummary';
import LoadingState from './components/LoadingState';
import {getActiveEnrollments, getUsageDetails} from './services/api';

const BENEFIT_CATEGORIES = [
	{
		allowanceKey: 'annualExamAllowanceCents',
		color: '#4B9BFF',
		label: 'Exam',
		usedKey: 'examUsedCents',
	},
	{
		allowanceKey: 'annualFramesAllowanceCents',
		color: '#FFB46E',
		label: 'Frames',
		usedKey: 'framesUsedCents',
	},
	{
		allowanceKey: 'annualLensesAllowanceCents',
		color: '#50D2A0',
		label: 'Lenses',
		usedKey: 'lensesUsedCents',
	},
	{
		allowanceKey: 'annualContactsAllowanceCents',
		color: '#FF73C7',
		label: 'Contacts',
		usedKey: 'contactsUsedCents',
	},
];

function centsToDollars(cents) {
	return (cents / 100).toFixed(2);
}

export default function App() {
	const [loading, setLoading] = useState(true);
	const [error, setError] = useState(null);
	const [usageDetails, setUsageDetails] = useState(null);
	const [noEnrollment, setNoEnrollment] = useState(false);

	useEffect(() => {
		async function loadData() {
			try {
				const siteId =
					typeof Liferay !== 'undefined'
						? Liferay.ThemeDisplay.getScopeGroupId()
						: 0;

				const userId =
					typeof Liferay !== 'undefined'
						? Liferay.ThemeDisplay.getUserId()
						: 0;

				if (!siteId) {
					setError('Unable to determine site context.');
					setLoading(false);

					return;
				}

				// Find the user's active enrollment

				const enrollments = await getActiveEnrollments(siteId);

				console.log(enrollments);
				console.log(userId);
				console.log("userId:", userId, typeof userId);
				console.log("enrollment.member.id:", enrollments[0].member.id, typeof enrollments[0].member.id);

				const userEnrollment = enrollments.find(
					(enrollment) =>
						enrollment.member && enrollment.member.id === Number(userId)
				);

				if (!userEnrollment) {
					console.log("Failed to match the member id to an enrollment");
					setNoEnrollment(true);
					setLoading(false);

					return;
				}

				// Fetch aggregated usage details

				const details = await getUsageDetails(userEnrollment.id);

				setUsageDetails(details);
			}
			catch (err) {
				console.error('Dashboard load error:', err);
				setError(err.message);
			}
			finally {
				setLoading(false);
			}
		}

		loadData();
	}, []);

	if (loading) {
		return <LoadingState />;
	}

	if (error) {
		return (
			<div className="alert alert-danger">
				<strong>Error:</strong> {error}
			</div>
		);
	}

	if (noEnrollment) {
		return <LoadingState empty />;
	}

	return (
		<div className="ibt-dashboard">
			<DashboardSummary
				endDate={usageDetails.endDate}
				planName={usageDetails.planName}
				providerName={usageDetails.providerName}
				startDate={usageDetails.startDate}
			/>

			<div className="ibt-dashboard__charts">
				{BENEFIT_CATEGORIES.map((category) => {
					const allowanceCents =
						usageDetails[category.allowanceKey] || 0;
					const usedCents = usageDetails[category.usedKey] || 0;
					const remainingCents = Math.max(
						0,
						allowanceCents - usedCents
					);

					return (
						<BenefitChart
							allowanceDollars={centsToDollars(allowanceCents)}
							color={category.color}
							key={category.label}
							label={category.label}
							remainingDollars={centsToDollars(remainingCents)}
							usedDollars={centsToDollars(usedCents)}
						/>
					);
				})}
			</div>
		</div>
	);
}
