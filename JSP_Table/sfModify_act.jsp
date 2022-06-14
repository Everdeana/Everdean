<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.io.*, java.util.*"%>
<%@ page import="java.util.Enumeration" %>    
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 수정 처리 페이지</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<%	
	String uploadPath = request.getRealPath("/upload");
	String pwd = null;
	
	int size = 10 * 1024 *1024;  // 업로드 되는 파일의 최대 크기 지정 
	String b_filename="";
	String b_filesize="";
	try{
		MultipartRequest  multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		// Enumeration 객체 타입으로 반환 처리  
		Enumeration<?> files = multi.getFileNames();
		// Enumeration 객체에서 데이터 저장 자료 구조는 스택 구조 타입으로 저장 됨 
		String file1 = (String) files.nextElement();
		String fileName1 = multi.getFilesystemName(file1);
		String b_pwd = multi.getParameter("b_pwd");
		String b_pwd_db = null;
		
		if(fileName1 == null) {
			b_filename = "default.png";
			b_filesize = "5517Bytes";
		} else{
			b_filename = fileName1;
			File file = multi.getFile("b_filename");
			b_filesize=""+file.length()+"Bytes";
		}
		// multi 매개변수의 값을 문자열로 반환한다. 또는 매개변수가 없다면 null값을 반환한다. 문자열로 반환한 id값을 Integer형으로 변환한다.
		int b_id = Integer.parseInt(multi.getParameter("b_id"));
		String b_name = multi.getParameter("b_name");
		String b_title = multi.getParameter("b_title");
		String b_mail = multi.getParameter("b_mail");
		String b_content = multi.getParameter("b_content");
		/*
		   이름, 제목, 메일, 내용에 대한 문자열 변수를 선언한다.
		  multi 매개변수의 값을 문자열로 반환한다.
		   또는 매개변수가 존재하지 않을 경우 null값을 반환한다.
		*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		/*
		  DB 드라이버를 설정한다.
		  MySQL5.7 버전에서는 다음과 같이 "com.mysql.jdbc.driver"로 작성할 경우 정상적으로 클래스명을 인식할 수 있다.
		   하지만 MySQL8.0 버전에서는 위와 같이 입력할 경우 ClassNotFoundException 예외 상황이 발생한다.
		   해당 에러를 해결하기 위해 jdbc 앞에 cj를 작성한다.
		*/
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbmboard?useUnicode=true&characterEncoding=utf8", "momo", "1234");
		// localhost: DB 서버명, memberex: 연결시키고자 하는 DB명, min: 사용자명, 9647: 비밀번호	
		Statement stmt = conn.createStatement();
		
		ResultSet rs1 = stmt.executeQuery("select b_pwd	from bmboard where b_id=" +b_id);
        if(rs1.next()){
        	b_pwd_db = rs1.getString(1); // auto_increment 초기화 및 재정렬을 위한 변수 선언
			rs1.close();
		}
        
		if(!pwd.equals(b_pwd)) {
			%>
			<script>
			alert("비밀번호가 일치하지 않습니다!");
            location.href="sfConnect.jsp";
            </script>
            <%
		} else if(pwd.equals(b_pwd)){
			
		// DB 쿼리문을 실행하기 위한 객체 변수 stmt를 선언한다.
		String sql ="update bmboard set b_name = '"+b_name+"', b_title='"+b_title+"', b_mail='"+b_mail+"', b_content='"+b_content+"', b_filename='"+b_filename+"', b_filesize='"+b_filesize+"' where b_id="+b_id;
		/*
		   기존에 테이블에 등록한 데이터를 변경하기 위한 SQL문에 대한 문자열 변수 sql을 선언한다.
		   원 구문: update 테이블명 set column명 = '변경할 값' where 조건;
		   조건에 id를 작성한 것은 id를 자동으로 증가하는 값(auto_increment)으로 설정해서 데이터를 삽입, 수정, 삭제, 검색하는 과정에서 id를 SQL문에 작성하지 않기 때문이다.
		*/
		stmt.executeUpdate(sql);
		// insert문, update문 또는 delete문 또는 SQL문일지도 모르는 지정된 SQL문을 반환한다. 기서 SQL문은 SQL DDL문처럼 아무것도 반환하지 않는 SQL문이다.
		response.sendRedirect("sfConnect.jsp");
		/* sendRedirect();
		  --> 지정된 재전송 위치 URL을 사용하여 임시 재전송 응답을 보내고 버퍼를 지운다.
		  --> 버퍼는 sendRedirect() 메서드에 의해 설정된 데이터로 교체된다.
		  --> 이 메서드를 호출하면 상태 코드가 SC_FOUND 302(Found)로 설정된다.
		  --> 이 메서드는 상대 URL을 허용할 수 있다.
		  --> 서블릿 컨테이너는 응답을 클라이언트에 보내기전에,
		  --> 상대 URL을 절대적인 URL로 변환해야 한다
		  --> 만약에 위치가 선행 '/'이 없는 상대적인 위치일 경우,
		  --> 컨테이너는 서블릿 컨테이너 루트에 상대적인 것으로 해석한다.
		  --> 응답이 이미 커밋된 경우, 해당 메서드는 IllegalStateException 예외 상황을 발생시킨다.
		  --> 이 메서드를 사용한 후에 응답이 커밋된 것으로 간주해야하며 작성해서는 안된다.
		  --> 매개변수: location
		  --> 상대 위치 URL은 IOException 예외 상황을 발생시킨다.- 입출력 예외 상황 발생
		  IllegalStateException
		  --> 응답이 커밋되거나 부분적인 URL이 지정됬지만 유효한 URL로 변환할 수 없다. */
		stmt.close();
		  conn.close();
		stmt.close(); // 각 객체의 DB와 자바에서 DB에 접속할 수 있도록 해주는 JDBC 리소스(자원)를 기다리게 하는 대신에 즉시 해제시키며 이러한 상황은 DB와 JDBC 리소스가 자동으로 종료될 때 발생한다.
        } else {
			%>
			<script>
			alert("삭제하는데 실패하였습니다");
            location.href="sfConnect.jsp";
            </script>
            <%
		}
	}catch(Exception e){
		out.println(e);
	}
	%>
<p> 학생 정보 수정 처리 페이지</p>
</body>
</html>
