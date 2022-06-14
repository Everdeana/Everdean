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
		int b_id, b_view;
		// 검색 한 글의  정보를 저장할 객체 변수 선언
		String b_name, b_title, b_mail, b_content, b_date, b_pwd, b_filename, b_filesize, mailtoyou; // 데이터베이스에 필드를 저장하기 위해 객체변수 선언;
		int datacount = 0;
		int pagecount;
		// JDBC 드라이버 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 데이터베이스 연동
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
		// SQL query 문 작성
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs0 = stmt.executeQuery("select count(b_id) from bmboard where "+searchk+" like '%"+searchw+"%'");
		if(rs0.next()){
			datacount = rs0.getInt(1);
			out.println("<b> 검색결과: " + datacount + "개 입니다. <br/>");
			rs0.close();
		}
		// System.out.println(searchk);
		// System.out.println(searchw);
		// System.out.println("1");
		int pagesize = 5;
		if((datacount % 5)==0) {
			pagecount = datacount/(pagesize +1) + 1; // 페이지 값을 저장하기 위한 변수 계산
		} else {
			pagecount = datacount/pagesize + 1; // 페이지 값을 저장하기 위한 변수 계산
		}
		// System.out.println(searchk);
		// System.out.println(searchw);
		// System.out.println("2");
		int mypage = 1;
		int abpage = 1;// 현재 보여지는 페이지
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
		// System.out.println(searchk);
		// System.out.println(searchw);
		// System.out.println("3");
		String sql = "select b_id, b_name, b_title, b_mail, b_content, date_format(b_date, '%y-%m-%d'), b_view, b_pwd, b_filename, b_filesize from bmboard where "+searchk+" like '%"+searchw+"%' order by b_id desc";
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
		<th align="center"> 번호 </th>
		<th align="center"> 이미지(사진) </th>		
		<th align="center"> 제목 </th>
		<th align="center"> 작성자 </th>
		<th align="center"> 작성일자 </th>
		<th align="center"> 조회수 </th>
	</tr>
	<%
		for(int k=1; k<=pagesize; k++) {
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
		<td><img src="upload/<%=b_filename %>" height="50"> <br/><%=b_filesize %></td>
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
		
		stmt.close();
		conn.close();
	%>
	<tr>
		<td colspan="6" align="center">
			<%	
				int gopage; // 페이지를 앞/뒤로 이동할 때 사용하는 변수 선언

    			if(mypage!=1){ // 첫 페이지가 아니라면

    			gopage=mypage-1; // 현재 페이지의 바로 전 페이지로 이동하도록 값 저장

    			out.println("<a href=sfSearch_act.jsp?keyword="+ searchw +"&search="+ searchk +"&mypage=" + gopage + "> < prev</a>");
    			// 검색 결과 확인 페이지에서 페이징을 구현하기 위해 search와 keyword를 클릭할 때마다 다시 넘겨준다.

    			} else{

    			out.println(""); 

    			}
   			%>
   			<%	
   				if(pagecount != 1){ // 페이지 값이 1이 아니면
					for(int l = 1; l <= pagecount; l++) { // 1부터 pagecount 값보다 작을 때 까지 반복하여 페이지 번호 출력
						out.println("<a href=sfSearch_act.jsp?keyword="+ searchw +"&search="+ searchk +"&mypage=" + l + ">(" + l + ")</a>");
					}
				}else{
					out.println("1");
				}
   			%>

   			<%	if(mypage != pagecount){ // 페이지 값이 현재 페이지와 다르다면

    			gopage=mypage+1; // 다음 페이지로 이동하도록 값 저장

 			    out.println("<a href=sfSearch_act.jsp?keyword="+ searchw +"&search="+ searchk +"&mypage=" + gopage+ "> next > </a>"); 

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
	<tr>
		<td colspan="6" align="center">
			<input type="button" value="게시글 목록 페이지" id="godbc" onclick="location.href='sfConnect.jsp'"/>
		</td>
	</tr>
</table>
</body>
</html>
