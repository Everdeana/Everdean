<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2차원 배열 처리 - 학생성적처리 프로그램</title>
</head>
<body>
	<h2>학생 성적 프로그램</h2>
	<%
		/* 한 학생당 3과목 점수 선언 : 국어, 영어,컴퓨터 */
		int jumsu[][] = {{90, 89, 90}, {88, 78, 86}};
		int total[] = new int[2]; /* 총점 저장 배열 */
		float average[] = new float[2]; /* 평균 저장 배열 */
		/* total[0] = jumsu[0][0] + jumsu[0][1] + jumsu[0][2]
		   total[1] = jumsu[1][0] + jumsu[1][1] + jumsu[1][2] */
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				total[i] = total[i] + jumsu[i][j];
			}
		}
		average[0] = total[0]/3;
		average[1] = total[1]/3;
	%>
	1번 학생의 국어 성적 = <%= jumsu[0][0] %> <br/>
	1번 학생의 영어 성적 = <%= jumsu[0][1] %> <br/>
	1번 학생의 컴퓨터 성적 = <%= jumsu[0][2] %> <br/>
	1번 학생의 총점 = <%= total[0] %> <br/>
	1번 학생의 평균 = <%= average[0] %> <br/>
	<hr>
	2번 학생의 국어 성적 = <%= jumsu[1][0] %> <br/>
	2번 학생의 영어 성적 = <%= jumsu[1][1] %> <br/>
	2번 학생의 컴퓨터 성적 = <%= jumsu[1][2] %> <br/>
	2번 학생의 총점 = <%= total[1] %> <br/>
	2번 학생의 평균 = <%= average[1] %> <br/>
</body>
</html>
