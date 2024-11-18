package com.example.demo.serivce;

import com.example.demo.entity.Customer;

public interface CustomerService {

	

	public String addCustomer(Customer customer);
    public boolean emailExists(String email);
	public boolean validateCustomer(String email, String password);
}
