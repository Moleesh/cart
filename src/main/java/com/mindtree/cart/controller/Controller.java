package com.mindtree.cart.controller;

import com.mindtree.cart.entity.Cart;
import com.mindtree.cart.entity.User;
import com.mindtree.cart.exception.UserException;
import com.mindtree.cart.exception.UserNotFoundException;
import com.mindtree.cart.service.CartService;
import com.mindtree.cart.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private
    CartService cartService;
    @Autowired
    private
    UserService userService;

    @RequestMapping(value = "/saveUpdateCart", method = RequestMethod.POST)
    public Cart saveUpdateCart(@RequestBody Cart cart) {
        logger.info("Control has hit saveUpdateCart method ... by User ", cart.getUser());
        return cartService.saveUpdateCart(cart);
    }

    @RequestMapping(value = "/deleteProductFromCart")
    public User deleteProductFromCart(@RequestParam("user") String userName) {
        logger.info("Control has hit deleteProductFromCart method ... with username", userName);
        return userService.getUser(userName);
    }

    @RequestMapping(value = "/getUser")
    public User getUser(@RequestParam("user") String userName) {
        logger.info("Control has hit getUser method ... with username", userName);
        return userService.getUser(userName);
    }

    @RequestMapping(value = "/getUserCart")
    public Cart getUserCart(@RequestParam("user") String userName) throws UserException {
        logger.info("Control has hit getUserCart method ... with username", userName);
        try {
            return userService.getUserCart(userName);
        } catch (UserNotFoundException e) {
            logger.error("User Not Found ... for user with username ", userName);
            throw new UserException("User Not Found for user" + userName, e);
        }
    }
}
