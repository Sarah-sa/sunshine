package com.sunshine.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * 盐值加密工具类
 * 
 * @author 云和数据-王辉
 *
 */
public class EncryptUtil {

	private String algo;

	private int hashIterations;

	/**
	 * 加密方法
	 * 
	 * @param token
	 *            待加密字段
	 * @param salt
	 *            盐值
	 * @param algo
	 *            加密算法
	 * @param hashIterations
	 *            加密次数
	 * @return 加密后的字段
	 */
	@Deprecated
	public String encrypt(String token, String salt, String algo, int hashIterations) {
		ByteSource bs = ByteSource.Util.bytes(salt);
		return new SimpleHash(algo, token, bs, hashIterations).toString();
	}

	/**
	 * 加密方法，使用默认的加密次数
	 * 
	 * @param token
	 *            待加密字段
	 * @param salt
	 *            盐值
	 * @param algo
	 *            加密算法
	 * @return 加密后的字段
	 */
	@Deprecated
	public String encrypt(String token, String salt, String algo) {
		return encrypt(token, salt, algo, hashIterations);
	}

	/**
	 * 加密算法，使用默认的加密次数和默认的加密算法
	 * 
	 * @param token
	 *            待加密字段
	 * @param salt
	 *            盐值
	 * @return 加密后的字段
	 */
	public String encrypt(String token, String salt) {
		return encrypt(token, salt, algo);
	}

	public void setAlgo(String algo) {
		this.algo = algo;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

}
