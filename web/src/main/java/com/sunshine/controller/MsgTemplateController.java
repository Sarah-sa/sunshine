package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.MsgTemplate;
import com.sunshine.service.MsgTemplateService;

/**
 * 短信模板控制层
 * @author 云和数据-李牧
 *
 */
@RestController
public class MsgTemplateController {
	
	@Autowired
	private MsgTemplateService msgTemplateService;
	/**
	 * 短信模板添加操作
	 * @param msgTemplate 短信模板对象
	 * @return 
	 */
	@RequestMapping("/save")
	public String saveMsgTemplate(MsgTemplate msgTemplate){
		int i = msgTemplateService.saveMsgTemplate(msgTemplate);
		System.out.println("数据执行影响行数"+i);
		
		return "index";
		
	}
	/**
	 * 短信模板修改操作
	 * @param msgTemplate 短信模板对象
	 * @return 
	 */
	@RequestMapping("/update")
	public String updateMsgTemplate(MsgTemplate msgTemplate){
		
		int i = msgTemplateService.updateMsgTemplate(msgTemplate);
		return "index";
	}
	/**
	 * 短信模板删除操作
	 * @param id 短信模板对象id
	 * @return 
	 */
	@RequestMapping("/remove")
	public String removeMsgTemplate(String id){
		int i = msgTemplateService.removeMsgTemplate(id);
		
		return "index";
	}
	/**
	 * 短信模板根据id查询操作
	 * @param id 短信模板对象id
	 * @return 
	 */
	@RequestMapping("/get")
	public MsgTemplate getMsgTemplate(String id){
		MsgTemplate msgTemplate = msgTemplateService.getMsgTemplate(id) ;
		return msgTemplate;
	}
	/**
	 * 短信模板查询所有操作
	 * @param 
	 * @return 
	 */
	@RequestMapping("/list")
	public List<MsgTemplate> ListAllMsgTemplate(){
		List<MsgTemplate> list = msgTemplateService.listAllMsgTemplate();
		return list;
	}

}
