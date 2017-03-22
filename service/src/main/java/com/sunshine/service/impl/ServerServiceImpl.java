package com.sunshine.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.dao.ServCategoryDao;
import com.sunshine.dao.ServerInfoDao;
import com.sunshine.dao.ServiceItemDao;
import com.sunshine.model.ServCategory;
import com.sunshine.model.ServerInfo;
import com.sunshine.service.ServerService;
import com.sunshine.util.ServiceCategoryTree;

@Service
public class ServerServiceImpl implements ServerService {

	@Autowired
	private ServerInfoDao infoDao;
	
	@Autowired
	private ServiceItemDao itemDao;
	
	@Autowired
	private ServCategoryDao cateDao;
	
	@Override
	public boolean improveServerInfo(ServerInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PageInfo<ServerInfo> listAllUnVerifiedServerByPage(int pageIndex, int pageSize) {
		PageHelper.startPage(pageIndex, pageSize, true);
		
		PageInfo<ServerInfo> page = new PageInfo<>(infoDao.listServersByStatus(ServerInfo.ServerStatus.ToBeVerified.toString()));
		return page;
	}

	@Override
	public PageInfo<Map<String, Object>> listServerItem(String sid, int pageIndex, int pageSize, boolean available) {
		PageHelper.startPage(pageIndex, pageSize, true);
		
		PageInfo<Map<String, Object>> page = null;
		if(available)
			page = new PageInfo<>(itemDao.listAvailableItemByServer(sid));
		else
			page = new PageInfo<>(itemDao.listUnavailableItemByServer(sid));
		return page;
	}

	@Override
	public List<ServiceCategoryTree> listServCategoryTree() {
		List<ServiceCategoryTree> tree = new ArrayList<>();
		List<ServCategory> rootCate = cateDao.listAllRootCategory();
		for (ServCategory servCategory : rootCate) {
			ServiceCategoryTree servTree = new ServiceCategoryTree();
			servTree.setTreeNode(servCategory);
			List<ServCategory> childTree = cateDao.listByPid(servCategory.getId());
			
			servTree.setChildNode(childTree);
			tree.add(servTree);
		}
		
		return tree;
	}

	@Override
	public List<Map<String, Object>> listAvailableItemByCgy(String cgyId) {
		
		return itemDao.listAvailableItemByCgy(cgyId);
	}

	
}
