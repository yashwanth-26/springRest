package com.yashwanth.assign6;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OperationController{
	
	
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addition(@RequestBody Operation operation) {
		int a=operation.getX();
		int b=operation.getY();
		int c;
		c=a+b;
		return ("addition is "+c);

		
	}
	/*
	@RequestMapping(value="/sub", method = RequestMethod.POST)
	public String subraction(@RequestBody Operation operation) {
		
	}
	@RequestMapping(value="/mul", method = RequestMethod.POST)
	public String multiplication(@RequestBody Operation operation){
		
	}
	@RequestMapping(value="/div", method = RequestMethod.POST)
	public String division(@RequestBody Operation operation){
		
	}
	@RequestMapping(value="/root", method = RequestMethod.POST)
	public String squareRoot(@RequestBody Operation operation) {
		
	}
	*/
}


