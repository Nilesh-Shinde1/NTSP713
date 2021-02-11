package org.rose.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/homeCtrl2")
public class HomeController2 {
	@RequestMapping("/welcome")
	public String method2() {
		System.out.println("method2");
		return "home1";
	}
}
