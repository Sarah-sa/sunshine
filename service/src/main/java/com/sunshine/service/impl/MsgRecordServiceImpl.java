package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.MsgRecordDao;
import com.sunshine.model.MsgRecord;
import com.sunshine.service.MsgRecordService;

/**
 * 短信记录表服务层接口实现类
 * @author 云和数据——李牧
 *
 */
@Service
public class MsgRecordServiceImpl implements MsgRecordService {
	@Autowired
	private MsgRecordDao msgRecordDao;

	@Override
	public Map<String,String> getMsgRecord(String id) {
	   Map<String,String> map = msgRecordDao.getMsgRecord(id);

		return map;
	}

	@Override
	public List<Map<String, String>> listAllMsgRecord() {
		List<Map<String, String>> list = msgRecordDao.listAllMsgRecord();
		return list;
	}

}
