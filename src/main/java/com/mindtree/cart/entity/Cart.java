package com.mindtree.cart.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int cartId;
    @OneToOne
    private User user;
    @OneToMany
    private List<Product> products;
}
