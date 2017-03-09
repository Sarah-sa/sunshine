package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.ComplainDao;
import com.sunshine.model.Complain;
import com.sunshine.service.ComplainService;

/**
* 投诉业务接口的实现类
*@author 王一贺
* 2017年3月8日  
*/
@Service("ComplainService")
public class ComplainServiceImpl implements ComplainService {
	
	/**
	 * 自动注入ComplainDao接口 
	 */
	@Autowired
	private ComplainDao cdao;

	@Override
	public Complain getComplain(String id) {

		return cdao.getComplain(id);
	}

	@Override
	public List<Complain> listComplain() {

		return cdao.listComplain();
	}

	@Override
	public int saveComplain(Complain complain) {

		return cdao.saveComplain(complain);
	}

	@Override
	public int updateComplain(Complain complain) {

		return cdao.updateComplain(complain);
	}

	@Override
	public int removeComplain(String id) {

		return cdao.removeComplain(id);
	}

}
