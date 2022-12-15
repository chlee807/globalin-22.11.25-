<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- C태그 쓰기 위해 넣은 taglib므로 반드시 확인 --> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<c:forEach var="emp" items="${emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<%-- <td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td>${emp.sal}</td>
				<td>${emp.comm}</td>
				<td>${emp.deptno}</td> --%>
			</tr>
		</c:forEach>
	</table>
	 <c:if test="${pageMaker.prev}">
	         <a href="emp_list${pageMaker.makeQuery(pageMaker.startPage - 1) }">«</a>
	      </c:if>
	
	      <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
	         <c:out value="${pageMaker.cri.pageNum == idx?'':''}" />
	         <a href="emp_list${pageMaker.makeQuery(idx)}">${idx}</a>
	      </c:forEach>
	      
	      <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
	         <a href="emp_list${pageMaker.makeQuery(pageMaker.endPage +1) }"> » </a>
	      </c:if> <br>
</body>
</html>