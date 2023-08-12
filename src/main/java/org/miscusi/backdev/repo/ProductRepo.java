package org.miscusi.backdev.repo;

import org.miscusi.backdev.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
