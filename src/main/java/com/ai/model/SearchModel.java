package com.ai.model;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Null;

/**
 * Created by fdarmoch on 2016-01-02.
 */
public class SearchModel {
private String productname;
    private String manufacturername;
    private Integer manufacturerid;
private Integer pricemin;
private Integer pricemax;
private Integer product;
    SearchModel(){

        pricemin=0;
        pricemax=999999999;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getManufacturername() {
        return manufacturername;
    }

    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername;
    }

    public Integer getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(Integer manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public Integer getPricemin() {
        return pricemin;
    }

    public void setPricemin(Integer pricemin) {

        this.pricemin = pricemin;

    }

    public Integer getPricemax() {
        return pricemax;
    }

    public void setPricemax(Integer pricemax) {
        this.pricemax = pricemax;
    }
}
