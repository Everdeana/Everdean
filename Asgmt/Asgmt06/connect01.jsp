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
			/* 지정한 JDBC 드라이버 클래스 이름을 발견하면 자동으로 객체를 생성하고 DriverManager에 JDBC 드라이버로 등록한다. */
			Connection con = DriverManager.getConnection("JDBC:mysql://localhost:3306/22bjsp", "smart", "1234");
			/* 
				java.sql.Connection 타입이 데이터베이스 커넥션을 나타내며, java.sql.DriverManager 클래스가 제공하는
				getConnection() 메서드를 사용해서 커넥션을 구할 수 있다. DriverManager 클래스는 다음의 두 getConnection() 메서드를 제공하고 있다.
				DriverManager.getConnection(String jdbcURL)
				DriverManager.getConnection(String jdbcURL, String user, String password) 
			*/
			Statement stmt = con.createStatement();
			/*  Connection 객체를 생성한 후에는 Connection 객체로부터 Statment를 생성하고 쿼리를 실행할 수 있다.
				Statement는 다음과 같이 Connection의 createStatement() 메서드를 사용하여 생성한다. 
			*/
			ResultSet rs = stmt.executeQuery("select no, name, course, dept, gender, year from student");
			/*	Statement 객체를 사용하면 쿼리를 실행할 수 있다. 쿼리를 실행할 때 사용하는 메서드는 다음과 같다.
				ResultSet executeQuery(String query) : SELECT 쿼리를 실행한다.
				int executeUpdate(String quert) : INSERT, UPDATE, DELETE 쿼리를 실행한다.
				executeQuery() 메서드는 SELECT 쿼리의 결과값을 java.sql.ResultSet 객체에 저장해서 리턴한다. 
				두 번째 executeUpdate() 메서드는 INSERT, UPDATE, DELETE 쿼리를 실행하고, 그 결과로 변경된 (또는 삽입된) 레코드의 개수를 리턴한다.
			*/
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
			/* 
				지정한 드라이버 클래스 이름 존재하지 않을 경우 오류 발생
				지정한 url, id, pw가 맞지 않을 경우 오류 발생
			*/
			
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
