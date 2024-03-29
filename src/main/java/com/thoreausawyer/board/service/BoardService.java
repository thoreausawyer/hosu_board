package com.thoreausawyer.board.service;

import java.util.List;

import com.thoreausawyer.board.vo.BoardDto;

public interface BoardService {
	
	public void insertBoard(BoardDto dto);
	
	public BoardDto getBoardDetail(Long num);
	
	public boolean updateBoard(BoardDto dto);
	
	public boolean deleteBoard(Long num);
	
	public List<BoardDto> getBoardList();

}
