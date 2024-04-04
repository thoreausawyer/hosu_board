<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<title>소로소여 게시글 수정 페이지</title>
<meta charset="UTF-8" />

<!-- css,js,assets 경로 설정 편하게 하기 위해 선언 -->
<base href="${pageContext.request.contextPath}/resources/">
<!-- .css 추가  -->
<link rel="stylesheet" type="text/css" href="css/boardUpdateView.css"/>
<!-- js import -->
<script src="js/boardUpdateView.js"></script>

<style type="text/css">

input {
    background-color: transparent; /* 배경색을 투명하게 설정 */
}


</style>

</head>
<body>
     <div class="board-update-wrapper">
     
        <div class="board-update-title">소로소여 게시글 수정 페이지 입니다 :)</div>
        
        <form id="boardUpdateForm" action="/board/boardUpdate" method="post">
        
	        <div class="board-update-container">
		        <div class="board-update-title-box">
				    <label>제목 :</label> 
				    <input name="title" class="board-update-input-title" value="${board.title}"/>
		        </div>
		        <div class="board-update-username-box">
		            <label>글쓴이 :</label> <input type="text" value="${board.name}" readonly />
		        </div>
		        <div class="board-update-content-box">
		            <label>내용 :</label><br>
		            <textarea name="content" cols="70" rows="15">${board.content}</textarea> 
		        </div>
		        <div class="board-update-file-box">
		            <label>첨부 파일:</label> (예: 파일명.pdf)
		        </div>
	    	</div>
	        <div class="board-update-button-box">
	            <button class="btn" id="btnUpdate" type="button">수정</button>
	            <button type="button" onclick="goToDetail(${board.num})">취소</button>
	            <button type="button" onclick="deletePost(${board.num})">삭제</button>
	        </div>
		    
        </form>
        
    </div>
    
    <script type="text/javascript">
    
    let mForm = $("#boardUpdateForm");
    
	console.log(mForm);
    $("#btnUpdate").on("click", function(e){
            mForm.submit();
        });
    
    
    </script>
    
</body>
</html>

