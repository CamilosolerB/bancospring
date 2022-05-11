package com.proyectouno.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class usuario {

    @Id
    private String documentousu;
    @Column(name = "usuario",nullable = false,length = 255)
    private String usuario;
    @Column(name = "clave",nullable = false,length = 255)
    private String clave;
    @Column(name = "rol")
    private String rol;
    private String estado;
    private String imagen;

    public usuario(String documentousu, String usuario, String clave, String rol, String estado, String imagen) {
        this.documentousu = documentousu;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
        this.imagen = imagen;
    }

    public usuario(String documento, String usuario, String clave, String rol, String estado) {
        this.documentousu = documento;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    }


    public usuario(String documento, String imagen) {
        this.documentousu = documento;
        this.imagen = imagen;
    }

    public usuario(String documento, String usuario, String clave) {
        this.documentousu = documento;
        this.usuario = usuario;
        this.clave = clave;
    }


    public usuario(String documento) {
        this.documentousu = documento;
    }


    public usuario() {
    }

    public String getDocumento() {
        return documentousu;
    }

    public void setDocumento(String documento) {
        this.documentousu = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
