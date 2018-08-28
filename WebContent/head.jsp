<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
	.personal{
		position: absolute;
		right: 100px;
		font-family: 楷体;
		font-size: 18px;
	}
</style>
<body>
	<table>
		<tr>
			<td>
				<h1>
					<a href="${pageContext.request.contextPath }/index.jsp">后台系统</a>
				</h1>
			</td>
			<td id="personal">
				<div class="personal">
					<c:if test="${admin_session != null }">
						<span id="admin">${admin_session.name }</span>
						<a href="${pageContext.request.contextPath }/exitAdmin.action">退出</a>
					</c:if>
					<c:if test="${admin_session == null }">
						请<a href="${pageContext.request.contextPath }/login.jsp">登录</a>
					</c:if>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>