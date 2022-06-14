<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 사내 정보 공유 입력 페이지 </title>
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
	#b_bo{
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial;
		width:98%;
	}
	#b_fi{
		background-color:#C4E7D6;
		font:bold 0.9em Arial;
		width:98%;
	}
	#b_sd {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial;
		width:30%; 
	}
	#b_con {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial; 
		width:100%;
	}
	body{
		margin:30px;
	}
</style>
</head>
<body>
<div> <h2> 사내 정보 공유 시스템  </h2> </div>
	<form action="sfWrite_act.jsp" method="post" enctype="multipart/form-data">
	<table border="1" cellspacing="0" cellpadding="5">
		<caption> 공유 정보 작성 </caption>
		<tr>
			<th> 작성자 </th>
			<td> <input type="text" name="b_name" value="" id="b_bo"> </td>
		</tr>
		<tr>
			<th> 이메일 </th>
			<td> <input type="text" name="b_mail" value="" id="b_bo"> </td>
		</tr>
		<tr>
			<th> 제목 </th>
			<td> <input type="text" name="b_title" value="" id="b_bo"> </td>
		</tr>
		<tr>
			<th> 내용 </th>
			<td> <textarea rows="5" cols="50" name="b_content" id="b_bo"></textarea> </td>
		</tr>
		<tr>
			<th> 비밀번호 </th>
			<td> <input type="password" name="b_pwd" maxlength="10" id="b_bo"> </td>
		</tr>
		<tr>
			<th> 파일 첨부 </th>
			<td> <input type="file" name="b_filename" id="b_fi"> </td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="저장" id="b_sd">&emsp;&emsp;&emsp;&emsp;
				<input type="reset" value="취소" id="b_sd">
			</td>	
		</tr>
		<tr>
		<td colspan="2" align="center">
			<input type="button" value="게시글 목록 페이지" id="b_con" onclick="location.href='sfConnect.jsp'"/>
		</td>
	</tr>
	</table>
</form>
</body>
</html>
