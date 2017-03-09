package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunshine.dao.ElderDao;
import com.sunshine.model.Elder;
import com.sunshine.service.ElderService;

/**
 * @author 云和数据-陈剑洲
 *
 */
@Service("ElderService")
public class ElderServiceImpl implements ElderService{
 
	private static Logger logger = LogManager.getLogger(ElderServiceImpl.class);
	
	@Autowired
	private ElderDao elderDao;
	
	@Override
	public int saveElder(Elder elder) throws Exception {
		logger.error("添加老人:"+elder);
		return elderDao.saveElder(elder);
		
		
	}

	@Override
	public int updateElder(Elder elder) throws Exception {
		// TODO Auto-generated method stub
		return elderDao.updateElder(elder);
	}

	@Override
	public int removeElder(String id) throws Exception {
		
		return elderDao.removeElder(id);
	}

	@Override
	public Elder getElder(String id) throws Exception {
		
		return elderDao.getElder(id);
	}

	@Override
	public List<Elder> listAllElders() throws Exception {
		// TODO Auto-generated method stub
		return elderDao.listAllElders();
	}

}
