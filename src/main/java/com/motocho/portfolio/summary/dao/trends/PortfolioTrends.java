package com.motocho.portfolio.summary.dao.trends;

public class PortfolioTrends {
	private DayTrends day;
	private WeekTrends week;
	private MonthTrends month;
	private YtdTrends ytd;
	private AllTrends all;

	public DayTrends getDay() {
		return day;
	}
	public void setDay(DayTrends day) {
		this.day = day;
	}
	public WeekTrends getWeek() {
		return week;
	}
	public void setWeek(WeekTrends week) {
		this.week = week;
	}
	public MonthTrends getMonth() {
		return month;
	}
	public void setMonth(MonthTrends month) {
		this.month = month;
	}
	public YtdTrends getYtd() {
		return ytd;
	}
	public void setYtd(YtdTrends ytd) {
		this.ytd = ytd;
	}
	public AllTrends getAll() {
		return all;
	}
	public void setAll(AllTrends all) {
		this.all = all;
	}

}
