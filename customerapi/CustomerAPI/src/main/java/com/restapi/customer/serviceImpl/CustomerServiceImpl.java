package com.restapi.customer.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.customer.entity.Customer;
import com.restapi.customer.exception.ResourceNotFoundException;
import com.restapi.customer.repository.CustomerRepository;
import com.restapi.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	

	@Override
	public Customer createCustomer(Customer customer) {
			return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomerList() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(Long cid) {
		Customer existingCustomer = this.customerRepository.findById(cid)
				.orElseThrow(() -> new ResourceNotFoundException("User", " cid ", cid));

			customerRepository.delete(existingCustomer);
		
	}

	@Override
	public Customer updateCustomer(Long id, Customer customer) {
		Customer existingCustomer =  this.customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", " id ", id));

		 
			// Update the fields you want to allow
			existingCustomer.setFirstName(customer.getFirstName());
			existingCustomer.setLastName(customer.getLastName());
			existingCustomer.setStreet(customer.getStreet());
			existingCustomer.setAddress(customer.getAddress());
			existingCustomer.setCity(customer.getCity());
			existingCustomer.setState(customer.getState());
			existingCustomer.setEmail(customer.getEmail());
			existingCustomer.setPhone(customer.getPhone());

			return customerRepository.save(existingCustomer);
		
		
	}
}