package com.sunshine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
	
	/**
	 *描述：
	 *@author 王一贺 2017-03-10
	 *@return 获得所有的走访记录
	 */
	@RequestMapping("/query")
	public ModelAndView getList(){
		Map<String,Object> map = new HashMap<String,Object>();
		PageHelper.startPage(1, 3, true);				
		Page<List<Map<String,Object>>> page = (Page) vrs.listVisitElderStaff(map);
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitcaremanager","vstcarePage",page);		
	}
	
	/**
	 *描述：根据id获得对应的走访记录详情
	 *@author 王一贺 2017-03-10
	 *@param id
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/getone")
	public ModelAndView getOne(String id){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		List<Map<String,Object>> list = vrs.listVisitElderStaff(map);
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitrecord_show","theOne",list);
	}
	
	
}

