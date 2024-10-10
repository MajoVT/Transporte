package com.Transporte.entitys;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "usuario")

public class Usuario implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "ubicacion_actual")
    private String ubicacio_actual;

    @Column(name = "contacto_confianza")
    private String contacto_confianza;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String email, int telefono, String contraseña, String ubicacio_actual, String contacto_confianza) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.ubicacio_actual = ubicacio_actual;
        this.contacto_confianza = contacto_confianza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUbicacio_actual() {
        return ubicacio_actual;
    }

    public void setUbicacio_actual(String ubicacio_actual) {
        this.ubicacio_actual = ubicacio_actual;
    }

    public String getContacto_confianza() {
        return contacto_confianza;
    }

    public void setContacto_confianza(String contacto_confianza) {
        this.contacto_confianza = contacto_confianza;
    }
}

