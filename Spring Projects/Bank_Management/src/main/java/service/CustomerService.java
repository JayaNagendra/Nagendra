package service;

import java.util.List;

import entity.Customer;
import model.CustomerDTO;

public interface CustomerService {

	
	// defining methods to perform customer and account related operations
		String createAccount(Customer customer);

		CustomerDTO updateAccountDetail(int id, Customer customerId);

		CustomerDTO getAccountDetailByCustomerId(int customerId);

		List<CustomerDTO> getAllAccountDetails();

		String checkBalanceById(int customerId);

		List<CustomerDTO> getCustomerByName(String customerName);
}

