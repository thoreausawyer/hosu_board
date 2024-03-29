	/* 페이지 이동 방법 1 */
    function editPost() {
        // 수정 기능 구현 -> 해당 게시물의 수정화면으로
        window.location.href = "/board/boardUpdateView"
    }
	
    /* 페이지 이동 방법 2 */
    function deletePost(num) {
        console.log("메서드는 타나? 게시물 번호 : " + num)
        let conf = confirm("게시물을 삭제하시겠습니까?");
        if (conf == true) {
            location.href = "/board/boardDelete?num=" + num;
            alert("게시글이 삭제되었습니다.");
        }
    }

    function goToList() {
        // 목록으로 이동
        window.location.href = "/board/boardList";
    }
