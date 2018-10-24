package com.motocho.portfolio.summary.dao;

public class Summary {

	private double totalInvestment;
	private double totalCash;
	private double totalPortfolioValue;
	private UnrealizedSummary unrealizedSummary;

	public double getTotalInvestment() {
		return totalInvestment;
	}
	public void setTotalInvestment(double totalInvestment) {
		this.totalInvestment = totalInvestment;
	}
	public double getTotalCash() {
		return totalCash;
	}
	public void setTotalCash(double totalCash) {
		this.totalCash = totalCash;
	}
	public double getTotalPortfolioValue() {
		return totalPortfolioValue;
	}
	public void setTotalPortfolioValue(double totalPortfolioValue) {
		this.totalPortfolioValue = totalPortfolioValue;
	}
	public UnrealizedSummary getUnrealizedSummary() {
		return unrealizedSummary;
	}
	public void setUnrealizedSummary(UnrealizedSummary unrealizedSummary) {
		this.unrealizedSummary = unrealizedSummary;
	}

}
