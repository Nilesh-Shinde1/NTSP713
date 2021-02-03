package org.rose.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rose.conn.Constants;
import org.rose.dao.DAO;
import org.rose.dao.DAOImpl2;
import org.rose.dto2.StudentDTO;
import org.rose.service.StudentServiceImpl;
import org.springframework.web.servlet.ModelAndView;

import lombok.Setter;
@Setter
public class Controller implements org.springframework.web.servlet.mvc.Controller{
	private StudentDTO dto;
	private StudentServiceImpl service;
//	private DAO dao;
	public Controller(StudentServiceImpl service, StudentDTO dto) {
		this.service = service;
		this.dto = dto;
	}
//	public Controller(DAO dao) {
//		this.dao = dao;
//	}
	/*public String process(String sno,String sname, String m1, String m2, String m3) throws Exception{
		StudentVO vo = new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		StudentDTO dto = new StudentDTO();
		dto.setSno(Integer.parseInt(sno));
		dto.setSname(sname);
		dto.setM1(Integer.parseInt(m1));
		dto.setM2(Integer.parseInt(m2));
		dto.setM3(Integer.parseInt(m3));
		String result = service.result(dto);
		return result;
	}*/
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		DAO dao = new DAOImpl2();
//		dao.databaseName(Constants.ORACLE);
//		dao.tableName("MVC_Student");
		return new ModelAndView("StudentInfo","result",service.getAllStudents());
	}
}
