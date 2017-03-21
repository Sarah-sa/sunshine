package com.sunshine.service;

import java.util.List;

import com.sunshine.model.Tips;

/**
 * 标题接口
 * @author 云和数据-齐铁成
 *
 */
public interface TipsService {
 
    /**
     * 根据分类的id获取所有的知识
     */
    List<Tips> getTipsList(String tips_ctgy_id);
    /**
     *根据标题的关键字模糊查询知识
     */
    List<Tips> getLikeTips(String Titlename);
	
	
}
