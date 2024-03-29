package com.thoreausawyer.board.mapper;

import java.util.List;

import com.thoreausawyer.board.vo.BoardDto;


public interface BoardMapper {
	
		// 리스트 불러오기
		public List<BoardDto> getBoardList();
		
		// 게시글 작성하기
		public void insertBoard(BoardDto dto);
		
		// num 예외
		public void insertSelectKey(BoardDto dto);
		
		// 게시물 불러오기
		public BoardDto getBoardDetail(Long num);
		
		// 특정 게시물 삭제
		public int deleteBoard(Long num);
		
		// 게시물 업데이트
		public int updateBoard(BoardDto dto);
		
}
