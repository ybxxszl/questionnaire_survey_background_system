<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示模板</title>
</head>
<script type="text/javascript" src="jq/jquery.js"></script>
<body>
	<%
		int m = 1;
		int n;
	%>
	<%@include file="head.jsp" %>
	<div>
		<hr style="height:2px;" />
		<div>
			<h4 style="text-align: center;">${dictTempletName }</h4>
		</div>
		<br />
		<div>
			<table width="600px" align="center">
				<c:forEach var="dictSingle" items="${dictSingleList }">
					<%
						n = 65;
					%>
					<tr>
						<td>
							<%=m++ %>、${dictSingle.dictSingleContent }
						</td>
					</tr>
					<c:forEach var="dictSingleOption" items="${dictSingleOptionList }">
						<c:if test="${dictSingle.dictSingleId == dictSingleOption.dictSingleId }">
							<tr style="font-size: 12px;">
								<td>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=(char)n++ %>.${dictSingleOption.dictSingleOptionContent }
								</td>
							</tr>
						</c:if>
					</c:forEach>
				</c:forEach>
				<c:forEach var="dictCheckbox" items="${dictCheckboxList }">
					<%
						n = 65;
					%>
					<tr>
						<td>
							<%=m++ %>、${dictCheckbox.dictCheckboxContent }
						</td>
					</tr>
					<c:forEach var="dictCheckboxOption" items="${dictCheckboxOptionList }">
						<c:if test="${dictCheckbox.dictCheckboxId == dictCheckboxOption.dictCheckboxId }">
							<tr style="font-size: 12px;">
								<td>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=(char)n++ %>.${dictCheckboxOption.dictCheckboxOptionContent }
								</td>
							</tr>
						</c:if>
					</c:forEach>
				</c:forEach>
				<c:forEach var="dictText" items="${dictTextList }">
					<tr>
						<td>
							<%=m++ %>、${dictText.dictTextContent }
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>