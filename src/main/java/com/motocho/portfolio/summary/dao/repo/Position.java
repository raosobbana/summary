package com.motocho.portfolio.summary.dao.repo;

/*import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

/**
 * Position Table Mapping
 * @author rao.sobbana@motocho.io
 * positionId, accountId, quantity, coinId,
 * averagePricePaid, dateCreated, dateModified
 */

//@Entity
//@Table(name="position")
public class Position {
	//@Id
	private long positionId;//posId
	private long accountId;//acctId
	private double quantity;//qty
	private long coinId;//coiId
	private double averagePricePaid;//avgPrcPad
	private String dateCreated;//dtCrt
	private String dateModified;//dtMod;

	public Position() {
		super();
	}

	public Position(long positionId, long accountId,
		double quantity, long coinId, double averagePricePaid,
		String dateCreated, String dateModified) {

		super();
		this.positionId = positionId;
		this.accountId = accountId;
		this.quantity = quantity;
		this.coinId = coinId;
		this.averagePricePaid = averagePricePaid;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;		
	}

	public long getPositionId() {
		return positionId;
	}
	public void setPositionId(long positionId) {
		this.positionId = positionId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public long getCoinId() {
		return coinId;
	}
	public void setCoinId(long coinId) {
		this.coinId = coinId;
	}
	public double getAveragePricePaid() {
		return averagePricePaid;
	}
	public void setAveragePricePaid(double averagePricePaid) {
		this.averagePricePaid = averagePricePaid;
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
