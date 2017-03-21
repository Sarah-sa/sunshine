package com.sunshine.model;

/**
 * 商家详细信息表 t_server_info
 * 
 * @author 云和数据-边晓鹏
 *
 */
public class ServerInfo {

	// 用户id
	private String uid;
	// 地址
	private String address;
	// 座机电话
	private String tel;
	// 店面图片
	private String photo;
	// 店名
	private String shopName;
	// 店长姓名
	private String mgrName;

	// 店长身份证号
	private String mgrIdcard;
	// 店长性别
	private Boolean mgrGender;
	// 证件照片
	private String certificates;
	// 店面描述
	private String description;
	private ServerStatus status;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMgrName() {
		return mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public String getMgrIdcard() {
		return mgrIdcard;
	}

	public void setMgrIdcard(String mgrIdcard) {
		this.mgrIdcard = mgrIdcard;
	}

	public Boolean getMgrGender() {
		return mgrGender;
	}

	public void setMgrGender(Boolean mgrGender) {
		this.mgrGender = mgrGender;
	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status.toString();
	}

	public void setStatus(ServerStatus status) {
		this.status = status;
	}

	/**
	 * 将审核状态改为枚举类，防止传入无效数据
	 * @author 云和数据-王辉
	 *
	 */
	public enum ServerStatus {
		/**
		 * 待审核
		 */
		ToBeVerified("待审核"),
		/**
		 * 审核已通过
		 */
		Check("通过"),
		/**
		 * 审核未通过
		 */
		Failure("未通过");
		private String name;
		ServerStatus(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return name;
		}
	}
	@Override
	public String toString() {
		return "ServerInfo [uid=" + uid + ", address=" + address + ", tel=" + tel + ", photo=" + photo + ", shopName="
				+ shopName + ", mgrName=" + mgrName + ", mgrIdcard=" + mgrIdcard + ", mgrGender=" + mgrGender
				+ ", certificates=" + certificates + ", description=" + description + ", status=" + status + "]";
	}

}