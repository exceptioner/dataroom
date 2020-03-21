package com.exp.app.board.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.app.board.dao.BoardDao;
import com.exp.app.board.model.BoardBase;
import com.exp.app.board.model.BoardSearch;
import com.exp.app.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);

	@Autowired
	BoardDao dao;

	@Override
	public List<BoardBase> selectBoardList(BoardSearch search) {
		return dao.selectBoardList(search);
	}

	@Override
	public int countBoardList(BoardSearch search) {
		return dao.countBoardList(search);
	}

}
