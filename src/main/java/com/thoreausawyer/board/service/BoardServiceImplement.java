package com.thoreausawyer.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoreausawyer.board.mapper.BoardMapper;
import com.thoreausawyer.board.vo.BoardDto;

@Service("boardService")
public class BoardServiceImplement implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public void insertBoard(BoardDto dto) {
		
		boardMapper.insertBoard(dto);
		
		System.out.println("여기는 오나? 서비스 임플");
		
	}

	@Override
	public BoardDto getBoardDetail(Long num) {
		return boardMapper.getBoardDetail(num);
	}

	@Override
	public boolean updateBoard(BoardDto dto) {
		
		return boardMapper.updateBoard(dto) == 1;
	}

	@Override
	public boolean deleteBoard(Long num) {
		
		return boardMapper.deleteBoard(num) == 1;
	}

	@Override
	public List<BoardDto> getBoardList() {
		
		System.out.println("여기는 오나?");

		return boardMapper.getBoardList();
	}
	

}
