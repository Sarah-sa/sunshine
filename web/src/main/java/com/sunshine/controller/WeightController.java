package com.sunshine.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sunshine.model.Weight;
import com.sunshine.service.WeightService;

/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public class WeightController {

	private WeightService weightService;
	@RequestMapping("/getweight")
	String findWeight(Date exam_time){
//		Weight weight=weightService.getWeight(exam_time);
		
		return "a";
	}
	
}
