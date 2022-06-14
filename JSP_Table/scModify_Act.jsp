<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.io.*, java.util.*"%>
<%@ page import="java.util.Enumeration" %>    
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%  request.setCharacterEncoding("utf-8"); 
	ServletContext scontext = getServletContext();
	String realFolder = scontext.getRealPath("upload");
	// Client(request)-Server(response)환경
	
	try{
		// 파일 처리 문
		MultipartRequest  multi = new MultipartRequest(request, realFolder, (1024*1024*5), "utf-8", new DefaultFileRenamePolicy());
		// Enumeration 객체 타입으로 반환 처리  
		Enumeration<?> files = multi.getFileNames(); // 파일의 속성
		// Enumeration 객체에서 데이터 저장 자료 구조는 스택 구조 타입으로 저장 됨 
		String file1 = (String) files.nextElement();
		String fileName1 = multi.getFilesystemName(file1);
		
		String b_name = multi.getParameter("b_name");
		String b_title = multi.getParameter("b_title");
		String b_mail = multi.getParameter("b_mail");
		String b_content = multi.getParameter("b_content");
		String b_pwd = multi.getParameter("b_pwd");
		int b_id = Integer.parseInt(multi.getParameter("b_id"));
		System.out.println("입력한 비밀번호:" + b_pwd);
		String b_filename="";
		String b_filesize="";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select b_pwd	from bmboard where b_id=" +b_id);
	    if(rs.next()){
			String b_pwd_db = rs.getString(1); // auto_increment 초기화 및 재정렬을 위한 변수 선언
			System.out.println("DB 비밀번호:" + b_pwd_db);
			if(b_pwd.equals(b_pwd_db)) {
				if(fileName1 == null) {
					b_filename = "default.PNG";
					b_filesize = "10640Bytes";
				} else{
					b_filename = fileName1;
					System.out.println(fileName1);
					File file = multi.getFile("b_filename");
					b_filesize=""+file.length()+"Bytes";
				}
				PreparedStatement pstmt = conn.prepareStatement("update bmboard set b_date=date_format(now(), '%y-%c-%e %H:%i:%s') where b_id="+b_id);
				pstmt.executeUpdate();
				String sql ="update bmboard set b_name = '"+b_name+"', b_title='"+b_title+"', b_mail='"+b_mail+"', b_content='"+b_content+"', b_filename='"+b_filename+"', b_filesize='"+b_filesize+"' where b_id="+b_id;
				stmt.execute(sql);
				response.sendRedirect("sfConnect.jsp");
				stmt.close();
				conn.close();
			}
			else{
				%>
				<script>
				alert("비밀번호를 확인해 주세요.");
				history.back();
				</script>
				<%
			}
		}
	} catch(Exception e) {
		out.print(e);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 정보 처리 페이지</title>
</head>
<body>

</body>
</html>
