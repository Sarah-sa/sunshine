package com.sunshine.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.message.Result;
import com.sunshine.model.Community;
import com.sunshine.model.User;
import com.sunshine.service.CommunityService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private CommunityService communityService;
	
	@RequestMapping("/currentuser")
	public Result<User> currentUser() {
		User user = getUser();
		Result<User> rs = new Result<>();
		rs.setData(user);
		rs.setRsCode(Result.RsCode.Success);
		return rs;
	}
	
	@RequestMapping("/communityinfo")
	public Result<Community> communityInfo() {
		Community com = communityService.currentCommunity();
		Result<Community> rs = new Result<>();
		rs.setData(com);
		rs.setRsCode(Result.RsCode.Success);
		return rs;
	}
	
	private User getUser() {
		return (User) SecurityUtils.getSubject().getPrincipal();
	}
}
