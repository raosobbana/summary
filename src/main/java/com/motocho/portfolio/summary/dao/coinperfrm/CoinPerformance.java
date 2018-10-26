package com.motocho.portfolio.summary.dao.coinperfrm;

public class CoinPerformance {
	private String coinName;//coiNme
	private String coinCode;//coiCde
	private String date;//date
	private double quantity;//qty
	private double cost;//cost
	private double lastPrice;//lstPrc
	private double _24hourPrice;//_24hrPrc
	private byte _24hourPriceChange;
	private double totalValue;//ttlVal
	private double _24hourValue;//_24hrVal
	private byte _24hourValueChange; //1 increase 2 decrease 3 nochange
	private double YTDValue;//ytdVal
	private byte YTDValueChange;
	private double totalGains;//ttlGai
	private String isType;

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
	public byte get_24hourPriceChange() {
		return _24hourPriceChange;
	}
	public void set_24hourPriceChange(byte _24hourPriceChange) {
		this._24hourPriceChange = _24hourPriceChange;
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
	public byte get_24hourValueChange() {
		return _24hourValueChange;
	}
	public void set_24hourValueChange(byte _24hourValueChange) {
		this._24hourValueChange = _24hourValueChange;
	}
	public double getYTDValue() {
		return YTDValue;
	}
	public void setYTDValue(double yTDValue) {
		YTDValue = yTDValue;
	}
	public byte getYTDValueChange() {
		return YTDValueChange;
	}
	public void setYTDValueChange(byte yTDValueChange) {
		YTDValueChange = yTDValueChange;
	}
	public double getTotalGains() {
		return totalGains;
	}
	public void setTotalGains(double totalGains) {
		this.totalGains = totalGains;
	}
	public String getIsType() {
		return isType;
	}
	public void setIsType(String isType) {
		this.isType = isType;
	}

}