package com.exp.app.board.dao;

import java.util.List;

import com.exp.app.board.model.BoardBase;
import com.exp.app.board.model.BoardSearch;


public interface BoardDao {
	public List<BoardBase> selectBoardList(BoardSearch search);

	public int countBoardList(BoardSearch search);

}
