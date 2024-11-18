package com.example.demo.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.reposistory.CustomerRepository;
@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	CustomerRepository repo;

	public String addCustomer(Customer customer) 
	{
		repo.save(customer);
		return "added customer";
	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null)
		{
			return false;
		}
		else
		return true;
	}

	@Override
	public boolean validateCustomer(String email, String password) {
		Customer customer=repo.findByEmail(email);
		String dbPassword=customer.getPassword();
		if(password.equals(dbPassword))
		{
			return true;
		}
		return false;
	}
}
