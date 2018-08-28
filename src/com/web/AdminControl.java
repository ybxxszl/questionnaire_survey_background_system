package com.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.AdminBiz;
import com.vo.Admin;

@Controller
public class AdminControl {
	
	@Autowired
	private AdminBiz adminBiz;
	
	/**
	 * 管理员登录
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param admin
	 * @return
	 */
	@RequestMapping(value = "/loginAdmin")
	@ResponseBody
	public String loginUser(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, Admin admin) {
		
		System.out.println("迟来的web:loginAdmin请求。。。");
		
		String msg = "";
		
		Admin a = adminBiz.loginAdmin(admin);
		
		if(a == null) {
			
			msg = "账号或密码错误，管理员登录失败";
			
			System.out.println(msg);
			
		} else {
			
			session.setAttribute("admin_session", a);//将a存入session
			
			System.out.println("Admin:" + a.toString());
			
			System.out.println("管理员登录成功");
			
		}
		
		if("".equals(msg)) {
			
			try {
				response.sendRedirect("index.jsp");//管理员登录成功
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IO异常");
				e.printStackTrace();
			}
			
		}
		
		return msg;//管理员登录失败
		
	}
	
	/**
	 * 管理员退出
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/exitAdmin")
	public String exitUser(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
		
		System.out.println("迟来的web:exitAdmin请求。。。");
		
		session.setAttribute("admin_session", null);//将session中admin存为null
		
		return "login.jsp";
		
	}
	
}
