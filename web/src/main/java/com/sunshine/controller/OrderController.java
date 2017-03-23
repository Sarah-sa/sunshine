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
	
	/**
	 * 获取商家接到的所有的订单
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@RequestMapping("/server/all")
	private Result<Page<Map<String, Object>>> getAllReceived(int pageSize, int pageIndex) {
		Result<Page<Map<String, Object>>> rs = new Result<>();
		
		Page<Map<String, Object>> page = orderService.listOrderSummaryByServer(pageIndex, pageSize);
		rs.setRsCode(Result.RsCode.Success);
		rs.setData(page);
		
		return rs;
	}
	
	/**
	 * 获取商家未处理的订单
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@RequestMapping("/server/new")
	public Result<Page<Map<String, Object>>> getNewReceived(@RequestParam("pageSize") int pageSize, @RequestParam("pageIndex") int pageIndex) {
		Page<Map<String, Object>> orderList = orderService.listUnFinishedOrderSummaryByServer(pageIndex, pageSize);
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
	@RequestMapping("/server/finished")
	public Result<Page<Map<String, Object>>> getOrderDetail(@RequestParam("pageSize") int pageSize, @RequestParam("pageIndex") int pageIndex) {
		Page<Map<String, Object>> orderList = orderService.listFinishedOrderSummaryByServer(pageIndex, pageSize);
		Result<Page<Map<String, Object>>> rs = new Result<>();
		rs.setData(orderList);
		rs.setRsCode(Result.RsCode.Success);
		return rs;
	}

}
