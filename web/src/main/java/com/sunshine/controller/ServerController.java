package com.sunshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sunshine.message.Result;
import com.sunshine.model.ServiceItem;
import com.sunshine.service.ServerService;
import com.sunshine.util.ServiceCategoryTree;
import com.sunshine.util.UUIDUtil;

/**
 * 服务商模块控制器
 * @author 云和数据-王辉
 *
 */
@Controller
@RequestMapping("/server")
public class ServerController {
	

	@Autowired
	private ServerService serverService;
	
	@RequestMapping(path = "/listServerItem/{sid}/{pageIndex}/{pageSize}/{available}", method=RequestMethod.GET)
	@ResponseBody
	public Result<PageInfo<Map<String, Object>>> listServerItem(@PathVariable("sid") String sid, @PathVariable("pageIndex") int pageIndex, @PathVariable("pageSize") int pageSize, @PathVariable("available") boolean available) {
		PageInfo<Map<String, Object>> page = serverService.listServerItem(sid, pageIndex, pageSize, available);
		Result<PageInfo<Map<String, Object>>> rs = new Result<>(Result.RsCode.Success, page);
		return rs;
	}
	
	@RequestMapping("/newitem")
	public String listServicecategory() {
		return "/WEB-INF/views/ftl/server/newItem";
	}
	
	@RequestMapping("/itemlist")
	public String itemList() {
		return "/WEB-INF/views/ftl/server/itemlist";
	}
	
	@RequestMapping("/orderlist")
	public String orderList() {
		return "/WEB-INF/views/ftl/server/orderlist";
	}
	
	@RequestMapping("/neworder")
	public String newOrder() {
		return "/WEB-INF/views/ftl/server/neworder";
	}
	@RequestMapping("/handledorder")
	public String handledOrder() {
		return "/WEB-INF/views/ftl/server/handledorder";
	}
	@RequestMapping("/allorder")
	public String allOrder() {
		return "/WEB-INF/views/ftl/server/allorder";
	}
	
	@RequestMapping("myitemlist")
	@ResponseBody
	public Result<List<Map<String, Object>>> listItemOfCurrentServer() {
		Result<List<Map<String, Object>>> rs = new Result<>();
		
		
		
		return rs;
	}
	
	@RequestMapping("/addserviceitem")
	public Result<Object> addServerItem(ServiceItem item) {
		item.setId(UUIDUtil.genericUUID());
		boolean success = serverService.AddServiceItem(item);
		Result<Object> rs = new Result<>();
		rs.setRsCode(success ? Result.RsCode.Success : Result.RsCode.Fail);
		return rs;
	}
	
	
	
	@RequestMapping("/servcategory")
	@ResponseBody
	public Result<List<ServiceCategoryTree>> listCateTree() {
		Result<List<ServiceCategoryTree>> rs = new Result<>();
		rs.setData(serverService.listServCategoryTree());
		rs.setRsCode(Result.RsCode.Success);
		return rs;
	}
}
