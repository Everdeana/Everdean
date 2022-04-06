<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*, java.util.*"%>
<%-- page import="java.io.*" --%>
<%-- page import="java.util.Date" --%>
<%@ page import="java.util.Enumeration" %>    
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<% request.setCharacterEncoding("utf-8"); %>
<%
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String uploadPath = request.getRealPath("/upload");
    int size = 10 * 1024 *1024;  /* 업로드 되는 파일의 최대 크기 지정  */
    String filename01="";
	
	Date date = new Date();
	Long time = date.getTime();
	String filename = time + "txt"; // 파일 이름 -> 시간 | 확장자 -> txt
	String result; // 처리 결과에 값을 저장하기 위한 객체 변수 선언
	PrintWriter writer = null;
	
	/* 예외처리문 --> result->success, fail */
	try {
		/* 파일 저장 절대 경로 저장 */
		MultipartRequest  multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		String filePath = application.getRealPath("/upload/" + filename); // 절대경로
		
		/* Enumeration 객체 타입으로 반환 처리   */
    	Enumeration files = multi.getFileNames();
    	String file1 = (String) files.nextElement(); 
    	filename01 = multi.getFilesystemName(file1); 
    	System.out.println(filename01); /*  console에서 출력  */
    	
		writer = new PrintWriter(filePath);
		writer.printf("작성자: %s, %n", name); // %s -> 값, %n -> 개행문자
		writer.printf("제목: %s, %n", subject);
		writer.printf("내용: %s, %n", content);
		result = "success";
	}
	catch(IOException ioe) { // InputOutput 오류 발생 시
		result = "fail";
	}
	
	finally {
		try {
			writer.close(); // 파일 작업이 끝났을 시 닫아야함
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	response.sendRedirect("bbsResult.jsp?result=" + result);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시글 입력 처리 페이지 </title>
</head>
<body>
	<h3> 입력된 게시물을 처리하고 결과 페이지로 이동 합니다. </h3>
	작성자: <%=name %>  <br /> 
 	제목: <%=subject %> <br /> 
	파일명: <%=filename01 %> <br />
 	<form name="filecheck" action="bbsResult.jsp" method="post">
		<input type="hidden" name="name" value="<%=name%>"> <br/>
		<input type="hidden" name="subject" value="<%=subject%>"> <br/>
		<input type="hidden" name="filename1" value="<%=filename01%>"> <br/>
		<%-- <%= name %> <-- 공백 X  --%>
	</form>
</body>
</html>
