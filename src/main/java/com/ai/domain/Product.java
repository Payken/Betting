package com.ai.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
/**
 * Created by fdarmoch on 2015-12-30.
 */
public class Product {




    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "manufacturer")
    @JsonIgnore
    private Manufacturer manufacturer;
    @ManyToMany
    private List<Cart> cart;
    @ManyToMany
    private List<MyOrder> myOrders;
//    @Lob
//    private MultipartFile image;
    @Lob
    private String image;
    @Lob
    private byte[] file;
    private float price;
//////////////////////////////////////////////////////////////////////////////////////////////


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<MyOrder> getOrder() {
        return myOrders;
    }

    public void setOrder(List<MyOrder> myOrders) {
        this.myOrders = myOrders;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyOrder> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(List<MyOrder> myOrders) {
        this.myOrders = myOrders;
    }

//    public MultipartFile getImage() {
//        return image;
//    }

    //   public MultipartFile getImage() {
 //       return image;
 //   }

 //   public void setImage(MultipartFile image) {
 //       this.image = image;
 //   }


//    public byte[] getImage() {
//        return image;
//    }
//
//    public void setImage(byte[] image) {
//        this.image = image;
//    }

//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

//    public void setImage(MultipartFile image) {
//
//        this.image = image;
//    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Cart> getCart() {
        return cart;
    }

    public void setCart(List<Cart> cart) {
        this.cart = cart;
    }
}
