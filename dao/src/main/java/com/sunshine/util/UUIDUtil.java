package com.sunshine.util;

import java.util.UUID;

/**
 * 工具类，获取UUID
 * 
 * @version 0.0.1
 * @author 云和数据-王辉
 *
 */
public final class UUIDUtil {

	/**
	 * 静态方法，生成一个 UUID,可用作主键
	 * 
	 * @return
	 */
	public static String genericUUID() {
		return UUID.randomUUID().toString();
	}
	
}
