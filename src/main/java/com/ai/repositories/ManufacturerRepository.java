package com.ai.repositories;

import com.ai.domain.Manufacturer;
import com.ai.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by fdarmoch on 2015-12-28.
 */

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {


   List<Manufacturer> findAll();



}