package com.motocho.portfolio.summary.dao.repo;

/*import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

/**
 * Position_Lot Table Mapping
 * @author rao.sobbana@motocho.io
 * positionLotId, positionId, dateAcquired, quantity, fee,
 * pricePaid, dateCreated, dateModified
 */

//@Entity
//@Table(name="position_lot")
public class PositionLot {
	//@Id
	private long positionLotId;//posLotId
	private long positionId;//posId
	private String dateAcquired;//dtAcq
	private float quantity;//qty
	private double fee;//fee
	private double pricePaid;//prcPad
	private String dateCreated;//dtCrt
	private String dateModified;//dtMod

	public PositionLot() {
		super();
	}

	public PositionLot(long positionLotId, long positionId,
		String dateAcquired, float quantity, double fee,
		double pricePaid, String dateCreated,
		String dateModified) {

		super();
		this.positionLotId = positionLotId;
		this.positionId = positionId;
		this.dateAcquired = dateAcquired;
		this.quantity = quantity;
		this.fee = fee;
		this.pricePaid = pricePaid;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}

	public long getPositionLotId() {
		return positionLotId;
	}
	public void setPositionLotId(long positionLotId) {
		this.positionLotId = positionLotId;
	}
	public long getPositionId() {
		return positionId;
	}
	public void setPositionId(long positionId) {
		this.positionId = positionId;
	}
	public String getDateAcquired() {
		return dateAcquired;
	}
	public void setDateAcquired(String dateAcquired) {
		this.dateAcquired = dateAcquired;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getPricePaid() {
		return pricePaid;
	}
	public void setPricePaid(double pricePaid) {
		this.pricePaid = pricePaid;
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
