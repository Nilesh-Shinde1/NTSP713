package org.rose;

import java.util.List;

import org.rose.doc.School;
import org.rose.doc.Student;
import org.rose.repo.ISchoolRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringDataMongoDb05SpecialTypesNoCollectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataMongoDb05SpecialTypesNoCollectionApplication.class, args);
		ISchoolRepo repo = ctx.getBean(ISchoolRepo.class);
		repo.save(new School("ABC678","New High School",
				new Student(181,"Nic","10 B")));
	
//		repo.save(new School("ABC678","New High School",
//					List.of(new Student(181,"Nic","10 B"),
//							new Student(182,"Mike","9 A"))));
		System.out.println("Record Saved..!");
		((ConfigurableApplicationContext) ctx).close();
	}
}
