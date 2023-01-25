package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cart;
import model.Customer;
import repository.ItemRepository;
import service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private ItemRepository ir;
	
	@Override
	public Cart saveCart(Cart cart) {
		Customer cust=new Customer();
		
		return ir.save(cart);
	}

	@Override
	public Cart findByCartId(int cartId) {
		
		return ir.findById(cartId).get();
	}

	@Override
	public List<Cart> getAllItems() {
		// TODO Auto-generated method stub
		return ir.findAll() ;
	}

	
	@Override
	public Cart updateItem(Cart cart, int id) {
		// TODO Auto-generated method stub
		Cart _temp=ir.findById(id).get();
		_temp.setPrice(cart.getPrice());
		_temp.setQty(cart.getQty());
		
		return ir.save(_temp);
	}

	@Override
	public String deleteItems(int id) {
		ir.deleteById(id);
		return "Item removed from cart!!!";
	}

	
	}

	