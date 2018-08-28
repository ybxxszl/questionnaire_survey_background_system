<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示模板列表</title>
</head>
<script type="text/javascript" src="jq/jquery.js"></script>
<style type="text/css">
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
		text-align: center;
	}
</style>
<body>
	<%@include file="head.jsp" %>
	<div>
		<div>
			<table border="3px" align="center">
				<tr>
					<c:forEach var="sort" items="${SortList }">
						<th style="width: 200px;"><a href="${pageContext.request.contextPath }/showTempletList.action?sortId=${sort.sortId }&page=1&action=modify">${sort.sortName }</a></th>
					</c:forEach>
				</tr>
			</table>
		</div>
		<hr style="height:1px;" />
		<div>
			<table border="2px" align="center">
				<tr class="head">
					<td style="width: 600px;">唯一标识符</td>
					<td style="width: 600px;">模板名称</td>
					<td style="width: 150px;">查看</td>
					<td style="width: 150px;">修改</td>
				</tr>
				<c:forEach var="dictTemplet" items="${DictTempletList }">
					<tr class="option">
						<td>${dictTemplet.dictTempletId }</td>
						<td>${dictTemplet.dictTempletName }</td>
						<td><a href="${pageContext.request.contextPath }/showTemplet.action?dictTempletId=${dictTemplet.dictTempletId }">查看</a></td>
						<td><a href="${pageContext.request.contextPath }/modifyTemplet.action?dictTempletId=${dictTemplet.dictTempletId }">修改</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div id="paging">
		<c:if test="${PageBean.page != 1 }">
			<a href="${pageContext.request.contextPath }/showTempletList.action?sortId=${SortId }&page=1&action=modify">首页</a>
			<a href="${pageContext.request.contextPath }/showTempletList.action?sortId=${SortId }&page=${PageBean.page - 1 }&action=modify">上一页</a>
		</c:if>
		<c:forEach var="i" begin="1" end="${PageBean.totalPage }">
			<c:if test="${PageBean.page == i }">
				<font color="red" size="+2">${i }</font>
			</c:if>
			<c:if test="${PageBean.page != i }">
				<font color="blue" size="+1"><a href="${pageContext.request.contextPath }/showTempletList.action?sortId=${SortId }&page=${i }&action=modify">${i }</a></font>
			</c:if>
		</c:forEach>
		<c:if test="${PageBean.page != PageBean.totalPage }">
			<a href="${pageContext.request.contextPath }/showTempletList.action?sortId=${SortId }&page=${PageBean.page + 1 }&action=modify">下一页</a>
			<a href="${pageContext.request.contextPath }/showTempletList.action?sortId=${SortId }&page=${PageBean.totalPage }&action=modify">尾页</a>
		</c:if>
	</div>
</body>
</html>