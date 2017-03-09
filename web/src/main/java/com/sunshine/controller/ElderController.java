package com.sunshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunshine.model.Elder;
import com.sunshine.service.ElderService;

public class ElderController {
             @Autowired
	         private ElderService elderService;
             
             @RequestMapping("/elder")
              String getElder(){
            	 return "index";
             }
             
             @RequestMapping(value="",method=RequestMethod.GET)
              int saveElder(Elder elder){
				return 0;
            	 
             }
}
