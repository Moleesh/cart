package com.mindtree.cart.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int productid;
    private String prodName;
    private float price;

    Product() {
    }

    public Product(int productid, String prodName, float price) {
        this.productid = productid;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return productid == product.productid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productid);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
