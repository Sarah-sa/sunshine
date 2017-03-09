package com.sunshine.model;

import java.util.List;

/**
 * 通用的分页模型
 * 
 * @author ZSL
 *
 */
public class Page {
	/**
	 * 每页大小
	 */
	private int pageSize;
	/**
	 * 当前页码
	 */
	private int curPageNum;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 记录总数
	 */
	private int totalNum;
	/**
	 * 当前页记录列表
	 */
	private List<Object> result;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getCurPageNum() {
		return curPageNum;
	}

	public void setCurPageNum(int curPageNum) {
		this.curPageNum = curPageNum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public List<Object> getResult() {
		return result;
	}

	public void setResult(List<Object> result) {
		this.result = result;
	}


}
