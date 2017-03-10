package com.sunshine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.HobbyDao;
import com.sunshine.model.Hobby;
import com.sunshine.service.HobbyService;
/**
 * 老人兴趣业务实现
 * 
 * @author 云和数据-冯显胜
 *
 */
@Service
public class HobbyServiceImpl implements HobbyService {
	@Autowired
	private HobbyDao hobbydao;

	@Override
	public int saveHobby(Hobby hobby) {

		return hobbydao.saveHobby(hobby);
	}

}
