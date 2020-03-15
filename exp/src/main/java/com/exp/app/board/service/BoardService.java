package com.exp.app.board.service;

import java.util.List;

import com.exp.app.board.model.BoardBase;
import com.exp.app.board.model.BoardSearch;

public interface BoardService {
	public List<BoardBase> selectBoardList(BoardSearch search);

	public int countBoardList(BoardSearch search);
}
