package com.exp.app.board.service;

import java.util.List;

import com.exp.app.board.model.BoardBase;
import com.exp.app.common.model.Criteria;

public interface BoardService {
	public List<BoardBase> selectBoardList(Criteria cri);
}
