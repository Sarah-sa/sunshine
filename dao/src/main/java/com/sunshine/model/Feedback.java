package com.sunshine.model;

import java.util.Date;
/**
 * 反馈表
 * @author 陈晓锋
 *
 */
public class Feedback {

    /**
     * 反馈id
     */
	private String id;
	/*
	 * 订单id
	 */
	private String orderid;
	/*
	 * 评论内容
	 */
	private String content;
	/*
	 * 发表时间
	 */
	private Date publishtime;
	/*
	 * 服务打分
	 */
	private int score;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", orderid=" + orderid + ", content=" + content + ", publishtime=" + publishtime
				+ ", score=" + score + "]";
	}
	
}
