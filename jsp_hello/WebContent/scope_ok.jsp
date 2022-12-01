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
		String app_value = (String)application.getAttribute("application_name");
		String session_value = (String)session.getAttribute("session_name");
		String request_value = (String)request.getAttribute("request_name");
		String page_value = (String)pageContext.getAttribute("page_name");
		
		out.print(app_value + "<br>");
		out.print(session_value + "<br>");
		out.print(request_value + "<br>");
		out.print(page_value + "<br>");
	%>

	applicationScope : ${ applicationScope.application_name }<br />
	sessionScope : ${ sessionScope.session_name }<br />
	requestScope : ${ requestScope.request_name }<br />
	pageScope : ${ pageScope.page_name }<br />
</body>
</html>