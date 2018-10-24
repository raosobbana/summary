package com.motocho.portfolio.summary.service;

import com.motocho.portfolio.summary.dao.PortfolioSummary;
import com.motocho.portfolio.summary.dao.coinperfrm.PortfolioCoinPerformance;
import com.motocho.portfolio.summary.dao.position.PortfolioPostion;
import com.motocho.portfolio.summary.dao.trends.PortfolioTrends;

public interface SummaryService {
	public PortfolioSummary getSummary();
	public PortfolioPostion getPositions();
	public PortfolioCoinPerformance getCoinPerformance();
	public PortfolioTrends getSummaryTrends();

}
