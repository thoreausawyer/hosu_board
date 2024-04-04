package com.thoreausawyer.board.service;

import java.util.List;

import com.thoreausawyer.board.vo.BoardVo;

public interface BoardService {
	
	public void insertBoard(BoardVo dto);
	
	public BoardVo getBoardDetail(Long num);
	
	public boolean updateBoard(BoardVo dto);
	
	public boolean deleteBoard(Long num);
	
	public List<BoardVo> getBoardList();

}
