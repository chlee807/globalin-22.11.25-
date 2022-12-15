<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
	<title>list</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function (){
		
		$("#updateForm").submit(function(event) {
			//prevendDefault()는 href로 연결해 주지 않고 
			//단순히 click에 대한 처리를 하도록 해준다.
			event.preventDefault();
			
			let empno = $("#input_empno").val();
			let ename = $("#input_ename").val();
			let job = $("#input_job").val();
			let mgr = $("#input_mgr").val();
			let hiredate = $("#input_hiredate").val();
			let sal = $("#input_sal").val();
			let comm = $("#input_comm").val();
			let deptno = $("#input_deptno").val();

			let form={
					empno: empno,
					ename: ename,
					job: job,
					mgr: mgr,
					hiredate: hiredate,
					sal: sal,
					comm: comm,
					deptno: deptno
			};
			
			/*
			$.ajax({
				  type : `http method type`,
				  url : `url`,
				  data : `서버에 전송할 데이터`,
				  contentType : "전송할 데이터 타입",
				  //기본 값 : "application / x-www-form-urlencoded; charset = UTF-8"  
				  dataType : '서버로 부터 수신할 데이터 타입',
				  //아무것도 지정하지 않으면 jQuery는 응답의 MIME 유형을 기반으로 해석을 시도
				  error : `에러 발생시 수행할 함수`,
				  success : `성공시 수행할 함수`
				});
			*/
			console.log(JSON.stringify(form));
			
			$.ajax({
			    type : "PUT",
			    url : "/emps/" + empno,
			    cashe:false,
			    contentType:'application/json; charset=utf-8',
			    data: JSON.stringify(form), 
			    success: function (result) {       
			           console.log(result);
			           //location.href = "/list";
			           //$(location).attr('href', '/rest_board.html');
			           $(location).attr('href', '/emp_list');              
			    },
			    error: function (e) {
			        console.log(e);
			    }
			});
			
			
			
		});
	
	
	});
</script>
</head>
<body>
  <table width="700" cellpadding="0" cellspacing="0" border="1">
      <form action="modify" method="post">
         <input id="input_empno" type="hidden" name="empno" value="${content_view.empno}">
         <tr>
            <td> 사원번호 </td>
            <td> ${content_view.empno} </td>
         </tr>
         <tr>
            <td> 사원이름 </td>
            <td> ${content_view.ename} </td>
         </tr>
         
         <tr>
            <td> 직업 </td>
            <td> <input id="input_job" type="text" name="job" value="${content_view.job}"></td>
         </tr>
         <tr>
            <td> 관리자 </td>
            <td> <input id="input_mgr" type="text" name="mgr" value="${content_view.mgr}"></td>
         </tr>
        <tr>
            <td> 고용일 </td>
            <td> <input id="input_hiredate" type="text" name="hiredate" value="${content_view.hiredate}"></td>
         </tr>
         <tr>
            <td> 급여 </td>
            <td> <input id="input_sal" type="text" name="sal" value="${content_view.sal}"></td>
         </tr>
         <tr>
            <td> 커미션 </td>
            <td> <input id="input_comm" type="text" name="comm" value="${content_view.comm}"></td>
         </tr>
         <tr>
            <td> 부서번호 </td>
            <td> <input id="input_deptno" type="text" name="deptno" value="${content_view.deptno}"></td>
         </tr>
         <tr >
            &nbsp;&nbsp; <a href="emp_list">목록보기</a> 
         </tr>
      </form>
   </table>

</body>
</html>