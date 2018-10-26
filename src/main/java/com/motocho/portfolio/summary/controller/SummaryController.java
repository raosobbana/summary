package com.motocho.portfolio.summary.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.motocho.portfolio.summary.dao.PortfolioSummary;
import com.motocho.portfolio.summary.dao.coinperfrm.PortfolioCoinPerformance;
import com.motocho.portfolio.summary.dao.position.PortfolioPostion;
import com.motocho.portfolio.summary.dao.trends.PortfolioTrends;
import com.motocho.portfolio.summary.service.SummaryService;
import com.motocho.portfolio.summary.service.account.AccountService;
import com.motocho.portfolio.summary.service.coin.CoinService;

@RestController
@CrossOrigin
public class SummaryController {

	@Autowired
	private SummaryService summaryService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private CoinService coinService;

	@GetMapping("/summary/{userId}")
	public PortfolioSummary getSummary(@PathVariable long userId) {
		return summaryService.getSummary(userId);
	}

	@GetMapping("/summary/positions/{userId}")
	public PortfolioPostion getPositions(@PathVariable long userId) {
		return summaryService.getPositions(userId);
	}

	@GetMapping("/summary/coinperformance/{userId}")
	public PortfolioCoinPerformance getCoinPerformance(@PathVariable long userId) {
		return summaryService.getCoinPerformance(userId);
	}

	@GetMapping("/summary/trends/{userId}")
	public PortfolioTrends getSummaryTrends(@PathVariable long userId) {
		return summaryService.getSummaryTrends(userId);
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