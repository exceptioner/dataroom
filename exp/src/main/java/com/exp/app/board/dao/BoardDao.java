package com.exp.app.board.dao;

import java.util.List;

import com.exp.app.board.model.BoardBase;
import com.exp.app.common.model.Criteria;


public interface BoardDao {
	public List<BoardBase> selectBoardList(Criteria cri);

}
