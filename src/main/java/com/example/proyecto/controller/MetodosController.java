package com.example.proyecto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.proyecto.model.Persona;

@Controller
@RequestMapping("/")
public class MetodosController {
    
    @GetMapping("/metodo1")
    public String Metodo1(Model model){
        model.addAttribute("p", getPersonas());
        return "resultados";
    }
    @GetMapping("/metodo2")
    public ModelAndView Metodo2(){
        ModelAndView mav=new ModelAndView("resultados");
        mav.addObject("p", getPersonas());
        return mav;
    }

    private List<Persona> getPersonas(){

        List<Persona> p = new ArrayList<>();
        p.add(new Persona("Paula",310830898));
        p.add(new Persona("Juan",311264514));
        p.add(new Persona("Alejandro",311425972));
        p.add(new Persona("Alba",320972360));

        return p;
    }
}
