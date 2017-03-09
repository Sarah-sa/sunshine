package com.sunshine.model;
/**
 * 订单状态表
 * 陈晓锋
 *
 */
public class OrderStatus {

	/*
	 * 表id
	 */
	private String id;
	/*
	 * 订单状态名称
	 */
	private String name;
	/*
	 * 流程顺序
	 */
	private int orderlevel;
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
	public int getOrderlevel() {
		return orderlevel;
	}
	public void setOrderlevel(int orderlevel) {
		this.orderlevel = orderlevel;
	}
	@Override
	public String toString() {
		return "OrderStatus [id=" + id + ", name=" + name + ", orderlevel=" + orderlevel + "]";
	}
	
}
