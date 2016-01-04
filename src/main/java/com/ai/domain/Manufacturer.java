package com.ai.domain;

import javax.persistence.*;
import java.util.List;

@Entity
/**
 * Created by fdarmoch on 2016-01-02.
 */
public class Manufacturer {

    @Id
    @GeneratedValue
    private Integer Id;
    private String name;



    @OneToMany(mappedBy = "manufacturer")
    private List<Product> products;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
