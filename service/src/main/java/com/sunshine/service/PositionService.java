package com.sunshine.service;

import java.util.List;

import com.sunshine.model.Position;
	/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public interface PositionService {
	/**
	 * 根据id查询当前位置
	 * @param id
	 * @return
	 */
  Position getCurrentPositionByElder(String id);
  	/**
	 * 根据id查询历史轨迹
	 * @param id
	 * @return
	 */
  List<Position> getHistoryTrace(String id);
}
