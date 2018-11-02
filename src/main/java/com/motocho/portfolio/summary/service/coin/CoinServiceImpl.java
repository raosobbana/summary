package com.motocho.portfolio.summary.service.coin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motocho.portfolio.summary.dao.repo.coin.CoinRepositoy;

@Service
public class CoinServiceImpl implements CoinService {
	/*@Autowired
	private CoinRepositoy coinRepositoy;*/
	@Override 
	public Object getCoinValue(long coinId) {
		// TODO Auto-generated method stub
		//Object coinValue = coinRepositoy.findByCoinId(coinId);

		return new Object();//return coinValue;
	}
	
}
