package com.sunshine.service;

import com.sunshine.model.Apply;

/**
* 参赛的业务接口
*@author 任继鹏
* 2017年3月9日  
*/
public interface ApplyService {
	/**
	 * 添加参赛人员
	 * @param apply
	 * @return
	 */
	public int saveApply(Apply apply);
}
