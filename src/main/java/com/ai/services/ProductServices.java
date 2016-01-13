package com.ai.services;

import com.ai.domain.Manufacturer;
import com.ai.domain.Product;
import com.ai.model.ProductModel;
import com.ai.model.SearchModel;
import com.ai.repositories.ManufacturerRepository;
import com.ai.repositories.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

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


    public void create(ProductModel productModel) throws JsonProcessingException, UnsupportedEncodingException {
        Product product = new Product();
        product.setName(productModel.getName());
        Manufacturer manufacturer = manufacturerRepository.getOne(productModel.getManufacturer());
        product.setManufacturer(manufacturer);
        product.setFile(productModel.getFile().getBytes());
        product.setImage(productModel.getFile());
        product.setPrice(productModel.getPrice());
//        product.setImage(productModel.getFile().getBytes());
     //product.setImage(productModel.getFile());

        product.setFile(productModel.getFile().getBytes());
        productRepository.save(product);
    }
    public void addPhoto(MultipartFile multipartFile) throws IOException {
        Product product = productRepository.getOne(7);
      //  product.setImage(multipartFile.toString());
    //    product.setFile(multipartFile.getBytes());
    //    productRepository.save(product);
    }

    public  List<Product> products(){
        return  productRepository.findAll();
    }
    public Product chooseOne(Integer id){
        return productRepository.getOne(id);
    }
    public List<Product> getProducts(SearchModel searchModel) {
        Pageable pageable;
        pageable = new PageRequest(0, 25, Sort.Direction.ASC, "name");
ObjectMapper objectMapper = new ObjectMapper();

        return productRepository.findByNameContainingAndManufacturerAndPriceBetween(searchModel.getProductname(),manufacturerRepository.getOne(searchModel.getManufacturerid()),searchModel.getPricemin(),searchModel.getPricemax(),pageable);
             //   .findByNameContainingAndManufacturer(searchModel.getProductname(),manufacturerRepository.getOne(searchModel.getManufacturerid()),pageable);


        //      return objectMapper.writeValueAsString(products,pageable);
//    return productRepository.findByNameContaining(searchModel.getProductname(),pageable);

    }
//    public void saveProduct(ProductModel productModel) {
//        Product product = new Product();
//
//        productRepository.save(product);
//    }
}
