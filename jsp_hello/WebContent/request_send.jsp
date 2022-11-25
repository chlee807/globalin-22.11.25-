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
	
	if( age >= 20){ // Redirect 함수는 Foward와 달리, 클라이언트에게 재접속을 요구한다.
		response.sendRedirect("pass.jsp?age=" + age);
	} else{
		response.sendRedirect("ng.jsp?age=" + age);
	}
%>
</body>
</html>