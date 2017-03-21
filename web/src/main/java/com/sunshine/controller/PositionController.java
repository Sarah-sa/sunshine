package com.sunshine.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import com.sunshine.model.Position;
import com.sunshine.service.PositionService;

	/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public class PositionController {
	private PositionService positionService;
	@RequestMapping("/getposition")
	String findPosition(String id){
		Position position=positionService.getCurrentPositionByElder(id);
		List<Position> position1=positionService.getHistoryTrace(id);
		return "a";
		
	}







}
