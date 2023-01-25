package repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	 //Sql query to get Customer By Name
	@Query("from Customer where lower(customerName) like :s%")	
	List<Customer> getCustomerByName(@Param("s") String customerName); 
}