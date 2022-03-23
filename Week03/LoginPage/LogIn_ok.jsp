<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인 확인 페이지</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	로그인 정보 입니다.<br/>
	<% 
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("root") && pwd.equals("admin")) {
			response.sendRedirect("Adm.jsp");
		}
		else {
			response.sendRedirect("User.jsp");
		}
		
		// out.print("아이디 = " + id + "<br/>");
		// out.print("비밀번호 = " + pwd + "<br/>");
	%>
	<a href = "LogIn01.jsp">로그인 페이지 이동</a>
	<hr>
</body>
</html>
