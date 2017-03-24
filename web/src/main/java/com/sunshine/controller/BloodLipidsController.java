package com.sunshine.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

 
import com.sunshine.model.BloodLipids;
import com.sunshine.service.BloodLipidsService;

import freemarker.core.ParseException;

/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
 
	@RestController
	@RequestMapping("/health")
 
public class BloodLipidsController {
   @Autowired
	private BloodLipidsService bloodLipidsService;
	@RequestMapping("/getbloodLipids")
 
	public ModelAndView listUricAcaid(Date sdate, Date edate, HttpServletRequest req) {
		List<BloodLipids> bloodLipids=(List<BloodLipids>) bloodLipidsService.getBloodLipids(sdate, edate);		
		Map<String,Object> dat = new HashMap<String,Object>(); 
		dat.put("BloodLipids",bloodLipids);
		return new ModelAndView("bloodLipids",dat);
 
	}
}
 