package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.MsgTemplateDao;
import com.sunshine.model.MsgTemplate;
import com.sunshine.service.MsgTemplateService;
import com.sunshine.util.UUIDUtil;


/**
 * 短信模板表服务层实现类
 * @author  云和数据-李牧
 *  
 */
@Service
public class MsgTemplateServiceImpl implements MsgTemplateService {
	
	
	@Autowired
	private MsgTemplateDao msgTemplateDao;
	/**
	 * 根据id获取详细的短信模板详情
	 * @param id 短信模板对象 id
	 * @return
	 */
    @Override
	public MsgTemplate getMsgTemplate(String id) {
    	MsgTemplate msgTemplate = msgTemplateDao.getMsgTemplate(id);
		return msgTemplate;
	}
    /**
	 * 获取短信模板表的所有信息
	 * @param 
	 * @return
	 */
	@Override
	public List<MsgTemplate> listAllMsgTemplate() {
		List<MsgTemplate> list = msgTemplateDao.listAllMsgTemplate();
		return list;
	}
	/**
	 * 根据短信模板对象修改数据信息
	 * @param msgTemplate 短信模板对象
	 * @return
	 */
	@Override
	public int updateMsgTemplate(MsgTemplate msgTemplate) {
		int i = msgTemplateDao.updateMsgTemplate(msgTemplate);
		return i;
		
	}
	/**
	 * 根据短信模板对象插入数据信息
	 * @param msgTemplate  短信模板对象
	 * @return
	 */
	@Override
	public int saveMsgTemplate(MsgTemplate msgTemplate) {
		msgTemplate.setId(UUIDUtil.genericUUID());
		int i = msgTemplateDao.saveMsgTemplate(msgTemplate);
		return i;
	}
	/**
	 * 根据短信模板对象 id删除数据信息
	 * @param id  短信模板对象 id
	 * @return
	 */
	@Override
	public int removeMsgTemplate(String id) {
		int i = msgTemplateDao.removeMsgTemplate(id);
		return i;
	}

}
