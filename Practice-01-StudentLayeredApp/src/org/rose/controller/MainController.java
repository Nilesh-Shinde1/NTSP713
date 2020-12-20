package org.rose.controller;

import java.util.List;

import org.rose.dto.StudentDTO;
import org.rose.service.StudentService;
import org.rose.vo.StudentVO;

public class MainController {
	private StudentService service;
	public MainController(StudentService service) {
		this.service = service;
	}	
	
	private StudentDTO voToDto(StudentVO vo) {
		StudentDTO dto = new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setPercentage(Float.parseFloat(vo.getPercentage()));
		dto.setTotal(Float.parseFloat(vo.getTotal()));
		dto.setResult(vo.getResult());		
		return dto;
	}
	
	public String addStudent(StudentVO vo) throws Exception{
		StudentDTO dto = voToDto(vo);
		return service.addStudent(dto);
	}
	
	public String updateStudent(StudentVO vo) throws Exception{
		StudentDTO dto = voToDto(vo);
		return service.updateStudent(dto);
	}
	
	public StudentDTO getStudent(int id) throws Exception{
		return service.getStudent(id);
	}
	
	public List<StudentDTO> getAllStudents() throws Exception{
		return service.getAllStudents();
	}
	
	public String deleteStudent(int id) throws Exception{
		return service.deleteStudent(id);
	}
	
}
