package serviceimpl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.CustomerException;
import model.Cart;
import model.Customer;
import repository.CustomerRepository;
import service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository custRepo;
	
	public String addCustomer(Customer c)throws CustomerException
	{

		for(Cart cr : c.getItemList())
		{
			cr.setCust(c);
		}
		
		custRepo.save(c);
		return "-- Customer added successfully --";
	}

	@Override
	public String updateCustomer(Customer temp, Integer id) throws CustomerException {
		Customer _cust= custRepo.findById(id).get();
		_cust.setAdress(temp.getAdress());
		_cust.setFullName(temp.getFullName());
		_cust.setPhone(temp.getPhone());
		custRepo.save(_cust);
		return "Customer details updated sucessfuly...... ";
	}

	@Override
	public String deleteCustomer(Integer id) throws CustomerException {
		custRepo.deleteById(id);
		return "Customer with id="+id+" is deleted";
	}

	@Override
	public Customer viewCustomer(Integer id) throws CustomerException {
		return custRepo.findById(id).get();
	}

	@Override
	public List<Customer> viewAll() throws CustomerException {
		
		return custRepo.findAll();
	}

	
}