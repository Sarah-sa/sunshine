package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Volunteer;

/**
 * 志愿者数据访问接口
 * @author 云和数据-冯显胜
 *
 */
public interface VolunteerDao {
	/**
	 * 添加志愿者信息
	 * 
	 * @param volunteer
	 * @return
	 */
	int saveVolunteer(Volunteer volunteer);
	
	  /**
	   * 查询志愿者集合
	   */
	List<Volunteer> getVolunteer();

	/**
	 * 根据条件模糊查询志愿者
	 */
	List<Object> listAllVolunteer(Map<String,Object> volunteer);
}
