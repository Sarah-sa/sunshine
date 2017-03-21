package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Volunteeractivity;

/**
 *自愿者活动dao层接口
 * @author 云和数据-齐铁成
 *2015年3月16日
 */
public interface VolunteerActivityDao {
/**
 * 获取所有自愿者的服务记录
 */
 List<Volunteeractivity> ListVolService( );
	
 /**
  * 获取所有的正在进行服务中的自愿者记录
  */
 List<Volunteeractivity> ListVolOnService();
 
/**
 * 获取所有的历史服务记录
 */
 List<Volunteeractivity> ListVolHistoryService();
 
 
}
