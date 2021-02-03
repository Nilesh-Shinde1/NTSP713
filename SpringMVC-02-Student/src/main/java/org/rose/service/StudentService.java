package org.rose.service;

import java.util.List;

import org.rose.dto2.StudentDTO;

public interface StudentService {
	public String result(StudentDTO dto) throws Exception;
	public List<StudentDTO> getAllStudents() throws Exception;
}
