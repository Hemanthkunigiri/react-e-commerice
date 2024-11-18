package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   int id;
   String email;
   String password;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int id, String email, String password) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", email=" + email + ", password=" + password + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

   
}
