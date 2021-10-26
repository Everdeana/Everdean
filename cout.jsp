<%@ page ianguage="java" contextType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="jspproject.ch11.*" %>

<!-- taglib 지시어 추가 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE htmi>
<html>
<head>
<meta charset="UTF-8">
<title>c:out 실습</title>
</head>
<body>
<H3>&lt;c:out&gt; 실습</H3> // c:out을 직접 입력하면 태그로 인식하기 때문에 html 인코딩을 사용
	
<table border="1" style="cellpadding:5;cellspacing:0">
	<c:forEach var="member" items="${members}">
		<tr>
		<!-- member는 기본 생성자를 통해 생성된 객체로, ("홍길동", "test@test.net") -->
		<!-- 두 필드의 출력 내용은 동일하나, JSTL 사용한 것이 훨씬 간단 -->
		<td>
			<!-- 표현식을 이용한 출력 -->
			<%= ((Member)pageContext.getAttribute("member")).getName() %>
		</td>
			<!-- 표현 언어를 이용한 출력 -->
			<td> ${member.name} </td>
		<td>
		<!-- c:out을 이용한 출력 -->
		<!--  -->
		<!--  -->
		<!--  -->
		<!--  -->
</body>
</html>
