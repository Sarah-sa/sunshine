package com.sunshine.service;

import java.util.List;
import java.util.Map;

/**
 * 座席登录服务层接口
 * @author 云和数据-齐铁成
 * 2017年3月9号
 */
public interface LoginRecordService {
	/**
	 * 获取座席登录接口
	 * @return
	 */
	public List<Map<String, String>> getListLoginRecord();              
	

}
