package service;

import java.util.List;

import exception.CustomerException;
import model.Customer;

public interface CustomerService {
	
	public String addCustomer(Customer c) throws CustomerException;
	
	public String updateCustomer(Customer temp,Integer id) throws CustomerException;
	
	public String deleteCustomer(Integer id) throws CustomerException;
	
	public Customer viewCustomer(Integer id) throws CustomerException;
	
	public List<Customer> viewAll()throws CustomerException;

}
