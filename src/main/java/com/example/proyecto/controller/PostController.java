package com.example.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.proyecto.model.Persona;

@Controller
@RequestMapping("ejemplopost")
public class PostController {

    /*@GetMapping("/")
    public String Redirect1(){
        return "redirect:/ejemplopost/form";
    }*/

    @GetMapping("/")
    public RedirectView Redirect2(){
        return new RedirectView("/ejemplopost/form");
    }

    @GetMapping("/form")
    public String Form(Model model){
        model.addAttribute("persona", new Persona());
        return "formulario";
    }
    
    @PostMapping("/addpersona")
    public ModelAndView Resultados(@ModelAttribute("persona") Persona persona){
        ModelAndView mav=new ModelAndView("resultados");
        mav.addObject("persona", persona);
        return mav;
    }

}
