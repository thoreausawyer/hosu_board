package com.thoreausawyer.board.mapper;

import java.util.List;

import com.thoreausawyer.board.vo.BoardVo;


public interface BoardMapper {
	
		// 리스트 불러오기
		public List<BoardVo> getBoardList();
		
		// 게시글 작성하기
		public void insertBoard(BoardVo dto);
		
		// num 예외
		public void insertSelectKey(BoardVo dto);
		
		// 게시물 불러오기
		public BoardVo getBoardDetail(Long num);
		
		// 특정 게시물 삭제
		public int deleteBoard(Long num);
		
		// 게시물 업데이트
		public int updateBoard(BoardVo dto);
		
}
