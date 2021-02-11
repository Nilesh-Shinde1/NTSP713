package org.rose.controller;

import java.util.List;
import java.util.Map;

import org.rose.dto.StudentDTO;
import org.rose.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/studentController")
public class StudentController {
	
	@Autowired
	StudentService service;
	@Autowired
	StudentDTO dto;
	
	@RequestMapping("/addStudent.edu")
	public String addStudent(Map<String,Object> map) {
		String result = null;
		try {
			result = service.addOne(dto);
			System.out.println("result : "+result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		map.put("result",result);
		return "redirect:getAllStudentsData.edu";
	}
	
	@RequestMapping("/getAllStudentsData.edu")
	public String getStudents(Map<String, Object> map) {
		try {
			map.put("studentsInfo", service.getAll());
			System.out.println(map.get("studentsInfo"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "StudentsData";
	}
}
