package com.motocho.portfolio.summary.dao.repo.acct;

/*import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

/**
 * Accounts Table Mapping
 * @author rao.sobbana@motocho.io
 * accountId, userId, cashBalance, cashCurrencyCode, status,
 * dateCreated, dateModified
 */

//@Entity
//@Table(name="accounts")
public class Account {
	//@Id
	private long accountId;
	private long userId;
	private double cashBalance;
	private String cashCurrencyCode;
	private int status;
	private String dateCreated;
	private String dateModified;

	public Account() {
		super();
	}

	public Account(long accountId, long userId, 
		double cashBalance, String cashCurrencyCode,
		int status, String dateCreated, String dateModified) {

		super();
		this.accountId = accountId;
		this.userId = userId;
		this.cashBalance = cashBalance;
		this.cashCurrencyCode = cashCurrencyCode;
		this.status = status;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(double cashBalance) {
		this.cashBalance = cashBalance;
	}
	public String getCashCurrencyCode() {
		return cashCurrencyCode;
	}
	public void setCashCurrencyCode(String cashCurrencyCode) {
		this.cashCurrencyCode = cashCurrencyCode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
}
