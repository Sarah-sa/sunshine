package com.sunshine.dao;

import java.util.List;
import com.sunshine.model.TipsCategory;

/**
 * 知识库种类模型的数据访问接口
 * @author 云和数据-陈剑洲
 *
 */
public interface TipsCategoryDao {
           
	    /**
	     * 根据id获得对应的知识种类记录
	     * @param id 知识记录的id
	     * @return 知识种类
	     */
	    TipsCategory getTipsCategory(String id);
	    
	    /**
	     * 获得所有的知识种类记录
	     * @return 知识种类记录的list集合
	     */
	    List<TipsCategory> listAllTipsCategory();
	    
	    
	    /**
	     * 插入 知识记录 到数据库
	     * @param tipscategory 知识种类记录对象
	     * @return 数据库中受影响的行数
	     */
	    int saveTipsCategory(TipsCategory tipscategory);
	    
	    /**
	     * 删除知识种类记录
	     * @param id 要删除的知识种类记录的id
	     * @return 数据库中受影响的行数
	     */
	    int removeTipsCategory(String id);
	    
	    /**
	     * 更新 知识种类记录
	     * @param tipscategory 知识种类记录对象
	     * @return 数据库中受影响的行数
	     */
	    int updateTipsCategory(TipsCategory tipscategory);
}
