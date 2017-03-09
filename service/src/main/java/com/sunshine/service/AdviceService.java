package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Advice;
import com.sunshine.model.Page;

/**
 * 业务层
 * @author Administrator
 *
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
	public int removeAdvice(String Id);
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
	public Advice getAdvice(String Id);
	/**
	 * 修改公告
	 * @param advice
	 */
	public void updateAdvice(Advice advice);
}
