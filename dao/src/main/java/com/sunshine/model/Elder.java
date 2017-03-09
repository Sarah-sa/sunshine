package com.sunshine.model;

import java.util.Date;

/**s
 * 老人数据模型层 表名:t_elder
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Elder {
	/**
	 * 权限id
	 */
	private String id;
	/**
	 * 老人姓名
	 */
	private String name;
	/**
	 * 老人性别
	 */
	private Boolean gender;
	/**
	 * 老人出生日期
	 */
	private Date birthday;
	/**
	 * 老人身份证号
	 */
	private String idcard;
	/**
	 * 联系电话
	 */
	private String phone;
	/**
	 * 婚姻状况
	 */
	private String marriage_id;
	/**
	 * 民族
	 */
	private String nation_id;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 老人图像
	 */
	private String photo;
	/**
	 * 需帮扶程度id
	 */
	private String need_id;

	public Elder() {

	}

	public Elder(String id, String name, Boolean gender, Date birthday, String idcard, String phone,
			String marriage_id, String nation_id, String address, String photo, String need_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.idcard = idcard;
		this.phone = phone;
		this.marriage_id = marriage_id;
		this.nation_id = nation_id;
		this.address = address;
		this.photo = photo;
		this.need_id = need_id;
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

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String id_card) {
		this.idcard = id_card;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMarriage_id() {
		return marriage_id;
	}

	public void setMarriage_id(String marriage_id) {
		this.marriage_id = marriage_id;
	}

	public String getNation_id() {
		return nation_id;
	}

	public void setNation_id(String nation_id) {
		this.nation_id = nation_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNeed_id() {
		return need_id;
	}

	public void setNeed_id(String need_id) {
		this.need_id = need_id;
	}

	@Override
	public String toString() {
		return "Elder [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", id_card="
				+ idcard + ", phone=" + phone + ", marriage_id=" + marriage_id + ", nation_id=" + nation_id
				+ ", address=" + address + ", photo=" + photo + ", need_id=" + need_id + "]";
	}

}
