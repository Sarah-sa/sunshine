package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Advice;
import com.sunshine.model.Page;

/**
* 通告的业务接口
*@author 任继鹏
* 2017年3月8日  
*/
public interface AdviceService {
	/**
	 * 添加公告
	 * @param advice
	 * @return
	 */
	public int saveAdvice(Advice advice);
	/***
	 * 删除公告
	 * @param advice
	 * @return
	 */
	public int removeAdvice(String id);
	/**
	 * 模糊查询通告列表
	 * @param advice
	 * @return
	 */
	public List<Advice> ListAllAdvice();
	/**
	 * 查看公告详情
	 * @return
	 */
	public Advice getAdvice(String id);
	/**
	 * 修改公告
	 * @param advice
	 */
	public void updateAdvice(Advice advice);
}
