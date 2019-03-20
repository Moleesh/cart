package com.mindtree.cart.dao;

import com.mindtree.cart.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, String> {
}
