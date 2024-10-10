package com.Transporte.entitys;


import jakarta.persistence.*;
import lombok.Generated;

@Entity
@Table(name = "coordenadas")


public class Coordenada {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;
    private String nombre_ubicacion;
    private String longitud;
    private String latitud;

    public Coordenada() {
    }

    public Coordenada(int id, String nombre_ubicacion) {
        this.id = id;
        this.nombre_ubicacion = nombre_ubicacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_ubicacion() {
        return nombre_ubicacion;
    }

    public void setNombre_ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
    }
}
