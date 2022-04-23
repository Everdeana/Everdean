<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 연동 테스트</title>
</head>
<body>
	<h2>MySQL DB 서버 연동 테스트 입니다.</h2>
	<table border="1" cellspacing="0" celpadding="4">
		<caption>데이터베이스 데이터 목록</caption>
		<tr>
			<td align="center"> 번호 </td>
			<td align="center"> 이름 </td>
			<td align="center"> 교과명 </td>
			<td align="center"> 학과 </td>
			<td align="center"> 성별 </td>
			<td align="center"> 입학년도 </td>
		</tr>
		
	
	
	<%
		try {
			String name, course, dept, gender, year; // 데이터베이스 안에 필드를 저장하기 위한 객체변수 선언
			int no;
			// JDBC 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("JDBC:mysql://localhost:3306/22bjsp", "smart", "1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select no, name, course, dept, gender, year from student");
			while(rs.next()) {
				no = rs.getInt(1); // 번호 필드 값
				name = rs.getString(2); // 이름 필드 값
				course = rs.getString(3); // 이름 필드 값
				dept = rs.getString(4); // 이름 필드 값
				gender = rs.getString(5); // 성별 필드 값
				year = rs.getString(6); // 이메일 필드 값
	%>
	<tr>
		<td align="center"><%=no %></td>
		<td><%=name %></td>
		<td><%=course %></td>
		<td><%=dept %></td>
		<td align="center"><%=gender %></td>
		<td><%=year %></td>
	</tr>
	<%
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	%>
	
	<%--
		/* 데이터베이스 (JDBC) 드라이버 설정 */
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("JDBC:mysql://localhost:3306/jsp22_b", "root", "1234");	
		/* 연결 데이터베이스 환경 (데이터베이스 서버 주소, 아이디, 비밀번호) */
		if(con != null){
			out.println("jsp22_b 데이터베이스 서버에 연결 완료되었습니다. <br/>");		
		} else{
			out.println("데이터베이스 연결 실패입니다. <br/>");
		}
	--%>
	</table>
</body>
</html>
