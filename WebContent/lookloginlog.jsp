<%@page import="com.vo.UserLoginResult"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看用户登录日志</title>
</head>
<script type="text/javascript" src="jq/jquery.js"></script>
<style type="text/css">
	#table{
		height: 5%;
		width: 100%;
	}
	.head{
		text-align: center;
		font-family: 宋体;
		font-weight: bold;
		font-size: 17px;
	}
	.option{
		text-align: center;
		font-size: 15px;
	}
	#paging{
		position: absolute;
		top: 40%;
		left: 45%;
		text-align: center;
	}
</style>
<body>
	<%@include file="head.jsp" %>
	<div id="content">
		<table border="3px" align="center">
			<tr class="head">
				<td>唯一标识符</td>
				<td>用户登录时间</td>
				<td>用户登录账号</td>
				<td>用户登录结果</td>
			</tr>
			<c:forEach var="userLoginLog" items="${list }">
				<tr class="option">
					<td>${userLoginLog.userLoginLogId }</td>
					<td>
						<div class="userLoginTime">${userLoginLog.userLoginTime }</div>
					</td>
					<td>
						<div class="userLoginAccount">${userLoginLog.userLoginAccount }</div>
					</td>
					<td>
						<div class="userLoginResultId">
							<c:forEach var="result" items="${result }" begin="${userLoginLog.userLoginResultId - 1 }" end="${userLoginLog.userLoginResultId - 1 }">
								${result.userLoginResultShow }
							</c:forEach>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div id="paging">
		<c:if test="${PageBean.page != 1 }">
			<a href="${pageContext.request.contextPath }/lookUserLoginLog.action?page=1">首页</a>
			<a href="${pageContext.request.contextPath }/lookUserLoginLog.action?page=${PageBean.page - 1 }">上一页</a>
		</c:if>
		<c:forEach var="i" begin="1" end="${PageBean.totalPage }">
			<c:if test="${PageBean.page == i }">
				<font color="red" size="+2">${i }</font>
			</c:if>
			<c:if test="${PageBean.page != i }">
				<font color="blue" size="+1"><a href="${pageContext.request.contextPath }/lookUserLoginLog.action?page=${i }">${i }</a></font>
			</c:if>
		</c:forEach>
		<c:if test="${PageBean.page != PageBean.totalPage }">
			<a href="${pageContext.request.contextPath }/lookUserLoginLog.action?page=${PageBean.page + 1 }">下一页</a>
			<a href="${pageContext.request.contextPath }/lookUserLoginLog.action?page=${PageBean.totalPage }">尾页</a>
		</c:if>
	</div>
</body>
</html>