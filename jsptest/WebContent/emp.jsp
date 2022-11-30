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
		
		out.print("<table><tr>");
		out.print("<th>사원번호</th><th>이름</th><th>직종</th><th>매니저</th><th>입사일</th><th>연봉</th><th>상여금</th><th>부서번호</th>");
		out.print("</tr>");
		
		for(EmpDTO emp: emps) {			
			out.print("<tr><td>" + emp.getEmpno() + "</td>" 
    					+"<td>" + emp.getEname() + "</td>"
    					+"<td>" + emp.getJob() + "</td>"
    					+"<td>" + emp.getMgr() + "</td>"
    					+"<td>" + emp.getHiredate() + "</td>"
    					+"<td>" + emp.getSal() + "</td>"
    					+"<td>" + emp.getComm() + "</td>"
    					+"<td>" + emp.getDeptno() + "</td>"
    					+"</tr>");
			salSum += emp.getSal();
		}
		out.print("<tr><td colspan='8'> 연봉 합계: " + salSum + "</td></tr>");
		out.print("</table>");
		
	%>
</body>
</html>