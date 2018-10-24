package com.motocho.portfolio.summary.dao.coinperfrm;

public class CoinPerformance {
	private String coinCode;
	private String date;
	private double quantity;
	private double cost;
	private double lastPrice;
	private double _24hourPrice;
	private double totalValue;
	private double _24hourValue;
	private double YTDvalue;
	private double totalGains;

	public String getCoinCode() {
		return coinCode;
	}
	public void setCoinCode(String coinCode) {
		this.coinCode = coinCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public double get_24hourPrice() {
		return _24hourPrice;
	}
	public void set_24hourPrice(double _24hourPrice) {
		this._24hourPrice = _24hourPrice;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public double get_24hourValue() {
		return _24hourValue;
	}
	public void set_24hourValue(double _24hourValue) {
		this._24hourValue = _24hourValue;
	}
	public double getYTDvalue() {
		return YTDvalue;
	}
	public void setYTDvalue(double yTDvalue) {
		YTDvalue = yTDvalue;
	}
	public double getTotalGains() {
		return totalGains;
	}
	public void setTotalGains(double totalGains) {
		this.totalGains = totalGains;
	}

}