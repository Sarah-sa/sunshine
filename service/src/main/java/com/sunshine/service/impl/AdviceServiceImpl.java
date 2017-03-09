package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.AdviceDao;
import com.sunshine.model.Advice;
import com.sunshine.model.Page;
import com.sunshine.service.AdviceService;

@Service
public class AdviceServiceImpl implements AdviceService {
	@Autowired
	private AdviceDao adviceDao;

	@Override
	public int saveAdvice(Advice advice) {
		// TODO Auto-generated method stub
		int i= adviceDao.saveAdvice(advice);
		if(i>0){
			System.out.println("增加成功");
		}
		return i;
	}

	@Override
	public void updateAdvice(Advice advice) {
		// TODO Auto-generated method stub
		int i= adviceDao.updateAdvice(advice);
		if(i>0){
			System.out.println("修改成功");
		}
	}
	@Override
	public int removeAdvice(String Id) {
		// TODO Auto-generated method stub
		int i= adviceDao.removeAdvice(Id);
		if(i>0){
			System.out.println("删除成功");
		}
		return i;
	}

	@Override
	public List<Advice> ListAllAdvice() {
		// TODO Auto-generated method stub
		List<Advice> listAdvice=adviceDao.ListAllAdvice();
		return listAdvice;
	}

	@Override
	public Advice getAdvice(String Id) {
		// TODO Auto-generated method stub
		Advice advice = adviceDao.getAdvice(Id);
		return advice;
	}

}
