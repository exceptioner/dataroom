package com.exp.app.code.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.app.code.dao.CodeDao;
import com.exp.app.code.model.CodeBase;
import com.exp.app.code.model.CodeSearch;
import com.exp.app.code.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService {

	private static final Logger logger = LoggerFactory.getLogger(CodeServiceImpl.class);

	@Autowired
	CodeDao dao;

	@Override
	public List<CodeBase> selectCodeList(CodeSearch search) {
		return dao.selectCodeList(search);
	}

	@Override
	public int countCodeList(CodeSearch search) {
		return dao.countCodeList(search);
	}

}
