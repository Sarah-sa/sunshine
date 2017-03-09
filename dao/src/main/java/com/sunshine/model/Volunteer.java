package com.sunshine.model;

/**
 * 志愿者数据模型层 
 * 表t_volunteer
 * 
 * @author 云和数据-陈剑洲
 */
public class Volunteer {

	/**
	 * 志愿者id
	 */
	private String id; 
	/**
	 * 姓名
	 */
	private String name; 
	/**
	 * 地址
	 */
	private String address; 
	/**
	 * 电话
	 */
	private String phone; 
	/**
	 * 志愿者编号
	 */
	private String code;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Volunteer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", code=" + code
				+ "]";
	}
	
	

}
