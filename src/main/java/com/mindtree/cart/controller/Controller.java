package com.mindtree.cart.controller;

import com.mindtree.cart.Exception.UserException;
import com.mindtree.cart.Exception.UserNotFoundException;
import com.mindtree.cart.entity.Cart;
import com.mindtree.cart.entity.User;
import com.mindtree.cart.service.CartService;
import com.mindtree.cart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private
    CartService cartService;
    @Autowired
    private
    UserService userService;

    @RequestMapping(value = "/saveUpdateCart", method = RequestMethod.POST)
    public Cart saveUpdateCart(@RequestBody Cart cart) {
        return cartService.saveUpdateCart(cart);
    }

    @RequestMapping(value = "/deleteProductFromCart")
    public User deleteProductFromCart(@RequestParam("user") String userName) {
        return userService.getUser(userName);
    }

    @RequestMapping(value = "/getUser")
    public User getUser(@RequestParam("user") String userName) {
        return userService.getUser(userName);
    }

    @RequestMapping(value = "/getUserCart")
    public Cart getUserCart(@RequestParam("user") String userName) throws UserException {
        try {
            return userService.getUserCart(userName);
        } catch (UserNotFoundException e) {
            throw new UserException("User Not Found", e);
        }
    }
}
