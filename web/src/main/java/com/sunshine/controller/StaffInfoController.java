package com.sunshine.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sunshine.model.StaffInfo;
import com.sunshine.service.StaffInfoService;

@Service
@RequestMapping("/staff")
public class StaffInfoController {
@Autowired
private StaffInfoService sis;
	@RequestMapping("/get")
	public ModelAndView  getallStaffInfo(){
		PageHelper.startPage(1, 3, true);
		List<StaffInfo> page =sis.getListStaff(); 
		return new ModelAndView("/WEB-INF/views/ftl/StaffInfoManage/StaffInfoManager","StaffInfoPage",page);
	}
	
	
	
	
	
}
