package com.exp.app.board.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardBase {
	private String bltnNmbr;
	private String nameBoard;
	private String dscrp;
	private String boardType;
	private String rgstr;
	private Timestamp rgstrDate;
	private String mdfr;
	private Timestamp mdfctDate;
	private String dltd;
}
