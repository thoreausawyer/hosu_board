<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>소로소여 게시판 메인페이지</title>
<meta charset="UTF-8" />

<!-- css,js,assets 경로 설정 편하게 하기 위해 선언 -->
<base href="${pageContext.request.contextPath}/resources/">
<!-- .css import  -->
<link rel="stylesheet" type="text/css" href="css/boardMain.css"/>
<!-- js import -->
<script src="js/boardMain.js"></script>

</head>
<body>
    <div class="board-main-wrapper">
        <div class="board-main-title">안녕하세요 소로소여 게시판 메인페이지 입니다 :)</div>
        <div class="board-main-button">
	        <button onclick="onMoveToBoardClickHandler()">게시판으로 가기</button>
        </div>
    </div>
  
</body>
</html>
