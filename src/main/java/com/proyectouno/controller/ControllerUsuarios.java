package com.proyectouno.controller;


import com.proyectouno.entity.usuario;
import com.proyectouno.repository.UsuarioRepository;
import com.proyectouno.services.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerUsuarios {
    @Autowired
    private UsuarioServicio servicio;
    @GetMapping("usuario/ver")
    public String listarcliente(Model modelo){
        modelo.addAttribute("Nombre",servicio.usuarioresp());
        return ("verusuarios");
    }

    @GetMapping("/")

    public  String registrarcliente(Model modelo){
        modelo.addAttribute("clienteinsertar", new usuario());
        return "index";
    }

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("usuario/guardar")

    public String registrardatoscliente(usuario usu){
        usuario clienteguardar=repository.save((new usuario("100",usu.getUsuario(),usu.getClave(),usu.getRol(),usu.getEstado(),usu.getImagen())));
        return "redirect:/";
    }
}
