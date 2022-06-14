<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
        // 삭제하려는 사람의 ID값을 받아옴
        String b_id = request.getParameter("b_id");
    	String passwd = request.getParameter("passwd");
    	String pwd = null;
    	int resn = 0; 
        // 유효성 체크
        if(b_id==null||b_id.trim().equals("")){
            response.sendRedirect("sfConnect.jsp");
            // 널일 경우 sfConnect.jsp페이지로 돌려보낸다.
            return;
        }
        // db와 연결하여 delete문을 전송
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbmboard?allowMultiQueries=true&useUnicode=true&characterEncoding=utf8", "momo", "1234");
        Statement stmt = conn.createStatement(); // 연결이 된 상태에서 쿼리문 처리
		ResultSet rs = stmt.executeQuery("select max(b_id) from bmboard"); 
		// 저장된 번호 최대값 확인 --> auto_increment 초기화 후 최대값을 찾아 그 다음 번호부터 데이터가 입력되기 위해 사용
		if(rs.next()){
			resn = rs.getInt(1); // auto_increment 초기화 및 재정렬을 위한 변수 선언
			rs.close();
		}
		ResultSet rs1 = stmt.executeQuery("select b_pwd	from bmboard where b_id=" +b_id);
        if(rs1.next()){
			pwd = rs1.getString(1); // auto_increment 초기화 및 재정렬을 위한 변수 선언
			rs1.close();
			stmt.close();
		}
        // System.out.println(pwd);
        // System.out.println(passwd);
		if(!pwd.equals(passwd)) {
			%>
			<script>
			alert("비밀번호가 일치하지 않습니다!");
            location.href="sfConnect.jsp";
            </script>
            <%
		} else if(pwd.equals(passwd)){
		
        String sql = "delete from bmboard where b_id = ?"; // 삭제 쿼리
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, b_id);
        int result = ps.executeUpdate();
        
        String sql1 = "set @cnt = 0;"; // 번호 초기화
        ps = conn.prepareStatement(sql1);
        ps.executeUpdate();
        
        String sql2 = "update bmboard set bmboard.b_id = @cnt:=@cnt+1"; // b_id 재정렬
        ps = conn.prepareStatement(sql2);
        ps.executeUpdate();
        
        // System.out.println(resn);
        String sql3 = "alter table bmboard auto_increment=" + resn;
        // rs로 쿼리 결과값을 int형으로 받아서  최대값의 다음 값부터 데이터가 입력되도록 한다.
        ps = conn.prepareStatement(sql3);
        ps.executeUpdate();
        // System.out.println(sql3);
        
        // 그 실행 결과를 스크립트 로 처리
        String msg = "글 삭제";
        String urlMove="sfConnect.jsp";
        
        if(result > 0){
            msg+=" 성공!";
            urlMove="sfConnect.jsp";
        }else{
            msg+=" 실패";
        }      
        %>
            <script>
                alert("<%=msg%>");
                location.href="<%=urlMove%>";
            </script>
        <%
        // db연결 자원 반납
        if(ps != null) ps.close();
        if(conn != null) conn.close();
		}
		else {
			%>
			<script>
			alert("삭제하는데 실패하였습니다");
            location.href="sfConnect.jsp";
            </script>
            <%
		}
    %>
</body>
</html>
