package com.sunshine.model;

/**
 * 知识库数据模型层 
 * 表t_tips
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class Tips {

	/**
	 * 此表id
	 */
	private String id;
	/**
	 * 种类id
	 */
	private String tips_ctgy_id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTips_ctgy_id() {
		return tips_ctgy_id;
	}

	public void setTips_ctgy_id(String tips_ctgy_id) {
		this.tips_ctgy_id = tips_ctgy_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Tips [id=" + id + ", tips_ctgy_id=" + tips_ctgy_id + ", title=" + title + ", content=" + content + "]";
	}

}
