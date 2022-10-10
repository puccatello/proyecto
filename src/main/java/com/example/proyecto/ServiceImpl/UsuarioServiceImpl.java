package com.example.proyecto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.Usuario;
import com.example.proyecto.repository.UsuarioRepository;
import com.example.proyecto.service.UsuarioService;

@Service("usuarioservice")
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    @Qualifier("usuariorepository")
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listAllUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    
}
