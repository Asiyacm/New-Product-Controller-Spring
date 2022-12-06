package com.example.NewProduct_Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private int pcode;
    private String pname;
    private String mandate;
    private String expdate;
    private String brand;
    private int price;
    private String seller;
    private String distributor;

    public Product() {
    }

    public Product(int id, int pcode, String pname, String mandate, String expdate, String brand, int price, String seller, String distributor) {
        this.id = id;
        this.pcode = pcode;
        this.pname = pname;
        this.mandate = mandate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.seller = seller;
        this.distributor = distributor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
