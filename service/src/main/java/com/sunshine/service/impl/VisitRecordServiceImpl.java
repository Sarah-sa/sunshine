package com.sunshine.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunshine.dao.VisitRecordDao;
import com.sunshine.model.VisitRecord;
import com.sunshine.service.VisitRecordService;



/**
 * 走访记录业务的实现类
 * @author 王一贺 
 * 2017-03-08
 */
@Service("VisitRecordService")
public class VisitRecordServiceImpl implements VisitRecordService {
	
	/**
	 * 注入对应的dao层对象
	 */
	@Autowired
	private VisitRecordDao vtrd;
	
	@Override
	public VisitRecord getVisitRecord(String id) {		
		return vtrd.getVisitRecord(id);
	}

	
	@Override
	public List<VisitRecord> listVisitRecord() {		
		return vtrd.listVisitRecord();
	}


	@Override
	public int saveVisitRecord(VisitRecord vr) {		
		return vtrd.saveVisitRecord(vr);
	}

	
	@Override
	public int updateVisitRecord(VisitRecord vr) {	
		return vtrd.updateVisitRecord(vr);
	}

	
	@Override
	public int removeVisitRecord(String id) {		
		return vtrd.removeVisitRecord(id);
	}

}
