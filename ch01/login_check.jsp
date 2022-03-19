<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인 페이지</title>
</head>
<body>
	로그인 정보 입니다.<br/>
	<% /* JSP 문의 주석문 처리 */
		String cust_id = request.getParameter("id"); /* 객체변수 */
		String cust_pwd = request.getParameter("pwd");
		
		out.print("아이디=" + cust_id + "<br/>");
		out.print("비밀번호=" + cust_pwd + "<br/>");
	%>
	<a href = "login_form.jsp">로그인 페이지 이동</a>
	<hr>
	요청 정보 프로토콜: <%=request.getProtocol() %> <br/>
	요청 정보 전송방식: <%=request.getMethod() %> <br/>
	요청 정보 콘텐츠 타입: <%=request.getContentType() %> <br/>
	요청 정보 인코딩: <%=request.getCharacterEncoding() %> <br/>
</body>
</html>
