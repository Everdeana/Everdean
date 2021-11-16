<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 로그인이 되어 있는 상태에서는 게시글 입력이 가능함 -->
<c:if test="${uid != null}">
    <input type="submit" value="글쓰기">
</c:if>
