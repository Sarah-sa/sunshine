package com.sunshine.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.sunshine.message.Result;
import com.sunshine.service.OrderService;

/**
 * 订单相关请求的控制器
 * @author 云和数据-王辉
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
	
//	@Autowired
//	private 
	
	/**
	 * 获取商家未处理的订单
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@RequestMapping("/server/new")
	public Result<Page<Map<String, Object>>> getNewReceived(@RequestParam("pageSize") int pageSize, @RequestParam("pageIndex") int pageIndex) {
		Page<Map<String, Object>> orderList = orderService.listUnFinishedOrderSummary(pageIndex, pageSize);
		Result<Page<Map<String, Object>>> rs = new Result<>();
		rs.setData(orderList);
		rs.setRsCode(Result.RsCode.Success);
		return rs;
	}
	
	/**
	 * 获取商家已完成的订单
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@RequestMapping("/finished")
	public Result<Page<Map<String, Object>>> getOrderDetail(@RequestParam("pageSize") int pageSize, @RequestParam("pageIndex") int pageIndex) {
		Page<Map<String, Object>> orderList = orderService.listFinishedOrderSummary(pageIndex, pageSize);
		Result<Page<Map<String, Object>>> rs = new Result<>();
		rs.setData(orderList);
		rs.setRsCode(Result.RsCode.Success);
		return rs;
	}

}
