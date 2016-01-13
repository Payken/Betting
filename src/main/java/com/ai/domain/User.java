package com.ai.domain;

import javax.persistence.*;
import java.util.List;

@Entity
/**
 * Created by jrudnik on 2016-01-03.
 */
public class User{

    public User(){};

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String surname;
    private Boolean active;
    private String mail;
    private Boolean trusted;
    @OneToMany(mappedBy = "user")
    private List<MyOrder> orders;
   @ManyToOne
   @JoinColumn(name = "role_id")
   private Role role;
    @OneToOne
    private Cart cart;
    private String password;

///////////////////////////////////////////////////////////////////////


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean getTrusted() {
        return trusted;
    }

    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    public List<MyOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<MyOrder> orders) {
        this.orders = orders;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    //    @ManyToOne(fetch = FetchType.LAZY)


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "opinion")
//    public Set<Opinion> getOpinion() {
//        return this.opinion;
//    }
//
//    public void setOpinion(Set<Opinion> opinion) {
//        this.opinion = opinion;
//    }

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
//    public Set<Order> getOrder() {
//        return this.order;
//    }
//
//    public void setOrder(Set<Order> order) {
//        this.order = order;
//    }
}