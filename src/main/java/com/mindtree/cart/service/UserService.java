package com.mindtree.cart.service;

import com.mindtree.cart.entity.Cart;
import com.mindtree.cart.entity.User;
import com.mindtree.cart.exception.UserNotFoundException;

public interface UserService {
    User getUser(String userName);

    Cart getUserCart(String userName) throws UserNotFoundException;
}
