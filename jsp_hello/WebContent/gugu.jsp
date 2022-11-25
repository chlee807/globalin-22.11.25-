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
	<table>
	<%
		for (int i = 0; i <= 9; i++) {
			out.println("<tr>");
			for (int j = 2; j <= 9; j++) {
				if (i == 0)
					out.print("<th>" + j + "행" + "</th>");
				else
					out.print("<td>"+ j + " * " + i + " = " + (i*j)+"</td>");
			}
			
			out.print("<tr>");
		}
	%>
	</table>
</body>
</html>