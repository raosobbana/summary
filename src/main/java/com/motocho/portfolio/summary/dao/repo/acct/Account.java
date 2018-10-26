package com.motocho.portfolio.summary.dao.repo.acct;

/**
 * Accounts Table Mapping
 * @author rao.sobbana@motocho.io
 * accountId, userId, cashBalance, cashCurrencyCode, status,
 * dateCreated, dateModified
 */
public class Account {
	private long acctId;
	private long usrId;
	private double cshBal;
	private String curCod;
	private int stat;
	private long dtCrt;
	private long dtMod;

	public long getAcctId() {
		return acctId;
	}
	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
	public long getUsrId() {
		return usrId;
	}
	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}
	public double getCshBal() {
		return cshBal;
	}
	public void setCshBal(double cshBal) {
		this.cshBal = cshBal;
	}
	public String getCurCod() {
		return curCod;
	}
	public void setCurCod(String curCod) {
		this.curCod = curCod;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	public long getDtCrt() {
		return dtCrt;
	}
	public void setDtCrt(long dtCrt) {
		this.dtCrt = dtCrt;
	}
	public long getDtMod() {
		return dtMod;
	}
	public void setDtMod(long dtMod) {
		this.dtMod = dtMod;
	}
}
