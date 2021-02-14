package org.rose.dao;

import java.util.List;

import org.rose.bo.StudentBO;

public interface IStudentDAO {
	public int insertStudent(StudentBO bo);
	public List<StudentBO> getStudents();
}
