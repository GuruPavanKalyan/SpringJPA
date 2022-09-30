package com.sopra.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.rest.entity.Customer;
import com.sopra.rest.services.CustService;

@RestController
public class CustController {
	@Autowired
	private CustService service;

	@GetMapping("/customers")
	public List<Customer>getAllCustomerrs(){
		return service.getAllCustomers();
	}
//	@GetMapping("/customer/{custid}")
	//public Customer getAllCustomer(@PathVariable Integer custid) {
	//	return this.service.getAllCustomer(custid);

	//}

	@PostMapping("/addcustomer")
	public void addCustomer(@RequestBody Customer customer) {
		this.service.addCustomer(customer);
	}

	@DeleteMapping("/delcustomer/{custid}")
	public void delCustomer(@PathVariable Integer custid) {
		this.service.deleteCustomer(custid);
	}

	@PutMapping("/updatecustomer/{custid}")
	public void updateCustomer(@PathVariable Integer custid,@RequestBody Customer customer) {
		this.service.updateCustomer(custid, customer);
	}
}


