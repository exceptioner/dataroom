package com.exp.app.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.app.board.dao.BoardDao;
import com.exp.app.board.model.BoardBase;
import com.exp.app.board.service.BoardService;
import com.exp.app.common.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;

	@Override
	public List<BoardBase> selectBoardList(Criteria cri) {
		return dao.selectBoardList(cri);
	}

}
