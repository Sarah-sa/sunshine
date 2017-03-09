package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Advice;



/**
 * 文化生活-通知表 t_advice数据接口
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public interface AdviceDao {
	/**
	 * 添加公告
	 * @param advice
	 * @return
	 */
	public int saveAdvice(Advice advice);
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
	public int updateAdvice(Advice advice);
	
	/**
	 * 删除公告
	 * @param advice
	 * @return
	 */
	public  int removeAdvice(String Id);
}
