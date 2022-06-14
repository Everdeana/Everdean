
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.io.*, java.util.*"%><%--java.sql.connection, java.sql.ResultSet --%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>
<!-- 배경, 테두리, 폰트 색상 변경-->
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
	#mod {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.8em Arial; 
		width:24%;
	}
</style>
</head>
<body>
	<%
		try {
			String b_name, b_title, b_mail, b_content, b_date, b_pwd, b_filename, b_filesize, mailtoyou; // 데이터베이스에 필드를 저장하기 위해 객체변수 선언
			int b_id = Integer.parseInt(request.getParameter("b_id"));
			int b_view;
			out.println("<h2>&nbsp;&nbsp;<선택된 글 번호:" + b_id + "></h2>");
			Class.forName("com.mysql.jdbc.Driver");
			/* 지정한 JDBC 드라이버 클래스를 발견하면 자동으로 객체를 생성 */
			Connection con = DriverManager.getConnection("JDBC:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
			/*  java.sql.Connection 타입이 DB 연결을 나타내며, DriverManager 클래스가 제공하는
				getConnection() 메서드를 사용해서 커넥션을 구할 수 있음 */
			Statement stmt = con.createStatement();
			/*  Connection 객체를 생성한 후 Connection 객체로부터 Statment를 생성하고 쿼리를 실행할 수 있음*/
			ResultSet rs = stmt.executeQuery("select * from bmboard where b_id="+b_id); // 문자열과 연결연산자
			/*  Select 쿼리를 실행한다. executeQuery 쿼리에서 실행한 결과를  ResultSet 객체에 저장하여 반환(order by id desc 를 사용하여 내림차순 정렬) */
			if(rs.next()) {
				b_id = rs.getInt(1);
				b_name = rs.getString(2);
				b_title = rs.getString(3);
				b_mail = rs.getString(4);
				b_content = rs.getString(5); 
				b_date = rs.getString(6);
				b_view = rs.getInt(7);
				b_pwd = rs.getString(8);
				b_filename = rs.getString(9);
				b_filesize = rs.getString(10); /*  각각의 필드값을 저장하여 웹 페이지에 띄울 때 사용 */
				
				if(!b_mail.equals("")) {
					mailtoyou = "<a href=mailto:"+b_mail+">" +b_mail+ "</a>";
				} else {
					mailtoyou = b_mail;
				}
	%>
	<div> <h2>&nbsp;&nbsp;&nbsp;&nbsp;사내 상세 정보 내용 </h2> </div> <br/>
	<table border="1" cellspacing="0" cellpadding="5">
		<caption><font color="blue"><b><%=b_name %></b></font> 님의 글 </caption>
		<tr>
			<th align="center"> 번호 </th>
			<th align="center"> 이미지(사진) </th>		
			<th align="center"> 제목 </th>
			<th align="center"> 작성자 </th>
			<th align="center"> 이메일 </th>
			<th align="center"> 작성일자 </th>
			<th align="center"> 조회수 </th>
		</tr>
	<tr>
		<td align="center"><%=b_id %></td>
		<td align="center"><a href = "./upload/<%=b_filename%>"><img src="upload/<%=b_filename%>" width="80"></a><br/><%=b_filesize%></td>
		<td><%=b_title %></td>
		<td><%=b_name %></td>
		<td><%=mailtoyou %></td>
		<td><%=b_date %></td>
		<td><%=b_view %></td>		
	</tr>
	<tr>
		<th colspan="7" align="center"> 내용 </th>
		
	</tr>
	<tr>
		<td colspan="7"><pre><%=b_content %></pre></td>
	</tr>
	<tr>
		<td colspan="8" align="center">
			<input type="button" value="뒤로 가기" id="mod" onclick="history.go(-1)"/>
			<input type="button" value="정보 입력" id="mod" onclick="location.href='sfInput.jsp'"/>
			<input type="button" value="정보 수정" id="mod" onclick="location.href='sfModify.jsp?b_id=<%=b_id%>'"/>
			<input type="button" value="정보 삭제" id="mod" onclick="location.href='sfDelete.jsp?b_id=<%=b_id%>'"/>
		</td>
	</tr>
	</table>
	<br/>
	<%
		rs.close();
		stmt.executeUpdate("update bmboard set b_view=b_view+1 where b_id="+b_id+"");
		stmt.close();
		con.close();
			}
		}
		catch(Exception e) {
			out.println(e);
			e.printStackTrace();/*	Class.forName 에서 지정한 드라이버 클래스 이름이 없거나 getConnection 에서 url, id, pw 등의 값이 잘못되었을 경우 예외처리 */
		}
	%>
</body>
</html>
