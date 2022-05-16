package com.proyectouno.controller;

import com.proyectouno.entity.cliente;
import com.proyectouno.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyectouno.services.ClienteServicio;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerCliente {
	
	@Autowired
	private ClienteServicio servicio;
	@GetMapping("cliente")
	public String listarcliente(Model modelo){
		modelo.addAttribute("Nombre",servicio.clienteresp());
		return ("insertarcliente");
	}

	@GetMapping("/cliente/nuevo")

	public  String registrarcliente(Model modelo){
		modelo.addAttribute("clienteinsertar", new cliente());
		return "clientes";
	}

	@Autowired
	private CLienteRepository repository;

	@PostMapping("cliente/guardar")

	public String registrardatoscliente(cliente client){
		cliente clienteguardar=repository.save((new cliente(client.getDocumento(),client.getNombre(),client.getApellido(),client.getCorreo(),client.getCelular(),client.getSexo(),client.getFecnac())));
		return "redirect:/cliente/nuevo";
	}
}
