package com.exp.app.board.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exp.app.board.dao.BoardDao;
import com.exp.app.board.model.BoardBase;
import com.exp.app.board.model.BoardSearch;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession sqlSession;

	private final static String NS = "com.exp.app.board.dao.BoardDao.";

	@Override
	public List<BoardBase> selectBoardList(BoardSearch search) {
		return sqlSession.selectList(NS + "selectBoardList", search);
	}

	@Override
	public int countBoardList(BoardSearch search) {
		return sqlSession.selectOne(NS + "countBoardList", search);
	}
}
