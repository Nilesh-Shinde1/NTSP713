package org.rose.dao;

import java.util.List;

import org.rose.bo.StudentBO;

public interface StudentDAO {
	public int insert(StudentBO bo) throws Exception;
	public List<StudentBO> select() throws Exception;
}
