package com.motocho.portfolio.summary.dao.repo;
/**
 * Position Table Mapping
 * @author rao.sobbana@motocho.io
 * positionId, accountId, quantity, coinId,
 * avaragePricePaid, dateCreated, dateModified
 */
public class Position {
	private long posId;
	private long acctId;
	private double qty;
	private long coiId;
	private double avgPrcPad;
	private long dtCrt;
	private long dtMod;

	public long getPosId() {
		return posId;
	}
	public void setPosId(long posId) {
		this.posId = posId;
	}
	public long getAcctId() {
		return acctId;
	}
	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public long getCoiId() {
		return coiId;
	}
	public void setCoiId(long coiId) {
		this.coiId = coiId;
	}
	public double getAvgPrcPad() {
		return avgPrcPad;
	}
	public void setAvgPrcPad(double avgPrcPad) {
		this.avgPrcPad = avgPrcPad;
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
