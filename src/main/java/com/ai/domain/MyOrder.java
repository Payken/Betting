package com.ai.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by jrudnik on 2016-01-03.
 */
@Entity

public class MyOrder {

    public MyOrder(){};

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany
    private List<Product> product;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Integer amount;
    private Float value;
    private String status;
    private Date orderdate;
    private Date receiptdate;
    private Boolean finalized;
/////////////////////////////////////////////////////
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(Date receiptdate) {
        this.receiptdate = receiptdate;
    }

    public Boolean getFinalized() {
        return finalized;
    }

    public void setFinalized(Boolean finalized) {
        this.finalized = finalized;
    }

//
/////////////////////////////////////////////////////////////////////////
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//    public Integer getAmount() {
//        return amount;
//    }
//
//    public void setAmount(Integer amount) {
//        this.amount = amount;
//    }
//
//    public Boolean getFinalized() {
//        return finalized;
//    }
//
//    public void setFinalized(Boolean finalized) {
//        this.finalized = finalized;
//    }
//    public Float getValue() {
//        return value;
//    }
//
//    public void setValue(Float value) {
//        this.value = value;
//    }
//
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//
//
//    public Date getOrderDate() {
//        return orderdate;
//    }
//
//    public void setOrderDate(Date orderdate) {
//        this.orderdate = orderdate;
//    }
//
//
//
//    public Date getReceiptDate() {
//        return receiptdate;
//    }
//
//    public void setReceiptDate(Date receiptdate) {
//        this.receiptdate = receiptdate;
//    }
//    /////////
//    @ManyToOne(fetch = FetchType.LAZY)
//
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    public Set<Product> getProduct() {
//        return this.product;
//    }
//
//    public void setProduct(Set<Product> product) {
//        this.product = product;
//    }

}