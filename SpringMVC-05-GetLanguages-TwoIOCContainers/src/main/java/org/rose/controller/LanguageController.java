package org.rose.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rose.service.ILanguageService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LanguageController implements Controller {
	
	private ILanguageService service;
	
	public LanguageController(ILanguageService service) {
		this.service=service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("result","langs",service.getAllLanguages());
	}

}
