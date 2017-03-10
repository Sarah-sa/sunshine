package com.sunshine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.ApplyDao;
import com.sunshine.model.Apply;
import com.sunshine.service.ApplyService;

/**
 * 参赛接口的实现类 云和——任继鹏 3月9日
 * 
 * @author Administrator
 *
 */
@Service("ApplyService")
public class ApplyServiceImpl implements ApplyService {
	/**
	 * 自动注入ApplyDao接口
	 */
	@Autowired
	private ApplyDao applydao;

	@Override
	public int saveApply(Apply apply) {
		// TODO Auto-generated method stub
		int i=applydao.saveApply(apply);
		if(i>0){
			System.out.println("增加成功");
		}
		return i;
	}

}
