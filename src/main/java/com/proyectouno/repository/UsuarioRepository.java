package com.proyectouno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyectouno.entity.usuario;

public interface UsuarioRepository extends JpaRepository <usuario, Long> {
}
