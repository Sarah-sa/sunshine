package com.sunshine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Advice;
import com.sunshine.model.Page;
import com.sunshine.service.AdviceService;

/**
 * 通告控制器
 */
@RestController
public class AdviceController {
	@Autowired
	private AdviceService adviceService;
	/**
	 * 添加公告
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveAdvice(Advice advice){
		int i=adviceService.saveAdvice(advice);
		if(i>0){
			System.out.println("数据执行结果影响行数为："+i);			
		}
		return "index";	
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Advice> ListAllAdvice(){
		List<Advice> advice=adviceService.ListAllAdvice();	
		for(Advice a:advice){
			System.out.println(a.getId()+a.getTitle());
			}
		return advice;

	}
}
