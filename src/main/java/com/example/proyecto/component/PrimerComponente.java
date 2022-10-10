package com.example.proyecto.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("primerComponente")
public class PrimerComponente {
    private static final Log LOG= LogFactory.getLog(PrimerComponente.class);
    
    public void EjemploComponente(){ 
        LOG.info("Entrando en el componente");
        }
    }

