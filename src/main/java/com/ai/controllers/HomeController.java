package com.ai.controllers;


import com.ai.domain.Sth;
import com.ai.repositories.SthRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fdarmoch on 2015-12-28.
 */
@Controller
@RequestMapping("/") // url (w domysle http://localhost:8080)
public class HomeController {


    @RequestMapping()  //  rozszerzenie urla z klasy, brak oznacza ze to ten sam url
    public String getView() {

        return "home"; // zwraca sciezke wzgledna do widoku, domyslnie folder templates w resources

    }

}