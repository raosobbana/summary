package com.motocho.portfolio.summary.dao.repo;

/*import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

/**
 * Account_Activity Table Mapping
 * @author rao.sobbana@motocho.io
 * accountActivityId, accountId, activityDate, positionLotId,
 * quantity, transactionDate, transactionPrice,transactionType,
 * closingDate, closingPrice, closingTotal, timeStamp
 */

//@Entity
//@Table(name="account_activity")
public class AccountActivity {
	//@Id
	private long accountActivityId;
	private long accountId;
	private String activityDate;
	private long positionLotId;
	private double quantity;
	private String transactionDate;
	private double transactionPrice;
	private byte transactionType;
	private String closingDate;
	private double closingPrice;
	private double closingTotal;
	private String timeStamp;

	public AccountActivity() {
		super();
	}

	public AccountActivity(long accountActivityId,
		long accountId, String activityDate,
		long positionLotId, double quantity,
		String transactionDate, double transactionPrice,
		byte transactionType, String closingDate,
		double closingPrice, double closingTotal,
		String timeStamp) {

		super();
		this.accountActivityId = accountActivityId;
		this.accountId = accountId;
		this.activityDate = activityDate;
		this.positionLotId = positionLotId;
		this.quantity = quantity;
		this.transactionDate = transactionDate;
		this.transactionPrice = transactionPrice;
		this.transactionType = transactionType;
		this.closingDate = closingDate;
		this.closingPrice = closingPrice;
		this.closingTotal = closingTotal;
		this.timeStamp = timeStamp;
	}

	public long getAccountActivityId() {
		return accountActivityId;
	}
	public void setAccountActivityId(long accountActivityId) {
		this.accountActivityId = accountActivityId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}
	public long getPositionLotId() {
		return positionLotId;
	}
	public void setPositionLotId(long positionLotId) {
		this.positionLotId = positionLotId;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(double transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
	public byte getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(byte transactionType) {
		this.transactionType = transactionType;
	}
	public String getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(String closingDate) {
		this.closingDate = closingDate;
	}
	public double getClosingPrice() {
		return closingPrice;
	}
	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
	}
	public double getClosingTotal() {
		return closingTotal;
	}
	public void setClosingTotal(double closingTotal) {
		this.closingTotal = closingTotal;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
}
