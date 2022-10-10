package com.example.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PeticionesController {

    @GetMapping("/peticiones1")
    public ModelAndView Peticiones1(@RequestParam(name="nombre") String nom){
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("nombre", nom);
        return mav;
    }

    @GetMapping("/peticiones2/{nombre}")
    public ModelAndView Peticiones2(@PathVariable(name="nombre") String nom){
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("nombre", nom);
        return mav;
    }
    
}
