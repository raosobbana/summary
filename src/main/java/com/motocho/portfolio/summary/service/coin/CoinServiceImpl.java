package com.motocho.portfolio.summary.service.coin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.motocho.portfolio.summary.dao.coin.Coin;

@Service
public class CoinServiceImpl implements CoinService {
	/*public static void main(String[] args) {
		CoinServiceImpl coinServiceImpl = new CoinServiceImpl();
		Coin coin1 = coinServiceImpl.getCoinCreatedDetails("XRP");
		System.out.println("Created Time Coin Id-"+coin1.getCoinCode()+" Coin Value-"+coin1.getCoinValue());
		Coin coin2 = coinServiceImpl.getCoinCurrentDetails("XRP");
		System.out.println("Created Time Coin Id-"+coin2.getCoinCode()+" Coin Value-"+coin2.getCoinValue());
		
	}*/

	/**
	 * Coin Created details has to fetch from Our Data base
	 * it will not come into this part of Service.
	 */
	@Override
	public Coin getCoinCreatedDetails(String coinId) {
		Coin coin = new Coin();
		boolean isAccountAvailable = isCoinAvailable(coinId);
		if(isAccountAvailable) {
			Map<String,Double> map = getCoinCreatedPrice(coinId);
			coin.setCoinCode(coinId);
			Double coinValue = map.get(coinId);
			coin.setCoinValue(coinValue);
			coin.setCoinId(1001);
			return coin;
		}else {
			coin.setCoinId(00);
			coin.setCoinCode(coinId);
			coin.setCoinValue(00.0000);		
			return coin;
		}
	}
	
	public Coin getCoinCurrentDetails(String coinId) {
		Coin coin = new Coin();
		boolean isAccountAvailable = isCoinAvailable(coinId);
		if(isAccountAvailable) {
			Map<String,Double> map = getCoinCurrentPrice(coinId);
			coin.setCoinId(1001);
			coin.setCoinCode(coinId);
			Double coinValue = map.get(coinId);
			coin.setCoinValue(coinValue);
			return coin;
		}else {
			coin.setCoinId(00);
			coin.setCoinCode(coinId);
			coin.setCoinValue(00.0000);
			return coin;
		}	
	}

	private boolean isCoinAvailable(String coinId) {		
		Map<String,Double> map = getCoinCreatedPrice(coinId);
		Double coinValue;
		try {
			coinValue = map.get(coinId);
			if(coinValue>=0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {System.out.println(coinId+" Coin Code is not in Exist");}
		return false;
	}

	private Map<String,Double> getCoinCreatedPrice(String coinId) {
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("BTC", 7846.9833);
		map.put("ETH", 288.9833);
		map.put("XRP", 22.9833);
		map.put("XLM", 8764.9833);
		map.put("ADA", 985.9833);
		map.put("DASH", 8.9833);
		map.put("LTC", 0.9893);
		return map;
	}

	private Map<String,Double> getCoinCurrentPrice(String coinId) {
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("BTC", 8846.9833);
		map.put("ETH", 250.9833);
		map.put("XRP", 220.9833);
		map.put("XLM", 7630.9833);
		map.put("ADA", 1500.9833);
		map.put("DASH", 18.9833);
		map.put("LTC", 38.9893);
		return map;
	}

}
