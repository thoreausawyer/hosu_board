
function onBoardListBackClickEvent() {
    window.location.href = "/board/boardList";
}


    
function goToDetail(num) {
	let conf = confirm("수정을 취소하시겠습니까?");
    if (conf == true) {
        location.href = "/board/boardDetail?num=" + num;
        alert("게시글이 수정이 취소되었습니다.");
    }
}