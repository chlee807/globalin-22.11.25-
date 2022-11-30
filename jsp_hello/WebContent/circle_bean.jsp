<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <jsp:useBean id="circle" class="edu.global.ex.Circle"/>
   <jsp:setProperty property="radius" name="circle" param="radius"/>
   넓이 : <jsp:getProperty property="area" name="circle"/>	<!-- get함수 가져옴. area -> Area -->
	
</body>
</html>