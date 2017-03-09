package com.sunshine.model;
/**
 * 服务项目表
 * @author 陈晓锋
 *
 */
public class ServiceItem {

	/*
	 * 服务项目id
	 */
	private String id;
	/*
	 * 服务名称
	 */
	private String name;
	/*
	 * 所属分类
	 */
	private String srvctgyid;
	/*
	 * 服务费
	 */
	private double price;
	/*
	 * 服务描述
	 */
	private String description;
	/*
	 * 服务商id
	 */
	private String serverid;
	/*
	 * 服务状态
	 */
	private Boolean status;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrvctgyid() {
		return srvctgyid;
	}
	public void setSrvctgyid(String srvctgyid) {
		this.srvctgyid = srvctgyid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getServerid() {
		return serverid;
	}
	public void setServerid(String serverid) {
		this.serverid = serverid;
	}
	@Override
	public String toString() {
		return "ServiceItem [id=" + id + ", name=" + name + ", srvctgyid=" + srvctgyid + ", price=" + price
				+ ", description=" + description + ", serverid=" + serverid + ", status=" + status + "]";
	}

	
}
