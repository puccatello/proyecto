package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.proyecto.entity.Usuario;
import com.example.proyecto.service.UsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    @Qualifier("usuarioservice")
    
    private UsuarioService usuarioService;

    @GetMapping("/list")
    public ModelAndView listAllUsuarios(){

        ModelAndView mav = new ModelAndView("list");
        mav.addObject("usuarios", usuarioService.listAllUsuario());
        mav.addObject("user", new Usuario());
        return mav;
    }

    
    @PostMapping("/addusers")
    public String addUsers(@ModelAttribute(name="users") Usuario usuario){
        usuarioService.addUsuario(usuario);
        return "redirect:/user/list";
        
    }   
}
