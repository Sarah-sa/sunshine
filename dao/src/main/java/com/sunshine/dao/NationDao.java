package com.sunshine.dao;

import com.sunshine.model.Nation;

/**
 * 民族数据接口
 * @author 云和数据-冯显胜
 *
 */
public interface NationDao {
	/**
	 * 获取民族
	 * @param nation 民族名
	 * @return 对应的民族
	 */
	Nation getNationByName(String name);
}
