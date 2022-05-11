<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.io.*, java.util.*"%>
<% request.setCharacterEncoding("utf-8"); %>
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
	#godbc {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial; 
		width:100%;
	}
	
	#sear {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.7em Arial;
		text-align:center; 
		width:10%;
	}
	.search{
		background-color:#E2F3EA;
	}
</style>
</head>
<body>
<% // 검색 처리에서 예외 처리문 작성
	try{
		String searchk = request.getParameter("search"); // 검색 할 항목
		String searchw = request.getParameter("keyword"); // 검색 할 키워드
		// out.println(searchk);
		// out.println(searchw);
		int id;
		// 검색 한 학생의 정보를 저장할 객체 변수 선언
		String name, gender, dept, address, year;
		int datacount = 0;
		int pagecount;
		// JDBC 드라이버 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 데이터베이스 연동
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/22stdjsp?useUnicode=true&characterEncoding=utf8", "stdmgm", "1234");
		// SQL query 문 작성
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs0 = stmt.executeQuery("select count(id) from student where "+searchk+" like '%"+searchw+"%'");
		if(rs0.next()){
			datacount = rs0.getInt(1);
			out.println("<b> 검색결과:" + datacount + "개 입니다. <br/>");
			rs0.close();
		}
		// System.out.println(searchk);
		// System.out.println(searchw);
		// System.out.println("1");
		int pagesize = 5;
		pagecount = datacount/pagesize;
		if(datacount % pagesize > 0) {
			pagecount++;
		}
		// System.out.println(searchk);
		// System.out.println(searchw);
		// System.out.println("2");
		int mypage = 1;
		int abpage = 1;// 현재 보여지는 페이지
		if(request.getParameter("mypage") != null) { // mypage 값이 null이 아닐 경우 
			mypage = Integer.parseInt(request.getParameter("mypage"));
		// 매개변수의 값을 문자열로 반환(존재하지 않을 경우 null 반환)
			abpage = (mypage - 1) * pagesize;
			/* mypage = 1 --> 0
			   mypage = 2 --> (2 - 1) * 5 = 5
			   mypage = 3 --> (3 - 1) * 5 = 10 */
			if(abpage <= 0) {
				abpage = 1;
				// abpage가 0보다 작다면 테이블 목록을 나타내는 파일을 실행할 경우 처음에 등록한 1개의 글만 화면에 나타냄
			}
		}
		// System.out.println(searchk);
		// System.out.println(searchw);
		// System.out.println("3");
		String sql = "select id, name, gender, dept, address, year from student where "+searchk+" like '%"+searchw+"%' order by id desc";
		// out.println(sql);
		// System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		if(!rs.next()) {
			pagesize = 0;
		} else{
			rs.absolute(abpage);
		}
%>
<table border="1" cellspacing="0" cellpadding="4">
	<caption> 검 색 결 과 </caption>
	<tr>
		<th> 번호 </th> <th> 이름 </th> <th> 학과 </th> <th> 출생년도 </th>
	</tr>
	<%
		for(int k=1; k<=pagesize; k++) {
			id = rs.getInt(1);
			name = rs.getString(2);
			gender = rs.getString(3);
			dept = rs.getString(4);
			address = rs.getString(5);
			year = rs.getString(6);
		
	%>
	<tr>
		<td align="center"><%=id %></td>
		<td><%=name %></td>
	<%--<td><%=gender %></td>--%>
		<td><%=dept %></td>
	<%--<td><%=address %></td>--%>
		<td><%=year %></td>
	</tr>
	<%
		if(rs.getRow()==datacount) { // ResultSet 객체인 rs에서 현재 행 번호를 검색한다. 
			break; // 행 번호와 데이터 카운트를 비교하여 같다면 반복문을 종료한다.
		} else {
			rs.next(); // 그렇지 않을 경우 커서의 위치를 현재 위치에서 한 행 앞으로 이동시킨다.
		}
	}
		// 각 객체를 사용한 후 DB와 자바에서 DB에 접속할 수 있도록 해주는 JDBC 리소스를 기다리게 하는 대신에 즉시 해제시킴
		
		stmt.close();
		conn.close();
	%>
	<tr>
		<td colspan="4" align="center">
			<input type="button" value="학생 정보 목록 페이지" id="godbc" onclick="location.href='DBconnect01.jsp'"/>
		</td>
	</tr>
	
</table>
<%
	}catch(Exception e) {
		System.out.println(e);
		out.println(e);
	}
%>
<br/>
<a href="DBconnect01.jsp"> 학생 정보 목록 페이지 </a>

</body>
</html>
