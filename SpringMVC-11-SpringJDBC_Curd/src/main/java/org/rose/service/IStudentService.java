package org.rose.service;

import java.util.List;

import org.rose.dto.StudentDTO;

public interface IStudentService {
	public int addStud(StudentDTO dto);
	public List<StudentDTO> getAllStuds();
}
