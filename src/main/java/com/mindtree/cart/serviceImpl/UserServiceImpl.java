package com.mindtree.cart.serviceImpl;

import com.mindtree.cart.dao.UserDAO;
import com.mindtree.cart.entity.Cart;
import com.mindtree.cart.entity.User;
import com.mindtree.cart.exception.UserNotFoundException;
import com.mindtree.cart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    /**
     * Retrieve a new User if not exits Create a new one
     *
     * @param userName
     * @return
     */
    @Override
    public User getUser(String userName) {
        if (!userDAO.existsById(userName)) {
            userDAO.save(new User(userName));
        }
        return userDAO.findById(userName).get();
    }

    /**
     * Retrive the cart fot the User
     *
     * @param userName
     * @return
     */
    @Override
    public Cart getUserCart(String userName) throws UserNotFoundException {
        if (userDAO.existsById(userName)) {
            return userDAO.findById(userName).get().getCart();
        } else {
            throw new UserNotFoundException("User not Found in DB");
        }
    }
}
