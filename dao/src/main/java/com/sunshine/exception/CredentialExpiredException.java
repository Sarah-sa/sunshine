package com.sunshine.exception;

/**
 * 凭证过期异常：坐席管理人员已离职
 * @author 云和数据-王辉
 *
 */
public class CredentialExpiredException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2863373832199033494L;

	public CredentialExpiredException() {
		super();
	}

	public CredentialExpiredException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CredentialExpiredException(String message, Throwable cause) {
		super(message, cause);
	}

	public CredentialExpiredException(String message) {
		super(message);
	}

	public CredentialExpiredException(Throwable cause) {
		super(cause);
	}
	
}
