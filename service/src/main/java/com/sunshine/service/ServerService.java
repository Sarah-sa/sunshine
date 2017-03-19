package com.sunshine.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.sunshine.model.ServerInfo;

/**
 * 服务商相关业务
 * @author 云和数据-王辉
 *
 */
public interface ServerService {
	
	/**
	 * 完善/修改服务商信息
	 * @param info 供应商信息
	 * @return
	 */
	boolean improveServerInfo(ServerInfo info);
	
	/**
	 * 分页获取所有待审核供应商列表
	 * @param pageIndex 页码
	 * @param volume 每页容量
	 * @return 查询到的数据
	 */
	PageInfo<ServerInfo> listAllUnVerifiedServerByPage(int pageIndex, int pageSize);
	
	/**
	 * @param sid
	 * @param pageIndex
	 * @param volume
	 * @return
	 */
	PageInfo<Map<String, Object>> listServerItem(String sid, int pageIndex, int pageSize, boolean available);
}
