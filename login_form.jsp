<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<style>
	table {
		background:#ccddaa;
		font-family:휴먼둥근헤드라인;
		font-style:bold;
	}
	
	.bb{  
		font-family:Comic Sans MS;
		font-style:bold;
	}
	
</style>
<body>
	<form name="login+form" action="login_check.jsp" method="post">
 	<!-- html태그(tag) 매크로  입력 양식을 처리 -->
		<table border="1" cellpadding="3"> <!-- border는 표의 선을 의미 -->
		<caption>로그인 페이지</caption><!-- 테이블 제목 -->
			<tr> 
				<td>아이디: </td>
				<td> <input type = "text" name="id" value=""> </td> <!-- value로 변수 초기화 -->
			</tr>
			<tr>
				<td>비밀번호: </td>
				<td> <input type = "password" name="pwd" value=""> </td> <!-- value로 변수 초기화 -->
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input class="bb" type="submit" value="login">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
<form action="submit" ></form>

</body>
</html>
