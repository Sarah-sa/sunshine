package com.sunshine.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunshine.dao.PositionDao;
import com.sunshine.model.Position;
import com.sunshine.service.PositionService;
	@Service
public class PositionServiceImpl implements PositionService {
	@Autowired
	private PositionDao positionDao;
	/**
	 * 根据id查询老人当前位置
	 */
	@Override
	public Position getCurrentPositionByElder(String id) {
		
		return positionDao.getCurrentPositionByElder(id);
	}
	/**
	 * 根据id查询老人历史轨迹
	 */
	@Override
	public List<Position> getHistoryTrace(String id) {
		
		return positionDao.getHistoryTrace(id);
	}

}
