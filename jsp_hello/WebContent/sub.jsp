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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String str = request.getParameter("age");
		int age = Integer.valueOf(str);
	%>
	<%= age %>살 입니다.<br>
	id : <%=id %><br>
	pw : <%=pw %><br>
	<h5>sub.jsp 페이지 입니다.</h5>
</body>
</html>