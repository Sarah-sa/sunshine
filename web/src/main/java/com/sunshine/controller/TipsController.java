package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

 
import com.sunshine.service.TipsService;

/**
 * 知识控制层
 * @author 云和数据-齐铁成
 *2017年3月13号
 */
@Controller
@RequestMapping("tips")
public class TipsController {
@Autowired
private TipsService tp;

/**
 * 根据种类的id获取tips的集合
 * 
 * @param tips_ctgy_id
 * @return
 */
@RequestMapping("gettips")
public String getTips(String tips_ctgy_id){	
List list=tp.getTipsList(tips_ctgy_id);
return "index";	
}
	

/**
 * 根据标题的字符串模糊查询tips的集合
 * @param  titleName
 * @return
 */
@RequestMapping("getLiketips")
public String getLikeTips(String titleName){	
List list=tp.getTipsList(titleName);
return "index";
	
}
}
