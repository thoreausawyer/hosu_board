<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>게시물 상세 보기</title>
<meta charset="UTF-8" />

<!-- css,js,assets 경로 설정 편하게 하기 위해 선언 -->
<base href="${pageContext.request.contextPath}/resources/">
<!-- .css 추가  -->
<link rel="stylesheet" type="text/css" href="css/boardDetail.css">
<!-- js import -->
<script src="js/boardDetail.js"></script>

</head>
<body>
<div class="board-detail-wrapper">
    <div class="board-detail-title">소로소여 특정 게시글 페이지 입니다 :)</div>
    <div class="container">
        <div class="details">
            <label>제목:</label> ${board.title}
        </div>
        <div class="details">
            <label>글쓴이:</label> ${board.name}
        </div>
        <div class="details">
            <label>작성일:</label> ${board.writeDatetime}
        </div>
        <div class="content">
            <label>내용:</label><br>
            ${board.content}
        </div>
        <div class="details">
            <label>첨부 파일:</label> (예: 파일명.pdf)
        </div>
        <div class="board-detail-button-box">
            <button type="button"><a href="/board/boardUpdateView?num=${board.num}">수정</a></button>
            <button type="button" onclick="goToList()">목록</button>
            <button type="button" onclick="deletePost(${board.num})">삭제</button>
        </div>
    </div>
</div>

</body>
</html>
