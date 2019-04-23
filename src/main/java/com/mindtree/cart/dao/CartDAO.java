package com.mindtree.cart.dao;

import com.mindtree.cart.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDAO extends CrudRepository<Cart, Integer> {
}
