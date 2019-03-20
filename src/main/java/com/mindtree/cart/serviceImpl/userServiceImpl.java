package com.mindtree.cart.serviceImpl;

import com.mindtree.cart.dao.UserDAO;
import com.mindtree.cart.entity.User;
import com.mindtree.cart.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUser(String userName) {
        if (!userDAO.existsById(userName)) {
            userDAO.save(new User());
        }
        return userDAO.findById(userName).get();
    }
}
