package com.motocho.portfolio.summary.service.position;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.motocho.portfolio.summary.dao.repo.PositionLotRepositoy;

public class PositionLotServiceImpl implements PositionLotService {

	@Autowired
	private PositionLotRepositoy positionLotRepositoy;

	@Override
	public List<Object> getPositonLotIds(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
