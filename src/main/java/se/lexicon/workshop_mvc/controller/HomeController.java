package se.lexicon.workshop_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Controller
public class HomeController {

    @PostConstruct
    public void init() {

    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }


    @GetMapping("/productManagement")
    public String contact() {
        return "productManagement";
    }


}
