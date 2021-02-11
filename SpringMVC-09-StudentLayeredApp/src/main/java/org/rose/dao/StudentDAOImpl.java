package org.rose.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.rose.bo.StudentBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("/studentDao")
public class StudentDAOImpl implements StudentDAO {

	private static final String INSERT_QUERY = "INSERT INTO MVC_STUDENT VALUES(STUDENT_SEQ.NEXTVAL,?,?,?,?)";
	private static final String SELECT_QUERY = "SELECT * FROM MVC_STUDENT";
//	@Autowired
//	private StudentRepo repo;
	public int insertStudent(StudentBO bo)  throws Exception{
		int result = 0;
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nic", "rose");
		Connection con = getCon();
		PreparedStatement ps = con.prepareStatement(INSERT_QUERY);

		ps.setString(1, bo.getSname());
		ps.setDouble(2, bo.getTotal());
		ps.setDouble(3, bo.getPercentage());
		ps.setString(4, bo.getResult());
		result = ps.executeUpdate();

		ps.close();
		con.close();
		System.out.println("exeption occured");
		return result;
	}

	private Connection getCon() throws Exception {
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource) ic.lookup("java:/comp/env/DSJndi");
		Connection con = ds.getConnection();
		return con;
	}

	@Override
	public List<StudentBO> getStudents() throws Exception {
		Connection con = this.getCon();
		PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
		ResultSet rs = ps.executeQuery();
		List<StudentBO> listBO = new ArrayList<StudentBO>();
		while(rs.next()) {
			StudentBO bo = new StudentBO();
			bo.setSname(rs.getString("SNAME"));  
			bo.setTotal(rs.getDouble("TOTAL"));
			bo.setPercentage(rs.getDouble("PERCENTAGE"));
			bo.setResult(rs.getString("RESULT"));
			listBO.add(bo);
		}
//		List<StudentBO> listBO = new ArrayList<StudentBO>();
//		System.out.println("findAll() : "+repo.findAll());
		return listBO;
	}

}
