import React from 'react';

export default function LoadingState({empty}) {
	if (empty) {
		return (
			<div className="card ibt-empty-card">
				<div className="card-body text-center">
					<div className="ibt-empty-card__icon">
						<svg
							fill="none"
							height="48"
							viewBox="0 0 24 24"
							width="48"
							xmlns="http://www.w3.org/2000/svg"
						>
							<path
								d="M9 12h6m-3-3v6m-7 4h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v10a2 2 0 002 2z"
								stroke="#6B6C7E"
								strokeLinecap="round"
								strokeLinejoin="round"
								strokeWidth="1.5"
							/>
						</svg>
					</div>

					<h3 className="ibt-empty-card__title">
						No Active Enrollment Found
					</h3>

					<p className="ibt-empty-card__description">
						You do not have an active plan enrollment. Please
						contact your administrator to enroll in a benefits plan.
					</p>
				</div>
			</div>
		);
	}

	return (
		<div className="card ibt-loading-card">
			<div className="card-body text-center">
				<div className="loading-animation" />

				<p className="ibt-loading-card__text">
					Loading benefit details...
				</p>
			</div>
		</div>
	);
}
