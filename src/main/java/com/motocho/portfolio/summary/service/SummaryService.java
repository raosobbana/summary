package com.motocho.portfolio.summary.service;

import com.motocho.portfolio.summary.dao.PortfolioSummary;
import com.motocho.portfolio.summary.dao.coinperfrm.PortfolioCoinPerformance;
import com.motocho.portfolio.summary.dao.position.PortfolioPostion;
import com.motocho.portfolio.summary.dao.trends.PortfolioTrends;

public interface SummaryService {
	public PortfolioSummary getSummary(long userId);
	public PortfolioPostion getPositions(long userId);
	public PortfolioCoinPerformance getCoinPerformance(long userId);
	public PortfolioTrends getSummaryTrends(long userId,String query);

}
