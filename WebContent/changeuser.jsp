<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>激活或冻结用户</title>
</head>
<script type="text/javascript" src="jq/jquery.js"></script>
<style type="text/css">
	#table{
		height: 5%;
		width: 100%;
	}
	img{
		height: 50px;
		width: 60px;
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
				<td>账号</td>
				<td>密码</td>
				<td>姓名</td>
				<td>性别</td>
				<td>出生日期</td>
				<td>电话号码</td>
				<td>电子邮件</td>
				<td>状态</td>
			</tr>
			<c:forEach var="user" items="${list }">
				<tr class="option">
					<td>${user.userId }</td>
					<td>
						<div class="account">${user.account }</div>
					</td>
					<td>
						<div class="password">${user.password }</div>
					</td>
					<td>
						<div class="name">${user.name }</div>
					</td>
					<td>
						<div class="sex">${user.sex }</div>
					</td>
					<td>
						<div class="birthday">${user.birthday }</div>
					</td>
					<td>
						<div class="phone">${user.phone }</div>
					</td>
					<td>
						<div class="email">${user.email }</div>
					</td>
					<td>
						<div class="state">
							<a href="#" onclick="changeState('${user.userId }', this)">
								<c:if test="${user.state == 0 }">已冻结，点击激活</c:if>
								<c:if test="${user.state == 1 }">已激活，点击冻结</c:if>
							</a>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div id="paging">
		<c:if test="${PageBean.page != 1 }">
			<a href="${pageContext.request.contextPath }/changeUser.action?page=1">首页</a>
			<a href="${pageContext.request.contextPath }/changeUser.action?page=${PageBean.page - 1 }">上一页</a>
		</c:if>
		<c:forEach var="i" begin="1" end="${PageBean.totalPage }">
			<c:if test="${PageBean.page == i }">
				<font color="red" size="+2">${i }</font>
			</c:if>
			<c:if test="${PageBean.page != i }">
				<font color="blue" size="+1"><a href="${pageContext.request.contextPath }/changeUser.action?page=${i }">${i }</a></font>
			</c:if>
		</c:forEach>
		<c:if test="${PageBean.page != PageBean.totalPage }">
			<a href="${pageContext.request.contextPath }/changeUser.action?page=${PageBean.page + 1 }">下一页</a>
			<a href="${pageContext.request.contextPath }/changeUser.action?page=${PageBean.totalPage }">尾页</a>
		</c:if>
	</div>
</body>
</html>
<script type="text/javascript">
	/* 改变用户状态 */
	function changeState(userId, parameter) {
		var state = $(parameter).text().trim();
		$.ajax({
			url: "${pageContext.request.contextPath }/changeState.action",
			data: {userId: userId},
			error: function(){
				alert("又出错了");
			},
			success: function(){
				if(state == "已冻结，点击激活") {
					$(parameter).text("已激活，点击冻结");
				}
				if(state == "已激活，点击冻结") {
					$(parameter).text("已冻结，点击激活");
				}
			}
		});
	}
</script>