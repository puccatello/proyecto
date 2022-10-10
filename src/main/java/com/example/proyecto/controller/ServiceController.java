package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyecto.service.PrimerService;

@Controller
@RequestMapping("/")
public class ServiceController {

    @Autowired
    @Qualifier("primerservice")

    private PrimerService primerservice;

    @GetMapping("/listado")
    public String ListadoPersonas(Model model){
        model.addAttribute("p", primerservice.getPersonas());
        return "listado";
    }
    
}
