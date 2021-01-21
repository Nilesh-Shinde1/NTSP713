package org.rose.service;

import org.rose.document.Customer;
import org.rose.dto.CustomerDTO;
import org.rose.repository.CustomerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("custService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo custRepo;
	
	@Override
	public String insertCustomer(CustomerDTO dto) {
		Customer cust = new Customer();
		BeanUtils.copyProperties(dto, cust);
		System.out.println(dto+"==dto"+cust+"==cust");
		custRepo.insert(cust);
		return "Entity Saved";
	}
}
