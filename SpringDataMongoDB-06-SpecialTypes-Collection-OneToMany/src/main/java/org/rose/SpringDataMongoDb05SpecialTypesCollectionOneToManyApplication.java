package org.rose;

import java.util.Map;
import java.util.Set;

import org.rose.dto.IdentitiesDTO;
import org.rose.dto.PersonDTO;
import org.rose.dto.SchoolsDTO;
import org.rose.service.IPersonService;
import org.rose.service.PersonServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringDataMongoDb05SpecialTypesCollectionOneToManyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataMongoDb05SpecialTypesCollectionOneToManyApplication.class, args);
//		IPersonRepo repo = ctx.getBean(IPersonRepo.class);
//		repo.save(new Person(110,"Nilesh Shinde", "MCA", 
//				  Set.of(new Identities(1993838,"Aadhar Card","UID"),
//						 new Identities(1993787,"Voter Id","Election Commission")),
//				  Map.of("1st to 4th",new Schools(1458,"Aashram Shala","Georai"),
//						 "5th",new Schools(1738,"New High School","Beed"),
//						 "8th to 10th",new Schools(1742,"Sharda Vidya Mandir","Pune"))));
		
		IPersonService service = ctx.getBean(PersonServiceImpl.class,"personService");
		service.savePersonInfo(new PersonDTO(110,"Nilesh Shinde", "MCA", 
				  Set.of(new IdentitiesDTO(1993838,"Aadhar Card","UID"),
						 new IdentitiesDTO(1993787,"Voter Id","Election Commission")),
				  Map.of("1st to 4th",new SchoolsDTO(1458,"Aashram Shala","Georai"),
						 "5th",new SchoolsDTO(1738,"New High School","Beed"),
						 "8th to 10th",new SchoolsDTO(1742,"Sharda Vidya Mandir","Pune")))
		);
		System.out.println("Saved..!");
		((ConfigurableApplicationContext) ctx).close();
	}
}
