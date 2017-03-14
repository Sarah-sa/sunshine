package com.sunshine.dao;

import com.sunshine.model.Apply;

/**
 * 文化生活-参赛表 t_apply数据接口
 * @author 云和数据-任继鹏
 *
 * Administrator
 */
public interface ApplyDao {
	/**
	 * 添加参赛人员
	 * @param apply
	 * @return
	 */
	public int saveApply(Apply apply);
	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	public int removeApply(String id);
	/**
	 * 修改数据
	 * @param apply
	 * @return
	 */
	public int updateApply(Apply apply);
}
