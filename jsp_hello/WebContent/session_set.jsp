<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("id", "1234");
	session.setAttribute("pw", 1234);
%>
	<a href="session_get.jsp">session get</a>
</body>
</html>