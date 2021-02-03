package org.rose;

import org.rose.dto.CustomerDTO;
import org.rose.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataMongoDb01CrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataMongoDb01CrudOperationsApplication.class, args);
		CustomerService service = ctx.getBean(CustomerService.class,"custService");
		
		//Insert
//		System.out.println(service.insertCustomer(new CustomerDTO(103,"Shane","Beed",999483939L)));
		
		//Select
		service.getAllCustomers().forEach(System.out::println);
		
		//Update
//		CustomerDTO dto = new CustomerDTO();
//		dto.setId("600a591c24fe2379055e9a88");
//		dto.setCname("Shane");
//		dto.setCadd("Mumbai");
//		dto.setMobNo(8530385930L);
//		System.out.println(service.updateCustomer(dto));
		
		//Delete
//		System.out.println(service.deleteCustomerById("60091edd35c8586b242f97ba"));
		((ConfigurableApplicationContext) ctx).close();
	}
}
