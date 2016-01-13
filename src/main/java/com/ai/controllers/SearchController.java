
package com.ai.controllers;


import com.ai.domain.Manufacturer;
import com.ai.model.SearchModel;
import com.ai.services.ManufacturerServices;
import com.ai.services.ProductServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fdarmoch on 2015-12-28.
 */
@Controller
@RequestMapping("/search") // url (w domysle http://localhost:8080)
public class SearchController {

    @Autowired
    private ProductServices productServices;
    @Autowired
    private ManufacturerServices manufacturerServices;
    @ModelAttribute("manufacturers")
    private List<Manufacturer> manufacturerList(){
        return manufacturerServices.manufacturers();
    }



    @RequestMapping  //  rozszerzenie urla z klasy, brak oznacza ze to ten sam url
    public String getView(Model model) {
        return "search"; // zwraca sciezke wzgledna do widoku, domyslnie folder templates w resources
    }


    @RequestMapping(value="/searchProduct", method = RequestMethod.POST, produces = "application/JSON")
    @ResponseBody
    public String searchProduct(@RequestBody SearchModel searchModel) throws JsonProcessingException {
        System.out.println(searchModel.getManufacturerid());
    //    productServices.getProducts(searchModel);
        ObjectMapper objectMapper = new ObjectMapper();
       return objectMapper.writeValueAsString(productServices.getProducts(searchModel));

//        manufacturerServices.create(manufacturerModel);
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(manufacturerModel);

    }

    @RequestMapping(value="/addCart", method = RequestMethod.POST, produces = "application/JSON")
    @ResponseBody
    public String addCart(@RequestBody SearchModel searchModel) throws JsonProcessingException {




//        System.out.println(searchModel.getManufacturerid());
//        //    productServices.getProducts(searchModel);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(searchModel);
//
////        manufacturerServices.create(manufacturerModel);
////        ObjectMapper objectMapper = new ObjectMapper();
////        return objectMapper.writeValueAsString(manufacturerModel);

    }

}