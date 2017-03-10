package com.sunshine.controller;

import java.util.Date;
import java.util.List;

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
	String findWeight(Date sdate,Date edate){ 
		List<Weight> weight=weightService.getWeight(sdate, edate);
		
		return "a";
	}
	
}
