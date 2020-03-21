package com.exp.app.board.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exp.app.board.controller.BoardController;
import com.exp.app.board.dao.BoardDao;
import com.exp.app.board.model.BoardBase;
import com.exp.app.board.model.BoardSearch;

@Repository
public class BoardDaoImpl implements BoardDao {

	private static final Logger logger = LoggerFactory.getLogger(BoardDaoImpl.class);

	@Autowired
	private SqlSession sql;

	private final static String NS = "com.exp.app.board.dao.BoardDao.";

	@Override
	public List<BoardBase> selectBoardList(BoardSearch search) {
		return sql.selectList(NS + "selectBoardList", search);
	}

	@Override
	public int countBoardList(BoardSearch search) {
		return sql.selectOne(NS + "countBoardList", search);
	}

}
