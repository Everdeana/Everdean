<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시글 입력 페이지 </title>
<style>
	table, tr, td{
		background:#C4E7D6;
		border:1px solid green;
		font:bold 1.0em Arial;  
	}
	table caption {
		background:#66C19C;
		border:2px solid green;
		font:bold 1.1em Arial;
		color:white;
	}
	#send {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial; 
	}
	#rst {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial; 
	}
	#fi {
		font:bold 0.9em Arial; 
	}
</style>
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
        	<td> <input type="file" name="fileName01" id="fi"> </td>  
        	<!-- style에서 사용하기 위해 id="fi" 선언 -->
        </tr>
		<tr>
			<td align="center" colspan="2"> 
			<input type="submit" value="글올리기" id="send">
			&nbsp;&nbsp;&nbsp;&nbsp;	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="취소" id="rst"> 
			</td>
		</tr>
	</table>
</form>
</body>
</html>
