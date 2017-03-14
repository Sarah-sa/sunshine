package com.sunshine.model;

import com.sunshine.util.UUIDUtil;

/**
 * 
 * @author 云和数据-边晓鹏
 *  用户表 t_user
 */
public class User {
    //用户id
	private String id;
	//用户名称
	private String userName;
	//角色id
	private String roleId;
	//电话
	private String phone;
	//电子邮箱
	private String email;
	//密码
	private String pwd;
	//真实姓名
	private String realName;
	//身份证号
	private String idCard;
	//社区id
	private String communityId;
	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getCommunityId() {
		return communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", roleId=" + roleId + ", phone=" + phone + ", email="
				+ email + ", pwd=" + pwd + ", realName=" + realName + ", idCard=" + idCard + ", communityId="
				+ communityId + "]";
	}
	
	
	
}
