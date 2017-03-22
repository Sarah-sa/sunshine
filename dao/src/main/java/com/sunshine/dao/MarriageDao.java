package com.sunshine.dao;

import com.sunshine.model.Marriage;

/**
 * 婚姻数据接口 
 * @author 云和数据-冯显胜
 *
 */
public interface MarriageDao {
	/**
	 * 获取老人婚姻数据
	 * @return
	 */
	Marriage getMarrageByName(String name);
}
