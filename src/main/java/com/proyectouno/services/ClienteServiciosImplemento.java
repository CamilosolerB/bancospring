package com.proyectouno.services;

import java.util.List;

import com.proyectouno.entity.cliente;
import com.proyectouno.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiciosImplemento implements ClienteServicio {
	@Autowired
	private CLienteRepository clienterepositorio;
	
	@Override
	public List<cliente>clienteresp(){
		return clienterepositorio.findAll();
	}
}
