<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<%
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content"); 
	String filename01 = request.getParameter("filename01"); 
	String result = request.getParameter("result");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 확인 페이지</title>
<style>
	table, tr, td{
		background:#C4E7D6; 
		border:1px solid green;
		font:bold 1.0em Arial;  
	}
	table caption {
		background:#66C19C;
		border:2px solid green;
		font:bold 1.1em Arial;
		color:white;
	}
	button {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 2.0em Arial; 
	}
</style>
</head>
<body>
<%
	String str = request.getParameter("result");
	if(result.equals("success")) { %>
	<script>
		alert("성공적으로 파일이 저장되었습니다."); 
	</script> <!-- alert를 사용하여 팝업창으로 성공 여부 알림 -->
<%	} else {  %>
	<script>
		alert("파일 저장 실패했습니다.");
		location.href="bbsBoard_01.jsp";
	</script>
<%	}  %>

<br/>
	<h2> 업로드 정보 확인 </h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="5">
		<caption> 파일저장 <%=str %> </caption>
		<tr>
			<td>작성자</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=subject %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=content %></td>
		</tr>
		<tr>
			<td>업로드 파일</td>
			<td><a href = "./upload/<%=filename01%>"><img src="./upload/<%=filename01%>"></a></td>
		</tr>
	</table>
	<br/>
	<hr>
	<button onclick="location.href='bbsBoard_01.jsp'">처음으로</button>
</body>
</html>
