package com.biz;

import java.util.List;

import com.vo.PageBean;
import com.vo.UserLoginLog;
import com.vo.UserLoginResult;
import com.vo.UserOperateLog;
import com.vo.UserOperateProject;

public interface LogBiz {

	PageBean getUserLoginLogPageBean(int page);

	List<UserLoginLog> getUserLoginLogList(PageBean pageBean);

	PageBean getUserOperateLogPageBean(int page);

	List<UserOperateLog> getUserOperateLogList(PageBean pageBean);

	List<UserLoginResult> getUserLoginResult();

	List<UserOperateProject> getUserOperateProject();

}
