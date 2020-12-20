package org.rose.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.rose.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO{
	private DataSource ds;
	private static final String INSERT_STUDENT = "INSERT INTO MVC_STUDENT VALUES(?,?,?,?,?)";
	private static final String UPDATE_STUDENT = "UPDATE MVC_STUDENT SET SNAME=?, total=?, percentage=?, result=? WHERE SNO=?";
	private static final String GET_STUDENT = "SELECT * FROM MVC_STUDENT WHERE SNO=?";
	private static final String GET_ALL_STUDENTS = "SELECT * FROM MVC_STUDENT";
	private static final String DELETE_STUDENT = "DELETE FROM MVC_STUDENT WHERE SNO=?";
	
	public StudentDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int addStudent(StudentBO bo) throws SQLException {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(INSERT_STUDENT);
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setFloat(3, bo.getTotal());
		ps.setFloat(4, bo.getPercentage());
		ps.setString(5, bo.getResult());
		return ps.executeUpdate();
	}
	@Override
	public int updateStudent(StudentBO bo) throws SQLException{
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(UPDATE_STUDENT);
		ps.setString(1, bo.getSname());
		ps.setFloat(2, bo.getTotal());
		ps.setFloat(3, bo.getPercentage());
		ps.setString(4, bo.getResult());
		ps.setInt(5, bo.getSno());		
		return ps.executeUpdate();
	}
	@Override
	public StudentBO getStudent(int id) throws SQLException {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_STUDENT);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		StudentBO bo = new StudentBO();
		while(rs.next()) {
			bo.setSno(rs.getInt("sno"));
			bo.setSname(rs.getString("sname"));
			bo.setTotal(rs.getFloat("total"));
			bo.setPercentage(rs.getFloat("percentage"));
			bo.setResult(rs.getString("result"));
		}
		return bo;
	}
	@Override
	public List<StudentBO> getAllStudents() throws SQLException {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_ALL_STUDENTS);
		ResultSet rs = ps.executeQuery();
		List<StudentBO> listBO = new ArrayList<StudentBO>();
		while(rs.next()) {
			StudentBO bo = new StudentBO();
			bo.setSno(rs.getInt("sno"));
			bo.setSname(rs.getString("sname"));
			bo.setTotal(rs.getFloat("total"));
			bo.setPercentage(rs.getFloat("percentage"));
			bo.setResult(rs.getString("result"));
			listBO.add(bo);
		}
		return listBO;
	}
	@Override
	public int deleteStudent(int id) throws SQLException {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(DELETE_STUDENT);
		ps.setInt(1, id);
		return ps.executeUpdate();
	}
}
