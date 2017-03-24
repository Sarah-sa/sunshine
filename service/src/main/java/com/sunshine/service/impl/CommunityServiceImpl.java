package com.sunshine.service.impl;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.CommunityDao;
import com.sunshine.model.Community;
import com.sunshine.model.User;
import com.sunshine.service.CommunityService;
import org.apache.shiro.SecurityUtils;
 

/**
 * 社区信息相关业务类
 * @author 云和数据-王辉
 *
 */
@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	private CommunityDao communityDao;
	
	@Override
	public List<Community> getall() { 
		return communityDao.getall();
	}
	
	@Override
	public Community getCommunity(String id) {
		return communityDao.getCommunity(id);
	}

	@Override
	public List<Community> listLikeAddress(String address) {
		return communityDao.listLikeAddress(address);
	}

	@Override
	public boolean checkDuplicate(String name, String address) {
		return communityDao.countByNameAndAddress(name, address) > 0;
	}

	@Override
	public boolean communityRegister(Community community) {
		return communityDao.saveCommunity(community) > 0;
	}

	@Override
	public boolean improveCommunityInfo(Community community) {
		return communityDao.updateCommunity(community) > 0;
	}

	@Override
	public boolean countByAdminCode(String adminCode) {
		return communityDao.countByAdminCode(adminCode) > 0;
	}

	@Override
	public boolean removeCommunity(String id) {
		return communityDao.removeCommunity(id) > 0;
	}

	@Override
	public List<Community> listAllUnHandled() {
		return communityDao.listAllUnHandled();
	}

	@Override
	public Community currentCommunity() {
		User user = (User) SecurityUtils.getSubject().getPrincipal();

		Community com = communityDao.getCommunity(user.getCommunityId());
		System.out.println(com);
		return com;

	}

 
}
