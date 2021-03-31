package com.yashwanth.mongodb.assign.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private CustomerRepo repository;
	@PostMapping("/addCustomer")
	public String saveBook(@RequestBody Customer employee) {
		repository.save(employee);
		
		return "Added book with id : " + employee.getId();
	}

	@GetMapping("/findAllCustomer")
	public List<Customer> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findAllCustomer/{id}")
	public Optional<Customer> getBook(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}

}




