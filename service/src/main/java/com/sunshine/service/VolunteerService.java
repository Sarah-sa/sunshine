package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Volunteer;

/**
 * 志愿者服务接口
 * 
 * @author 云和数据-冯显胜
 *
 */
public interface VolunteerService {
	/**
	 * 添加志愿者信息
	 * 
	 * @param volunteer
	 * @return
	 */
	int saveVolteer(Volunteer volunteer);

	/**
	 * 查询所有志愿者
	 */
	List<Volunteer> getVolunteer();

	/**
	 * 根据条件模糊查询志愿者
	 */
	List<Object> listAllVolunteer(Map<String, Object> volunteer);

}
