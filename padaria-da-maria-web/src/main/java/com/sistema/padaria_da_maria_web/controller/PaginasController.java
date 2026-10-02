package com.sistema.padaria_da_maria_web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {
    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }

   
}
