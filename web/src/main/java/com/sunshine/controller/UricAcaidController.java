package com.sunshine.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.tools.javac.util.List;
import com.sunshine.model.UricAcaid;
import com.sunshine.service.UricAcaidService;

/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public class UricAcaidController {
	
	private UricAcaidService uricAcaidService;
	@RequestMapping("/getUricAcaid")
	String findUricAcaid(Date sdate,Date edate){
		List<UricAcaid> uricAcaid=(List<UricAcaid>) uricAcaidService.getUricAcaid(sdate, edate);
		return "a";
		
	}
}
