package com.Nagendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nagendra.entity.Product;
import com.Nagendra.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	//post method for single object.......
	
   public Product saveProduct(Product product) {
	return repository.save(product);
	
	
   }
	// post method for list of objects.........
   
	public List<Product> saveProduct(List<Product> products) {
		return repository.saveAll(products);
}
	// GET Method for all objects.
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	// GET Method for single objects.
	
	public Product getProductById(int id){
		return repository.findById(id).orElseThrow(()->new 
				RuntimeException("Product not found!!!"));}
	
	// GET Method for single object By using Name......
	
	public Product getProductByName(String name){
		return repository.findByName(name);                    // Create this method in repository....
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product Removed"+id;
	}
	
	// update...
	
    public void update(Product p1, int id) {
	repository.save(p1); }
}




	

