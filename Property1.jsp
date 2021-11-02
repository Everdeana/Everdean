<%@ page language="java" contextType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div align="center">
        <h2>ch13 : ServletContext 초기화 매개변수 확인 (Property1.jsp)</h2>
        <hr>
        ServletContext 설정값 출력
        <hr>
        <!-- ServletContext로 설정한 초기값은 jsp 파일에서도 인식 가능함 -->
        name1 : <%@ getServletContext().getInitParameter("name1") %>
    </div>
</body>
</html>
  
