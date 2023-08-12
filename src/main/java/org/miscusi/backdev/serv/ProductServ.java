package org.miscusi.backdev.serv;

import java.util.List;
import java.util.Optional;

import org.miscusi.backdev.pojo.Product;
import org.miscusi.backdev.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServ {
	
	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> findAll() {
		return productRepo.findAll();
	}
	
	public Product save(Product product) {
		return productRepo.save(product);
	}
	
	public Optional<Product> findById(int id) {
		return productRepo.findById(id);
	}
	
	public void delete(Product product) {
		productRepo.delete(product);
	}
}
