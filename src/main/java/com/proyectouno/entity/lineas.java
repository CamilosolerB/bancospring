package com.proyectouno.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lineas")
public class lineas {
    private String codigo;
    private String numero;
    private String monto;
    private int plazo;

    public lineas(String codigo, String numero, String monto, int plazo) {
        this.codigo = codigo;
        this.numero = numero;
        this.monto = monto;
        this.plazo = plazo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
