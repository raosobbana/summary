package com.motocho.portfolio.summary.dao.coinperfrm;

import java.util.ArrayList;
import java.util.List;

public class PortfolioCoinPerformance {
	private List<CoinPerformance> performances = new ArrayList<CoinPerformance>();

	public List<CoinPerformance> getPerformances() {
		return performances;
	}
	public void setPerformances(List<CoinPerformance> performances) {
		this.performances = performances;
	}

}
