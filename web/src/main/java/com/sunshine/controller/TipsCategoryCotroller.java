package com.sunshine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunshine.model.TipsCategory;
import com.sunshine.service.TipsCategoryService;

@Controller
@RequestMapping("/TipsCategory")
public class TipsCategoryCotroller {
@Autowired
private TipsCategoryService tcs;
@RequestMapping("/get")
/**
 * 返回一个将一个集合封装在一个map集合里
 * @return
 */
private String getCategoryList(Map rsMap){
 List list=tcs.listAllTipsCategory();
 rsMap.put("TipsCategoryList", list);
	return "/WEB-INF/views/ftl/queryInfo/healthyTips";	
	
}
	
	
	
	
}
