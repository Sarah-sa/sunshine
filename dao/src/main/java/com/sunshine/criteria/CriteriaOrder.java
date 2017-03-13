package com.sunshine.criteria;

import java.util.Date;
import java.util.Objects;

/**
 * 订单模糊查询类<br>
 * 若查询字段为空
 * 
 * @author 云和数据-王辉
 *
 */
public class CriteriaOrder {
	/*
	 * 订单号
	 */
	private String code;
	/*
	 * 下单人id
	 */
	private String userId;
	/*
	 * 服务商id
	 */
	private String serverId;
	
	/**
	 * 服务商名字
	 */
	private String serverName;
	
	/*
	 * 服务条目id
	 */
	private String itemName;
	/*
	 * 订单最早创建时间
	 */
	private Date earliestCreateTime;
	
	/**
	 * 订单最晚创建时间
	 */
	private Date latestCreateTime;
	
	/*
	 * 接收服务地址
	 */
	private String address;
	
	/*
	 * 最早接单时间
	 */
	private Date earlestAcceptTime;
	
	/**
	 * 最晚接单时间
	 */
	private Date latestAcceptTime;
	
	/*
	 * 最早完成时间
	 */
	private Date earliestFinishTime;
	
	/**
	 * 最晚完成时间
	 */
	private Date latestFinishTime;
	
	/*
	 * 订单的状态
	 */
	private String orderStatusId;
	
	/*
	 * 最大订单金额
	 */
	private Double maxCost;
	
	
	/**
	 * 最小订单金额
	 */
	private Double minCost;

	public String getCode() {
		return "%" + Objects.toString(code, "") + "%";
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserId() {
		return "%" + Objects.toString(userId, "") + "%";
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getServerId() {
		return "%" + Objects.toString(serverId, "") + "%";
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getServerName() {
		return "%" + Objects.toString(serverName, "") + "%";
	}
	
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getItemName() {
		return "%" + Objects.toString(itemName, "") + "%";
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setEarliestCreateTime(Date earliestCreateTime) {
		this.earliestCreateTime = earliestCreateTime;
	}

	public void setLatestCreateTime(Date latestCreateTime) {
		this.latestCreateTime = latestCreateTime;
	}
	
	public String getCreateTimeQueryString() {
		int start = earliestCreateTime == null ? 0 : 1;
		int end = latestCreateTime == null ? 0 : 1;
		String queryString = null;
		switch(start + end * 2) {
		case 0:
			queryString = "true";
			break;
		case 1:
			queryString = "createtime >= #{earliestCreateTime}";
			break;
		case 2:
			queryString = "createtime <= #{latestCreateTime}";
			break;
		case 3:
			queryString = "createtime BETWEEN #{earliestCreateTime} AND #{latestCreateTime}";
			break;
		}
		return queryString;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setEarlestAcceptTime(Date earlestAcceptTime) {
		this.earlestAcceptTime = earlestAcceptTime;
	}

	public void setLatestAcceptTime(Date latestAcceptTime) {
		this.latestAcceptTime = latestAcceptTime;
	}

	public void setEarliestFinishTime(Date earliestFinishTime) {
		this.earliestFinishTime = earliestFinishTime;
	}

	public void setLatestFinishTime(Date latestFinishTime) {
		this.latestFinishTime = latestFinishTime;
	}

	public void setOrderStatusId(String orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public void setMaxCost(Double maxCost) {
		this.maxCost = maxCost;
	}

	public void setMinCost(Double minCost) {
		this.minCost = minCost;
	}

}
