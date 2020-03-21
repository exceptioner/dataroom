package com.exp.app.code.dao;

import java.util.List;

import com.exp.app.code.model.CodeBase;
import com.exp.app.code.model.CodeSearch;

public interface CodeDao {
	public List<CodeBase> selectCodeList(CodeSearch search);

	public int countCodeList(CodeSearch search);

}
