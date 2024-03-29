package com.thoreausawyer.board.vo;

import java.util.List;

public class BoardDto {
	
	private int num;
	private String name;
	private String title;
	private String content;
	private String writerEmail; // 특정 유저 일치를 위해
	private String writeDatetime; // 가져오려면 있어야한다.
	private String writeUpdateDatetime; // 가져오려면 있어야한다.
	private List<BoardDto> list; // 리스트로 만들어서 뿌림
		
	// 기본 생성자
	public BoardDto() {}
	
	// 매개변수 생성자
	public BoardDto(int num,  String title, String content,  String name, String writeDatetime, String writeUpdateDatetime,  List<BoardDto> list) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.name = name;
		this.writeDatetime = writeDatetime;
		this.writeUpdateDatetime = writeUpdateDatetime;
		this.list = list;
//		this.writerEmail = email; // join해서 가져와야 하나? // 특정 유저dto와 같은지 확
	}

	// getter/setter
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
	    if (content != null && content.length() > 35) {
	        return content.substring(0, 35) + "...";
	    }
	    return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriterEmail() {
		return writerEmail;
	}

	public void setWriterEmail(String writerEmail) {
		this.writerEmail = writerEmail;
	}

	public String getWriteDatetime() {
		return writeDatetime;
	}

	public void setWriteDatetime(String writeDatetime) {
		this.writeDatetime = writeDatetime;
	}

	public String getWriteUpdateDatetime() {
		return writeUpdateDatetime;
	}

	public void setWriteUpdateDatetime(String writeUpdateDatetime) {
		this.writeUpdateDatetime = writeUpdateDatetime;
	}

	public List<BoardDto> getList() {
		return list;
	}

	public void setList(List<BoardDto> list) {
		this.list = list;
	}


}
