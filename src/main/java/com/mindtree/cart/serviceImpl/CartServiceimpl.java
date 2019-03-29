package com.mindtree.cart.serviceImpl;

import com.mindtree.cart.dao.CartDAO;
import com.mindtree.cart.entity.Cart;
import com.mindtree.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceimpl implements CartService {
    @Autowired
    private
    CartDAO cartDAO;

    /**
     * update the cart as per needed
     *
     * @param cart
     * @return
     */
    @Override
    public Cart saveUpdateCart(Cart cart) {
        return cartDAO.save(cart);
    }
}
