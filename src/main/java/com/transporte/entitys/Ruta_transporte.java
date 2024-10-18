package com.transporte.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "Rutas_Transporte")

public class Ruta_transporte {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_ruta;
    private String paradas;

    public Ruta_transporte() {
    }

    public Ruta_transporte(int id, String nombre_ruta, String paradas) {
        this.id = id;
        this.nombre_ruta = nombre_ruta;
        this.paradas = paradas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(String nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }

    public String getParadas() {
        return paradas;
    }

    public void setParadas(String paradas) {
        this.paradas = paradas;
    }
}
