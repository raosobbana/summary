package com.motocho.portfolio.summary.dao.test;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motocho.portfolio.summary.dao.trends.DayTrends;
import com.motocho.portfolio.summary.dao.trends.FifteenMinutes;
import com.motocho.portfolio.summary.dao.trends.PortfolioTrends;

public class TestData {
	
	public static void main(String[] args) {
		/*PortfolioSummary portfolioSummary = new PortfolioSummary();

		Summary summary = new Summary();
		summary.setTotalInvestment(9834.9873);
		summary.setTotalCash(3653.974);
		summary.setTotalPortfolioValue(8794784.094);
		UnrealizedSummary unrealizedSummary = new UnrealizedSummary();
		unrealizedSummary.setShortTerm(764.984);
		unrealizedSummary.setLongTerm(76409.89);
		unrealizedSummary.setTotal(74674.98);

		summary.setUnrealizedSummary(unrealizedSummary);
		portfolioSummary.setPortfolioSummary(summary);*/
		
		/*PortfolioPostion portfolioPostion = new PortfolioPostion();
		
		List<CoinPosition> positions = new ArrayList<>();
		CoinPosition btc = new CoinPosition();
		btc.setCoinCode("BTC");
		btc.setPerCentage(23.09f);
		positions.add(btc);
		
		CoinPosition xrp = new CoinPosition();
		xrp.setCoinCode("XRP");
		xrp.setPerCentage(23.09f);
		positions.add(xrp);
		
		CoinPosition eth = new CoinPosition();
		eth.setCoinCode("ETH");
		eth.setPerCentage(23.09f);
		positions.add(eth);
		
		CoinPosition xlm = new CoinPosition();
		xlm.setCoinCode("XLM");
		xlm.setPerCentage(23.09f);
		positions.add(xlm);
		
		CoinPosition ada = new CoinPosition();
		ada.setCoinCode("ADA");
		ada.setPerCentage(23.09f);
		positions.add(ada);
		
		CoinPosition dash = new CoinPosition();
		dash.setCoinCode("DASH");
		dash.setPerCentage(23.09f);
		positions.add(dash);
		
		CoinPosition ltc = new CoinPosition();
		ltc.setCoinCode("LTC");
		ltc.setPerCentage(23.09f);
		positions.add(ltc);
		
		portfolioPostion.setPositions(positions);
		portfolioPostion.setIsType("category");*/

		/*PortfolioCoinPerformance performance = new PortfolioCoinPerformance();

		List<CoinPerformance> performances = new ArrayList<>();

		CoinPerformance btc = new CoinPerformance();
		btc.setCoinCode("BTC");
		btc.setDate("16/10/2018");
		btc.setQuantity(56.9);
		btc.setCost(20.98);
		btc.setLastPrice(65.98);
		btc.set_24hourPrice(64.984);
		btc.setTotalValue(6837.948);
		btc.set_24hourValue(2873.94);
		btc.setYTDvalue(943.99);
		btc.setTotalGains(88302.984);
		performances.add(btc);

		CoinPerformance xrp = new CoinPerformance();
		xrp.setCoinCode("XRP");
		xrp.setDate("16/10/2018");
		xrp.setQuantity(56.9);
		xrp.setCost(20.98);
		xrp.setLastPrice(65.98);
		xrp.set_24hourPrice(64.984);
		xrp.setTotalValue(6837.948);
		xrp.set_24hourValue(2873.94);
		xrp.setYTDvalue(943.99);
		xrp.setTotalGains(88302.984);
		performances.add(xrp);

		CoinPerformance eth = new CoinPerformance();
		eth.setCoinCode("ETH");
		eth.setDate("16/10/2018");
		eth.setQuantity(56.9);
		eth.setCost(20.98);
		eth.setLastPrice(65.98);
		eth.set_24hourPrice(64.984);
		eth.setTotalValue(6837.948);
		eth.set_24hourValue(2873.94);
		eth.setYTDvalue(943.99);
		eth.setTotalGains(88302.984);
		performances.add(eth);

		CoinPerformance xlm = new CoinPerformance();
		xlm.setCoinCode("XLM");
		xlm.setDate("16/10/2018");
		xlm.setQuantity(56.9);
		xlm.setCost(20.98);
		xlm.setLastPrice(65.98);
		xlm.set_24hourPrice(64.984);
		xlm.setTotalValue(6837.948);
		xlm.set_24hourValue(2873.94);
		xlm.setYTDvalue(943.99);
		xlm.setTotalGains(88302.984);
		performances.add(xlm);

		CoinPerformance ada = new CoinPerformance();
		ada.setCoinCode("ADA");
		ada.setDate("16/10/2018");
		ada.setQuantity(56.9);
		ada.setCost(20.98);
		ada.setLastPrice(65.98);
		ada.set_24hourPrice(64.984);
		ada.setTotalValue(6837.948);
		ada.set_24hourValue(2873.94);
		ada.setYTDvalue(943.99);
		ada.setTotalGains(88302.984);
		performances.add(ada);

		CoinPerformance dash = new CoinPerformance();
		dash.setCoinCode("DASH");
		dash.setDate("16/10/2018");
		dash.setQuantity(56.9);
		dash.setCost(20.98);
		dash.setLastPrice(65.98);
		dash.set_24hourPrice(64.984);
		dash.setTotalValue(6837.948);
		dash.set_24hourValue(2873.94);
		dash.setYTDvalue(943.99);
		dash.setTotalGains(88302.984);
		performances.add(dash);

		CoinPerformance ltc = new CoinPerformance();
		ltc.setCoinCode("LTC");
		ltc.setDate("16/10/2018");
		ltc.setQuantity(56.9);
		ltc.setCost(20.98);
		ltc.setLastPrice(65.98);
		ltc.set_24hourPrice(64.984);
		ltc.setTotalValue(6837.948);
		ltc.set_24hourValue(2873.94);
		ltc.setYTDvalue(943.99);
		ltc.setTotalGains(88302.984);
		performances.add(ltc);

		performance.setPerformances(performances);*/
		PortfolioTrends portfolioTrends = new PortfolioTrends();
		List<FifteenMinutes> minutes = new ArrayList<>();
		TimeStamps timeStamps = new TimeStamps();
		List<Long> values = timeStamps.getDateValues();
		for(long value: values) {
			FifteenMinutes min = new FifteenMinutes();
			min.setCoinName("Bitcoin");
			Double coin = new Double(98.909);
			min.setCoinValue(coin.toString());
			min.setTimeStamp(String.valueOf(value));
			minutes.add(min);
		}
		DayTrends day = new DayTrends();
		day.setFifteenMinutes(minutes);
		portfolioTrends.setDay(day);
		
		ObjectMapper obj = new ObjectMapper();
		System.out.println(obj.valueToTree(portfolioTrends));
	}
}
