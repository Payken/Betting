package com.ai.services;

import com.ai.domain.Manufacturer;
import com.ai.model.ManufacturerModel;
import com.ai.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
