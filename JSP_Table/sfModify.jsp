<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.io.*, java.util.*"%>
<% request.setCharacterEncoding("utf-8"); %>
    <%
    String b_name=null, b_title=null, b_mail=null, b_content=null, b_filename=null, b_filesize=null;
    // student 테이블의 각 항목의 초기값을 null로 설정한다.
    int b_id = Integer.parseInt(request.getParameter("b_id"));
    // 정수형인 id를 문자형으로 변환한다.
    out.println("<h2>&nbsp;&nbsp;<해당 글 번호:" + b_id + "></h2>");
    Class.forName("com.mysql.cj.jdbc.Driver");
    /* DB 드라이버를 설정한다. MySQL5.7 버전에서는 다음과 같이 "com.mysql.jdbc.driver"로 작성할 경우 정상적으로 클래스명을 인식할 수 있다. 하지만 MySQL8.0 버전에서는 위와 같이 입력할 경우 
	   ClassNotFoundException 예외 상황이 발생한다. 해당 에러를 해결하기 위해 jdbc 앞에 cj를 작성한다. */
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
    // localhost: DB 서버명, memberex: 연결시키고자 하는 DB명, min: 사용자명, 9647: 비밀번호	
    Statement stmt = conn.createStatement();
    /*
    Statement 객체: static(정적) SQL문을 실행하고 생성한 결과를 반환하는데에 사용된다.
    createStatement(); --> SQL문을 DB에 보내기 위한 Statement 객체를 생성한다.
        매개변수가 없는 SQL문은 보통 Statement 객체를 실행하는데 사용된다.
    */
    String sql = "select b_name, b_title, b_mail, b_content, b_filename, b_filesize from bmboard where b_id=" + b_id;
    ResultSet rs = stmt.executeQuery(sql);
    // DB를 실행하는 쿼리문을 선언한다.
    if(rs.next()){
    	// 커서의 위치가 순방향으로 이동할 경우(다음 레코드 행으로 이동o)
    	b_name = rs.getString(1);
    	b_title = rs.getString(2);
        b_mail = rs.getString(3);
    	b_content = rs.getString(4);
    	b_filename = rs.getString(5);
        b_filesize = rs.getString(6); // ResultSet 객체인 rs에서  bmboard 테이블의 n번째 열(column)인 값을 String형으로 검색한다.
    }
    rs.close();
    stmt.close();
    conn.close(); // 각 객체의 DB와 자바에서 DB에 접속할 수 있도록 해주는 JDBC 리소스(자원)를 기다리게 하는 대신에 즉시 해제시키며 이러한 상황은 DB와 JDBC 리소스가 자동으로 종료될 때 발생한다.
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 정보 수정 페이지</title>
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
	#govi {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial; 
		width:100%;
	}
	#b_bo{
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial;
		width:100%;
	}
	#b_fi{
		background-color:#C4E7D6;
		font:bold 0.9em Arial;
		width:98%;
	}
	#mod {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial; 
		width:24%;
	}
</style>
</head>
<body>
	<form name="myform" action="scModify_act.jsp" method="post" enctype="multipart/form-data">
	<table border="1" cellspacing="0" celpadding="5">
		<caption> 정보 수정 </caption>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="b_name" value="<%=b_name %>" id="b_bo"></td>
		</tr>
		<tr>
			<th>메일</th>
			<td><input type="text" name="b_mail" value="<%=b_mail %>" id="b_bo"></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="b_title" value="<%=b_title %>" id="b_bo"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="5" cols="50" name="b_content" id="b_bo"><%=b_content %></textarea></td>
		</tr>
		<tr>
			<th>파일명</th>
			<td><a href = "./upload/<%=b_filename%>"><%=b_filename%></a></td>
		</tr>
		<tr>
			<th>파일 크기</th>
			<td><%=b_filesize %></td>
		</tr>
		<tr> <td> 파일 수정 </td>  
       		<td> <input type="file" name="b_filename" id="file1"> </td>
   		</tr>
   		<tr>
   			<th> 비밀번호: </th>
       		<td> <input type="password" name="b_pwd" id="govi"> </td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="hidden" name="b_id" value="<%=b_id %>" id = "mod">
			<input type="button" value="뒤로 가기" id="mod" onclick="history.go(-1)"/>
			<input type="button" value="목록 으로" id="mod" onclick="location.href='sfConnect.jsp'"/>
			<input type="submit" value="수정 하기" id = "mod"> 
			<input type="reset" value="다시 입력" id="mod">
		</td>
		</tr>
	</table>
</form>
</body>
</html>
