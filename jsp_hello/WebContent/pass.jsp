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
	String str = request.getParameter("age");
	int age = Integer.valueOf(str);
	out.print("나이가 어른 입니다.::" + age + "<br>");
	%>
	성인 입니다. 주류구매가 가능합니다.
	<a href="requestex.html">처음으로 이동</a>
</body>
</html>