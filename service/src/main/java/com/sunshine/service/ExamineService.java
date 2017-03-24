package com.sunshine.service;

import java.util.List;
import java.util.Map;

/**
 * 老人状态服务接口
 * @author 云和数据-冯显胜
 *
 */
public interface ExamineService {
	/**
	 * 老人状态查询
	 * @param examine
	 * @return
	 */
	List<Map> listAllExamine(Map<String,Object> examine);
}
