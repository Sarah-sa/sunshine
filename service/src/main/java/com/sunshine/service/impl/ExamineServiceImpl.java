package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sunshine.dao.ExamineElderDao;
import com.sunshine.service.ExamineService;
/**
 * 实现老人服务接口
 * @author 云和数据-冯显胜
 *
 */
public class ExamineServiceImpl implements ExamineService{
	@Autowired
	private ExamineElderDao examineElder;
	/**
	 * 模糊查询老人的审核状态
	 */
	@Override
	public List<Map> listAllExamine(Map<String, Object> examine) {
		// TODO 
		List<Map> list = null;
		list = examineElder.listAllExamine(examine);
		return list;
	}

}
