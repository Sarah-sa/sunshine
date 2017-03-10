package com.sunshine.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.tools.javac.util.List;
import com.sunshine.model.BloodLipids;
import com.sunshine.service.BloodLipidsService;

/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public class BloodLipidsController {

	private BloodLipidsService bloodLipidsService;
	@RequestMapping("/getbloodLipids")
	String findBloodLipids(Date sdate,Date edate){
		List<BloodLipids> bloodLipids=(List<BloodLipids>) bloodLipidsService.getBloodLipids(sdate, edate);
		return "a";
	}
}
