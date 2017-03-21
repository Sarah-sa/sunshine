package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.ServCategory;

/**
 * 服务种类表操作
 * @author 云和数据-王辉
 *
 */
public interface ServCategoryDao {
	
	/**
	 * 根据 id 获取服务种类
	 * @param id 服务种类主键
	 * @return 对应的服务种类
	 */
	ServCategory getCategory(String id);
	
	/**
	 * 列出所有服务种类
	 * @return 所有服务种类
	 */
	List<ServCategory> listAllCategory();
	
	/**
	 * 列出所有指定父分类下的所有子分类
	 * @param pid 父分类id
	 * @return 所有的指定父分类下的子分类
	 */
	List<ServCategory> listByPid(String pid);
	
	/**
	 * 列出所有根分类
	 * @return 所有根分类
	 */
	List<ServCategory> listAllRootCategory();
	
	/**
	 * 新增一条分类数据
	 * @param category 分类数据
	 * @return 数据库中受影响的记录数
	 */
	int saveCategory(ServCategory category);
	
	/**
	 * 更新一条分类数据
	 * @param category 要更新的分类数据
	 * @return 数据库中受影响的记录数
	 */
	int updateCategory(ServCategory category);
	
	/**
	 * 删除一条分类数据<br>
	 * <font color="red"><b>删除之前务必确保其已经没有子分类数据</b></font>
	 * @param id 要删除的分类数据的主键
	 * @return 数据库中受影响的记录数
	 */
	int deleteCategory(String id);
	
	/**
	 * 删除指定父分类下的所有子分类<br>
	 * <font color="red"><strong>删除前请确保所有子分类下没有下一级分类</strong></font>
	 * 
	 * @param pid 
	 * @return
	 */
	int removeAllChildNode(String pid);
	
	/**
	 * 根据父分类和分类名获取子分类<br>
	 * <font color="green">该方法的意义在于验证名字是否有重复</font>
	 * @param name 分类名
	 * @param pid 父分类主键
	 * @return 查询结果
	 */
	ServCategory getByNameAndPid(String name, String pid);
}
