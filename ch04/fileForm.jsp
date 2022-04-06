<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- euc-kr / utf-8 문자 셋    -->
<meta charset="UTF-8">
<title>파일 업로드 페이지 </title>
<style> 
 #send{
  background:#097709; 
  font:bold 1.1em 서울남산체; 
  color:white; 
 }
</style>
</head>
<body>
<h2> File 업로드 페이지 입니다. </h2>
<form action="fileUpload01.jsp" method="post" enctype="multipart/form-data"> 
 <table border="1" cellspacing="0"  cellpadding="5"> 
 <caption> File Upload Form </caption>
  <tr> <td> 작성자  </td>   
       <td> <input type="text" name="name" value="">   </td>   </tr> 
  <tr> <td> 제목 </td>   
       <td> <input type="text" name="subject" value="">    </td>   </tr> 
  <tr> <td> 파일명1 </td>  
          <td> <input type="file" name="fileName1">    </td>  </tr>
  <tr> <td> 파일명2  </td>   
          <td> <input type="file" name="fileName2">    </td>  </tr>  
  <tr>  <td align="center" colspan="2"> 
        <input type="submit" id="send" value="전송">
        <input type="reset" value="취소"> 
       </td>    
   </tr>         
 </table>
</form>
</body>
</html>
