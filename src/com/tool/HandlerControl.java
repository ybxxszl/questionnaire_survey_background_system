package com.tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerControl implements HandlerInterceptor {

	/**
	 * Controller已执行，视图已返回
	 * 记录日志
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * Controller已执行，视图未返回
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView mv) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Controller未执行，视图未返回
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		// TODO Auto-generated method stub
		
		return false;
	}

}
