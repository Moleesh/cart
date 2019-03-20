package com.mindtree.cart.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int UserId;
    private String userName;
    @OneToOne
    Cart cart;
}
