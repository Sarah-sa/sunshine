package com.sunshine.model;

import java.io.Serializable;

/**
 * 将审核状态改为枚举类，防止传入无效数据
 * 
 * @author 云和数据-王辉
 *
 */
public enum ServerStatus implements Serializable {
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
