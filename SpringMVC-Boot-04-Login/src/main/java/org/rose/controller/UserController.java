package org.rose.controller;

import java.util.Map;

import org.rose.model.User;
import org.rose.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private IUserService service;
	
	@GetMapping("/login")
	public String loginPage(@ModelAttribute User user) {
		return "login_form";
	}
	
	@PostMapping("/login")
	public String loginForm(@ModelAttribute User user,
							Map<String, String> map) {
		map.put("msg", service.checkCredentials(user));
		return "login_form";
	}

}
