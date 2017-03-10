package com.sunshine.service;

import com.sunshine.model.Hobby;

/**
 * 老人爱好服务接口
 * 
 * @author 云和数据-冯显胜
 *
 */
public interface HobbyService {
	/**
	 * 添加爱好
	 * 
	 * @param hobby
	 * @return
	 */
	int saveHobby(Hobby hobby);
}
