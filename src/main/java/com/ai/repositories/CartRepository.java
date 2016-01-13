package com.ai.repositories;

import com.ai.domain.Cart;
import com.ai.domain.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by fdarmoch on 2016-01-12.
 */
public interface CartRepository extends JpaRepository<Cart, Integer>{





        List<Cart> findAll();




}
