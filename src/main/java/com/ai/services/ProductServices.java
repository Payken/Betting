package com.ai.services;

import com.ai.domain.Manufacturer;
import com.ai.domain.Product;
import com.ai.model.ProductModel;
import com.ai.repositories.ManufacturerRepository;
import com.ai.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by fdarmoch on 2016-01-02.
 */
@Service
@Transactional
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ManufacturerRepository manufacturerRepository;


    public void create(ProductModel productModel) {
        Product product = new Product();
        product.setName(productModel.getName());
        Manufacturer manufacturer = manufacturerRepository.getOne(productModel.getManufacturer());
        product.setManufacturer(manufacturer);
        productRepository.save(product);
    }

    public void saveProduct(ProductModel productModel) {
        Product product = new Product();
        product.setImage(ProductModel.getImage().getBytes());
        productRepository.save(product);
    }
}
