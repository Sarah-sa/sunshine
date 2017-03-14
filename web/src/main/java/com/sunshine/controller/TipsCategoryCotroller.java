package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunshine.model.TipsCategory;
import com.sunshine.service.TipsCategoryService;

@Controller
@RequestMapping("TipsCategory")
public class TipsCategoryCotroller {
@Autowired
private TipsCategoryService tcs;
@RequestMapping("get")
private String getCategoryList(){
 List<TipsCategory> list=tcs.listAllTipsCategory();

	return "index";	
}
	
	
	
	
}
