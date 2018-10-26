package com.motocho.portfolio.summary.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.motocho.portfolio.summary.dao.PortfolioSummary;
import com.motocho.portfolio.summary.dao.Summary;
import com.motocho.portfolio.summary.dao.UnrealizedSummary;
import com.motocho.portfolio.summary.dao.coinperfrm.CoinPerformance;
import com.motocho.portfolio.summary.dao.coinperfrm.PortfolioCoinPerformance;
import com.motocho.portfolio.summary.dao.position.CoinPosition;
import com.motocho.portfolio.summary.dao.position.PortfolioPostion;
import com.motocho.portfolio.summary.dao.test.TimeStamps;
import com.motocho.portfolio.summary.dao.trends.DayTrends;
import com.motocho.portfolio.summary.dao.trends.FifteenMinutes;
import com.motocho.portfolio.summary.dao.trends.PortfolioTrends;

@Service
public class SummaryServiceImpl implements SummaryService {

	@Override
	public PortfolioSummary getSummary(long userId) {
		PortfolioSummary portfolioSummary = new PortfolioSummary();
		Summary summary = new Summary();
		if(userId==1) {
			summary.setTotalInvestment(17652.470608530024);
			summary.setTotalCash(42150.36579250125);
			summary.setTotalPortfolioValue(59802.83640103128);
			UnrealizedSummary unrealizedSummary = new UnrealizedSummary();
			unrealizedSummary.setShortTerm(26944.61335114149);
			unrealizedSummary.setLongTerm(11994.682047118355);
			unrealizedSummary.setTotal(38939.29539825984);
			summary.setUnrealizedSummary(unrealizedSummary);
			portfolioSummary.setPortfolioSummary(summary);
			return portfolioSummary;
		}else {
			summary.setTotalInvestment(26226.402569074646);
			summary.setTotalCash(9660.007235879099);
			summary.setTotalPortfolioValue(35886.40980495374);
			UnrealizedSummary unrealizedSummary = new UnrealizedSummary();
			unrealizedSummary.setShortTerm(521.9493816632781);
			unrealizedSummary.setLongTerm(1485.1157659664937);
			unrealizedSummary.setTotal(2007.0651476297717);
			summary.setUnrealizedSummary(unrealizedSummary);
			portfolioSummary.setPortfolioSummary(summary);
			return portfolioSummary;
		}
		//summaryRepositoy.findAll();
	}

	@Override
	public PortfolioPostion getPositions(long userId) {
		PortfolioPostion portfolioPostion = new PortfolioPostion();

		List<CoinPosition> positions = new ArrayList<>();
		if(userId==1) {
			CoinPosition btc = new CoinPosition();
			btc.setName("Bitcoin");
			btc.setValue("18.12%");
			positions.add(btc);

			CoinPosition xrp = new CoinPosition();
			xrp.setName("Ripple");
			xrp.setValue("17.65%");
			positions.add(xrp);

			CoinPosition eth = new CoinPosition();
			eth.setName("Ethereum");
			eth.setValue("23.09%");
			positions.add(eth);

			CoinPosition xlm = new CoinPosition();
			xlm.setName("Stellar");
			xlm.setValue("9.98%");
			positions.add(xlm);

			CoinPosition ada = new CoinPosition();
			ada.setName("Cardano");
			ada.setValue("15.77%");
			positions.add(ada);

			CoinPosition position = new CoinPosition();
			position.setName("Cash");
			position.setValue("15.39%");
			positions.add(position);

			portfolioPostion.setPositions(positions);
			portfolioPostion.setIsType("category");
			return portfolioPostion;

		}else {

			CoinPosition btc = new CoinPosition();
			btc.setName("Bitcoin");
			btc.setValue("18.12%");
			positions.add(btc);

			CoinPosition ltc = new CoinPosition();
			ltc.setName("Litecoin");
			ltc.setValue("23.09%");
			positions.add(ltc);

			CoinPosition dash = new CoinPosition();
			dash.setName("Dash");
			dash.setValue("33.98%");
			positions.add(dash);

			CoinPosition position = new CoinPosition();
			position.setName("Cash");
			position.setValue("24.81%");
			positions.add(position);

			portfolioPostion.setPositions(positions);
			portfolioPostion.setIsType("category");
			return portfolioPostion;
		}
	}

