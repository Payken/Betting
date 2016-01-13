package com.ai.controllers;


import com.ai.domain.Product;
import com.ai.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

/**
 * Created by fdarmoch on 2015-12-28.
 */
@Controller
@RequestMapping("/products") // url (w domysle http://localhost:8080)
public class ProductsController {

@Autowired
    ProductServices productServices;
 @ModelAttribute("products")
 private List<Product> products() {return productServices.products();}

    @RequestMapping()  //  rozszerzenie urla z klasy, brak oznacza ze to ten sam url
    public String getView(Model model) {
        return "products"; // zwraca sciezke wzgledna do widoku, domyslnie folder templates w resources
    }


    @RequestMapping(value = "/imageDisplay", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public byte[] showImage(@RequestParam("id") Integer itemId)
            throws ServletException, IOException {
//        byte b[];
 //       b = b.decodeFromString

      Product product = productServices.chooseOne(itemId);
        return product.getFile();
 //       ObjectMapper objectMapper = new ObjectMapper();
  //      return objectMapper.writeValueAsString(product);
   //    response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
   //     response.getOutputStream().write(product.getImage());

 //       response.getOutputStream().close();
        //

        }


}