package com.sunshine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunshine.model.Volunteer;
import com.sunshine.service.VolunteerService;

/**
 * 自愿者控制层
 * @author 云和数据-齐铁成
 * 2017年3月16日
 */
@Controller
@RequestMapping("/Volunteer")
public class VolunteerController {

@Autowired
private VolunteerService vs;
/**
 * 模糊查询自愿者列表
 * @param olunteer
 * @return
 */
@RequestMapping
public String getAllVolunteers(Map<String, Object> volunteer){
	  List list=vs.listAllVolunteer(volunteer);
	  
	return null;
	
}
	
}
