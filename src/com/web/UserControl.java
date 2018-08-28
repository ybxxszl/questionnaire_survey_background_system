package com.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.biz.UserBiz;
import com.vo.PageBean;
import com.vo.User;

@Controller
public class UserControl {
	
	@Autowired
	private UserBiz userBiz;
	
	/**
	 * 加载激活或冻结用户页面
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/changeUser")
	public String changeUser(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, int page) {
		
		System.out.println("迟来的web:changeUser请求。。。");
		
		PageBean pageBean = userBiz.getPageBean(page);//获取PageBean
		
		System.out.println("PageBean:" + pageBean.toString());
		
		List<User> list = userBiz.getUserList(pageBean);//获取内容UserList
		
		System.out.println("UserList:");
		for (User u : list) {
			System.out.println(u.toString());
		}
		
		session.setAttribute("PageBean", pageBean);
		session.setAttribute("list", list);
		
		return "changeuser.jsp";
		
	}
	
	/**
	 * 改变用户状态
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param userI
	 */
	@RequestMapping(value = "/changeState")
	public void changeState(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, String userId) {
		
		System.out.println("迟来的web:changeState请求。。。");
		
		System.out.println("userId:" + userId);
		
		userBiz.changeState(userId);//改变用户状态
		
	}

}
