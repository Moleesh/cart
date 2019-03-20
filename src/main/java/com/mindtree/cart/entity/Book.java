package com.mindtree.cart.entity;

import javax.persistence.Entity;

@Entity
public class Book extends Product {
    private String genre;
    private String authour;
    private String publiications;

    public Book() {
    }

    public Book(int productid, String prodName, float price, String genre, String authour, String publiications) {
        super(productid, prodName, price);
        this.genre = genre;
        this.authour = authour;
        this.publiications = publiications;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public String getPubliications() {
        return publiications;
    }

    public void setPubliications(String publiications) {
        this.publiications = publiications;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", authour='" + authour + '\'' +
                ", publiications='" + publiications + '\'' +
                '}';
    }
}
