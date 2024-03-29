<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>소로소여 게시글 작성 페이지</title>
<meta charset="UTF-8" />

<!-- css,js,assets 경로 설정 편하게 하기 위해 선언 -->
<base href="${pageContext.request.contextPath}/resources/">
<!-- .css 추가  -->
<link rel="stylesheet" type="text/css" href="css/boardWriteView.css"/>
<!-- js import -->
<script src="js/boardWriteView.js"></script>

</head>
<body>
     <div class="board-write-wrapper">
	        <div class="board-write-title">소로소여 게시글 작성 페이지 입니다 :)</div>
	        
	        <form action="/board/boardWrite" method="post">
	        
		        <div class="board-write-container">
			        <div class="board-write-title-box">
			            <label>제목 :</label> 
			            <input class="board-write-input-title" type="text" name="title" placeholder="제목을 입력하세요."/>
			        </div>
			        <div class="board-write-username-box">
			            <label>글쓴이 :</label> 
			            <input class="board-write-username" type="text" placeholder="로그인된 유저 이름 호출." readonly />
			        </div>
			        <div class="board-write-content-box">
			            <label>내용 :</label><br>
			            <textarea class="board-write-input-contents" name="content" cols="70" rows="15" placeholder="내용을 입력하세요."></textarea>
			        </div>
			        <div class="board-write-file-box">
			            <label>첨부 파일:</label> 
			            <div class="board-write-file-upload">(예: 파일명.pdf)</div> 
			        </div>
			    </div>
		        <div class="board-write-button-box">
				        <button class="board-write-submit" type="submit">등록</button>
				        <button class="board-write-list" type="button" onclick="cancleBoardPost()">취소</button>
			    </div>
			    
	        </form>
        
    	</div>
    
</body>
</html>
