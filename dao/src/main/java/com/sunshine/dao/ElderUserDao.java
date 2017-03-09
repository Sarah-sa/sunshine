package com.sunshine.dao;

import com.sunshine.model.ElderUser;

/**
 * 老人用户数据层
 * @author 云和数据-陈剑洲
 *
 */
public interface ElderUserDao {
       
	    /**
	     * 添加老人用户关系信息
	     * @param relation
	     * @return
	     */
	    int saveElderUser(ElderUser elderUser);
}
