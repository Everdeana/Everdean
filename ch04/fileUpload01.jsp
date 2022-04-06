<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>    
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%
  /* 실제 파일이 저장되는 시스템 상의 경로  */ 
    String uploadPath = request.getRealPath("/upload");
    int size = 10 * 1024 *1024;  /* 업로드 되는 파일의 최대 크기 지정  */
    String name=""; 
    String subject=""; 
    String filename1=""; 
    String filename2=""; 
    /* 예외 처리문  */ 
    try{
    	MultipartRequest  multi = new MultipartRequest(request, uploadPath, size, "utf-8", 
    			                           new DefaultFileRenamePolicy());
    	name = multi.getParameter("name"); 
    	System.out.println(name); 
    	subject = multi.getParameter("subject"); 
    	System.out.println(subject); 
    	
    	/* Enumeration 객체 타입으로 반환 처리   */
    	Enumeration files = multi.getFileNames(); 
    	/* Enumeration 객체에서 데이터 저장 자료 구조는 
    	    스택 구조 타입으로 저장 됨 */ 
    	String file2 = (String) files.nextElement(); 
    	filename2 = multi.getFilesystemName(file2);
    	System.out.println(filename2);  /* console에서 출력 */ 
    	
    	String file1 = (String) files.nextElement(); 
    	filename1 = multi.getFilesystemName(file1); 
    	System.out.println(filename1); /*  console에서 출력  */ 
    	
    	
    	
    }  catch(Exception e){
    	e.printStackTrace(); 
    }


%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 처리 페이지 </title>
</head>
<body>
 	작성자: <%=name %>  <br /> 
 	제목: <%=subject %> <br /> 
 	파일명1 : <%=filename1 %> <br /> 
 	파일명2: <%=filename2 %> <br />
 	<form name="filecheck" action="fileCheck01.jsp" method="post">
		<input type="hidden" name="name" value="<%=name%>"> <br/>
		<input type="hidden" name="subject" value="<%=subject%>"> <br/>
		<input type="hidden" name="filename1" value="<%=filename1%>"> <br/>
		<input type="hidden" name="filename2" value="<%=filename2%>"> <br/>
		<%-- <%= name %> <-- 공백 X  --%>
	</form>
	<a href="#" onclick="javascript:filecheck.submit()">업로드된 정보 확인</a>
</body>
</html>
