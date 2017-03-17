package com.sunshine.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.model.Elder;
import com.sunshine.model.VisitRecord;
import com.sunshine.service.ElderService;
import com.sunshine.service.VisitRecordService;
import com.sunshine.util.UUIDUtil;

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
	 * 注入老人信息的业务接口
	 */
	@Autowired
	private ElderService els;
	
	@RequestMapping("/tovisit")
	public ModelAndView toVisitRecord(){		
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitcaremanager");
	}
	
	/**
	 *描述：
	 *@author 王一贺 2017-03-10
	 *@return 获得所有的走访记录
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/query")
	public ModelAndView getList(Integer pageSize,Integer pageNum,String elderName,Integer status,String startTime,String endTime){
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", elderName);
		map.put("status", status);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 3:pageSize, true);
		Page<List<Map<String,Object>>> page = (Page) vrs.listVisitElderStaff(map);
		PageInfo pg = page.toPageInfo();
		map.put("vstcarePage", pg);
		map.put("pageSize", pageSize);
		map.put("pageNum", pageNum);
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitcaremanager",map);		
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
	
	/**
	 *描述：获得数据库中所有的老人信息
	 *@author 王一贺 2017-03-13
	 *@return 
	 *@throws Exception
	 */
	@RequestMapping("/forname")
	public List<Elder> getName() throws Exception{
		List<Elder> elderList = els.listAllElders();		
		return elderList;
	}
	
	/**
	 *描述：转发到添加页面
	 *@author 王一贺 2017-03-15
	 *@return
	 */
	@RequestMapping("/preadd")
	public ModelAndView preAdd(){
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitrecord_add");
	}
	
	/**
	 *描述：新增走访计划
	 *@author 王一贺 2017-03-15
	 * @throws ParseException
	 * @return 数据库的受影响行数 
	 */
	@RequestMapping("/add")
	public int add(String elderId,String planTime) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		VisitRecord newVr = new VisitRecord();
		newVr.setCreateTime(new Date());
		newVr.setElderId(elderId);
		newVr.setId(UUIDUtil.genericUUID());
		if(planTime != null && planTime != "")
		newVr.setPlanTime(sdf.parse(planTime));
		newVr.setStaffId("79842030-8f35-48eb-84f1-41c2de0b7e4c");//应该为获取到的登陆的坐席人员id
		newVr.setStatus(false);
		int num = vrs.saveVisitRecord(newVr);
		return num;
		
	}
	
	
	/**
	 *描述：服务器端跳转到编辑/更新 走访记录页面
	 *@author 王一贺 2017-03-16
	 *@param id 准备更新的走访记录编号
	 *@return
	 */
	@RequestMapping("/preupdate")
	public ModelAndView preUpdate(String id){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		List<Map<String,Object>> list = vrs.listVisitElderStaff(map);
		return new ModelAndView("/WEB-INF/views/ftl/visitcare/visitrecord_edit","editOne",list);
	}
	
	/**
	 *描述：更新走访记录
	 *@author 王一贺 2017-03-15
	 *@return 数据库中受影响的行数
	 * @throws ParseException 
	 */
	@RequestMapping("/editpage")
	public int update(String id,String status,String execTime,String content) throws ParseException{		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		VisitRecord vr = vrs.getVisitRecord(id);
		vr.setStatus(status.equals("true")?true:false);
		vr.setExecTime(sdf.parse(execTime));
		vr.setContent(content);		
		int num = vrs.updateVisitRecord(vr);
		return num;
	}
	
	/**
	 *描述：删除走访记录
	 *@author 王一贺 2017-03-16
	 *@param id
	 */
	@RequestMapping("/delete")
	public void delete(String id){
		vrs.removeVisitRecord(id);
	}
	
	
}

