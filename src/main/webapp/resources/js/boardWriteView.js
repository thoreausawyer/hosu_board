function cancleBoardPost() {
        // 리스트 돌아가기        	
	window.location.href = "/board/boardList";
}
// 입력값 변경 이벤트를 감지하여 처리하는 함수
function handleInputChange() {
   // 입력된 제목과 내용 가져오기
   var title = document.querySelector('.board-write-input-title').value;
   var content = document.querySelector('.board-write-input-contents').value;
   
   // 콘솔에 출력
   console.log('제목:', title);
   console.log('내용:', content);
}
// 입력값 변경 이벤트에 대한 핸들러 설정
	document.querySelector('.board-write-input-title').addEventListener('input', handleInputChange);
	document.querySelector('.board-write-input-contents').addEventListener('input', handleInputChange);
      