<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<script type="text/javascript" src="jq/jquery.js"></script>
<body>
	<%@include file="head.jsp" %>
	<form action="${pageContext.request.contextPath }/loginAdmin.action" method="post">
		<table border="2px" align="center">
			<tr>
				<th colspan="3">
					<div id="title" align="center">管理员登录</div>
				</th>
			</tr>
			<tr>
				<td>
					<div class="prompt">管理员账号</div>
				</td>
				<td colspan="2">
					<div id="account">
						<input type="text" name="account" id="input_account" placeholder="请输入您的管理员账号">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="prompt">管理员密码</div>
				</td>
				<td colspan="2">
					<div id="password">
						<input type="password" name="password" id="input_password" placeholder="请输入您的管理员密码">
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<div id="submit" align="center">
						<input type="submit" value="登录" id="login">
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>