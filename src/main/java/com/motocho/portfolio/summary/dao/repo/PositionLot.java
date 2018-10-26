package com.motocho.portfolio.summary.dao.repo;

/**
 * Position_Lot Table Mapping
 * @author rao.sobbana@motocho.io
 * positionLotId, positionId, dateAcquired, quantity, fee,
 * pricePaid, dateCreated, dateModified
 */
public class PositionLot {
	private long posLotId;
	private long posId;
	private long dtAcq;
	private float qty;
	private double fee;
	private double prcPad;
	private long dtCrt;
	private long dtMod;

	public long getPosLotId() {
		return posLotId;
	}
	public void setPosLotId(long posLotId) {
		this.posLotId = posLotId;
	}
	public long getPosId() {
		return posId;
	}
	public void setPosId(long posId) {
		this.posId = posId;
	}
	public long getDtAcq() {
		return dtAcq;
	}
	public void setDtAcq(long dtAcq) {
		this.dtAcq = dtAcq;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getPrcPad() {
		return prcPad;
	}
	public void setPrcPad(double prcPad) {
		this.prcPad = prcPad;
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
