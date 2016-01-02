package com.ai.controllers;


import com.ai.domain.Manufacturer;
import com.ai.domain.Product;
import com.ai.domain.Sth;
import com.ai.model.ProductModel;
import com.ai.repositories.SthRepository;
import com.ai.services.ManufacturerServices;
import com.ai.services.ProductServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fdarmoch on 2015-12-28.
 */
@Controller
@RequestMapping("/index") // url (w domysle http://localhost:8080)
public class HomeController {

@Autowired
   private ProductServices productServices;
@Autowired
private ManufacturerServices manufacturerServices;

    @ModelAttribute("product")
    private ProductModel productModel(){
        return new ProductModel();

    }
    @RequestMapping //  rozszerzenie urla z klasy, brak oznacza ze to ten sam url
    public String getView() {

        return "home"; // zwraca sciezke wzgledna do widoku, domyslnie folder templates w resources

    }

    @RequestMapping(value="addProduct", method = RequestMethod.POST, produces = "application/JSON")
    @ResponseBody
    public String addProduct(@RequestBody ProductModel productModel) throws JsonProcessingException {
productServices.create(productModel);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(productModel);
    }

}