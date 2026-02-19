import React from 'react';
import {Cell, Legend, Pie, PieChart, ResponsiveContainer, Tooltip} from 'recharts';

const REMAINING_COLOR = '#E7E7ED';

function CustomTooltip({active, payload}) {
	if (active && payload && payload.length) {
		return (
			<div className="ibt-tooltip">
				<p className="ibt-tooltip__label">{payload[0].name}</p>
				<p className="ibt-tooltip__value">${payload[0].value}</p>
			</div>
		);
	}

	return null;
}

export default function BenefitChart({
	allowanceDollars,
	color,
	label,
	remainingDollars,
	usedDollars,
}) {
	const data = [
		{name: 'Used', value: parseFloat(usedDollars)},
		{name: 'Remaining', value: parseFloat(remainingDollars)},
	];

	const colors = [color, REMAINING_COLOR];

	return (
		<div className="card ibt-chart-card">
			<div className="card-body">
				<h3 className="card-title ibt-chart-card__title">{label}</h3>

				<ResponsiveContainer height={220} width="100%">
					<PieChart>
						<Pie
							cx="50%"
							cy="50%"
							data={data}
							dataKey="value"
							innerRadius={55}
							nameKey="name"
							outerRadius={85}
							paddingAngle={2}
						>
							{data.map((entry, index) => (
								<Cell
									fill={colors[index]}
									key={`cell-${index}`}
									stroke="none"
								/>
							))}
						</Pie>

						<Tooltip content={<CustomTooltip />} />

						<Legend
							formatter={(value) => (
								<span className="ibt-chart-card__legend-text">
									{value}
								</span>
							)}
							iconType="circle"
						/>
					</PieChart>
				</ResponsiveContainer>

				<div className="ibt-chart-card__summary">
					<div className="ibt-chart-card__stat">
						<span className="ibt-chart-card__stat-label">
							Allowance
						</span>

						<span className="ibt-chart-card__stat-value">
							${allowanceDollars}
						</span>
					</div>

					<div className="ibt-chart-card__stat">
						<span
							className="ibt-chart-card__stat-label"
							style={{color}}
						>
							Used
						</span>

						<span
							className="ibt-chart-card__stat-value"
							style={{color}}
						>
							${usedDollars}
						</span>
					</div>

					<div className="ibt-chart-card__stat">
						<span className="ibt-chart-card__stat-label">
							Remaining
						</span>

						<span className="ibt-chart-card__stat-value">
							${remainingDollars}
						</span>
					</div>
				</div>
			</div>
		</div>
	);
}
