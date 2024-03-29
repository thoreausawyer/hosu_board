package com.thoreausawyer.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thoreausawyer.board.vo.BoardDto;
import com.thoreausawyer.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
		@Autowired
		private BoardService boardService;
		
		// 게시글 작성 화면
			@RequestMapping(value="/boardWriteView", method=RequestMethod.GET)
			public String getBoardWriteView() {
				
				System.out.println("게시글 작성 화면 컨트롤러");
				return "board/boardWriteView";
			}
	
		// 게시글 작성하기
		
		@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
		public String insertBoard(BoardDto dto) {
			System.out.println("게시글 작성 컨트롤러");
			boardService.insertBoard(dto);
			return "redirect:boardList";
			
		}
		
		// 특정 게시물 불러오기
		
		@RequestMapping(value="/boardDetail", method=RequestMethod.GET)
		public String getBoardDetail(
	            @RequestParam("num") Long num, Model model
	            ) {
		    System.out.println("게시글 화면 불러오기 컨트롤러");
		    System.out.println(num);
		    BoardDto board = boardService.getBoardDetail(num); // 맵퍼를 통해 게시물 가져오기
		    model.addAttribute("board", board); // 모델에 게시물 추가
		    
		    return "board/boardDetail";
		}

		
		//게시글 수정 화면
		@RequestMapping(value="/boardUpdateView", method=RequestMethod.GET)
		public String updateBoardView(
				@RequestParam("num") Long num, Model model) {
			System.out.println("게시물 수정 화면 컨트롤러");
			System.out.println(num);
			BoardDto board = boardService.getBoardDetail(num);
			model.addAttribute("board", board);
			
			return "board/boardUpdateView";
		}
		
		//게시글 수정
		@RequestMapping(value="/boardUpdate", method=RequestMethod.POST)
		public String updateBoard(BoardDto dto, Model model
				) {
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			boolean result = boardService.updateBoard(dto);
			model.addAttribute("result", result);
			return "redirect:boardDetail";
		}
		
		//게시글 삭제
		@RequestMapping(value="/boardDelete", method=RequestMethod.GET)
		public String deleteBoard(
				@RequestParam("num") Long num){
			System.out.println("삭제할 게시글 번호 : " + num);
			boardService.deleteBoard(num);
			return "redirect:boardList";
		}
	
		// 게시판 리스트 불러오기
		@RequestMapping(value="/boardList", method=RequestMethod.GET )
		public String getBoardList(Model model){
			System.out.println("게시판 리스트 불러오기 컨트롤러");
			
			List<BoardDto> board = boardService.getBoardList();
			model.addAttribute("board", board);
			
			return "board/boardList";
		}
		
		// 게시판 메인 화면
		@RequestMapping(value="/boardMain", method=RequestMethod.GET)
		public String getBoardMain() {
			return "board/boardMain";
		}
		
			
}

