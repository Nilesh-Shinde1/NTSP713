package org.rose.service;

import java.sql.SQLException;
import java.util.List;
import org.rose.dto.StudentDTO;

public interface StudentService {
	public String addStudent(StudentDTO dto) throws SQLException;	
	public String updateStudent(StudentDTO dto) throws SQLException;
	public StudentDTO getStudent(int id) throws SQLException;
	public List<StudentDTO> getAllStudents() throws SQLException;
	public String deleteStudent(int id) throws SQLException; 
}
