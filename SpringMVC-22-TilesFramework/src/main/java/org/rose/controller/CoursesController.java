package org.rose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoursesController {
	
	@GetMapping("/welcome")
	public String showHome() {
		return "baseDef";
	}
	@GetMapping("/java")
	public String javaCourses() {
		return "javaDef";
	}
	@GetMapping("/dotNet")
	public String dotNetCourses() {
		return "dotNetDef";
	}
	@GetMapping("/oracle")
	public String oracleCourses() {
		return "oracleDef";
	}
	
}
