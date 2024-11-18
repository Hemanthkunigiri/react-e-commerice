package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.serivce.CustomerService;
@CrossOrigin("*")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
    @PostMapping("/reg")	
	public String addCustomer(@RequestBody Customer customer)
	{
    	 System.out.println("Received email: " + customer.getEmail());
         System.out.println("Received password: " + customer.getPassword());
    	boolean customerStatus=service.emailExists(customer.getEmail());
    	if(customerStatus ==false)
    	{
    	    service.addCustomer(customer);
    	    System.out.println("add user");
    	}
    	else
    	{
    		System.out.println("user already exits");
    	}
    	return"thank";
	}
    
    
    
    @PostMapping("/validate")
    public String validate(@RequestBody Customer data)
    
    {
    	System.out.println("Received email: " + data.getEmail());
        System.out.println("Received password: " + data.getPassword());
    	System.out.println("ccall recived");
    	String email=data.getEmail();
    	String password=data.getPassword();

    	if(service.validateCustomer(email,password)==true)
    	{
    		return "hlo";
    	}
    	else {
    		return"hi";
    	}
    }
    
}
