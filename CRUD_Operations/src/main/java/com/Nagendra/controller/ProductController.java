package com.Nagendra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Nagendra.entity.Product;
import com.Nagendra.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/addProduct")
	public int addProduct(@RequestBody Product product) {
		 service.saveProduct(product);
		 return product.getId();
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProduct(products);
		
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable  String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product saveOrUpdate(@RequestBody Product p) {
	service.saveProduct(p);
	return p;
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
