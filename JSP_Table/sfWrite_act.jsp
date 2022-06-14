<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.sql.*"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 정보 입력 처리 페이지 </title>
</head>
<body>
	<%
		ServletContext scontext = getServletContext();
		String realFolder = scontext.getRealPath("upload");
		try{
			String b_filename="";
			String b_filesize="";
			MultipartRequest multi = new MultipartRequest(request, realFolder, (1024*1024*5), "utf-8", new DefaultFileRenamePolicy());
			Enumeration<?> files = multi.getFileNames();
			String file1 = (String) files.nextElement();
			String fileName1 = multi.getFilesystemName(file1);
			if(fileName1 == null) {
				b_filename = "default.png";
				b_filesize = "5517Bytes";
			} else{
				b_filename = fileName1;
				File file = multi.getFile("b_filename");
				b_filesize=""+file.length()+"Bytes";
			}
			// 입력 페이지에서 전달된 값들을 저장하는 객체 변수 선언
			int b_id = 0;
			String b_name = multi.getParameter("b_name");
			String b_mail = multi.getParameter("b_mail");
			String b_title = multi.getParameter("b_title");
			String b_content = multi.getParameter("b_content");
			String b_pwd = multi.getParameter("b_pwd");
			System.out.println(b_name);
			System.out.println(b_name);
			System.out.println(b_name);
			System.out.println(b_name);
			
			// JDBC 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 데이터베이스 연동
			Connection conn = DriverManager.getConnection("JDBC:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
			// SQL Query문 처리
			Statement stmt = conn.createStatement(); // 연결이 된 상태에서 쿼리문 처리
			ResultSet rs = stmt.executeQuery("select max(b_id) from bmboard"); // 저장된 번호 최대값 확인
			System.out.println(rs);
			
			if(rs.next()){
				b_id = rs.getInt(1);
				b_id = b_id + 1;
				rs.close();
				stmt.close();
			} else{ // b_id가 NULL 이라면
				b_id = 1; // 1
			}
			PreparedStatement pstmt = conn.prepareStatement("insert into bmboard (b_id, b_name, b_mail, b_title, b_content, b_date, b_view, b_pwd, b_filename, b_filesize) values(?,?,?,?,?,now(),0,?,?,?)");
			pstmt.setInt(1, b_id); // ?자리에 넣을 값 지정
			pstmt.setString(2, b_name);
			pstmt.setString(3, b_mail);
			pstmt.setString(4, b_title);
			pstmt.setString(5, b_content);
			pstmt.setString(6, b_pwd);
			pstmt.setString(7, b_filename);
			pstmt.setString(8, b_filesize);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
			response.sendRedirect("sfConnect.jsp");
			
		}catch(Exception e){
			out.println(e);
		}
	
	
	%>
	<br/>
	정상적으로 정보가 등록 완료 되었습니다. <br/>
</body>
</html>
