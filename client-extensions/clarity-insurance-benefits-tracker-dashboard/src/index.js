import React from 'react';
import {createRoot} from 'react-dom/client';

import App from './App';
import './styles/index.css';

class InsuranceBenefitTrackerDashboard extends HTMLElement {
	connectedCallback() {
		this._root = createRoot(this);

		this._root.render(React.createElement(App));
	}

	disconnectedCallback() {
		if (this._root) {
			this._root.unmount();
			this._root = null;
		}
	}
}

if (!customElements.get('insurance-benefit-tracker-dashboard')) {
	customElements.define(
		'insurance-benefit-tracker-dashboard',
		InsuranceBenefitTrackerDashboard
	);
}
