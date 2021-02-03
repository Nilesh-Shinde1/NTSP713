package org.rose.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.rose.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	private static String INSERT_QUERY = "INSERT INTO MVC_STUDENT VALUES(?,?,?,?,?)";
	private static String SELECT_QUERY = "SELECT * FROM MVC_STUDENT";
	private static DataSource ds;
	static int k;

	public StudentDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	public int insert(StudentBO bo) throws Exception {
		//try{
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setDouble(3, bo.getTotal());
		ps.setDouble(4, bo.getAvg());
		ps.setString(5, bo.getResult());
		k = ps.executeUpdate();
	//}
	//catch(Exception e) {
	//	e.printStackTrace();
	//}
	return k;

	}

	public List<StudentBO> select() throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
		ResultSet rs = ps.executeQuery();
		
		List<StudentBO> listBO = new ArrayList<StudentBO>();
		while(rs.next()) {
			StudentBO bo = new StudentBO();
			bo.setSno(rs.getInt("SNO"));
			bo.setSname(rs.getString("SNAME"));
			bo.setResult(rs.getString("RESULT"));
			bo.setAvg(rs.getDouble("PERCENTAGE"));
			bo.setTotal(rs.getDouble("TOTAL"));;;
			listBO.add(bo);
		return listBO;
	}
	
}
