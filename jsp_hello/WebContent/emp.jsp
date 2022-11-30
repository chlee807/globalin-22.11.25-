<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
	    String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    String uid = "scott";
	    String upw = "tiger";
	    String query = "select * from emp";
	    
	    out.print("<table><tr>");
	    out.print("<th>사원번호</th><th>이름</th><th>직종</th><th>매니저</th><th>입사일</th><th>연봉</th><th>상여금</th><th>부서번호</th>");
	    out.print("</tr>");
	    try {
	    	Class.forName(driver); // 객체생성
	    	connection = DriverManager.getConnection(url,uid,upw);
	    	statement = connection.createStatement();
	    	resultSet = statement.executeQuery(query);
	    	
	    	while (resultSet.next()) {
	    		int empno = resultSet.getInt("empno");
	    		String ename = resultSet.getString("ename");
	    		String job = resultSet.getString("job");
	    		int mgr = resultSet.getInt("mgr");
	    		String hiredate = resultSet.getString("hiredate");
	    		int sal = resultSet.getInt("sal");
	    		String comm = resultSet.getString("comm");
	    		String deptno = resultSet.getString("deptno");
	    		
	    		out.print("<tr><td>" + empno + "</td>" + 
	    				"<td>" + ename + "</td>" +
	    				"<td>" + job + "</td>" +
	    				"<td>" + mgr + "</td>" +
	    				"<td>" + hiredate + "</td>" +
	    				"<td>" + sal + "</td>" +
	    				"<td>" + comm + "</td>" +
	    				"<td>" + deptno + "</td></tr>");
	    	}
	    	out.print("</table>");
	    }catch(Exception e) {
	    	
	    }finally {
	    	try{
	            if(resultSet != null) resultSet.close();
	            if(statement != null) statement.close();
	            if(connection != null) connection.close();
	         } catch(Exception e){}
	    }
	%>
</body>
</html>