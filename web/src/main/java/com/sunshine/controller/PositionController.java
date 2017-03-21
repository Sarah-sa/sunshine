package com.sunshine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Position;
import com.sunshine.service.PositionService;

	/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
@RestController
@RequestMapping("/health")
public class PositionController {
	@Autowired
	private PositionService positionService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping("/getposition")
	@ResponseBody
	Position findPosition(String id){
		Position position=positionService.getCurrentPositionByElder(id);
//		List<Position> position1=positionService.getHistoryTrace(id);
		return position;
		
	}







}
