<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main.jsp 페이지 입니다.</h1>
	<!-- url1 내부의 정보를 url2에 전달시켜야한다면 foward방식을 사용해야한다. 정보를 감추고싶다면 redirect 방식을 사용해야한다 -->
	<jsp:forward page="sub.jsp?age=20">
		<jsp:param value="abcd" name="id"/>
		<jsp:param value="1234" name="pw"/>
	</jsp:forward> 
</body>
</html>