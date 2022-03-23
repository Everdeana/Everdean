<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인 페이지</title>
</head>
<body>
<h2> 로그인 페이지 </h2>
<form name="Login_form" action="LogIn_ok.jsp" method="post">
	<table border="1" cellpadding="5">
	<caption> 로그인 페이지 </caption>
		<tr>
			<td> 아이디 </td>
			<td> <input type="text" name="id" value=""> </td>
			
		</tr>
		<tr>
			<td> 비밀번호 </td>
			<td> <input type="password" name="pwd" value=""> </td>
		</tr>
		<tr>
			<td align="center" colspan="2">
				<input type="submit" value="확인">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>
