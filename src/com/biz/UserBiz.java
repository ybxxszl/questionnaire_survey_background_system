package com.biz;

import java.util.List;

import com.vo.PageBean;
import com.vo.User;

public interface UserBiz {

	PageBean getPageBean(int page);

	List<User> getUserList(PageBean pageBean);

	void changeState(String userId);

}
