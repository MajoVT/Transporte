package com.Transporte.entitys;


import jakarta.persistence.*;

@Entity
@Table(name = "tipos")

public class Tipo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_buses")
    private String tipo_buses;

    @Column(name = "metro")
    private String metro;

    public Tipo() {
    }

    public Tipo(int id, String tipo_buses, String metro) {
        this.id = id;
        this.tipo_buses = tipo_buses;
        this.metro = metro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_buses() {
        return tipo_buses;
    }

    public void setTipo_buses(String tipo_buses) {
        this.tipo_buses = tipo_buses;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }
}
