package com.motocho.portfolio.summary.dao.trends;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTrends {
	private List<DataTrends> data = new ArrayList<DataTrends>();

	public List<DataTrends> getData() {
		return data;
	}
	public void setData(List<DataTrends> data) {
		this.data = data;
	}
}
