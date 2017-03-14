package com.sunshine.criteria;

import java.util.Date;

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

	/**
	 * 顾客用户名
	 */
	private String consumerName;

	/**
	 * 服务商名字
	 */
	private String productorName;

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
		// return "'%" + Objects.toString(code, "") + "%'";
		return code == null ? "" : code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getConsumerName() {
		// return "'%" + Objects.toString(consumerName, "") + "%'";
		return consumerName == null ? "" : consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getProductorName() {
		// return "'%" + Objects.toString(productorName, "") + "%'";
		return productorName == null ? "" : productorName;
	}

	public void setProductorName(String productorName) {
		this.productorName = productorName;
	}

	public String getItemName() {
		// return "'%" + Objects.toString(itemName, "") + "%'";
		return itemName == null ? "" : itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setEarliestCreateTime(Date earliestCreateTime) {
		this.earliestCreateTime = earliestCreateTime;
	}

	/**
	 * 不推荐使用该方法获取最早创建时间
	 * 
	 * @return 最早创建时间
	 */
	public Date getEarliestCreateTime() {
		return earliestCreateTime;
	}

	public void setLatestCreateTime(Date latestCreateTime) {
		this.latestCreateTime = latestCreateTime;
	}

	/**
	 * 不推荐使用该方法获取最晚创建时间
	 * 
	 * @return 最晚创建时间
	 */
	public Date getLatestCreateTime() {
		return latestCreateTime;
	}

	/**
	 * 推荐使用该方法获取创建时间区间的查询字符串，mybatis使用方法为${createTimeQueryString}
	 * 
	 * @return
	 */
	public String getCreateTimeQueryString() {
		int start = earliestCreateTime == null ? 0 : 1;
		int end = latestCreateTime == null ? 0 : 1;
		String queryString = null;
		switch (start + end * 2) {
		// 最早时间和最晚时间均为 null
		case 0:
			queryString = "true";
			break;
		// 最晚时间为 null
		case 1:
			queryString = "createtime >= #{earliestCreateTime}";
			break;
		// 最早时间为 null
		case 2:
			queryString = "createtime <= #{latestCreateTime}";
			break;
		// 最早时间和最晚时间均不为 null
		case 3:
			queryString = "createtime BETWEEN #{earliestCreateTime} AND #{latestCreateTime}";
			break;
		}
		return queryString;
	}

	public void setEarlestAcceptTime(Date earlestAcceptTime) {
		this.earlestAcceptTime = earlestAcceptTime;
	}

	/**
	 * 不推荐使用该方法获取最早接单时间
	 * 
	 * @return 最早接单时间
	 */
	public Date getEarlestAcceptTime() {
		return earlestAcceptTime;
	}

	public void setLatestAcceptTime(Date latestAcceptTime) {
		this.latestAcceptTime = latestAcceptTime;
	}

	/**
	 * 不推荐使用该方法获取最晚接单时间
	 * 
	 * @return 最晚接单时间
	 */
	public Date getLatestAcceptTime() {
		return latestAcceptTime;
	}

	/**
	 * 推荐使用该方法查询接单时间区间
	 * 
	 * @return 接单时间区间查询字符串
	 */
	public String getAcceptTimeQueryString() {
		int earlest = earlestAcceptTime == null ? 0 : 1;
		int latest = latestAcceptTime == null ? 0 : 1;
		String queryString = null;
		switch (earlest + latest * 2) {
		// 最早时间和最晚时间均为 null
		case 0:
			queryString = "true";
			break;
		// 最晚时间为 null
		case 1:
			queryString = "accepttime >= #{earlestAcceptTime}";
			break;
		// 最早时间为 null
		case 2:
			queryString = "accepttime <= #{latestAcceptTime}";
			break;
		// 最早时间和最晚时间均不为 null
		case 3:
			queryString = "accepttime BETWEEN #{earlestAcceptTime} AND #{latestAcceptTime}";
			break;
		}

		return queryString;
	}

	public void setEarliestFinishTime(Date earliestFinishTime) {
		this.earliestFinishTime = earliestFinishTime;
	}

	/**
	 * 不推荐使用该方法获取最早完成时间
	 * 
	 * @return 最早完成时间
	 */
	public Date getEarliestFinishTime() {
		return earliestFinishTime;
	}

	public void setLatestFinishTime(Date latestFinishTime) {
		this.latestFinishTime = latestFinishTime;
	}

	/**
	 * 不推荐使用该方法获取最晚完成时间
	 * 
	 * @return 最晚完成时间
	 */
	public Date getLatestFinishTime() {
		return latestFinishTime;
	}

	/**
	 * 推荐使用该方法获取订单完成时间区间的查询字符串
	 * 
	 * @return 订单完成时间区间的查询字符串
	 */
	public String getFinishQueryString() {
		int earliest = earliestFinishTime == null ? 0 : 1;
		int latest = latestFinishTime == null ? 0 : 1;
		String queryString = null;
		switch (earliest + latest * 2) {
		case 0:
			queryString = "true";
			break;
		case 1:
			queryString = "finishtime >= #{earliestFinishTime}";
			break;
		case 2:
			queryString = "finishtime <= #{latestFinishTime}";
			break;
		case 3:
			queryString = "accepttime BETWEEN #{earliestFinishTime} AND #{latestFinishTime}";
			break;
		}
		return queryString;
	}

	public void setOrderStatusId(String orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getOrderStatusId() {
		return orderStatusId == null ? "" : orderStatusId;
	}

	public void setMaxCost(Double maxCost) {
		this.maxCost = maxCost;
	}

	public Double getMaxCost() {
		return maxCost;
	}

	public void setMinCost(Double minCost) {
		this.minCost = minCost;
	}

	public Double getMinCost() {
		return minCost;
	}

	/**
	 * 推荐使用该方法获取查询订单金额区间的查询字符串
	 * 
	 * @return
	 */
	public String getCostQueryString() {
		int max = maxCost == null ? 0 : 1;
		int min = minCost == null ? 0 : 1;
		String queryString = null;
		switch (min + max * 2) {
		case 0:
			queryString = "true";
			break;
		case 1:
			queryString = "cost >= #{minCost}";
			break;
		case 2:
			queryString = "cost <= #{maxCost}";
			break;
		case 3:
			queryString = "cost BETWEEN #{minCost} AND #{maxCost}";
			break;
		}
		return queryString;
	}
}
