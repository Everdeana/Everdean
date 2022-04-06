<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시글 입력 페이지 </title>
</head>
<body>
<h2> 게시글 입력 </h2>
<form action="bbsPost_01.jsp" method="post" name="bbs_form" enctype="multipart/form-data">
	<table border="1" cellspacing="0" cellpadding="5">
	<caption> 게시글 내용 작성 </caption>
		<tr>
			<td> 작성자 </td>
			<td><input type="text" name="name" value=""></td>
		</tr>
		<tr>
			<td>제목 </td>
			<td><input type="text" name="subject" value=""></td>
		</tr>
		<tr>
			<td> 내용 </td>
			<td><textarea rows="5" cols="30" name="content"></textarea></td>
			<!-- rows, cols -> 사이즈 -->	
		</tr>
		<tr> 
			<td> 파일 첨부 </td>  
        	<td> <input type="file" name="fileName01"> </td>  
        </tr>
		<tr>
			<td colspan="2"> 
			<input type="submit" value="글올리기" id="send">
			<input type="reset" value="취소"> 
			</td>
		</tr>
	</table>
</form>
</body>
</html>
