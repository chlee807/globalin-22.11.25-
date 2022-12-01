<%@page import="edu.global.ex.dto.EmpDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:parseDate var="date1" value="2020-02-15" pattern="yyyy-mm-dd"/>
	<fmt:formatDate value="${date1}" pattern="mm/dd/yy"/><br>
	<%="Hello World" %><br>
	<% out.print("Hello World"); %><br>
	<c:out value="Hello World"/><br>
	<c:out value="${null}">JSTL</c:out><br>
	<c:out value="Hello ">World</c:out><br>
	
	<c:set var="name" value="홍길동"/>
	${name}<br>
	<%-- 아래 코드와 같은 역할 --%>
	<%
		EmpDTO emp1 = new EmpDTO();
		pageContext.setAttribute("name2", "홍길자");
		pageContext.setAttribute("emp", emp1);
		emp1.setEname("ename홍길동");
		
		String str = "홍길자";
		String str2 = new String("홍길룽");
	%>
	1번:${emp1}<br>
	2번:${str}<br>
	3번:${str2}<br>
	4번:${emp}<br>
	${name2}<br>
	${pageScope.name}<br>
	${pageScope.name2}<br>
	${emp.ename}<br>
	${emp.getEname()}<br>
	
	<c:if test="${10 > 20}" var="result">
	10은 10보다 크다
	</c:if>
	${result}<br>
	<c:if test="${ empty str }">
	트루
	</c:if><br>
	
	<c:set var="user" value="1234"/>
	<c:choose>
		<c:when test="${user=='1234333'}">
			관리자입니다.
		</c:when>
		<c:otherwise>
			${user}님 반갑습니다.
		</c:otherwise>
	</c:choose><br>
	
	<%
		//String numArr[] = new String[]{"1","2","3"}; 문법적으로 같은 의미를 가지지만, 페이지와 상호작용하지 못한다.
		pageContext.setAttribute("numList", new String[]{"1","2","3"});
	%>
	<c:forEach var="num" items="${numList}">
		${num}<br>
	</c:forEach>
	<c:if test="${ empty numList }">
	트루
	</c:if><br>
	
	<%-- <c:redirect url="https://www.naver.com">
	
	</c:redirect> --%>
</body>
</html>