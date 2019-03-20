package com.mindtree.cart.entity;

import javax.persistence.Entity;

@Entity
public class Book extends Product {
    private String genre;
    private String authour;
    private String publiications;
}
