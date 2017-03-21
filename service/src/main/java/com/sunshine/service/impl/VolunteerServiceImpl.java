package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.VolunteerDao;
import com.sunshine.model.Volunteer;
import com.sunshine.service.VolunteerService;

/**
 * 志愿者服务接口实现
 * @author 云和数据-冯显胜
 *
 */
@Service
public class VolunteerServiceImpl implements VolunteerService{
	@Autowired
	private VolunteerDao volunteerdao;
	/**
	 * 添加志愿者
	 */
	@Override
	public int saveVolteer(Volunteer volunteer) {
			int volt = volunteerdao.saveVolunteer(volunteer);
			if(volunteer!=null){
				volunteer.setId(UUID.randomUUID().toString());
			}
			return volt;
		
	}
	/**
	 * 查询所有志愿者信息
	 */
	@Override
	public List<Volunteer> getVolunteer() {
		List<Volunteer> volunteerlist = null;
		volunteerlist = volunteerdao.getVolunteer();
		return volunteerlist;
	}
	/**
	 * 模糊查询志愿者信息
	 */
	@Override
	public List<Object> listAllVolunteer(Map<String, Object> volunteer) {
		 List<Object> listAll = null;
		 listAll =  volunteerdao.listAllVolunteer(volunteer);
		return listAll;
	}

}
