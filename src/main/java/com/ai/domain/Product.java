package com.ai.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
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
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    @ManyToMany
    private List<MyOrder> myOrders;
    //private MultipartFile image;
    @Lob
    private byte[] image;

//////////////////////////////////////////////////////////////////////////////////////////////

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

 //   public MultipartFile getImage() {
 //       return image;
 //   }

 //   public void setImage(MultipartFile image) {
 //       this.image = image;
 //   }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
