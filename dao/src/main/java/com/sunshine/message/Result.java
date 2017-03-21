package com.sunshine.message;

public class Result<T> {
	
	/**
	 * 返回的数据
	 */
	private T data;
	
	/**
	 * 故障原因
	 */
	private String reason;
	
	/**
	 * 内置状态码
	 */
	private RsCode rsCode;
	
	public Result() { }
	
	public Result(RsCode rsCode) {
		this.rsCode = rsCode;
	}
	public Result(RsCode rsCode, T data) {
		this(rsCode);
		this.data = data;
	}
	public Result(RsCode rsCode, T data, String reason) {
		this(rsCode, data);
		this.reason = reason;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getCode() {
		return rsCode.getCode();
	}

	public String getStatus() {
		return rsCode.getStatus();
	}
	
	public void setRsCode(RsCode rsCode) {
		this.rsCode = rsCode;
	}

	public enum RsCode{
		Success(0, "Success"),
		Fail(1, "Fail"),
		IllegalArguement(2, "Illegal Arguement"),
		NotAuthenticated(4, "Not Authenticated");
		private int code;
		private String status;
		RsCode(int code, String status) {
			this.code = code;
			this.status = status;
		}
		public int getCode() {
			return code;
		}
		public String getStatus() {
			return status;
		}
	}
}
