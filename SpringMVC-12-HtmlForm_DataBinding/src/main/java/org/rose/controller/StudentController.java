package org.rose.controller;

import java.util.Map;

import org.rose.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String showForm() {
		return "student_form";
	}
	
	@PostMapping("/student")
	public String getFormData(Map<String, Object> map, 
//			@ModelAttribute("stud") Student st) {
			@ModelAttribute Student st) {
		map.put("studentData", st);
		return "student_data";
	}
}
