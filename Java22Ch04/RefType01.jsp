<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2차원 배열을 이용한 학생 성적관리 프로그램</title>
</head>
<body>
<h2> 학생 성적관리 프로그램 </h2>
<%
	int jumsu[][] = {{89, 90, 88}, {80, 79, 89}};
	int total[] = new int[2];
	total[0] = jumsu[0][0] + jumsu[0][1] + jumsu[0][2];
	total[1] = jumsu[1][0] + jumsu[1][1] + jumsu[1][2];
%>
1번 학생의 프로그램 언어 성적 = <%=jumsu[0][0] %> <br/>
1번 학생의 영어 성적 = <%=jumsu[0][1] %> <br/>
1번 학생의 국어 성적 = <%=jumsu[0][2] %> <br/>
1번 학생의 총점 = <%=total[0] %> <br/>

</body>
</html>