package com.sunshine.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.model.StaffInfo;
import com.sunshine.service.StaffInfoService;

@Service
@RequestMapping("/staff")
public class StaffInfoController {
 
@Autowired
private StaffInfoService sis;
	@RequestMapping("/get")
	public ModelAndView  getallStaffInfo(){
		List<StaffInfo> page =sis.getListStaff(); 
		return new ModelAndView("/WEB-INF/views/ftl/StaffInfoManage/StaffInfoManager","StaffInfoPage",page);
	}
	/**
	 * 获取所有的分页座席人员信息
	 * @param pageSize
	 * @param pageNum
	 * @param username
	 * @param communityName
	 * @param status
	 * @return
	 */
	@RequestMapping("/getlike")
	public ModelAndView  getLikeStaffInfo(Integer pageSize,Integer pageNum,String username, String gender,String status,String communityid){
      Map<String,Object> map=new HashMap<String,Object>();
      map.put("username",username);
      map.put("gender",gender);
      map.put("status",status);
      map.put("communityid",communityid);
      PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 3:pageSize, true);
       List<Map<String,Object>>list=sis.getLikeStaffInfo(map);
        PageInfo<Map<String, Object>> pg=new PageInfo<Map<String, Object>>();
        pg.setList(list); 
        if(pageSize==null){
        pageSize=3;
        pg.setPages(list.size()%pageSize==0 ? list.size()/pageSize:list.size()/pageSize+1);
        }
        map.put("pageResult", pg);
        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);
		return new ModelAndView("/WEB-INF/views/ftl/staffInfoManage/StaffInfoManager", map);
	}
/**
 * 删除指定的座席信息
 * @param id
 */
	@RequestMapping("/del")
	public ModelAndView delStaffInfo(String id){
	      sis.delStaff(id); 
	return new ModelAndView("/WEB-INF/views/ftl/staffInfoManage/StaffInfoManager");  
	}
	
 /**
  * 预修改 首先根据id 查询座席人员的相关信息
  * @param id
  * @return
  */
	@RequestMapping("/preupdate")
	public ModelAndView preUpdate(String id){ 
		List<Map<String,Object>> list=sis.getStaff(id);	 
		return new ModelAndView("/WEB-INF/views/ftl/staffInfoManage/Staff_edit","theone",list);
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/edit")
	public void update(String id,String status,String execTime,String content) {		
	                              
	}
	
	/**
	 *预添加座席信息
	 */
	@RequestMapping("/preadd")
	public ModelAndView preadd(){ 
		return new ModelAndView("/WEB-INF/views/ftl/staffInfoManage/Staff_add");
	}
	
	/**
	 *添加座席信息
	 */
	@RequestMapping("/add")
	 public void add(StaffInfo stf){
			
	}
	
	
	
}
