package com.sunshine.dao;

import java.util.List;
import java.util.Map;

/**
 * 短信记录表数据层接口
 * @author 云和数据-李牧
 *
 */
public interface MsgRecordDao {
	/**
	 * 根据id查询短信记录操作
	 * @return id 短信记录对象id
	 */
	public Map<String, String> getMsgRecord(String id);
	
	/**
	 * 获取用户记录表所有数据操作
	 * @return 
	 */
	public List<Map<String, String>> listAllMsgRecord();

}
