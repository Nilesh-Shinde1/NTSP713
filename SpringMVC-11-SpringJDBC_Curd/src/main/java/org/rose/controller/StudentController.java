package org.rose.controller;

import java.util.Map;

import org.rose.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@Autowired
	private IStudentService service;
	
	@GetMapping("/welcome")
	public String home() {
		return "home";
	}
	
	@GetMapping("/getData")
	public String getStudList(Map<String, Object> map) {
		map.put("students", service.getAllStuds());
		return "StudentData";
	}
}
