package com.sunshine.controlleradvice;

import javax.security.sasl.AuthenticationException;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.sunshine.message.Result;

/**
 * 全局异常处理类
 * @author 云和数据-王辉
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * 捕捉未进行身份验证的异常
	 * @return
	 */
	@ExceptionHandler(UnauthenticatedException.class)
	public ModelAndView handleUnAuthc() {
		//TODO url 赋值为 登陆页面地址
		String url = "";
		Result<Object> rs = new Result<>();
		rs.setRsCode(Result.RsCode.NotAuthenticated);
		rs.setReason("尚未登陆");
		ModelAndView mv = new ModelAndView(url, "result", rs);
		return mv;
	}
	
	@ExceptionHandler(AuthenticationException.class)
	public Result<String> handleLoginErr() {
		Result<String> rs = new Result<>();
		rs.setRsCode(Result.RsCode.LoginFailed);
		rs.setReason("用户名或密码错误");
		return rs;
	}
	
	@ExceptionHandler(AuthorizationException.class)
	public Result<String> handleNoPermission() {
		Result<String> rs = new Result<>();
		rs.setRsCode(Result.RsCode.NoPermission);
		rs.setData("您没有这个权限");
		return rs;
	}
}
