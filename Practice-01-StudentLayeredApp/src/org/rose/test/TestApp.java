package org.rose.test;

import org.rose.controller.MainController;
import org.rose.vo.StudentVO;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestApp {
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		MainController controller = factory.getBean("controller",MainController.class);
		try {
//			System.out.println(controller.addStudent(new StudentVO("198", "Mic", "19", "19", "fail")));
//			System.out.println(controller.updateStudent(new StudentVO("198","John","80", "80", "pass")));
//			System.out.println(controller.getStudent(198));
//			System.out.println(controller.getAllStudents());
//			controller.getAllStudents().forEach(System.out::println);
			System.out.println(controller.deleteStudent(198));
		}
		catch(Exception e) {
			System.err.println("Something gone wrong");
			e.printStackTrace();
		}
	}
}
