package org.rose.service;

import java.util.ArrayList;
import java.util.List;

import org.rose.bo.StudentBO;
import org.rose.dao.StudentDAO;
import org.rose.dto2.StudentDTO;
import org.springframework.beans.BeanUtils;

public class StudentServiceImpl implements StudentService{
	private StudentDAO dao;
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}
	public String result(StudentDTO dto) throws Exception{
		double total = dto.getM1() + dto.getM2() + dto.getM3();
		double avg = total/3;
		String result;
		if(avg<35) 
			result = "fail";
		else
			result = "pass";
		StudentBO bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		int count = dao.insert(bo);
		if(count==0)
			return "Record insertion Failed";
		else
			return "Record insertion Succeded";
	}
	public List<StudentDTO> getAllStudents() throws Exception {
		List<StudentBO> listBO = dao.select();
		List<StudentDTO> listDTO = new ArrayList<StudentDTO>();
		
		listBO.forEach(bo->{
			StudentDTO dto = new StudentDTO();
			dto.setAvg(bo.getAvg());
			dto.setSno(bo.getSno());
			dto.setSname(bo.getSname());
			dto.setTotal(bo.getTotal());
			dto.setResult(bo.getResult());
//			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
