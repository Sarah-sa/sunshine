package com.sunshine.model;

import java.util.Date;

/**
 * 地图数据模型 表名：t_position
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Position {
	/**
	 * 地图编号
	 */
	private String id;
	/**
	 * 地图坐标X轴
	 */
	private String x;

	/**
	 * 地图坐标Y轴
	 */
	private String y;
	/**
	 * 老人id
	 */
	private String elder_id;
	/**
	 * 此刻时间
	 */
	private Date upload_time;

	public Position() {

	}

	public Position(String id, String x, String y, String elder_id, Date upload_time) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.elder_id = elder_id;
		this.upload_time = upload_time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getElder_id() {
		return elder_id;
	}

	public void setElder_id(String elder_id) {
		this.elder_id = elder_id;
	}

	public Date getUpload_time() {
		return upload_time;
	}

	public void setUpload_time(Date upload_time) {
		this.upload_time = upload_time;
	}

}
