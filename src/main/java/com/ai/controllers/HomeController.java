package com.ai.controllers;


import com.ai.domain.Manufacturer;
import com.ai.services.ManufacturerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by fdarmoch on 2015-12-28.
 */
@Controller
@RequestMapping("/") // url (w domysle http://localhost:8080)
public class HomeController {

    @Autowired
    private ManufacturerServices manufacturerServices;
    @ModelAttribute("manufacturers")
    private List<Manufacturer> manufacturerList(){
        return manufacturerServices.manufacturers();
    }


    @RequestMapping()  //  rozszerzenie urla z klasy, brak oznacza ze to ten sam url
    public String getView(Model model) {
        return "redirect:/index"; // zwraca sciezke wzgledna do widoku, domyslnie folder templates w resources
    }
    @RequestMapping("/index")  //  rozszerzenie urla z klasy, brak oznacza ze to ten sam url
    public String getIndex(Model model) {
        return "index"; // zwraca sciezke wzgledna do widoku, domyslnie folder templates w resources
    }


}