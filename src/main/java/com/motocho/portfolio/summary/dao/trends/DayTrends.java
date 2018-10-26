package com.motocho.portfolio.summary.dao.trends;

import java.util.ArrayList;
import java.util.List;

public class DayTrends {
	private List<FifteenMinutes>  fifteenMinutes = new ArrayList<>();//fifMin

	public List<FifteenMinutes> getFifteenMinutes() {
		return fifteenMinutes;
	}
	public void setFifteenMinutes(List<FifteenMinutes> fifteenMinutes) {
		this.fifteenMinutes = fifteenMinutes;
	}

}
