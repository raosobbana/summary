package com.motocho.portfolio.summary.service.account;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.motocho.portfolio.summary.dao.account.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public Account getCash(long accountId) {
		Account account = new Account();
		boolean isAccountAvailable = isAccountAvailable(accountId);
		if(isAccountAvailable) {
			account.setAccountId(accountId);
			Map<Long,Double> map = getData();
			Double cashValue=00.00;
			cashValue = map.get(accountId);
			account.setCash(cashValue);
			//System.out.println("AccountId-"+account.getAccountId()+" Cash-"+account.getCash());
			return account;
		}else {
			account.setAccountId(0000l);
			account.setCash(0000.00);			
			return account;
		}
	}

	private boolean isAccountAvailable(long accountId) {		
		Map<Long,Double> map = getData();
		Double cashValue;
		try {
			cashValue = map.get(accountId);
			if(cashValue>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {System.out.println(accountId+" Account not in Exist");}
		return false;
	}

	private Map<Long,Double> getData() {
		Map<Long,Double> map = new HashMap<Long,Double>();
		map.put(1001l, 287683.9833);
		map.put(1002l, 28738.9833);
		map.put(1003l, 220387.9833);		
		return map;
	}
}
