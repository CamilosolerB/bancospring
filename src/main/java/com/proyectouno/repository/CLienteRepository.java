package com.proyectouno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyectouno.entity.cliente;


@Repository
public interface CLienteRepository extends JpaRepository<cliente, Long> {
	
}
