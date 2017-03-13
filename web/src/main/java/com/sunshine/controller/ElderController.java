package com.sunshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Elder;
import com.sunshine.model.ElderUser;
import com.sunshine.service.ElderService;
import com.sunshine.service.ElderUserService;

/**
 * 老人  控制层
 * @author 云和数据-陈剑洲
 *
 */
@RestController
public class ElderController {
	
    /**
     * 注入老人业务服务
     */
    @Autowired    
	private ElderService elderService;
	
    
    /**
     * 老人信息根据id查询操作
     * @param id
     * @return
     * @throws Exception 
     */
    @RequestMapping("/geted")
    public Elder getElder(String id) throws Exception{
    	Elder ed=elderService.getElder(id);
    	    return ed;
    }
    /**
     * 老人信息添加操作
     * @param elderuser 老人对象
     * @return
     * @throws Exception 
     */
    @RequestMapping("/saveed")
    public String saveElderUser(Elder elder) throws Exception{
    	int i=elderService.saveElder(elder);
    	System.out.println("数据执行影响条数："+i);
    	return "";
    }
    
    /**
     * 老人信息修改操作
     * @param elderuser 老人对象
     * @return
     * @throws Exception 
     */
    @RequestMapping("/updateed")
    public String updateElder(Elder elder) throws Exception{
    	int i=elderService.updateElder(elder);
		return "";
    }	
    
	/**
	 * 老人信息删除操作
	 * @param id 
	 * @return
	 * @throws Exception 
	 */
    @RequestMapping("/removeeu")
	public String removeElder(String id) throws Exception{
		   int i=elderService.removeElder(id);
		   return "";
	   } 

    /**
     * 根据查询所有老人
     * @param id 
     * @return
     * @throws Exception 
     */
    public List<Elder> listAllElders(String id) throws Exception{
    	List<Elder> list=elderService.listAllElders();
    	return list;
    }
} 
