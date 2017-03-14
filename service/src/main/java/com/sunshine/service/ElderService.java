package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Elder;

/**
 * 关联老人服务接口
 * @author 云和数据-陈剑洲
 *
 */
public interface ElderService {
           
	/**
	 * 添加老人信息
	 * @param elder
	 */
	int saveElder(Elder elder);
	
	/**
	 * 修改老人信息
	 * @param elder
	 * @return
	 */
	int updateElder(Elder elder);
    
    /**
     * 删除老人信息
     * @param elder
     * @return
     */
    int removeElder(String id);
    
    /**
     * 查询单个老人信息明细
     * @param elder
     * @return
     */
    Elder getElder(String id);
    
    
    /**
     * 模糊查询匹配的老人信息列表
     * @param elder
     * @return
     */
    List<Elder> listAllElders();
    
    
}
