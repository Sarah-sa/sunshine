package com.sunshine.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sunshine.message.Result;
import com.sunshine.service.ServerService;

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
}
