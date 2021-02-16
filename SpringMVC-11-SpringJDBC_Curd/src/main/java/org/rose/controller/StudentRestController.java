package org.rose.controller;

import java.util.List;

import org.rose.dto.StudentDTO;
import org.rose.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
	@Autowired
	private IStudentService service;
	
	@GetMapping("/welcome")
	public String home() {
		return "home";
	}
	
	@GetMapping("/getData")
	@ResponseBody
	public ResponseEntity<List<StudentDTO>> getStudList() {
//		return new StudentDTO("Patil", 98.9, 340.0, "Pass");
//		return (ResponseEntity<List<StudentDTO>>) service.getAllStuds();
		 if(service.getAllStuds().isEmpty()){
	            return new ResponseEntity<List<StudentDTO>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
		return new ResponseEntity<List<StudentDTO>>(service.getAllStuds(), HttpStatus.OK);
	}
}
