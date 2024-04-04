package com.thoreausawyer.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoreausawyer.board.mapper.BoardMapper;
import com.thoreausawyer.board.vo.BoardVo;

@Service("boardService")
public class BoardServiceImplement implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public void insertBoard(BoardVo dto) {
		
		boardMapper.insertBoard(dto);
		
		System.out.println("여기는 오나? 서비스 임플");
		
	}

	@Override
	public BoardVo getBoardDetail(Long num) {
		return boardMapper.getBoardDetail(num);
	}

	@Override
	public boolean updateBoard(BoardVo dto) {
		
		return boardMapper.updateBoard(dto) == 1;
	}

	@Override
	public boolean deleteBoard(Long num) {
		
		return boardMapper.deleteBoard(num) == 1;
	}

	@Override
	public List<BoardVo> getBoardList() {
		
		System.out.println("여기는 오나?");

		return boardMapper.getBoardList();
	}
	

}
