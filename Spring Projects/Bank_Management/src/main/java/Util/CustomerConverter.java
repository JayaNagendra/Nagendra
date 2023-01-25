package Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import entity.Customer;
import model.CustomerDTO;

@Component
public class CustomerConverter {

	// convert CustomerDTO to Entity(Customer)
	public Customer convertToEntity(CustomerDTO customerDTO) {

		Customer customer = new Customer();
		if (customerDTO != null) {
			BeanUtils.copyProperties(customerDTO, customer);
		}

		return customer;
	}

	// convert Customer to (CustomerDTO)
	public CustomerDTO convertToCustomerDTO(Customer customer) {

		CustomerDTO customerDTO = new CustomerDTO();
		if (customer != null) {
			BeanUtils.copyProperties(customer, customerDTO);
		}

		return customerDTO;
	}
}