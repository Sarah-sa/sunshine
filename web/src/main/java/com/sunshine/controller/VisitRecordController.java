package com.sunshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sunshine.model.VisitRecord;
import com.sunshine.service.VisitRecordService;

/**
* 走访记录 控制层
*@author 王一贺
* 2017年3月9日  
*/
@RestController
@RequestMapping("/visitrecord")
public class VisitRecordController {
	
	/**
	 * 注入走访记录业务接口
	 */
	@Autowired
	private VisitRecordService vrs;
	
	@RequestMapping("/query")
	public ModelAndView getList(){
		PageHelper.startPage(1, 3, true);
		Page<VisitRecord> page = (Page<VisitRecord>) vrs.listVisitRecord();
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitcaremanager","vstcarePage",page);
		
	}
}

