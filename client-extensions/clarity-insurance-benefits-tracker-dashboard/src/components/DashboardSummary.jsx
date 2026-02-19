import React from 'react';

function formatDate(dateString) {
	if (!dateString) {
		return '';
	}

	try {
		const date = new Date(dateString);

		return date.toLocaleDateString('en-US', {
			day: '2-digit',
			month: 'short',
			year: 'numeric',
		});
	}
	catch {
		return dateString;
	}
}

export default function DashboardSummary({
	endDate,
	planName,
	providerName,
	startDate,
}) {
	return (
		<div className="card ibt-summary-card">
			<div className="card-body">
				<div className="ibt-summary-card__header">
					<div>
						<h2 className="ibt-summary-card__plan-name">
							{planName}
						</h2>

						<p className="ibt-summary-card__provider">
							{providerName}
						</p>
					</div>

					<div className="ibt-summary-card__dates">
						<span className="label label-success">
							<span className="label-item label-item-expand">
								Active
							</span>
						</span>

						<span className="ibt-summary-card__period">
							{formatDate(startDate)} &mdash;{' '}
							{formatDate(endDate)}
						</span>
					</div>
				</div>
			</div>
		</div>
	);
}
