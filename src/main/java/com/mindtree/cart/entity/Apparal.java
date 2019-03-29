package com.mindtree.cart.entity;

import javax.persistence.Entity;

@Entity
public class Apparal extends Product {
    private String type;
    private String brand;
    private String design;

    public Apparal() {
    }

    public Apparal(int productid, String prodName, float price, String type, String brand, String design) {
        super(productid, prodName, price);
        this.type = type;
        this.brand = brand;
        this.design = design;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "Apparal{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", design='" + design + '\'' +
                '}';
    }
}
