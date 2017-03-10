package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.LoginRecordDao;
import com.sunshine.service.LoginRecordService;

 /**
  * 座席登录服务层实现类
  * @author 云和数据-齐铁成
  * 2017年3月9号
  */

@Service
public class LoginRecordServiceImpl implements LoginRecordService{
@Autowired
 private  LoginRecordDao lrs;
/**
 * 获取所有的座席人员登录列表
 */
	@Override
	public List<Map<String, String>> getListLoginRecord() {
		return lrs.getLoginRecord();
	}

}
