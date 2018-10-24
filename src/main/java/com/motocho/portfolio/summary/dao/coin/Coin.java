package com.motocho.portfolio.summary.dao.coin;

public class Coin {
	private long coinId;
	private String coinName;
	private String coinCode;
	private double coinValue;
	private boolean isCoinTradable;
	private boolean isCoinQuotable;
	private byte decimalMaxLength;
	private byte status;
	private long dateCreated;
	private long dateModified;

	public long getCoinId() {
		return coinId;
	}
	public void setCoinId(long coinId) {
		this.coinId = coinId;
	}
	public String getCoinName() {
		return coinName;
	}
	public void setCoinName(String coinName) {
		this.coinName = coinName;
	}
	public String getCoinCode() {
		return coinCode;
	}
	public void setCoinCode(String coinCode) {
		this.coinCode = coinCode;
	}
	public double getCoinValue() {
		return coinValue;
	}
	public void setCoinValue(double coinValue) {
		this.coinValue = coinValue;
	}
	public boolean isCoinTradable() {
		return isCoinTradable;
	}
	public void setCoinTradable(boolean isCoinTradable) {
		this.isCoinTradable = isCoinTradable;
	}
	public boolean isCoinQuotable() {
		return isCoinQuotable;
	}
	public void setCoinQuotable(boolean isCoinQuotable) {
		this.isCoinQuotable = isCoinQuotable;
	}
	public byte getDecimalMaxLength() {
		return decimalMaxLength;
	}
	public void setDecimalMaxLength(byte decimalMaxLength) {
		this.decimalMaxLength = decimalMaxLength;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public long getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}
	public long getDateModified() {
		return dateModified;
	}
	public void setDateModified(long dateModified) {
		this.dateModified = dateModified;
	}	
}
