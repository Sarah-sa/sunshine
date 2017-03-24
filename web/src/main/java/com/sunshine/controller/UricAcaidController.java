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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sunshine.model.UricAcaid;
import com.sunshine.service.UricAcaidService;

import freemarker.core.ParseException;

/**
 * 
 * @author 云和数据-孙爱平
 *
 */
	@RestController
	@RequestMapping("/health")
public class UricAcaidController {
		
	@Autowired
	private UricAcaidService uricAcaidService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	
	@RequestMapping(value="/getUricAcaid",method=RequestMethod.GET)
	public ModelAndView listUricAcaid(Date sdate, Date edate, HttpServletRequest req){
			
		List<UricAcaid> uricAcaid=uricAcaidService.getUricAcaid(sdate, edate);
		Map<String,Object> data = new HashMap<String,Object>(); 
		data.put("UricAcaid",uricAcaid);
	     
			
			return new ModelAndView("uricacaid",data); 
			
		
	
	}
}
