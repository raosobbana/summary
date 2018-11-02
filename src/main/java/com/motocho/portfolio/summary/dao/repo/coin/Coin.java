package com.motocho.portfolio.summary.dao.repo.coin;


/**
 * Coin Table Mapping
 * @author rao.sobbana@motocho.io
 * coinId, coinName, coinCode, coinValue, isCoinTradable, 
 * isCoinQuotable, decimalMaxLength, status, dateCreated,
 * dateModified
 */

//@Entity
//@Table(name="coin")
public class Coin {
	//@Id
	private long coinId;//coiId
	private String coinName;//coiNme
	private String coinCode;//coiCod
	private double coinValue;//coiVal
	private byte isCoinTradable;//isTrdble
	private byte isCoinQuotable;//isQutble
	private long decimalMaxLength;//decMaxLen
	private byte status;//stat
	private long dateCreated;//dtCrt
	private long dateModified;//dtMod

	public Coin() {
		super();
	}

	public Coin(long coinId, String coinName, String coinCode,
		double coinValue, byte isCoinTradable,
		byte isCoinQuotable, long decimalMaxLength,
		byte status, long dateCreated, long dateModified) {

		super();
		this.coinId = coinId;
		this.coinName = coinName;
		this.coinCode = coinCode;
		this.coinValue = coinValue;
		this.isCoinTradable = isCoinTradable;
		this.isCoinQuotable = isCoinQuotable;
		this.decimalMaxLength = decimalMaxLength;
		this.status = status;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}

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
	public byte getIsCoinTradable() {
		return isCoinTradable;
	}
	public void setIsCoinTradable(byte isCoinTradable) {
		this.isCoinTradable = isCoinTradable;
	}
	public byte getIsCoinQuotable() {
		return isCoinQuotable;
	}
	public void setIsCoinQuotable(byte isCoinQuotable) {
		this.isCoinQuotable = isCoinQuotable;
	}
	public long getDecimalMaxLength() {
		return decimalMaxLength;
	}
	public void setDecimalMaxLength(long decimalMaxLength) {
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
