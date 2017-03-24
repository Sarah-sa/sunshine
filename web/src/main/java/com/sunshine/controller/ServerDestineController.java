package com.sunshine.controller;

import java.util.ArrayList;
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
import com.sunshine.dao.ServiceItemDao;
import com.sunshine.message.Result;
import com.sunshine.model.ServCategory;
import com.sunshine.model.ServerInfo;
import com.sunshine.model.ServiceItem;
import com.sunshine.model.User;
import com.sunshine.service.ServerService;
import com.sunshine.util.ServiceCategoryTree;

/**
* 
*@author 王一贺
* 2017年3月21日  
*/
@RestController
@RequestMapping("/serverdestine")
public class ServerDestineController {
	
	/**
	 * 日志记录文件
	 */
	private Logger log = LogManager.getLogger(ServerDestineController.class);
	
	/**
	 * 注入服务商提供服务的业务接口
	 */
	@Autowired
	private ServerService ssv;
	//TODO 应该改变为调用service层，暂时没有，先测验
	/**
	 * 注入服务条目的Dao接口
	 */
	@Autowired
	private ServiceItemDao sid;
	
	@RequestMapping("/query")
	public ModelAndView query(String parent,String childOne,Integer pageNum,Integer pageSize){
		Map map = new HashMap();
		map.put("pname", ssv.getCategory(parent));
		map.put("cname", ssv.getCategory(childOne));
		PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 1 : pageSize, true);
		Page page = (Page) ssv.listAvailableItemByCgy(childOne);
		PageInfo pgif = page.toPageInfo();
		map.put("serverPage", pgif);
		return new ModelAndView("/WEB-INF/views/ftl/serverdestine/serverquery",map);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/cglist")
	public List servicelist(String pid){
		List<ServiceCategoryTree> list = ssv.listServCategoryTree();
		List parent = new ArrayList();
		List child = new ArrayList();
		for(ServiceCategoryTree sct : list){			
			parent.add(sct.getTreeNode());
			for(ServCategory sc :sct.getChildNode()){
				if(sc.getPid().equals(pid)){
					child.add(sc);
				}				
			}
		}
		if(pid == null)
			return parent;
		else
			return child;		
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/show")
	public ModelAndView show(String id){
		Map map = new HashMap();
		ServiceItem si = ssv.getItem(id);
		ServCategory sc = ssv.getCategory(si.getSrvctgyid());
		ServCategory sc2 = ssv.getCategory(sc.getPid());
		ServerInfo sinfo = ssv.getServerInfo(si.getServerid());
		map.put("item", si);
		map.put("ctgCd", sc);
		map.put("ctgPt", sc2);
		map.put("info", sinfo);
		return new ModelAndView("/WEB-INF/views/ftl/serverdestine/server_show",map);
	}
	
	public ModelAndView toDestine(){
		InfoController cinfo = new InfoController();
		Result<User> rs = cinfo.currentUser();
		User u = rs.getData(); 
		System.out.println("u"+u);
		
		return new ModelAndView();
	}
	
	
		
}
