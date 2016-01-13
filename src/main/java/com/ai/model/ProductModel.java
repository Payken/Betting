package com.ai.model;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.Base64Utils;

import java.io.File;

/**
 * Created by fdarmoch on 2016-01-02.
 */
public class ProductModel {

private String name;
private Integer manufacturer;
    private String file;
private MultipartFile file2;
    private float price;

    public MultipartFile getFile2() {
        return file2;
    }

    public void setFile2(MultipartFile file2) {
        this.file2 = file2;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Integer manufacturer) {
        this.manufacturer = manufacturer;
    }


//    public MultipartFile getFile() {
//        return file;
//    }
//
//    public void setFile(MultipartFile file) {
//        this.file = file;
//    }


//    public MultipartFile getFile() {
 //       return file;
 //   }

//    public void setFile(MultipartFile file) {
//        this.file = file;
//    }

//    public byte[] getFile() {
//        return file;
//    }
//
//    public void setFile(byte[] file) {
//        this.file = file;
//    }


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
