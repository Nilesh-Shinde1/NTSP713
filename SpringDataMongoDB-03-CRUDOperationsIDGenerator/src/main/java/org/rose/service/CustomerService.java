package org.rose.service;

import java.util.List;

import org.rose.dto.CustomerDTO;

public interface CustomerService {
	public String insertCustomer(CustomerDTO dto);
	public List<CustomerDTO> getAllCustomers();
	public String updateCustomer(CustomerDTO dto);
	public String deleteCustomerById(String id);
}
