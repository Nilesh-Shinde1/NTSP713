package org.rose.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rose.service.WishMessageService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishMessageController implements Controller {
	
	private WishMessageService service;
	
	public WishMessageController(WishMessageService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String msg = service.getWishMessage();
		return new ModelAndView("result","wMsg",msg);
	}

}
