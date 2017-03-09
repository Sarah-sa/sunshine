package com.sunshine.model;
/**
 * 设备表数据模型层
 * 表t_equipment
 * 
 * @author 云和数据-陈剑洲
 */
public class Equipment {

	/**
	 * 设备id
	 */
	private String id; 
	/**
	 * 设备名称
	 */
	private String name; 
	/**
	 * 设备类型id
	 */
	private String equp_ctgy_id; 
	/**
	 * 设备编号
	 */
	private String code; 
	/**
	 * 启用、停用
	 */
	private Boolean status; 
	/**
	 * 可用与否
	 */
	private Boolean accessable;

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

	public String getEqup_ctgy_id() {
		return equp_ctgy_id;
	}

	public void setEqup_ctgy_id(String equp_ctgy_id) {
		this.equp_ctgy_id = equp_ctgy_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getAccessable() {
		return accessable;
	}

	public void setAccessable(Boolean accessable) {
		this.accessable = accessable;
	}

	@Override
	public String toString() {
		return "Equipment [id=" + id + ", name=" + name + ", equp_ctgy_id=" + equp_ctgy_id + ", code=" + code
				+ ", status=" + status + ", accessable=" + accessable + "]";
	}
	
	

}