	@Override
	public PortfolioCoinPerformance getCoinPerformance(long userId) {
		PortfolioCoinPerformance performance = new PortfolioCoinPerformance();

		List<CoinPerformance> performances = new ArrayList<>();
		Date date = new Date();

		if(userId==1) {
			CoinPerformance btc = new CoinPerformance();
			btc.setCoinName("Bitcoin");
			btc.setCoinCode("BTC");
			btc.setDate(date.toLocaleString());
			btc.setQuantity(56.9);
			btc.setCost(20.98);
			btc.setLastPrice(65.98);
			btc.set_24hourPrice(64.984);
			btc.set_24hourPriceChange((byte)1);
			btc.setTotalValue(6837.948);
			btc.set_24hourValue(2873.94);
			btc.set_24hourValueChange((byte)1);
			btc.setYTDValue(943.99);
			btc.setYTDValueChange((byte)1);
			btc.setTotalGains(88302.984);
			btc.setIsType("USD");
			performances.add(btc);

			CoinPerformance xrp = new CoinPerformance();
			xrp.setCoinName("Ripple");
			xrp.setCoinCode("XRP");
			xrp.setDate(date.toLocaleString());
			xrp.setQuantity(57.9);
			xrp.setCost(29.98);
			xrp.setLastPrice(75.98);
			xrp.set_24hourPrice(84.984);
			xrp.set_24hourPriceChange((byte)2);
			xrp.setTotalValue(8784.948);
			xrp.set_24hourValue(8773.94);
			xrp.set_24hourValueChange((byte)2);
			xrp.setYTDValue(887.99);
			xrp.setYTDValueChange((byte)2);
			xrp.setTotalGains(98894.984);
			xrp.setIsType("USD");
			performances.add(xrp);

			CoinPerformance eth = new CoinPerformance();
			eth.setCoinName("Ethereum");
			eth.setCoinCode("ETH");
			eth.setDate(date.toLocaleString());
			eth.setQuantity(76.9);
			eth.setCost(40.98);
			eth.setLastPrice(98.98);
			eth.set_24hourPrice(75.984);
			eth.set_24hourPriceChange((byte)1);
			eth.setTotalValue(6546.948);
			eth.set_24hourValue(764.94);
			eth.set_24hourValueChange((byte)1);
			eth.setYTDValue(3874.99);
			eth.setYTDValueChange((byte)1);
			eth.setTotalGains(4765.984);
			eth.setIsType("USD");
			performances.add(eth);

			CoinPerformance xlm = new CoinPerformance();
			xlm.setCoinName("Stellar");
			xlm.setCoinCode("XLM");
			xlm.setDate(date.toLocaleString());
			xlm.setQuantity(87.9);
			xlm.setCost(45.98);
			xlm.setLastPrice(88.98);
			xlm.set_24hourPrice(65.984);
			xlm.set_24hourPriceChange((byte)3);
			xlm.setTotalValue(9845.948);
			xlm.set_24hourValue(8444.94);
			xlm.set_24hourValueChange((byte)3);
			xlm.setYTDValue(7647.99);
			xlm.setYTDValueChange((byte)3);
			xlm.setTotalGains(87595.984);
			xlm.setIsType("USD");
			performances.add(xlm);

			CoinPerformance ada = new CoinPerformance();
			ada.setCoinName("Cardano");
			ada.setCoinCode("ADA");
			ada.setDate(date.toLocaleString());
			ada.setQuantity(43.9);
			ada.setCost(67.98);
			ada.setLastPrice(87.98);
			ada.set_24hourPrice(76.984);
			ada.set_24hourPriceChange((byte)2);
			ada.setTotalValue(8785.948);
			ada.set_24hourValue(7644.94);
			ada.set_24hourValueChange((byte)2);
			ada.setYTDValue(7784.99);
			ada.setYTDValueChange((byte)1);
			ada.setTotalGains(748684.984);
			ada.setIsType("USD");
			performances.add(ada);

			performance.setPerformances(performances);
			return performance;

		}else {
			CoinPerformance btc = new CoinPerformance();
			btc.setCoinName("Bitcoin");
			btc.setCoinCode("BTC");
			btc.setDate(date.toLocaleString());
			btc.setQuantity(56.9);
			btc.setCost(20.98);
			btc.setLastPrice(65.98);
			btc.set_24hourPrice(64.984);
			btc.set_24hourPriceChange((byte)1);
			btc.setTotalValue(6837.948);
			btc.set_24hourValue(2873.94);
			btc.set_24hourValueChange((byte)1);
			btc.setYTDValue(943.99);
			btc.setYTDValueChange((byte)1);
			btc.setTotalGains(88302.984);
			btc.setIsType("USD");
			performances.add(btc);

			CoinPerformance ltc = new CoinPerformance();
			ltc.setCoinName("Litecoin");
			ltc.setCoinCode("LTC");
			ltc.setDate(date.toLocaleString());
			ltc.setQuantity(63.9);
			ltc.setCost(56.98);
			ltc.setLastPrice(82.98);
			ltc.set_24hourPrice(90.984);
			ltc.set_24hourPriceChange((byte)3);
			ltc.setTotalValue(8578.948);
			ltc.set_24hourValue(5885.94);
			ltc.set_24hourValueChange((byte)3);
			ltc.setYTDValue(5875.99);
			ltc.setYTDValueChange((byte)3);
			ltc.setTotalGains(48894.984);
			ltc.setIsType("USD");
			performances.add(ltc);

			CoinPerformance das = new CoinPerformance();
			das.setCoinName("Dash");
			das.setCoinCode("DASH");
			das.setDate(date.toLocaleString());
			das.setQuantity(47.9);
			das.setCost(87.98);
			das.setLastPrice(93.98);
			das.set_24hourPrice(99.984);
			das.set_24hourPriceChange((byte)1);
			das.setTotalValue(4847.948);
			das.set_24hourValue(4875.94);
			das.set_24hourValueChange((byte)1);
			das.setYTDValue(4874.99);
			das.setYTDValueChange((byte)1);
			das.setTotalGains(88848.984);
			das.setIsType("USD");
			performances.add(das);

			performance.setPerformances(performances);
			return performance;
		}
	}

