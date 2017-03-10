package com.sunshine.model;

/**
 * 权限表 t_authority 
 * 
 * 添加 Comparable<Authority> 接口 By 王辉
 * 
 * @author 云和数据-边晓鹏
 * @author 云和数据-王辉
 *
 */
public class Authority implements Comparable<Authority> {

	// 权限id
	private String id;
	// 权限名称
	private String name;
	// 权限的url
	private String url;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", name=" + name + ", url=" + url + "]";
	}

	@Override
	public int compareTo(Authority auth) {
		if (auth == null)
			return 1;
		return id.compareTo(auth.getId());
	}

}
