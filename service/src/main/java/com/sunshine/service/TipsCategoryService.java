package com.sunshine.service;

import java.util.List;

import com.sunshine.model.TipsCategory;

/**
 * 知识种类tips服务层接口
 * @author 云和数据-齐铁成
 * 2017年3月14日
 */
public interface TipsCategoryService {
	
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
    void saveTipsCategory(TipsCategory tipscategory);
}
