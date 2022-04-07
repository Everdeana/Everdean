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
		
		name = multi.getParameter("name"); 
    	System.out.println(name); 
    	subject = multi.getParameter("subject"); 
    	System.out.println(subject); 
    	content = multi.getParameter("content"); 
    	System.out.println(content); 
		
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
	// response.sendRedirect("bbsResult.jsp?result=" + result);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시글 입력 처리 페이지 </title>
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
	button {
		background-color:#E2F3EA;
		border:solid green;
		font:bold 0.9em Arial; 
	}
</style>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="5">
		<caption> 입력 내용 확인 </caption>
		<tr>
			<td>작성자</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=subject %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=content %></td>
		</tr>
		<tr>
			<td>파일명</td>
			<td><%=filename01%></td>
		</tr>
		<tr>
			<td><button onclick="javascript:filecheck.submit()"> 입력 </button></td>
			<td><button onclick="location.href='bbsBoard_01.jsp'">처음으로</button></td>
		</tr>
	</table>
	<%--작성자: <%=name %>  <br /> 
 	제목: <%=subject %> <br /> 
	파일명: <%=filename01 %> <br />  --%>
 	<form name="filecheck" action="bbsResult.jsp" method="post">
		<input type="hidden" name="name" value="<%=name%>"> <br/>
		<input type="hidden" name="subject" value="<%=subject%>"> <br/>
		<input type="hidden" name="content" value="<%=content%>"> <br/>
		<input type="hidden" name="filename01" value="<%=filename01%>"> <br/>
		<input type="hidden" name="result" value="<%=result%>"> <br/>
		<%-- <%= name %> <-- 공백 X  --%>
	</form>
</body>
</html>
