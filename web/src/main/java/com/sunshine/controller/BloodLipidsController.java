package com.sunshine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sun.tools.example.debug.expr.ParseException;
import com.sunshine.model.BloodLipids;
import com.sunshine.model.UricAcaid;
import com.sunshine.service.BloodLipidsService;

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
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping("/getbloodLipids")
	public ModelAndView listUricAcaid(Date sdate, Date edate, HttpServletRequest req) {
		List<BloodLipids> bloodLipids=(List<BloodLipids>) bloodLipidsService.getBloodLipids(sdate, edate);		
		Map<String,Object> dat = new HashMap<String,Object>(); 
		dat.put("BloodLipids",bloodLipids);
		return new ModelAndView("bloodLipids",dat);
	}
}
