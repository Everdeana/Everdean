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
		int total[] = new int[2]; // 학생별 1차원 뱌열을 선언하고 생성 --> 두 자료형을 같게 설정
		/* 선언과 동시에 메모리의 시작주소값 할당(주소 저장하는 포인터를 배열로 처리)
		   JAVA에서는 포인터 사용 X
		   int a[2]; // 배열 선언과 동시에 요소 결정
		   int[]; // 요소 결정 X 								*/
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				total[i] = total[i] + score[i][j];
			}
		}
		float average[] = new float[2]; // 두 자료형을 같게 설정
		
		/* total[0] = score[0][0] + score[0][1] + score[0][2];
		total[1] = score[1][0] + score[1][1] + score[1][2]; */
		// out.print("1번 학생의 총점= " + total[0] + "<br/>");
		
		average[0] = total[0]/3;
		average[1] = total[1]/3;
	%>
	
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
</body>
</html>
