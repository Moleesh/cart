package com.mindtree.cart.dao;

import com.mindtree.cart.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<Product,Integer> {
}
