package com.sunshine.exception;

/**
 * 目录树缺少根节点的异常类
 * 
 * @author 云和数据-王辉
 *
 */
public class NoRootModuleException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8832665101044569680L;

	public NoRootModuleException() {
		super();
	}

	public NoRootModuleException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public NoRootModuleException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public NoRootModuleException(String arg0) {
		super(arg0);
	}

	public NoRootModuleException(Throwable arg0) {
		super(arg0);
	}

}
