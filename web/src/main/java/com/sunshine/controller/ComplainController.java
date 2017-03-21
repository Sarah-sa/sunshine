package com.sunshine.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.model.Complain;
import com.sunshine.service.ComplainService;
import com.sunshine.util.UUIDUtil;

/**
* 投诉管理控制层
*@author 王一贺
* 2017年3月17日  
*/
@RestController
@RequestMapping("/complain")
public class ComplainController {

	/**
	 * 日志记录文件
	 */
	private Logger log = LogManager.getLogger(ComplainController.class);
	
	/**
	 * 自动注入投诉的业务接口
	 */
	@Autowired
	private ComplainService cpsv;
	
	/**
	 *描述：投诉信息的展示
	 *@author 王一贺 2017-03-18
	 *@return 投诉相关信息的集合
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/query")
	public ModelAndView query(Integer pageSize,Integer pageNum,String userName,String shopName,String staffId, String status,String startTime,String endTime){
		Map map = new HashMap();
		map.put("username", userName);
		map.put("shopname", shopName);
		map.put("staffId", staffId);
		map.put("status", status);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		//分页
		PageHelper.startPage(pageNum == null ? 1:pageNum, pageSize == null ? 3:pageSize, true);
		Page<List<Map<String,Object>>> page = (Page)cpsv.listComplainRelations(map);
		PageInfo pgif = page.toPageInfo();
		map.put("compPage", pgif);
		map.put("pageSize", pageSize);
		map.put("pageNum", pageNum);
		return new ModelAndView("/WEB-INF/views/ftl/complain/complainmanager",map);
	}
	
	//增加投诉，在用户评价服务阶段才可能产生
	@RequestMapping("/toadd")
	public ModelAndView toAdd(String orderId){
		Map map = new HashMap();
		map.put("orderId", orderId);
		List list = cpsv.listComplainRelations(map);
		if(list.size()== 0)
			return new ModelAndView("/WEB-INF/views/ftl/complain/complain_add",map);
		else
			return new ModelAndView("/WEB-INF/views/ftl/complain/complain_add_tip");
	}
	
	@RequestMapping("/add")
	public int add(String orderId,String content){
		Complain comp = new Complain();
		comp.setId(UUIDUtil.genericUUID());
		comp.setContent(content);
		comp.setCreateTime(new Date());
		comp.setStatus(false);
		comp.setOrderId(orderId);
		int num = cpsv.saveComplain(comp);
		return num;
	}
	
	//根据opr的值判断返回显示页面、编辑页面
	@RequestMapping("/getone")
	public ModelAndView getOne(String id,String opr){
		Map map = new HashMap();
		map.put("id", id);
		List listOne = cpsv.listComplainRelations(map);
		
		if("show".equals(opr))
			return new ModelAndView("/WEB-INF/views/ftl/complain/complain_show","theOne",listOne);
		if("edit".equals(opr))
			return new ModelAndView("/WEB-INF/views/ftl/complain/complain_edit","theOne",listOne);		
		else
			return null;
		
	}
	
	//更新投诉处理情况
	@RequestMapping("/update")
	public int update(String id,Integer status,String staffId,String visitTime,String visitResult) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Complain comp = cpsv.getComplain(id);
		comp.setStaffId(staffId);
		comp.setStatus(status== 0 ? false : true);
		comp.setVisitTime(sdf.parse(visitTime));
		comp.setVisitResult(visitResult);
		int num = cpsv.updateComplain(comp);
		return num;
	}
	//删除对应的投诉
	@RequestMapping("/delete")
	public void delete(String id){
		cpsv.removeComplain(id);
	}
	
}
