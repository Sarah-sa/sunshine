package com.sunshine.model;

import java.util.Date;

public class OrderOperation {

	private String id;
	private String staffid;
	private String oldorderid;
	private String neworderid;
	private Date operatetime;
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
	public void setOperatetype(String operatetype) {
		this.operatetype = operatetype;
	}
	@Override
	public String toString() {
		return "OrderOperation [id=" + id + ", staffid=" + staffid + ", oldorderid=" + oldorderid + ", neworderid="
				+ neworderid + ", operatetime=" + operatetime + ", operatetype=" + operatetype + "]";
	}
	
}
