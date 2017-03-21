package com.sunshine.dao;

import java.util.List;
import java.util.Map;

 

/**
 * 座席人员信息表
 * @author 云和数据—齐铁成
 * 2017年3月9号
 */
public interface LoginRecordDao {
   /**
    * 获取登录的座席人员
    */
  List<Map<String, String>> getLoginRecord();
	
	
	
}
