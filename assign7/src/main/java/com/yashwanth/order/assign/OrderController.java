package com.yashwanth.order.assign;
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
public class OrderController {
	@Autowired
	private OrderRepo repository;
	@PostMapping("/addOrder")
	public String saveBook(@RequestBody Order order) {
		//repository.save(order);
		repository.save(order);
		
		return "Added book with id : " + order.getId();
	}

	@GetMapping("/findOrders")
	public List<Order> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findAllOrders/{id}")
	public Optional<Order> getBook(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "order deleted with id : " + id;
	}


}



	





