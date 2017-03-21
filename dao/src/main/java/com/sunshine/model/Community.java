package com.sunshine.model;

/**
 *  社区表 t_community
 * @author 云和数据-边晓鹏
 *
 */
public class Community {

	//权限id
	private String id;
	//社区名称
	private String name;
	//社区地址
	private String address;
	//验证符
	private String identifier;
	//行政代码
	private String administrativeCode;
	
	/**
	 * 是否审核通过
	 */
	private Boolean status;
	private Boolean handle;
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
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getAdministrativeCode() {
		return administrativeCode;
	}
	public void setAdministrativeCode(String administrativeCode) {
		this.administrativeCode = administrativeCode;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getHandle() {
		return handle;
	}
	public void setHandle(Boolean handle) {
		this.handle = handle;
	}
	@Override
	public String toString() {
		return "Community [id=" + id + ", name=" + name + ", address=" + address + ", identifier=" + identifier
				+ ", administrativeCode=" + administrativeCode + "]";
	}
	
	
	
}
