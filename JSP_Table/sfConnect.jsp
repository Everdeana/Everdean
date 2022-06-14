<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%><%--java.sql.connection, java.sql.ResultSet --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사내 정보 공유 자료 목록현황</title>
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
	#pin {
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
		width:20%;
	}
	#keyin {
		border:solid green;
		font:bold 0.7em Arial;
		width:50%;
	}
	#opsel {
		background-color:#66C19C;
		border:solid green;
		font:bold 0.7em Arial;
		text-align:center; 
		width:20%;
	}
	.search{
		background-color:#66C19C;
	}
</style>
</head>
<body>
	<div><h2> 스마트 사내 정보 공유 자료 목록 </h2></div>
	<form action="sfSearch_act.jsp" method="post">
	<table border="1" cellspacing="0" celpadding="5">
		<caption>List Of Posts</caption>
		<tr>
			<th align="center"> 번호 </th>
			<th align="center"> 이미지(사진) </th>		
			<th align="center"> 제목 </th>
			<th align="center"> 작성자 </th>
			<th align="center"> 작성일자 </th>
			<th align="center"> 조회수 </th>
		</tr>
	<%
		try {
			String b_name, b_title, b_mail, b_content, b_date, b_pwd, b_filename, b_filesize, mailtoyou; // 데이터베이스에 필드를 저장하기 위해 객체변수 선언
			/* 작성자, 글제목, 작성자의 메일주소, 글내용, 작성일자, 글 삭제/수정 시  인증에 필요한 비밀번호, 첨부 파일 이름, 첨부 파일 크기, 메일전송 */
			int b_id, b_view;
			int datacount = 0; // 학생 수 만큼의 카운트 계산 저장 변수
			int pagecount; 
			// JDBC Driver 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 지정한 JDBC 드라이버 클래스를 발견하면 자동으로 객체를 생성
			Connection con = DriverManager.getConnection("JDBC:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
			// 한글 깨짐 현상 방지하기 위해 useUnicode, characterEncoding 설정
			//  java.sql.Connection 타입이 DB 연결을 나타내며, DriverManager 클래스가 제공하는 getConnection() 메서드를 사용해서 커넥션을 구할 수 있음 
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			//  Connection 객체를 생성한 후 Connection 객체로부터 Statment를 생성하고 쿼리를 실행할 수 있음
			/*  8.0 이후버전은 createStatement를 할 때 ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY를
				사용해야 오류가 생기지 않는다.
				1.	ResultSet.TYPE_SCROLL_INSENSITIVE: ResultSet 에서 rs.next() 를 사용하게 되면 다음 결과 row를 가져온 후  다음에는 이전 값을 사용못하게 된다.
					그러나 이 옵션으로 ResultSet을 만들면 한번 커서가 지나간 다음에 다시 되돌릴 수 있다.
				2.	ResultSet.CONCUR_READ_ONLY: ResultSet으로 가져온 row의 값을 다시 Insert나 Update로 사용하지 않을 때 선언한다.
			*/
			// 목록이 보여지는 페이지에서 한 페이지 5개 리스트만 보이도록 페이지 기능을 처리
			ResultSet rs0 = stmt.executeQuery("select count(b_id) from bmboard");
			// out.println(rs0);
			if(rs0.next()) { // 커서의 위치가 순방향으로 이동할 경우(다음 레코드행으로 이동o)
				datacount = rs0.getInt(1); // ResultSet 객체의 현재 행에서 지정된 열의 값을 Java의 int로 검색
				rs0.close();
			}
			int pagesize = 5; // 한 페이지에 나타나는 데이터의 수를 5로 지정
			
			if((datacount % 5)==0) {
				pagecount = datacount/(pagesize +1) + 1; // 페이지 값을 저장하기 위한 변수 계산
			} else {
				pagecount = datacount/pagesize + 1; // 페이지 값을 저장하기 위한 변수 계산
			}
			int mypage = 1, abpage = 1;
			if(request.getParameter("mypage") != null) { // mypage 값이 null이 아닐 경우 
				mypage = Integer.parseInt(request.getParameter("mypage"));
			// 매개변수의 값을 문자열로 반환(존재하지 않을 경우 null 반환)
				abpage = (mypage - 1) * pagesize + 1;
				/* mypage = 1 --> 0
				   mypage = 2 --> (2 - 1) * 5 = 5
				   mypage = 3 --> (3 - 1) * 5 = 10 */
				if(abpage <= 0) {
					abpage = 1;
					// abpage가 0보다 작다면 테이블 목록을 나타내는 파일을 실행할 경우 처음에 등록한 1개의 글만 화면에 나타냄
				}
			}
			ResultSet rs = stmt.executeQuery("select b_id, b_name, b_title, b_mail, b_content, date_format(b_date, '%y-%m-%d'), b_view, b_pwd, b_filename, b_filesize from bmboard order by b_id desc");
			/* Select 쿼리를 실행한다. executeQuery 쿼리에서 실행한 결과를  ResultSet 객체에 저장하여 반환(order by id desc 를 사용하여 내림차순 정렬-asc는 오름차순) */
			
			if(!rs.next()) {
				pagesize = 0;
				/* 커서의 위치가 순방향으로 이동하지 않는다면(다음 레코드행으로 이동x),
				      한 페이지당 나타나는 글의 목록 수를 0으로 설정 --> 화면에 아무것도 보이지 않음 */
			} else {
				rs.absolute(abpage);
				// ResultSet 객체에서 지정된 행 번호로 커서를 이동 --> 위에서 abpage를 1로 설정하였기 때문에 1번 행으로 커서를 이동
			}
			for(int k = 1; k <= pagesize; k++) {
				// ResultSet 객체인 rs에서 테이블의 n번째 열(column)인 특정 값을 Int형으로 검색한다.
				b_id = rs.getInt(1);
				b_name = rs.getString(2);
				b_title = rs.getString(3);
				b_mail = rs.getString(4);
				b_content = rs.getString(5); 
				b_date = rs.getString(6);
				b_view = rs.getInt(7);
				b_pwd = rs.getString(8);
				b_filename = rs.getString(9);
				b_filesize = rs.getString(10);
				
				if(!b_mail.equals("")) {
					mailtoyou = "<a href=mailto:"+b_mail+">" +b_name+ "</a>";
				} else {
					mailtoyou = b_name;
				}
	%>
	<tr>
		<td align="center"><%=b_id %></td>
		<td align="center"><img src="upload/<%=b_filename %>" height="60"></td>
		<td><a href="sfView.jsp?b_id=<%=b_id%>"><%=b_title %></a></td>
		<td><%=mailtoyou %></td>
		<td><%=b_date %></td>
		<td><%=b_view %></td>
	</tr>
	<%
		if(rs.getRow()==datacount) { // ResultSet 객체인 rs에서 현재 행 번호를 검색한다. 
			break; // 행 번호와 데이터 카운트를 비교하여 같다면 반복문을 종료한다.
		} else {
			rs.next(); // 그렇지 않을 경우 커서의 위치를 현재 위치에서 한 행 앞으로 이동시킨다.
		}
	}
		// 각 객체를 사용한 후 DB와 자바에서 DB에 접속할 수 있도록 해주는 JDBC 리소스를 기다리게 하는 대신에 즉시 해제시킴
		rs.close(); 
		stmt.close();
		con.close();
	%>
	<tr>
		<td colspan="7" align="center">
			<%	
				int gopage; // 페이지를 앞/뒤로 이동할 때 사용하는 변수 선언
    			if(mypage!=1){ // 첫 페이지가 아니라면
    			gopage=mypage-1; // 현재 페이지의 바로 전 페이지로 이동하도록 값 저장
    			out.println("<a href=sfConnect.jsp?mypage=" + gopage + "> < prev</a>");
    			} else{
    			out.println(""); 
    			}
   			%>
   			<%	
   				if(pagecount != 1){ // 페이지 값이 1이 아니면
					for(int l = 1; l <= pagecount; l++) { // 1부터 pagecount 값보다 작을 때 까지 반복하여 페이지 번호 출력
						out.println("<a href=sfConnect.jsp?mypage=" + l + ">(" + l + ")</a>");
					}
				}else{
					out.println("1");
				}
   			%>
   			<%	if(mypage != pagecount){ // 페이지 값이 현재 페이지와 다르다면
    			gopage=mypage+1; // 다음 페이지로 이동하도록 값 저장
 			    out.println("<a href=sfConnect.jsp?mypage=" + gopage+ "> next > </a>"); 
 			    } else{
 			    out.println(""); 
   			  } %>
		</td>
	</tr>
		<%
			}
			catch(Exception e) {
				out.println(e);
				e.printStackTrace();
			}
			/*	Class.forName 에서 지정한 드라이버 클래스 이름이 없거나
				getConnection 에서 url, id, pw 등의 값이 잘못되었을 경우 예외처리 */
		%>
	<tr>
		<td colspan="7" align="center">
			<input type="button" value="사내 정보 입력 페이지" id="pin" onclick="location.href='sfInput.jsp'"/>
		</td>
	</tr>
	<tr>
		<td colspan="7" align="center">
			<select name="search" class="search" id="opsel">
				<option> 선택 </option>
				<option value="b_name"> 작성자 </option>
				<option value="b_title"> 제목 </option>
			</select>
			<input type="text" name="keyword" id="keyin">
			<input type="submit" value="검색" id="sear">
		</td>
	</tr>
	</table>
	</form>
</body>
</html>
