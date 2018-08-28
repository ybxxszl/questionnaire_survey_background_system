package com.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.LogBiz;
import com.vo.PageBean;
import com.vo.UserLoginLog;
import com.vo.UserLoginResult;
import com.vo.UserOperateLog;
import com.vo.UserOperateProject;

@Controller
public class LogControl {
	
	@Autowired
	private LogBiz logBiz;
	
	@RequestMapping(value = "/lookUserLoginLog")
	public String lookUserLoginLog(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, int page) {
		
		System.out.println("迟来的web:lookUserLoginLog请求。。。");
		
		PageBean pageBean = logBiz.getUserLoginLogPageBean(page);//获取PageBean
		
		System.out.println("PageBean:" + pageBean.toString());
		
		List<UserLoginLog> list = logBiz.getUserLoginLogList(pageBean);//获取内容UserLoginLogList
		
		System.out.println("UserLoginLogList:");
		for (UserLoginLog u : list) {
			System.out.println(u.toString());
		}
		
		session.setAttribute("PageBean", pageBean);
		session.setAttribute("list", list);
		
		List<UserLoginResult> result = logBiz.getUserLoginResult();//获取结果表
		session.setAttribute("result", result);
		
		return "lookloginlog.jsp";
		
	}
	
	@RequestMapping(value = "/lookUserOperateLog")
	public String lookUserOperateLog(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, int page) {
		
		System.out.println("迟来的web:lookUserLoginLog请求。。。");
		
		PageBean pageBean = logBiz.getUserOperateLogPageBean(page);//获取PageBean
		
		System.out.println("PageBean:" + pageBean.toString());
		
		List<UserOperateLog> list = logBiz.getUserOperateLogList(pageBean);//获取内容UserOperateLogList
		
		System.out.println("UserOperateLogList:");
		for (UserOperateLog u : list) {
			System.out.println(u.toString());
		}
		
		session.setAttribute("PageBean", pageBean);
		session.setAttribute("list", list);
		
		List<UserOperateProject> result = logBiz.getUserOperateProject();//获取结果表
		session.setAttribute("result", result);
		
		return "lookoperatelog.jsp";
		
	}

}
