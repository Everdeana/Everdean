<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	#del {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial;
		width:50%;
	}
	#del1 {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial;
		width:76%;
	}
	#delsub {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial; 
		width:49%;
	}
	#delgov {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial; 
		width:100%;
	}
</style>
</head>
<body>
	<form name="delform" action="sfDelete_act.jsp" method="post">
	<table cellpadding="5" cellspacing="0" border="1">
		<caption> 게시글 삭제 </caption>
		<tr>
			<td>
			삭제할 게시글의 번호:
       		<input type="text" name="b_id" id="del"> 
       		</td>
		</tr>
		<tr>
		<td>
			비밀번호:
       		<input type="password" name="passwd" id="del1"> 
       		</td>
		</tr>
		<tr>
       		<td>
       		<input type="submit" value="삭제" id="delsub">
       		<input type="reset" value="취소" id="delsub">
       		</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" value="게시글 상세 정보 페이지" id="delgov" onclick="history.go(-1)"/>
			</td>
		</tr>
	</table>
    </form>
</body>
</html>
