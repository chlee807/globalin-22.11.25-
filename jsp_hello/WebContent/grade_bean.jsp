<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="grade" class="edu.global.ex.Grade"/>
	<jsp:setProperty property="kor" name="grade" param="kor"/>
	<jsp:setProperty property="eng" name="grade" param="eng"/>
	<jsp:setProperty property="math" name="grade" param="math"/>
	총점:<jsp:getProperty property="total" name="grade"/><br>
	평균:<jsp:getProperty property="average" name="grade"/><br>
	등급:<jsp:getProperty property="grade" name="grade"/><br>
</body>
</html>