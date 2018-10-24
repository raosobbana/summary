package com.motocho.portfolio.summary.service.coin;

import com.motocho.portfolio.summary.dao.coin.Coin;

public interface CoinService {
	public Coin getCoinCreatedDetails(String coinId);
	public Coin getCoinCurrentDetails(String coinId);
}
