package com.exp.app.code.model;

import com.exp.app.common.model.Criteria;

import lombok.Data;

@Data
public class CodeSearch extends Criteria {
	private int boardNo;
	private String boardNm;
	private String boardDesc;
	private String boardType;
	private String delYn;
}
