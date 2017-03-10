package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunshine.model.StaffInfo;
import com.sunshine.service.StaffInfoService;

/**
 * 座席信息管理控制层
 * @author 云和数据-齐铁成
 * 2017年3月9号
 */
@Controller
@RequestMapping("/staff")
public class StaffInfoController {
/**
 * 注入StaffInfoService接口
 */
@Autowired
private StaffInfoService sis;

@RequestMapping("/find")
public ModelAndView findList(){
    List<StaffInfo>stList=sis.getListStaff();
	return new ModelAndView("WEB-INF/views/ftl/staffManage/Staffmanager","staff",stList);
}
	
	
}
