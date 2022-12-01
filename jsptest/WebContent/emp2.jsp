<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="edu.global.ex.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="edu.global.ex.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{ border: 1px solid black; text-align: center; margin: 30px auto;}
	th{ border: 1px solid black;}
	td{ border: 1px solid black;}
</style>
</head>
<body>
	<%
		EmpDAO empDAO = new EmpDAO();
		List<EmpDTO> emps = empDAO.empList();
		int salSum = 0;
		
		session.setAttribute("emps", emps);
		session.setAttribute("salSum", salSum);
	%>
		<table><tr>
		<th>사원번호</th><th>이름</th><th>직종</th><th>매니저</th><th>입사일</th><th>연봉</th><th>상여금</th><th>부서번호</th>
		</tr>
		
		<c:forEach var="emp" items="${emps}">			
			<tr><td>${emp.empno}</td> 
    					<td>${emp.ename}</td>
    					<td>${emp.job}</td>
    					<td>${emp.mgr}</td>
    					<td>${emp.hiredate}</td>
    					<td>${emp.sal}</td>
    					<td>${emp.comm}</td>
    					<td>${emp.deptno}</td>
    					</tr>
				${salSum = salSum + emp.sal}
		</c:forEach>
		<tr><td colspan='8'> 연봉 합계: ${salSum}</td></tr>
		</table>
</body>
</html>