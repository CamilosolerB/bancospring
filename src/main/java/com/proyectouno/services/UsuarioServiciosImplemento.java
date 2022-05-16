package com.proyectouno.services;

import com.proyectouno.entity.usuario;
import com.proyectouno.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiciosImplemento implements UsuarioServicio{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List <usuario> usuarioresp(){
        return usuarioRepository.findAll();
    }
}
