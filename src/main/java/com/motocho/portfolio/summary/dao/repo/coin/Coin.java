package com.motocho.portfolio.summary.dao.repo.coin;

/**
 * Coin Table Mapping
 * @author rao.sobbana@motocho.io
 * coinId, coinName, coinCode, coinValue, isCoinTradable, isCoinQuotable,
 * decimalMaxLength, status, dateCreated, dateModified
 */
public class Coin {
	private long coiId;
	private String coiNme;
	private String coiCod;
	private double coiVal;
	private byte isTrdble;
	private byte isQutble;
	private long decMaxLen;
	private byte stat;
	private long dtCrt;
	private long dtMod;

	public long getCoiId() {
		return coiId;
	}
	public void setCoiId(long coiId) {
		this.coiId = coiId;
	}
	public String getCoiNme() {
		return coiNme;
	}
	public void setCoiNme(String coiNme) {
		this.coiNme = coiNme;
	}
	public String getCoiCod() {
		return coiCod;
	}
	public void setCoiCod(String coiCod) {
		this.coiCod = coiCod;
	}
	public double getCoiVal() {
		return coiVal;
	}
	public void setCoiVal(double coiVal) {
		this.coiVal = coiVal;
	}
	public byte getIsTrdble() {
		return isTrdble;
	}
	public void setIsTrdble(byte isTrdble) {
		this.isTrdble = isTrdble;
	}
	public byte getIsQutble() {
		return isQutble;
	}
	public void setIsQutble(byte isQutble) {
		this.isQutble = isQutble;
	}
	public long getDecMaxLen() {
		return decMaxLen;
	}
	public void setDecMaxLen(long decMaxLen) {
		this.decMaxLen = decMaxLen;
	}
	public byte getStat() {
		return stat;
	}
	public void setStat(byte stat) {
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
