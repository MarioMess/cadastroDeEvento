package com.eventoapp.eventoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventroController {

    @RequestMapping("/cadastrarEvento")
    public String form(){
        return "evento/formEvento";
    }
}
