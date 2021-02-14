package org.rose.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.rose.bo.StudentBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository("studentDAO")
public class StudentDAOImpl implements IStudentDAO {

	private static final String INSERT_QUERY = "INSERT INTO MVC_STUDENT(SNAME, TOTAL, PERCENTAGE, RESULT) VALUES(?,?,?,?)";
	private static final String SELECT_QUERY = "SELECT SNAME, TOTAL, PERCENTAGE, RESULT FROM MVC_STUDENT";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int insertStudent(StudentBO bo) {
		return jt.update(INSERT_QUERY, bo.getName(), bo.getTotal(), bo.getPer(), bo.getResult());
	}

	@Override
	public List<StudentBO> getStudents() {
		return jt.query(SELECT_QUERY, new StudentExtractor());
	}

	private class StudentExtractor implements ResultSetExtractor<List<StudentBO>>{

		@Override
		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<StudentBO> listBO = new ArrayList<StudentBO>();
			while(rs.next()) {
				StudentBO bo = new StudentBO();
				bo.setName(rs.getString("SNAME"));
				bo.setPer(rs.getDouble("PERCENTAGE"));
				bo.setTotal(rs.getDouble("TOTAL"));
				bo.setResult(rs.getString("RESULT"));
				listBO.add(bo);
			}
			return listBO;
		}
		
	}

}
