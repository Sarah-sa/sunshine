package com.sunshine.dao;

import java.util.List;
import java.util.Map;

/**
 * 未审核老人数据接口
 * @author 云和数据-冯显胜
 *
 */
public interface ExamineElderDao {
	/**
	 * 模糊查询老人的状态
	 * @param examine
	 * @return
	 */
	List<Map> listAllExamine(Map<String,Object> examine);
}
