package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Elder;

/**
 * 关联老人数据层
 * @author 云和数据-陈剑洲
 *
 */

public interface ElderDao {
               
	        /**
	         * 向数据库新增一条老人数据
	         * @param elder
	         * 要插入数据库的老人信息
	         * @return 受影响的条数
	         * @throws Exception
	         */
	        int saveElder(Elder elder) throws Exception; 
	        
	        /**
	         * 更新老人信息
	         * @param elder
	         *  要更新的信息
	         * @return  受影响的条数
	         * @throws Exception
	         */
	        int updateElder(Elder elder)throws Exception;
	        
	        /**
	         * 删除一条老人信息
	         * @param id
	         *          要删除老人的id   
	         * @return   受影响的条数
	         * @throws Exception
	         */
	        int removeElder(String id)throws Exception;
	        
	        /**
	         * 根据主键获取老人对象
	         * @param id
	         * @return     老人主键
	         * @throws Exception
	         */
	        Elder getElder(String id)throws Exception;
	        
	        
	        /**
	         * 模糊查询匹配的老人信息列表
	         * @param elder
	         * @return  返回所有的老人信息
	         * @throws Exception
	         */
	        List<Elder> listAllElders()throws Exception;
	        
}
