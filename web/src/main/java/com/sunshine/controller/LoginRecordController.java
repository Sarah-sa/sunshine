package com.sunshine.controller;
/**
 * 座席人员登录记录
 * @author QiTieCheng
 * 2017年3月13日
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunshine.service.LoginRecordService;

@Controller
@RequestMapping("/loginRecord")
public class LoginRecordController {
@Autowired
private LoginRecordService lrs;

@RequestMapping("get")
public String getLoginStaffRecord(){
	
   List Staff=lrs.getListLoginRecord();
	
	return ("index");
}


	
	
	
}
