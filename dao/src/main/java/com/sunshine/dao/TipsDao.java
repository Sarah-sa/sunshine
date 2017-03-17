package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Tips;

/**
 * 知识库模型的数据访问接口
 * @author 云和数据-陈剑洲
 *
 */
public interface TipsDao {
	  /**
     * 根据id获得对应的知识记录
     * @param id 知识记录的id
     * @return  知识
     */
    Tips getTips(String id);
    	 
    /**
     * 根据分类的id获取所有的知识jilu
     */
    List<Tips> getTipsList(String tips_ctgy_id);
    /**
     *根据标题的关键字模糊查询知识
     */
    List<Tips> getLikeTips(String Titlename);
    /**
     * 获得所有的知识记录
     * @return 知识记录的list集合
     */
    List<Tips> listAllTips();
    
    /**
     * 插入 知识记录 到数据库
     * @param tips 知识记录对象
     * @return 数据库中受影响的行数
     */
    int saveTips(Tips tips);
    
    /**
     * 删除知识记录
     * @param id 要删除的知识记录的id
     * @return 数据库中受影响的行数
     */
    int removeTips(String id);
    
    /**
     * 更新 知识记录
     * @param tips 知识记录对象
     * @return 数据库中受影响的行数
     */
    int updateTips(Tips tips);
	     
}
