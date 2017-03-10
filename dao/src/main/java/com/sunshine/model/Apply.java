package com.sunshine.model;
/**
 * 云和数据 任继鹏
 * @author Administrator
 *
 */
public class Apply {
	//参赛人员id
	private Integer id;
	//参赛人员名字
	private String name;
	//年龄
	private String age;
	//性别
	private String sex;
	//联系方式
	private String phone;
	//家庭住址
	private String address;
	//比赛列表外键
	private String acid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	@Override
	public String toString() {
		return "Apply [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phone=" + phone
				+ ", address=" + address + ", acid=" + acid + "]";
	}
}
