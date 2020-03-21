package com.exp.app.code.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exp.app.code.dao.CodeDao;
import com.exp.app.code.model.CodeBase;
import com.exp.app.code.model.CodeSearch;

@Repository
public class CodeDaoImpl implements CodeDao {

	private static final Logger logger = LoggerFactory.getLogger(CodeDaoImpl.class);

	@Autowired
	private SqlSession sql;

	private final static String NS = "com.exp.app.code.dao.CodeDao.";

	@Override
	public List<CodeBase> selectCodeList(CodeSearch search) {
		return sql.selectList(NS + "selectCodeList", search);
	}

	@Override
	public int countCodeList(CodeSearch search) {
		return sql.selectOne(NS + "countCodeList", search);
	}

}
