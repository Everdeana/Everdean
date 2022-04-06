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
	String str = request.getParameter("result");
	if(str.equals("success")) {
		out.println("성공적으로 파일이 저장되었습니다.");
	}
	else {
		out.println("파일 저장 실패했습니다.");
	}
%>
<br/>
파일저장 <%=str %> 입니다.
</body>
</html>
