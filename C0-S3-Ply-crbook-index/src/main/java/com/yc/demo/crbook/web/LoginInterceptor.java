package com.yc.demo.crbook.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (request.getSession().getAttribute("loginedUser") == null) {
			String host = request.getServerName();
			response.sendRedirect("http://" + host + "/login");
			return false;
		}
		return true;
	}

}
