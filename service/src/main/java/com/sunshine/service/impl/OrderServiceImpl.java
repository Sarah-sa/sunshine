package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sunshine.dao.OrderDao;
import com.sunshine.dao.ServCategoryDao;
import com.sunshine.dao.ServiceItemDao;
import com.sunshine.model.Order;
import com.sunshine.model.ServCategory;
import com.sunshine.model.User;
import com.sunshine.service.OrderService;
import com.sunshine.util.UUIDUtil;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private ServiceItemDao itemDao;
	
	@Autowired
	private ServCategoryDao cateDao;
	
	@Override
	public Page<Map<String, Object>> listOrderSummaryByServer(int pageIndex, int pageSize) {
		
		return listOrderSummary(pageIndex, pageSize, null);
	}
	
	private User getPrincipal() {
		return (User) SecurityUtils.getSubject().getPrincipal();
	}

	@Override
	public Map<String, Object> getOrderDetail(String id) {
		
		return orderDao.getOrderDetail(id);
	}
	
	@Override
	public List<ServCategory> listRootCategory() {
		return cateDao.listAllRootCategory();
	}
	
	@Override
	public List<ServCategory> listChildCategory(String pid) {
		return cateDao.listByPid(pid);
	}

	@Override
	public Page<Order> listUnHandledOrderSummaryByItemAndServer(int pageIndex, int pageSize, String itemId) {
		PageHelper.startPage(pageIndex, pageSize);
		
		Page<Order> page =  (Page<Order>) orderDao.listUnHandledOrderByItem(itemId);
		return page;
	}

	@Override
	public Page<Map<String, Object>> listFinishedOrderSummaryByServer(int pageIndex, int pageSize) {
		
		return listOrderSummary(pageIndex, pageSize, true);
	}
	
	private Page<Map<String, Object>> listOrderSummary(int pageIndex, int pageSize, Boolean handled) {
		Page<Map<String, Object>> page = null;
		PageHelper.startPage(pageIndex, pageSize);
		if(handled == null)
			page = (Page<Map<String, Object>>) orderDao.listOrderByServer(getPrincipal().getId());
		else if(handled)
			page = (Page<Map<String, Object>>) orderDao.listFinishedOrderByServer(getPrincipal().getId());
		else
			page = (Page<Map<String, Object>>) orderDao.listUnFinishedOrderByServer(getPrincipal().getId());
		return page;
	}

	@Override
	public Page<Map<String, Object>> listUnFinishedOrderSummaryByServer(int pageIndex, int pageSize) {
		
		return listOrderSummary(pageIndex, pageSize, false);
	}

	@Override
	public Page<Map<String, Object>> listAcceptOrderSummaryByServer(int pageIndex, int pageSize) {
		PageHelper.startPage(pageIndex, pageSize);
		Page<Map<String, Object>> page = orderDao.listAcceptOrderSummaryByServer(getPrincipal().getId());
		return page;
	}

	@Override
	public boolean addOrder(Order order) {
		if(order.getId() == null)
			order.setId(UUIDUtil.genericUUID());
		return orderDao.saveOrder(order) > 0;
	}

	@Override
	public boolean updateOrder(Order order) {
		
		return orderDao.updateOrder(order) > 0;
	}
}
