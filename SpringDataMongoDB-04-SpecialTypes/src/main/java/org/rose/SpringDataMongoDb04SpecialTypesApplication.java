package org.rose;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.rose.document.Student;
import org.rose.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringDataMongoDb04SpecialTypesApplication {

	public static void main(String[] args) {
		ApplicationContext ctc = SpringApplication.run(SpringDataMongoDb04SpecialTypesApplication.class, args);
		StudentRepo repo = ctc.getBean(StudentRepo.class);
		Properties batches = new Properties();
		batches.put("CJ", "7PM");
		batches.put("AJ", "9AM");
		Student student = new Student(
				101,
				"Nilesh",
				new Integer[] {80,90,89},
				List.of("Java","Spring","Hibernate"),
				Set.of(12937819L,27689721L,4765809L),
				Map.of(101,"A",102,"B",103,"A"),
				batches);
		repo.save(student);
		((ConfigurableApplicationContext) ctc).close();
	}
}
