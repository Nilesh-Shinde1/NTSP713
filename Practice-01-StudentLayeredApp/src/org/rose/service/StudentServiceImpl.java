package org.rose.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.rose.bo.StudentBO;
import org.rose.dao.StudentDAO;
import org.rose.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	private int result;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}
	
	private StudentBO dtoToBo(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setPercentage(dto.getPercentage());
		bo.setTotal(dto.getTotal());
		bo.setResult(dto.getResult());		
		return bo;
	}
	
	private StudentDTO boToDto(StudentBO bo) {
		StudentDTO dto = new StudentDTO();
		dto.setSno(bo.getSno());
		dto.setSname(bo.getSname());
		dto.setPercentage(bo.getPercentage());
		dto.setTotal(bo.getTotal());
		dto.setResult(bo.getResult());		
		return dto;
	}

	@Override
	public String addStudent(StudentDTO dto) throws SQLException {
		StudentBO bo = dtoToBo(dto);
		result = dao.addStudent(bo);
		return (result == 1) ? "Student Added Successfully" : "Student not Added";
	}

	@Override
	public String updateStudent(StudentDTO dto) throws SQLException {
		StudentBO bo = dtoToBo(dto);
		result = dao.updateStudent(bo);
		return (result == 1) ? "Student Updated Successfully" : "Student not Updated";
	}

	@Override
	public StudentDTO getStudent(int id) throws SQLException {
		StudentBO bo = dao.getStudent(id);
		return boToDto(bo);
	}

	@Override
	public List<StudentDTO> getAllStudents() throws SQLException {
		List<StudentBO> listBO = dao.getAllStudents();
		List<StudentDTO> listDTO = new ArrayList<>();
		for(int i=0; i<listBO.size(); i++) {
			listDTO.add(boToDto(listBO.get(i)));
		}
		return listDTO;
	}

	@Override
	public String deleteStudent(int id) throws SQLException {
		result = dao.deleteStudent(id);
		return (result == 1) ? "Student deleted Successfully" : "Student not deleted";
	}

}
