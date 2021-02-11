package org.rose.service;

import java.util.List;

import org.rose.dto.ResultDTO;
import org.rose.dto.StudentDTO;

public interface StudentService {
	public String addOne(StudentDTO dto) throws Exception;;
	public List<ResultDTO> getAll() throws Exception;
}
