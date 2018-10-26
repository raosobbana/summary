package com.motocho.portfolio.summary.dao.test;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="position")*/
public class SummaryPosition {
	/*@Id*/
	private long positionId;//posId
	private long accountId;//actId
	private double quantity;//qty
	private long coinId;//coiId
	private double avaragePricePaid;//avgPrcPd
	private String errorMessage;//err
	private long dateCreated;//dteCrt
	private long dateModified;//dteMod

	public SummaryPosition() {
		super();
	}

	public SummaryPosition(	long positionId, long accountId, double quantity,
					long coinId, double avaragePricePaid, long dateCreated,
					long dateModified) {
		super();
		this.positionId = positionId;
		this.accountId = accountId;
		this.quantity = quantity;
		this.coinId = coinId;
		this.avaragePricePaid = avaragePricePaid;
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

	public double getAvaragePricePaid() {
		return avaragePricePaid;
	}

	public void setAvaragePricePaid(double avaragePricePaid) {
		this.avaragePricePaid = avaragePricePaid;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
