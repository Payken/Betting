package com.ai.services;

import com.ai.domain.Manufacturer;
import com.ai.domain.Product;
import com.ai.model.ManufacturerModel;
import com.ai.model.ProductModel;
import com.ai.repositories.ManufacturerRepository;
import com.ai.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by fdarmoch on 2016-01-02.
 */
@Service
@Transactional
public class ManufacturerServices {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public void create(ManufacturerModel manufacturerModel){
    Manufacturer manufacturer = new Manufacturer();
manufacturer.setName(manufacturerModel.getName());
    manufacturerRepository.save(manufacturer);
    }


    public List<Manufacturer> manufacturers() {
        return manufacturerRepository.findAll();
    }

}
