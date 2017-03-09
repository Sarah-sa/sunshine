package com.sunshine.model;

import java.util.Date;

/**
 * 居民详细信息表 t_denizen_info
 * @author 云和数据-边晓鹏
 *
 */
public class DenizenInfo {

	 //居民详情id
	 private String uid;
	 //性别
	 private Boolean gender;
	 //地址
	 private String address;
	 //座机电话
	 private String tel;
	 //头像
	 private String photo;
	 //昵称
	 private String nickName;
	 //出生日期
	 private Date birthday;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "DenizenInfo [uid=" + uid + ", gender=" + gender + ", address=" + address + ", tel=" + tel + ", photo="
				+ photo + ", nickName=" + nickName + ", birthday=" + birthday + "]";
	}
	

	

		
}
