package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Module;

/**
 * 目录数据库操作
 * @author 云和数据-王辉
 *
 */
public interface ModuleDao {
	
	
	/**
	 * 根据目录 id 获取一条目录
	 * @param id 目录的id
	 * @return 数据库中对应的记录
	 */
	Module getModule(String id);
	
	/**
	 * 添加一个目录
	 * @param module 目录数据
	 * @return 数据库中受影响的记录数
	 */
	int saveModule(Module module);
	/**
	 * 更新目录信息
	 * @param module 要更新的目录信息
	 * @return 数据库中受影响的记录数
	 */
	int updateModule(Module module);
	
	/**
	 * 删除目录信息
	 * @param id 要删除目录的 id 
	 * @return 数据库中受影响的记录数
	 */
	int deleteModule(String id);
	
	/**
	 * 获取数据库中所有的目录信息
	 * @return
	 */
	List<Module> listAll();
	
	/**
	 * 获取当前目录的所有直接子目录的集合
	 * @param id 当前目录的 id
	 * @return
	 */
	List<Module> liatAllChildren(String id);
}
