package com.proyectouno.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class cliente {

	@Id
	private long documento;
	@Column(name = "nombre", nullable = false, length = 30)
	private String nombre;
	@Column(name = "apellido", nullable = false, length = 30)
	private String apellido;
	@Column(name = "correo", nullable = false, length = 50)
	private String correo;
	@Column(name = "Celular", nullable = false, length = 15)
	private long celular;
	@Column(name = "sexo",length = 10, nullable = false)
	private String sexo;
	@Column(name = "fecha_nacimiento",nullable = false,length = 255)
	private String fecnac;

	public cliente(long documento, String nombre, String apellido, String correo, long celular, String sexo, String fecnac) {
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.celular = celular;
		this.sexo = sexo;
		this.fecnac = fecnac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecnac() {
		return fecnac;
	}

	public void setFecnac(String fecnac) {
		this.fecnac = fecnac;
	}

	public cliente() {
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

}
