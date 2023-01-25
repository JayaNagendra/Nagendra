package service;

import java.util.List;

import model.Cart;

public interface CartService {
	
	public Cart saveCart(Cart cart);
    public Cart findByCartId(int bookId);
    
    List<Cart> getAllItems();
    String deleteItems(int id);
    Cart updateItem(Cart cart, int id);
}
