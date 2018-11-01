package com.motocho.portfolio.summary.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.motocho.portfolio.summary.dao.PortfolioSummary;
import com.motocho.portfolio.summary.dao.coinperfrm.PortfolioCoinPerformance;
import com.motocho.portfolio.summary.dao.position.PortfolioPostion;
import com.motocho.portfolio.summary.dao.repo.acct.AccountRepositoy;
import com.motocho.portfolio.summary.dao.test.UserRepositoy;
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
	
	/*@Autowired
	private UserRepositoy userRepositoy;*/
	
	/*@Autowired
	private AccountRepositoy accountRepositoy;*/

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

	@GetMapping("/summary/trends")
	public PortfolioTrends getSummaryTrends(@RequestParam long userId, @RequestParam String query) {
		return summaryService.getSummaryTrends(userId,query);
	}

	/*@PostMapping("/transactions/save")
	public User getUsers(@RequestBody User user){
		User user = new User();
		user.setUserId(4);
		user.setUserFirstName("Rajeswara");
		user.setUserMiddleName("Rao");
		user.setUserLastName("Sobbana");
		user.setUserName("Rajeswara Rao Sobbana");
		user.setPassword("indi2");
		user.setPreviousPassword("jhbsd");
		user.setResetPassword("mhs");
		user.setUserRole("user");
		user.setLoginAttempts(1);
		user.setStatus((byte)1);
		user.setDateCreated(new Date().getTime());
		user.setDateCreated(new Date().getTime());
		{
	        "userId": 1,
	        "userFirstName": "Dwayne",
	        "userMiddleName": "Miller",
	        "userLastName": "Bush",
	        "userName": "Dwayne Miller Bush",
	        "password": "indi2",
	        "previousPassword": "jhbsd",
	        "resetPassword": "mhs",
	        "userRole": "user",
	        "loginAttempts": 1,
	        "status": 1,
	        "dateCreated": 1540817147645,
	        "dateModified": 0
	    }

		return userRepositoy.save(user);
	}*/
	
	/*@GetMapping("/transactions")
	public Optional<Account> getTransactions(){

		return accountRepositoy.findById(2l);
	}*/
	/*@PostMapping("/summary/add/{accountId}")
    public SummaryPosition addSummary(@PathVariable Long accountId) {
		SummaryPosition summary = new SummaryPosition();
		summary.setPositionId(accountId);
		summary.setQuantity(3764.38774);
		summary.setCoinId(238789);
		
		return summaryRepositoy.save(summary);
    }*/
}