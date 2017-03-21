package com.sunshine.dao;

import com.sunshine.model.Hobby;

/**
 * ElderDao的测试
 * @author 云和数据-陈剑洲
 *
 */
public interface HobbyDao {
	/**
	 * 增加爱好
	 * 
	 * @param hobby
	 * @return
	 */
	int saveHobby(Hobby hobby);
}
