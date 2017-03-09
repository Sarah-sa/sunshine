package com.sunshine.service;

import java.util.List;

import com.sunshine.model.Complain;

/**
* 投诉的业务接口
*@author 王一贺
* 2017年3月8日  
*/
public interface ComplainService {

	/**
	 *描述：根据投诉的id获得该对象
	 *@author 王一贺 2017-03-08
	 *@param id 投诉的id
	 *@return 投诉对象
	 */
	Complain getComplain(String id);
	
	/**
	 *描述：获得所有的投诉对象构成list集合
	 *@author 王一贺 2017-03-08
	 *@return 投诉对象的集合
	 */
	List<Complain> listComplain();
	
	/**
	 *描述：增加投诉到数据库中
	 *@author 王一贺 2017-03-08
	 *@param complain 欲增加的投诉对象
	 *@return 受影响的行数
	 */
	int saveComplain(Complain complain);
	
	/**
	 *描述：更新投诉对象
	 *@author 王一贺 2017-03-08
	 *@param complain 准备更新的投诉对象
	 *@return 数据库中受影响的行数
	 */
	int updateComplain(Complain complain);
	
	/**
	 *描述：根据id删除对应的投诉对象
	 *@author 王一贺 2017-03-08
	 *@param id 准备删除的投诉对象的id
	 *@return 数据库中受影响的行数
	 */
	int removeComplain(String id);
}
