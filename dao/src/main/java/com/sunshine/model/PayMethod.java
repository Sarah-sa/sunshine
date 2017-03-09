package com.sunshine.model;
/**
 * 支付方式表
 * @author 陈晓锋
 *
 */
public class PayMethod {

	/*
	 * 支付方式id
	 */
	private String id;
	/*
	 * 支付方式名称
	 */
	private String name;
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
	@Override
	public String toString() {
		return "PayMethod [id=" + id + ", name=" + name + "]";
	}

}
