<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	null : ${null}<br>
	boolean : ${true}<br>
	문자열 : ${"test"}<br>
	문자열 : ${'test'}<br>
	정수 : ${20}<br>
	실수 : ${202.4}<br>
	
	연산 실행
	${10+20}<br>
	${10-20}<br>
	${10*20}<br>
	${10/20}<br>
	${10%20}<br>
	${10 mod 20}<br>
	
	${true && true}<br>
	
	${10 == 11}<br>
	${10 eq 11}<br>
	
	${10 != 11}<br>
	${10 ne 11}<br>
	
	${10 < 11}<br>
	${10 lt 11}<br>
	${10 >= 11}<br>
	${10 ge 11}<br>
	${10 > 20 ? "크다":"작다"}
</body>
</html>