package com.sunshine.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.model.Community;
import com.sunshine.model.StaffInfo;
import com.sunshine.model.User;
import com.sunshine.service.CommunityService;
import com.sunshine.service.StaffInfoService;
import com.sunshine.service.UserService;

@Controller
@RequestMapping("/staff")
public class StaffInfoController {
 private static Logger log = LogManager.getLogger(StaffInfoController.class); 
	
@Autowired
private StaffInfoService sis;
@Autowired
private CommunityService cs;
@Autowired
private UserService us;
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
 * 获取所有的社区的名字
 */
 
@RequestMapping("/forcommunityname")
public List<Community> getName(){
	List<Community> communityList =cs.getall();
	return  communityList;
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
	 * 使用事务对用户表字段
	 * 和座席人员信息进行修改
	 * @throws ParseException 
	 */
	//@Resource
	//private PlatformTransactionManager transactionManager;
	@ResponseBody
	@RequestMapping("/edit")
	public int update(String email, String phone, String birthday,String id,Integer status,Integer gender,String address, String nickname,String photo) throws ParseException{
	//	DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
	//    defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
	//	TransactionStatus sta =transactionManager.getTransaction(defaultTransactionDefinition);  
	//    try {
	    	
	       User u=new User();
	        u.setId(id);
	        u.setEmail(email);
	        u.setPhone(phone);
	        StaffInfo si=new  StaffInfo();
	        si.setAddress(address);
	      //将字符串类型的日期更改为Date类型
	        SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");
	        Date date=sdf.parse(birthday);
	        si.setUid(id);
	        si.setBirthday(date);
	        si.setGender(gender==0?false:true);
	        si.setNickname(nickname);
	        si.setStatus(status==0?false:true);
	        si.setPhoto(photo);
	        si.setUid(id);
	        log.info(us);
	        us.updateUser(u);
	        System.out.println("天天向上");
	       int num=sis.updateStaff(si);  
	       log.info(num);
	        return num;
	  //      transactionManager.commit(sta);
	 //   } catch (Exception e) {
	 //       transactionManager.rollback(sta);
	  //      e.printStackTrace();
	 //   }                
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
