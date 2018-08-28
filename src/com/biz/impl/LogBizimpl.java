package com.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.LogBiz;
import com.dao.UserLoginLogMapper;
import com.dao.UserLoginResultMapper;
import com.dao.UserOperateLogMapper;
import com.dao.UserOperateProjectMapper;
import com.vo.PageBean;
import com.vo.UserLoginLog;
import com.vo.UserLoginLogExample;
import com.vo.UserLoginResult;
import com.vo.UserLoginResultExample;
import com.vo.UserOperateLog;
import com.vo.UserOperateLogExample;
import com.vo.UserOperateProject;
import com.vo.UserOperateProjectExample;

@Service
public class LogBizimpl implements LogBiz {

	@Autowired
	private UserLoginLogMapper userLoginLogMapper;
	
	@Autowired
	private UserOperateLogMapper userOperateLogMapper;
	
	@Autowired
	private UserLoginResultMapper userLoginResultMapper;
	
	@Autowired
	private UserOperateProjectMapper userOperateProjectMapper;
	
	@Override
	public PageBean getUserLoginLogPageBean(int page) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserLoginLogPageBean请求。。。");
		
		int totalItem = userLoginLogMapper.countByExample(new UserLoginLogExample());//获取总条数
		
		PageBean pageBean = new PageBean();//保存PageBean
		
		pageBean.setPage(page);
		pageBean.setTotalItem(totalItem);
		pageBean.setTotalPage();
		
		return pageBean;
	}

	@Override
	public List<UserLoginLog> getUserLoginLogList(PageBean pageBean) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserLoginLogList请求。。。");
		
		int start = (pageBean.getPage() - 1) * pageBean.getItem();//内容开始
		int end = pageBean.getTotalItem() < pageBean.getPage() * pageBean.getItem() ? pageBean.getTotalItem() : pageBean.getPage() * pageBean.getItem();//内容结束
		
		System.out.println("内容开始:" + start + "    " + "内容结束:" + end);
		
		List<UserLoginLog> list = userLoginLogMapper.selectOrderByuserLoginTime();//获取全部内容
		
		List<UserLoginLog> l = new ArrayList<UserLoginLog>();
		for (int i = start; i < end; i++) {
			l.add(list.get(i));//获取每页显示内容
		}
		
		return l;
	}

	@Override
	public PageBean getUserOperateLogPageBean(int page) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserOperateLogPageBean请求。。。");
		
		int totalItem = userOperateLogMapper.countByExample(new UserOperateLogExample());//获取总条数
		
		PageBean pageBean = new PageBean();//保存PageBean
		
		pageBean.setPage(page);
		pageBean.setTotalItem(totalItem);
		pageBean.setTotalPage();
		
		return pageBean;
	}

	@Override
	public List<UserOperateLog> getUserOperateLogList(PageBean pageBean) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserOperateLogList请求。。。");
		
		int start = (pageBean.getPage() - 1) * pageBean.getItem();//内容开始
		int end = pageBean.getTotalItem() < pageBean.getPage() * pageBean.getItem() ? pageBean.getTotalItem() : pageBean.getPage() * pageBean.getItem();//内容结束
		
		System.out.println("内容开始:" + start + "    " + "内容结束:" + end);
		
		List<UserOperateLog> list = userOperateLogMapper.selectOrderByUserOperateTime();//获取全部内容
		
		List<UserOperateLog> l = new ArrayList<UserOperateLog>();
		for (int i = start; i < end; i++) {
			l.add(list.get(i));//获取每页显示内容
		}
		
		return l;
	}

	@Override
	public List<UserLoginResult> getUserLoginResult() {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserLoginResult请求。。。");
		
		List<UserLoginResult> list = userLoginResultMapper.selectByExample(new UserLoginResultExample());
		
		return list;
	}

	@Override
	public List<UserOperateProject> getUserOperateProject() {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserOperateProject请求。。。");
		
		List<UserOperateProject> list = userOperateProjectMapper.selectByExample(new UserOperateProjectExample());
		
		return list;
	}

}
