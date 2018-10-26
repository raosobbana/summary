package com.motocho.portfolio.summary.dao.position;

import java.util.ArrayList;
import java.util.List;

public class PortfolioPostion {
	private List<CoinPosition> positions = new ArrayList<CoinPosition>();//poss
	private String isType;//isTyp

	public List<CoinPosition> getPositions() {
		return positions;
	}
	public void setPositions(List<CoinPosition> positions) {
		this.positions = positions;
	}
	public String getIsType() {
		return isType;
	}
	public void setIsType(String isType) {
		this.isType = isType;
	}

}
