package org.rose.dao;

import java.sql.SQLException;
import java.util.List;

import org.rose.bo.StudentBO;

public interface StudentDAO {
	public int addStudent(StudentBO bo) throws SQLException;
	public int updateStudent(StudentBO bo) throws SQLException;
	public StudentBO getStudent(int id) throws SQLException;
	public List<StudentBO> getAllStudents() throws SQLException;
	public int deleteStudent(int id) throws SQLException; 
}
