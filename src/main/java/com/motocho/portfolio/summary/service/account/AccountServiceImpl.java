package com.motocho.portfolio.summary.service.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motocho.portfolio.summary.dao.repo.acct.Account;
import com.motocho.portfolio.summary.dao.repo.acct.AccountRepositoy;

@Service
public class AccountServiceImpl implements AccountService {

	/*@Autowired
	private AccountRepositoy accountRepositoy;*/
	
	public double getCash(long userId) {
		/*Optional<Account> account =accountRepositoy.findById(userId);
		Account act = account.get();
		System.out.println("Cash Balance:"+act.getCashBalance());
		return act.getCashBalance();*/
		return 93.33;
	}
	
}
