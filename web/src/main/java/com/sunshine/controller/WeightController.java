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
import com.sunshine.model.Weight;
import com.sunshine.service.WeightService;

	/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
  	@RestController
  	@RequestMapping("/health")
public class WeightController {
  	@Autowired
	private WeightService weightService;
  	
  	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
  	
	@RequestMapping("/getweight")
	public ModelAndView listWeight(Date sdate, Date edate, HttpServletRequest req){
		List<Weight> weight=weightService.getWeight(sdate, edate);
		Map<String,Object> dat = new HashMap<String,Object>(); 
		dat.put("Weight",weight);
		return new ModelAndView("weight",dat);
		
	}
	
}
