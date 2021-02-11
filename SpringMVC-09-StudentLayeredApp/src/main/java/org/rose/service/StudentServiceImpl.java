package org.rose.service;

import java.util.ArrayList;
import java.util.List;

import org.rose.bo.StudentBO;
import org.rose.dao.StudentDAO;
import org.rose.dto.ResultDTO;
import org.rose.dto.StudentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("/studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO dao;

	public String addOne(StudentDTO dto) throws Exception {
		String sname = dto.getSname();
		Double total = dto.getJava() + dto.getPhp() + dto.getOracle();
		Double percentage = total / 3f;
		String result = null;

		if (percentage <= 35)
			result = "fail";
		else
			result = "Pass";

		StudentBO bo = new StudentBO();
		bo.setSname(sname);
		bo.setTotal(total);
		bo.setPercentage(percentage);
		bo.setResult(result);
		
		int k = dao.insertStudent(bo);

		String dbstatus = null;
		if (k == 1)
			dbstatus = "Student Registered Successfully";
		else
			dbstatus = "Student Registration Failed";

		return dbstatus;
	}

	@Override
	public List<ResultDTO> getAll() throws Exception {
		List<StudentBO> listBO = dao.getStudents();
		List<ResultDTO> listDTO = new ArrayList<ResultDTO>();
		
		//copy properties
		listBO.forEach(bo -> {
			ResultDTO dto = new ResultDTO();
			dto.setSname(bo.getSname());
			dto.setPercentage(bo.getPercentage());
			dto.setResult(bo.getResult());
			dto.setTotal(bo.getTotal());
			listDTO.add(dto);
		});
		
		System.out.println("listBO : "+listBO);
		System.out.println("listDTO : "+listDTO);
		return listDTO;
	}
}
