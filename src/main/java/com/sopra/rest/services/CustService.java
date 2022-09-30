package com.sopra.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.rest.entity.Customer;
import com.sopra.rest.repository.custRepository;
@Service
public class CustService 
{
	@Autowired
private custRepository serviceRepo;
	public List<Customer> getAllCustomers(){
		
	List<Customer> list = new ArrayList<Customer>();
	// method reference :: is 2 colon
	this.serviceRepo.findAll().forEach(list::add);
	return list;
}
	//public Customer getAllCustomer
	public void addCustomer(Customer customer) {
		this.serviceRepo.save(customer);
	}
	public void updateCustomer(Integer id,Customer customer) {
		this.serviceRepo.save(customer);
	}
	public void deleteCustomer(Integer id) {
		this.serviceRepo.deleteById(id);
	}
}
