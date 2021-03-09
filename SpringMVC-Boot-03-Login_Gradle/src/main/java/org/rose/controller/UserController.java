package org.rose.controller;

import java.util.Map;

import org.rose.model.User;
import org.rose.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	ILoginService service;

	@GetMapping("/")
	public String showHome() {
		return "redirect:login";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute User user) {
		System.out.println("UserController.login()");
		return "login_form";
	}
	
	@PostMapping("/login")
	public String checkLogin(@ModelAttribute User user,
							 Map<String, String> map) {
		System.out.println("UserController.checkLogin()");
		String result = service.checkValidations(user);
		map.put("result", result);
		return "login_form";
	}
}
