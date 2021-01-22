package org.rose.service;

import java.util.ArrayList;
import java.util.List;

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
		custRepo.insert(cust);
		return "Entity Saved";
	}
	
	@Override
	public List<CustomerDTO> getAllCustomers() {
		List<Customer> custList = custRepo.findAll();
		List<CustomerDTO> dtoList = new ArrayList<>();
		custList.forEach(cust -> {
			CustomerDTO dto = new CustomerDTO();
			BeanUtils.copyProperties(cust, dto);
			dtoList.add(dto);
		});
		return dtoList;
	}
	
	@Override
	public String updateCustomer(CustomerDTO dto) {
		Customer cust = new Customer();
		BeanUtils.copyProperties(dto, cust);
		custRepo.save(cust);
		return "Updated..!";
	}
	
	@Override
	public String deleteCustomerById(String id) {
		Customer cust = new Customer();
		cust.setId(id);
		custRepo.delete(cust);
		return "Customer deleted..!";
	}
}
