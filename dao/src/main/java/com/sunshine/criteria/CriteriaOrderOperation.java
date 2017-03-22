package com.sunshine.criteria;

import java.util.Date;

import com.sunshine.model.OrderOperation;

public class CriteriaOrderOperation {
	private String staffId;
	private OrderOperation.OperaType operatetype;
	private Date startDate;
	private Date endDate;
	
	public String getStaffId() {
		return staffId == null ? "" : staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getOperatetype() {
		return operatetype == null ? "" : operatetype.toString();
	}
	public void setOperatetype(OrderOperation.OperaType operatetype) {
		this.operatetype = operatetype;
	}
	
	/**
	 * 获取最早操作时间<br>
	 * 该方法不推荐直接使用，而应该使用{@link CriteriaOrderOperation#getOperationTimeQueryString()}
	 * @return
	 */
	@Deprecated
	public Date getsDate() {
		return startDate;
	}
	public void setsDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取最晚操作时间<br>
	 * 该方法不推荐直接使用，而是使用{@link CriteriaOrderOperation#getOperationTimeQueryString()}
	 * @return
	 */
	@Deprecated
	public Date geteDate() {
		return endDate;
	}
	public void seteDate(Date eDate) {
		this.endDate = eDate;
	}
	
	/**
	 * 获取操作时间区间的查询字符串
	 * 在mybatis中建议直接使用该方法，使用方式为 ${operationTimeQueryString}
	 * @return
	 */
	public String getOperationTimeQueryString() {
		int start = startDate == null ? 0 : 1;
		int end = endDate == null ? 0 : 1;
		String queryString = null;
		switch(start + end * 2){
		case 0:
			queryString = "true";
			break;
		case 1:
			queryString = "operate_time >= #{sDate}";
			break;
		case 2:
			queryString = "operate_time <= #{eDate}";
			break;
		case 3:
			queryString = "operate_time BETWEEN #{sDate} AND #{eDate}";
			break;
		}
		
		return queryString;
	}
}
