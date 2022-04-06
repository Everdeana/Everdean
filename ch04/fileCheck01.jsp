<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	request.setCharacterEncoding("utf-8");	%>
<%
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String filename1 = request.getParameter("filename1");
	String filename2 = request.getParameter("filename2");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드 확인 페이지</title>
</head>
<body>
	<h2>업로드 정보 확인 내용입니다.</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<td>작성자</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=subject %></td>
		</tr>
		<tr>
			<td>업로드 파일명1</td>
			<td><a href = "./upload/<%=filename1%>"><img src="./upload/<%=filename1%>"></a></td>
		</tr>
		<tr>
			<td>업로드 파일명2</td>
			<td><a href="./upload/<%=filename2%>"><img src="./upload/<%=filename2%>"></a></td>
		</tr>
	</table>
	<br/>
	<hr>
	<a href="fileForm.jsp"> 파일 업로드 페이지로 이동 </a>
</body>
</html>
