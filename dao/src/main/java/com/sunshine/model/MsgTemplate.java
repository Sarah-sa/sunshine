package com.sunshine.model;

/**
 * 短信数据模型层 
 * 表t_msg_template
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class MsgTemplate {

	/**
	 * 此表id
	 */
	private String id;
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
		return "MsgTemplate [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

}
