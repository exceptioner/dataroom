package com.exp.app.code.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exp.app.board.model.BoardSearch;
import com.exp.app.code.model.CodeBase;
import com.exp.app.code.model.CodeSearch;
import com.exp.app.code.service.CodeService;
import com.exp.app.common.model.PageMaker;

@RequestMapping("/code")
@Controller
public class CodeController {

	private static final Logger logger = LoggerFactory.getLogger(CodeController.class);

	@Autowired
	CodeService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session, CodeSearch search) {
		logger.info("list in......");
		ModelAndView mav = null;

		List<CodeBase> list = service.selectCodeList(search);
		int totalCount = service.countCodeList(search);

		mav = new ModelAndView("/code/list");
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(search);
		pageMaker.setTotalCount(totalCount);

		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.addObject("search", search);
		return mav;
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public ModelAndView regist(HttpSession session, BoardSearch search) {
		logger.info("regist in......");
		ModelAndView mav = new ModelAndView("/code/regist");

		mav.addObject("search", search);
		return mav;
	}
}
