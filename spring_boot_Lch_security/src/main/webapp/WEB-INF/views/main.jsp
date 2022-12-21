<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>메인페이지</title>
</head>

<body>

<h1>메인페이지</h1>

<sec:authorize access="isAnonymous">
	<p>로그인이 필요합니다.</p>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
	<p>principal: <sec:authentication property="principal"/></p>
	<p>ID: <sec:authentication property="principal.username"/> 님 환영합니다</p>
	<%-- <p>PW: <sec:authentication property="principal.password"/> 비밀번호입니다</p> --%>
</sec:authorize>

<h3>
	[<a href="<c:url value="/add/addForm" />">회원가입</a>]
    [<a href="<c:url value="/user/userHome" />">유저 홈</a>]
</h3>

<sec:authorize access="hasRole('ADMIN')">
	[<a href="<c:url value="/member/memberHome" />">멤버 홈</a>]
    [<a href="<c:url value="/admin/adminHome" />">관리자 홈</a>]
</sec:authorize>

</body>
</html>