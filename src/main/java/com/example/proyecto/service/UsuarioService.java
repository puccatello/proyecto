package com.example.proyecto.service;

import java.util.List;

import com.example.proyecto.entity.Usuario;

public interface UsuarioService {
    
    public abstract List<Usuario> listAllUsuario();
    public abstract Usuario addUsuario(Usuario usuario);
}
