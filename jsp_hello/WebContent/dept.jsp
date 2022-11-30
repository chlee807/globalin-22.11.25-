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
	    String query = "select * from dept";
	    
	    try {
	    	Class.forName(driver); // 객체생성
	    	connection = DriverManager.getConnection(url,uid,upw);
	    	statement = connection.createStatement();
	    	resultSet = statement.executeQuery(query);
	    	
	    	while (resultSet.next()) {
	    		String loc = resultSet.getString("loc");
	    		String deptno = resultSet.getString("deptno");
	    		String dname = resultSet.getString("dname");
	    		
	    		out.print("부서번호: " + deptno + "위치: " + loc + "부서이름: " + dname + "<br>");
	    	}
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