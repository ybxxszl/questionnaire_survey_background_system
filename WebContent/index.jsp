<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<script type="text/javascript" src="jq/jquery.js"></script>
<style type="text/css">
	a{
		text-decoration: none;
	}
	#table{
		height: 5%;
		width: 100%;
	}
	.option{
		text-align: center;
		font-family: 宋体;
		font-weight: bold;
		font-size: 20px;
	}
	#ul_user{
		position: absolute;
		left: 10%;
	}
	#ul_templet{
		position: absolute;
		left: 44%;
	}
	#ul_log{
		position: absolute;
		right: 12%;
	}
	#menu{
		font-family: 宋体;
		font-weight: bold;
		font-size: 16px;
	}
	.a:hover{
		background-color: gray;
	}
</style>
<body>
	<%@include file="head.jsp" %>
	<table border="2px" align="center" id="table">
		<tr>
			<td id="about_user">
				<div class="option">
					<span id="user">用户</span>
				</div>
			</td>
			<td id="about_templet">
				<div class="option">
					<span id="templet">模板</span>
				</div>
			</td>
			<td id="about_log">
				<div class="option">
					<span id="log">日志</span>
				</div>
			</td>
		</tr>
	</table>
	<div id="menu">
		<ul id="ul_user">
			<li><a class="a" href="${pageContext.request.contextPath }/changeUser.action?page=1">激活或冻结用户</a></li>
		</ul>
		<ul id="ul_templet">
			<li><a class="a" href="${pageContext.request.contextPath }/getSortList.action">添加问卷模板</a></li>
			<li><a class="a" href="${pageContext.request.contextPath }/showTempletList.action?sortId=1&page=1&action=modify">修改问卷模板</a></li>
			<li><a class="a" href="${pageContext.request.contextPath }/showTempletList.action?sortId=1&page=1&action=delete">删除问卷模板</a></li>
		</ul>
		<ul id="ul_log">
			<li><a class="a" href="${pageContext.request.contextPath }/lookUserLoginLog.action?page=1">查看用户登录日志</a></li>
			<li><a class="a" href="${pageContext.request.contextPath }/lookUserOperateLog.action?page=1">查看用户操作日志</a></li>
		</ul>
	</div>
</body>
</html>
<script type="text/javascript">
	/* jquery判断admin_session是否存在，即判断是否已登录，未登录时admin_session为null，是一个4位的字符串，所以判断长度为4时为未登录状态，不能进行后台操作 */
	$(".a").click(function() {
		var admin_session = "<%=session.getAttribute("admin_session") %>";
		if(admin_session.length == 4) {
			alert("请登录");
			return false;
		}
	});
</script>
