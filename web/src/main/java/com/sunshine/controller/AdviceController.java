package com.sunshine.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Advice;

import com.sunshine.service.AdviceService;

/**
 * 公告模板控制层
 * @author 云和数据-任继鹏
 *
 */
@RestController
@RequestMapping("/advice")
public class AdviceController {
	@Autowired
	private AdviceService adviceService;
	/**
	 * 添加公告
	 * @return
	 */
	@RequestMapping("/save")
	public String saveAdvice(Advice advice){
		int i=adviceService.saveAdvice(advice);
		if(i>0){
			System.out.println("数据执行结果影响行数为："+i);			
		}
		return "success";	
	}
	/**
	 * 公告模糊查询操作
	 * @param id 公告对象id
	 * @return 
	 */
	@RequestMapping("/list")
	
	public List<Advice> ListAllAdvice(){
		List<Advice> advice=adviceService.ListAllAdvice();	
		return advice;
	}
	/**
	 * 公告修改操作
	 * @param 
	 * @return 
	 */
	@RequestMapping("/update")
	
	public String updateAdvice(Advice advice){
		 adviceService.updateAdvice(advice);
		return "success";	
	}
	/**
	 * 公告根据id删除操作
	 * @param id 公告对象id
	 * @return 
	 */
	@RequestMapping("/remove")
	
	public String updateAdvice(String id){
		int i=adviceService.removeAdvice(id);		
		return "success";	
	}
	/**
	 * 公告根据id查询操作
	 * @param id 公告对象id
	 * @return 
	 */
	@RequestMapping("/geta")
	
	public Advice getAdvice(String id){
		Advice ad=adviceService.getAdvice(id);
		return ad;
	}
}
