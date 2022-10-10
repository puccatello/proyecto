package com.example.proyecto.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyecto.component.PrimerComponente;

@Controller
@RequestMapping("/")
public class LogController {
    @Autowired
    @Qualifier("primerComponente")
    private PrimerComponente primerComponente;
    private static final Log LOG=LogFactory.getLog(LogController.class);

    @GetMapping("metodo11")
    public String Metodo1(){
        primerComponente.EjemploComponente();
        LOG.info("Estamos entrando en el metodo 1");
        return "view1";
    }
    @GetMapping("metodo22")
    public String Metodo2(){
        LOG.info("Estamos entrando en el metodo 2");
        return "view2";
    }
}
