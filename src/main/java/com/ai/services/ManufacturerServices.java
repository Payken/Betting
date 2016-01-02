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
public class ManufacturerServices {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public void create(){
    Manufacturer manufacturer = new Manufacturer();
manufacturer.setName("name");
    manufacturerRepository.save(manufacturer);
    }
}
