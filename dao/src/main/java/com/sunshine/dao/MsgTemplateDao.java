package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.MsgTemplate;

/**
 * 短信模板表接口层
 * 
 * @author 云和数据-李牧
 * 
 */

public interface MsgTemplateDao {
	/**
	 * 根据id获取详细的短信模板详情
	 * 
	 * @param id
	 *            短信模板对象 id
	 * @return
	 */
	public MsgTemplate getMsgTemplate(String id);

	/**
	 * 获取短信模板表的所有信息
	 * 
	 * @param
	 * @return
	 */
	public List<MsgTemplate> listAllMsgTemplate();

	/**
	 * 根据短信模板对象修改数据信息
	 * 
	 * @param msgTemplate
	 *            短信模板对象
	 * @return
	 */
	public int updateMsgTemplate(MsgTemplate msgTemplate);

	/**
	 * 根据短信模板对象插入数据信息
	 * 
	 * @param msgTemplate
	 *            短信模板对象
	 * @return
	 */
	public int saveMsgTemplate(MsgTemplate msgTemplate);

	/**
	 * 根据短信模板对象 id删除数据信息
	 * 
	 * @param id
	 *            短信模板对象 id
	 * @return
	 */
	public int removeMsgTemplate(String id);

}
