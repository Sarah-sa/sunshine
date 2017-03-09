package com.sunshine.model;

import java.util.Date;
/**
 * 订单表
 * @author 陈晓锋
 *
 */
public class Order {

	/*
	 * 订单表id
	 */
	private String id;
	/*
	 * 订单号
	 */
	private String code;
	/*
	 * 下单人id
	 */
	private String userid;
	/*
	 * 服务商id
	 */
	private String serverid;
	/*
	 * 服务条目id
	 */
	private String itemid;
	/*
	 * 订单创建时间
	 */
	private Date createtime;
	/*
	 * 预期最早时间
	 */
	private Date expectstarttim;
	/*
	 * 预期最晚时间
	 */
	private Date expectendtime;
	/*
	 * 接收服务地址
	 */
	private String address;
	/*
	 * 支付方式id
	 */
	private String paymethodid;
	/*
	 * 接单时间
	 */
	private Date accepttime;
	/*
	 * 完成时间
	 */
	private Date finishtime;
	/*
	 * 订单的备注
	 */
	private String remark;
	/*
	 * 服务的数量
	 */
	private double quantity;
	/*
	 * 订单的状态
	 */
	private String orderstatusid;
	/*
	 * 订单金额
	 */
	private Double cost;
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getServerid() {
		return serverid;
	}
	public void setServerid(String serverid) {
		this.serverid = serverid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getExpectstarttim() {
		return expectstarttim;
	}
	public void setExpectstarttim(Date expectstarttim) {
		this.expectstarttim = expectstarttim;
	}
	public Date getExpectendtime() {
		return expectendtime;
	}
	public void setExpectendtime(Date expectendtime) {
		this.expectendtime = expectendtime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymethodid() {
		return paymethodid;
	}
	public void setPaymethodid(String paymethodid) {
		this.paymethodid = paymethodid;
	}
	public Date getAccepttime() {
		return accepttime;
	}
	public void setAccepttime(Date accepttime) {
		this.accepttime = accepttime;
	}
	public Date getFinishtime() {
		return finishtime;
	}
	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getOrderstatusid() {
		return orderstatusid;
	}
	public void setOrderstatusid(String orderstatusid) {
		this.orderstatusid = orderstatusid;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", userid=" + userid + ", serverid=" + serverid + ", itemid="
				+ itemid + ", createtime=" + createtime + ", expectstarttim=" + expectstarttim + ", expectendtime="
				+ expectendtime + ", address=" + address + ", paymethodid=" + paymethodid + ", accepttime=" + accepttime
				+ ", finishtime=" + finishtime + ", remark=" + remark + ", quantity=" + quantity + ", orderstatusid="
				+ orderstatusid + ", cost=" + cost + "]";
	}

	
}
