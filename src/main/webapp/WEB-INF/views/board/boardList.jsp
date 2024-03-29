<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>게시판 리스트 페이지</title>
<meta charset="UTF-8" />
<!-- css,js,assets 경로 설정 편하게 하기 위해 선언 -->
<base href="${pageContext.request.contextPath}/resources/">
<link rel="stylesheet" type="text/css" href="css/boardList.css">
<!-- js import -->
<script src="js/boardList.js"></script>

</head>
<body>
    <div class="board-list-wrapper">
        <div class="board-list-title">소로소여 게시판 리스트 페이지 입니다 :)</div>
        <table class="board-list-table">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>내용</th>
                    <th>글쓴이</th>
                    <th>작성일자</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${board}" var="board" varStatus="num">
				    <tr>
				        <td>${board.num}</td>
				        <td><a href="/board/boardDetail?num=${board.num}">${board.title}</a></td>
				        <td>${board.content}</td>
				        <td>${board.name}</td>
				        <td>${board.writeDatetime}</td>
				    </tr>
				</c:forEach>

            </tbody>
        </table>
        <div class="board-write-button">
            <button onclick="onBoardWriteClickEvent()">게시글 작성</button>
            <button onclick="onBoardMainClickEvent()">메인페이지</button>
        </div>
    </div>

</body>
</html>
