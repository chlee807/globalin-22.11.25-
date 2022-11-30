<%@page import="java.util.Enumeration"%>
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
	Enumeration enumeration = session.getAttributeNames();
	
	int i = 0;
	while(enumeration.hasMoreElements()) {
		i++;
		
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName).toString();
		
		out.println("sName : " + sName + "<br>");
		out.println("sValue : " + sValue + "<br>");
	}
%>
</body>
</html>