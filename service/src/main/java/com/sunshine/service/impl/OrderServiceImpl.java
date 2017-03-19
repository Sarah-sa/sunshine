package com.sunshine.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.dao.OrderDao;
import com.sunshine.dao.ServiceItemDao;
import com.sunshine.model.Order;
import com.sunshine.model.ServiceItem;
import com.sunshine.model.User;
import com.sunshine.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private ServiceItemDao itemDao;
	
	@Override
	public List<Map<String, Object>> getOrderSummary(int pageIndex, int pageSize) {
		System.out.println(pageIndex + ":" + pageSize);
		PageHelper.startPage(pageIndex, pageSize);
		Page<Order> page = (Page<Order>) orderDao.listUnFinishedOrderByServer(getPrincipal().getId());
		if(page.getTotal() < pageIndex)
			return null;
//		PageInfo<Order> page = orderList.toPageInfo();
//		page.getFirstPage();
		List<Map<String, Object>> maps = new ArrayList<>();
		Map<String, ServiceItem> itemMap = new HashMap<>();
		for (int i = 0; i < page.getPageSize(); i++) {
			Order order = page.get(i);
			String itemId = order.getItemid();
			ServiceItem item = itemMap.get(itemId);
			if(item == null) {
				item = itemDao.getItem(itemId);
				itemMap.put(itemId, item);
			}
			Map<String, Object> orderMap = new HashMap<>();
			orderMap.put("NO", order.getCode());
			orderMap.put("cost", order.getCost());
			orderMap.put("quantity", order.getQuantity());
			orderMap.put("itemName", item.getName());
			orderMap.put("createTime", order.getCreatetime());
			maps.add(orderMap);
		}
		return maps;
	}
	
	private User getPrincipal() {
		return (User) SecurityUtils.getSubject().getPrincipal();
	}
}
