package com.ai.repositories;

import com.ai.domain.Manufacturer;
import com.ai.domain.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by fdarmoch on 2015-12-28.
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {


   List<Product> findByName(String name);
   List<Product> findByNameContainingAndManufacturerAndPriceBetween(String name, Manufacturer manufacturer,float pricemin, float pricemax, Pageable pageable);


}