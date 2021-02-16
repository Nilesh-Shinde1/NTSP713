package org.rose.service;

import java.util.ArrayList;
import java.util.List;

import org.rose.bo.StudentBO;
import org.rose.dao.IStudentDAO;
import org.rose.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDAO dao;
	
	@Override
	public int addStud(StudentDTO dto) {
		
		return 0;
	}

	@Override
	public List<StudentDTO> getAllStuds() {
		List<StudentDTO> listDTO = new ArrayList<StudentDTO>();
		List<StudentBO> listBO = dao.getStudents();
		listBO.forEach(bo ->{
			StudentDTO dto = new StudentDTO();
			dto.setName(bo.getName());
			dto.setPer(bo.getPer());
			dto.setTotal(bo.getTotal());
			dto.setResult(bo.getResult());
			listDTO.add(dto);
		});
		System.out.println(listBO);
		System.out.println(listDTO);
		return listDTO;
	}

}
