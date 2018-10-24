package com.motocho.portfolio.summary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motocho.portfolio.summary.dao.PortfolioSummary;
import com.motocho.portfolio.summary.dao.coinperfrm.PortfolioCoinPerformance;
import com.motocho.portfolio.summary.dao.position.PortfolioPostion;
import com.motocho.portfolio.summary.dao.test.SummaryPosition;
import com.motocho.portfolio.summary.dao.test.SummaryRepositoy;
import com.motocho.portfolio.summary.dao.trends.PortfolioTrends;
import com.motocho.portfolio.summary.service.SummaryService;
import com.motocho.portfolio.summary.service.account.AccountService;
import com.motocho.portfolio.summary.service.coin.CoinService;


@RestController
public class SummaryController {

	@Autowired
	private SummaryService summaryService;
	
	@Autowired
	private AccountService accountService;

	@Autowired
	private CoinService coinService;

	@GetMapping("/summary")
	public PortfolioSummary getSummary() {
		return summaryService.getSummary();
	}
	
	@GetMapping("/summary/positions")
	public PortfolioPostion getPositions() {
		return summaryService.getPositions();
	}
	
	@GetMapping("/summary/coinperformance")
	public PortfolioCoinPerformance getCoinPerformance() {
		return summaryService.getCoinPerformance();
	}

	@GetMapping("/summary/trends")
	public PortfolioTrends getSummaryTrends() {
		return summaryService.getSummaryTrends();
	}

	/*@PostMapping("/summary/add/{accountId}")
    public SummaryPosition addSummary(@PathVariable Long accountId) {
		SummaryPosition summary = new SummaryPosition();
		summary.setPositionId(accountId);
		summary.setQuantity(3764.38774);
		summary.setCoinId(238789);
		
		return summaryRepositoy.save(summary);
    }*/
}