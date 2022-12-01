<%@page import="edu.global.ex.dao.DeptDAO"%>
<%@page import="java.util.List"%>
<%@page import="edu.global.ex.dto.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table { border: 1px solid black; text-align: center; margin: 30px auto; }
	th { border: 1px solid black;}
	td { border: 1px solid black;}
</style>
</head>
<body>
	<%
	DeptDAO deptDAO = new DeptDAO();
	List<DeptDTO> depts = deptDAO.deptList();
	
	out.print("<table><tr>");
	out.print("<th>부서번호</th><th>부서명</th><th>위치</th>");
	out.print("</tr>");
	
	for(DeptDTO dept: depts) {
		out.print("<tr><td>" + dept.getDeptno() + "</td>"
					+ "<td>" + dept.getDname() + "</td>"
					+ "<td>" + dept.getLoc() + "</td>"
					+ "</tr>");
	}
	out.print("</table>");
	%>
</body>
</html>