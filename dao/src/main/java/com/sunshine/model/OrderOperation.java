package com.sunshine.model;

import java.util.Date;
/**
 * 工单管理表
 * @author 陈晓锋
 *
 */
public class OrderOperation {

	/**
	 * 工单管理表的id
	 */
	private String id;
	/**
	 * 坐席人员id
	 */
	private String staffid;
	/**
	 * 原先订单id
	 */
	private String oldorderid;
	/**
	 * 新订单号
	 */
	private String neworderid;
	/**
	 * 新下单时间
	 */
	private Date operatetime;
	/**
	 * 操作类型
	 */
	private String operatetype;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStaffid() {
		return staffid;
	}
	public void setStaffid(String staffid) {
		this.staffid = staffid;
	}
	public String getOldorderid() {
		return oldorderid;
	}
	public void setOldorderid(String oldorderid) {
		this.oldorderid = oldorderid;
	}
	public String getNeworderid() {
		return neworderid;
	}
	public void setNeworderid(String neworderid) {
		this.neworderid = neworderid;
	}
	public Date getOperatetime() {
		return operatetime;
	}
	public void setOperatetime(Date operatetime) {
		
		this.operatetime = operatetime;
	}
	public String getOperatetype() {
		return operatetype;
	}
	public void setOperatetype(OperaType operatetype) {
		this.operatetype = operatetype.toString();
	}
	
	@Override
	public String toString() {
		return "OrderOperation [id=" + id + ", staffid=" + staffid + ", oldorderid=" + oldorderid + ", neworderid="
				+ neworderid + ", operatetime=" + operatetime + ", operatetype=" + operatetype + "]";
	}
	
	/**
	 * 订单操作类型的枚举
	 * @author 云和数据-王辉
	 *
	 */
	public enum OperaType {
		PLACEORDER("下单"),
		CHANGE("改派");
		
		private String name;
		OperaType(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return name;
		}
	}
	
}
