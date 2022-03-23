<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 코드 작성을 위한 기본 문법 01</title>
</head>
<body>
	<h2>성적 처리 프로그램 코드 작성 - 배열 사용</h2>
	<%
		int score[][] = {{89, 78, 73}, {88, 85, 79}};
		String sub[] = {"국어", "영어", "컴퓨터"};
		int total[] = new int[2]; 
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				total[i] = total[i] + score[i][j];
			}
		}
		
		float average[] = new float[2]; // 두 자료형을 같게 설정
		
		average[0] = total[0]/3;
		average[1] = total[1]/3;
	%>
	<hr>
	<%
		for(int i = 0; i < 2; i ++) {
			for(int j = 0; j < 3; j++) {
				out.println((i + 1) + "번 학생의 " + sub[j] + "성적: " + score[i][j] + "<br/>");
			}
			out.println((i + 1) + "번 학생의 총점: " + total[i] + "<br/>");
			out.println((i + 1) + "번 학생의 평균: " + average[i] + "<br/>");
			out.println("<hr>");
		}
	%>
</body>
</html>

<%--
	1번 학생의 국어 성적 = <%= score[0][0] %> <br/>
	1번 학생의 영어 성적 = <%= score[0][1] %> <br/>
	1번 학생의 컴퓨터 성적 = <%= score[0][2] %> <br/>
	1번 학생의 총점 = <%= total[0] %> <br/>
	1번 학생의 평균 = <%= average[0] %> <br/>
	<hr>
	2번 학생의 국어 성적 = <%= score[1][0] %> <br/>
	2번 학생의 영어 성적 = <%= score[1][1] %> <br/>
	2번 학생의 컴퓨터 성적 = <%= score[1][2] %> <br/>
	2번 학생의 총점 = <%= total[1] %> <br/>
	2번 학생의 평균 = <%= average[1] %> <br/> 
--%>
