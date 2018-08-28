package com.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.UserBiz;
import com.dao.UserMapper;
import com.vo.PageBean;
import com.vo.User;
import com.vo.UserExample;

@Service
public class UserBizimpl implements UserBiz {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 获取PageBean
	 */
	@Override
	public PageBean getPageBean(int page) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getPageBean请求。。。");
		
		int totalItem = userMapper.countByExample(new UserExample());//获取总条数
		
		PageBean pageBean = new PageBean();//保存PageBean
		
		pageBean.setPage(page);
		pageBean.setTotalItem(totalItem);
		pageBean.setTotalPage();
		
		return pageBean;
	}

	/**
	 * 获取内容UserList
	 */
	@Override
	public List<User> getUserList(PageBean pageBean) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getUserList请求。。。");
		
		int start = (pageBean.getPage() - 1) * pageBean.getItem();//内容开始
		int end = pageBean.getTotalItem() < pageBean.getPage() * pageBean.getItem() ? pageBean.getTotalItem() : pageBean.getPage() * pageBean.getItem();//内容结束
		
		System.out.println("内容开始:" + start + "    " + "内容结束:" + end);
		
		List<User> list = userMapper.selectByExample(new UserExample());//获取全部内容
		
		List<User> l = new ArrayList<User>();
		for (int i = start; i < end; i++) {
			l.add(list.get(i));//获取每页显示内容
		}
		
		return l;
	}

	/**
	 * 改变用户状态
	 */
	@Override
	public void changeState(String userId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:changeState请求。。。");
		
		User u = userMapper.selectByPrimaryKey(userId);
		
		if(u.getState() == 0) {
			u.setState(1);
		} else {
			u.setState(0);
		}
		
		userMapper.updateByPrimaryKey(u);
		
	}
	

}
