package com.exp.app.board.dao;

import java.util.List;

import com.exp.app.board.model.BoardBase;


public interface BoardDao {
	public List<BoardBase> selectBoardList();

}
