package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cart;
import service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	public CartService cartService;
	
	@PostMapping(value="/save")
	public Cart addController(@RequestBody Cart cart) {
		return cartService.saveCart(cart);
	}
	
	
	@GetMapping(value = "/viewAll")
	public List<Cart> getAllController(){
		return cartService.getAllItems();
	}
	
	@PutMapping(value = "/edit/{id}")
	public Cart updateController(@PathVariable int id, @RequestBody Cart cart) {
		return cartService.updateItem(cart, id);
	}
	@DeleteMapping(value = "/del/{id}")
	public String deleteController(@PathVariable int id) {
		return cartService.deleteItems(id);
	}
}
