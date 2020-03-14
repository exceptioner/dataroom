package com.exp.app.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exp.app.board.model.BoardBase;
import com.exp.app.board.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String selectBoardList(Locale locale, Model model) {
		logger.info("selectBoardList in......");
		List<BoardBase> list = service.selectBoardList();
		logger.debug("list ::::::::::::::::::::::::: " + list.toString());

		model.addAttribute("list", list);
		return "board/list";
	}

}
