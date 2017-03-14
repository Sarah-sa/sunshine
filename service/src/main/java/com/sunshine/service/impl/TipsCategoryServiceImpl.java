package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.TipsCategoryDao;
import com.sunshine.model.TipsCategory;
import com.sunshine.service.TipsCategoryService;

/**
 * 知识种类tipsCategory服务层实现
 * @author 云和数据-齐铁成
 * 2017年3月14日
 */
@Service
public class TipsCategoryServiceImpl implements TipsCategoryService {
@Autowired
private TipsCategoryDao tcd;

/**
 * 取出tipscategory的集合
 */
@Override
public List<TipsCategory> listAllTipsCategory() {
	// TODO Auto-generated method stub
	return  tcd.listAllTipsCategory();
}

@Override
public void saveTipsCategory(TipsCategory tipscategory) {
	// TODO Auto-generated method stub
	   tcd.saveTipsCategory(tipscategory);
}

}
