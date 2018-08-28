package com.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.AdminBiz;
import com.dao.AdminMapper;
import com.vo.Admin;
import com.vo.AdminExample;
import com.vo.AdminExample.Criteria;

@Service
public class AdminBizimpl implements AdminBiz {

	@Autowired
	private AdminMapper adminMapper;
	
	/**
	 * 管理员登录
	 */
	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:loginAdmin请求。。。");
		
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(admin.getAccount());
		criteria.andPasswordEqualTo(admin.getPassword());//查看数据库中是否有账号和密码完全相同的用户，并返回
		
		List<Admin> list = adminMapper.selectByExample(example);
		
		if(list.size()  == 0) {
			return null;
		} else {
			return list.get(0);
		}
		
	}

}