	@Override
	public PortfolioTrends getSummaryTrends(long userId) {
		PortfolioTrends portfolioTrends = new PortfolioTrends();
		List<FifteenMinutes> minutes = new ArrayList<>();
		TimeStamps timeStamps = new TimeStamps();
		List<Long> values = timeStamps.getDateValues();
		for(long value: values) {
			FifteenMinutes min = new FifteenMinutes();
			Double porfolioValue = 10000*Math.random();
			min.setPortfolioValue(Double.toString(porfolioValue));
			min.setTimeStamp(String.valueOf(value));
			minutes.add(min);
		}
		DayTrends day = new DayTrends();
		day.setFifteenMinutes(minutes);
		portfolioTrends.setDay(day);
		return portfolioTrends;
	}

	private String getRandomCoinName(long userId) {
		List<String> user1Coins = new ArrayList<String>();
		user1Coins.add("Bitcoin");
		user1Coins.add("Ethereum");
		user1Coins.add("Litecoin");
		user1Coins.add("Ripple");
		user1Coins.add("Cardano");
	
		List<String> user2Coins = new ArrayList<String>();
		user2Coins.add("Bitcoin");
		user2Coins.add("Ethereum");
		user2Coins.add("Stellar");
		if(userId==1) {
			int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
			return user1Coins.get(coinIndex);
		}else {
			int coinIndex = ThreadLocalRandom.current().nextInt(user2Coins.size());	
			return user2Coins.get(coinIndex);
		}
	}

	private int getRandomPercentage(long userId) {
		List<Integer> user1Coins = new ArrayList<Integer>();
		user1Coins.add(18);
		user1Coins.add(17);
		user1Coins.add(23);
		user1Coins.add(11);
		user1Coins.add(11);
	
		List<Integer> user2Coins = new ArrayList<Integer>();
		user2Coins.add(21);
		user2Coins.add(19);
		user2Coins.add(23);
		if(userId==1) {
			int coinIndex = ThreadLocalRandom.current().nextInt(user1Coins.size());	
			return user1Coins.get(coinIndex);
		}else {
			int coinIndex = ThreadLocalRandom.current().nextInt(user2Coins.size());	
			return user2Coins.get(coinIndex);
		}
	}
}
