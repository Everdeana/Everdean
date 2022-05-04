<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 입력 페이지</title>
</head>
<body>
	<h2>학생 정보 입력 내용</h2>
	<form action="write_act.jsp" method="post">
	<table border="1" cellspacing="0" cellpadding="5">
	<caption>학생 기본 정보 입력</caption>
	<tr>
		<th>이름</th>
		<td><input type="text" name="name" value=""></td>
	</tr>
	<tr>
		<th>교과목</th>
		<td><input type="text" name="course" value=""></td>
	</tr>
	<tr>
		<th>학과</th>
		<td><input type="text" name="dept" value=""></td>
	</tr>
	<tr>
		<th>출생년도</th>
		<td><input type="text" name="year" value=""></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장">
			<input type="reset" value="취소">
		</td>
	</tr>
	</table>
	</form>
</body>
</html>
