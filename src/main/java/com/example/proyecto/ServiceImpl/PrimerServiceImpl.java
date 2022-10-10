package com.example.proyecto.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.proyecto.model.Persona;
import com.example.proyecto.service.PrimerService;

@Service("primerservice")
public class PrimerServiceImpl implements PrimerService{

    @Override
    public List<Persona> getPersonas() {
        List<Persona> p=new ArrayList<>();
        p.add(new Persona("Paula",312413413));
        p.add(new Persona("Laura",312413213));
        p.add(new Persona("Carlos",123341355));
        p.add(new Persona("Sofia",31254413));
        return p;
    }
    
}
