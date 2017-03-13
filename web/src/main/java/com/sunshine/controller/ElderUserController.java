package com.sunshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.ElderUser;
import com.sunshine.service.ElderUserService;

/**
 * 老人用户  控制层
 * @author 云和数据-陈剑洲
 *
 */
@RestController
public class ElderUserController {
	
    /**
     * 注入老人用户业务服务
     */
    @Autowired    
	private ElderUserService elderUserService;
	
    
    /**
     * 老人用户信息根据id查询操作
     * @param id
     * @return
     */
    @RequestMapping("/geteu")
    public ElderUser getElderUser(String id){
    	ElderUser eu=elderUserService.getElderUser(id);
    	    return eu;
    }
    /**
     * 老人用户信息添加操作
     * @param elderuser 老人用户对象
     * @return
     */
    @RequestMapping("/saveeu")
    public String saveElderUser(ElderUser elderuser){
    	int i=elderUserService.saveElderUser(elderuser);
    	System.out.println("数据执行影响条数："+i);
    	return "";
    }
    
    /**
     * 老人用户信息修改操作
     * @param elderuser 老人用户对象
     * @return
     */
    @RequestMapping("/updateeu")
    public String updateElderUser(ElderUser elderuser){
    	int i=elderUserService.updateElderUser(elderuser);
		return "";
    }	
    
	/**
	 * 老人用户信息删除操作
	 * @param id 
	 * @return
	 */
 /*   @RequestMapping("/removeeu")
	public String removeElderUser(String id){
		   int i=elderUserService.removeElderUser(id);
		   return "";
	   } */

    /**
     * 根据用户查询与之有关的所有老人
     * @param uid 指定用户的id
     * @return
     */
    public List<Map<String, Object>> listAllRelatedElder(String uid){
    	List<Map<String, Object>> list=elderUserService.listAllRelatedElder(uid);
    	return list;
    }
} 
