package com.sunshine.model;

/**
 * 时限表数据模型层 
 * 表t_timelimit
 * 
 * @author 云和数据-陈剑洲
 */

public class Timelimit {

	/**
	 * 时限id
	 */
	private String id;

	/**
	 * 订单处理时限
	 */
	private Double order_handle_limit;
	/**
	 * 投诉处理时限
	 */
	private Double complain_handle_limit;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getOrder_handle_limit() {
		return order_handle_limit;
	}

	public void setOrder_handle_limit(Double order_handle_limit) {
		this.order_handle_limit = order_handle_limit;
	}

	public Double getComplain_handle_limit() {
		return complain_handle_limit;
	}

	public void setComplain_handle_limit(Double complain_handle_limit) {
		this.complain_handle_limit = complain_handle_limit;
	}

	@Override
	public String toString() {
		return "Timelimit [id=" + id + ", order_handle_limit=" + order_handle_limit + ", complain_handle_limit="
				+ complain_handle_limit + "]";
	}
	
	

}
