package org.rose.controller;

import org.rose.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String studentForm(@ModelAttribute("stud") Student st) {
		st.setAdd("Beed");
		return "student_form";
	}
}
