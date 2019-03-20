package com.mindtree.cart.dao;

import com.mindtree.cart.entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartDAO extends CrudRepository<Cart,Integer> {
}
