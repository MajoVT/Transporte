package com.Transporte.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "Notificaciones")

public class Notificacion {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ubicacion_enviada;
    private Usuario fk_id_usuario;

    public Notificacion() {
    }

    public Notificacion(int id, String ubicacion_enviada, Usuario fk_id_usuario) {
        this.id = id;
        this.ubicacion_enviada = ubicacion_enviada;
        this.fk_id_usuario = fk_id_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion_enviada() {
        return ubicacion_enviada;
    }

    public void setUbicacion_enviada(String ubicacion_enviada) {
        this.ubicacion_enviada = ubicacion_enviada;
    }

    public Usuario getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(Usuario fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }
}
