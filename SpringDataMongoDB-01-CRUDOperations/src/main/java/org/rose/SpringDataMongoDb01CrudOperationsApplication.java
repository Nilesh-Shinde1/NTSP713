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
		System.out.println(service.insertCustomer(new CustomerDTO(101,"Ram","Dubai",99948939L)));
		((ConfigurableApplicationContext) ctx).close();
	}
}
