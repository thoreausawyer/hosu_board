function onBoardListBackClickEvent() {
    window.location.href = "/board/boardList";
}

function editPost(num) {
    let conf = confirm("수정 하시겠습니까?");
    if (conf == true) {
    window.location.href = "/board/boardUpdate";
    alert("게시글이 수정되었습니다.");
    }
}

function goToDetail(num) {
	let conf = confirm("수정을 취소하시겠습니까?");
    if (conf == true) {
        location.href = "/board/boardDetail?num=" + num;
        alert("게시글이 수정이 취소되었습니다.");
    }
}