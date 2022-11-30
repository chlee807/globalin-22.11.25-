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
	table { border: 1px solid black; text-align: center; margin: 30px auto; }
	th { border: 1px solid black;}
	td { border: 1px solid black;}
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
	    String query = "SELECT * FROM DEPT";
	    
	    out.print("<table><tr>");
		out.print("<th>부서번호</th><th>부서명</th><th>위치</th>");
		out.print("</tr>");
		
	    try {
	    	Class.forName(driver); // 객체생성
	    	connection = DriverManager.getConnection(url,uid,upw);
	    	statement = connection.createStatement();
	    	resultSet = statement.executeQuery(query);
	    	
	    	while (resultSet.next()) {
	    		String deptno = resultSet.getString("deptno");
	    		String dname = resultSet.getString("dname");
	    		String loc = resultSet.getString("loc");
	    		
	    		out.print("<tr><td>" + deptno + "</td>"
						+ "<td>" + dname + "</td>"
						+ "<td>" + loc + "</td>"
						+ "</tr>");
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