package com.Transporte.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "Medios_Transporte")

public class Medio_transporte {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "tipo", referencedColumnName = "id")
    private Tipo tipo;

    @Column(name = "nombre_transporte")
    private String nombre_tranporte;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "horario_servicio")
    private String horario_servicio;

    @Column(name = "costo")
    private int costo;

    public Medio_transporte() {
    }

    public Medio_transporte(int id, Tipo tipo, String nombre_tranporte, int capacidad, String horario_servicio, int costo) {
        this.id = id;
        this.tipo = tipo;
        this.nombre_tranporte = nombre_tranporte;
        this.capacidad = capacidad;
        this.horario_servicio = horario_servicio;
        this.costo = costo;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre_tranporte() {
        return nombre_tranporte;
    }

    public void setNombre_tranporte(String nombre_tranporte) {
        this.nombre_tranporte = nombre_tranporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorario_servicio() {
        return horario_servicio;
    }

    public void setHorario_servicio(String horario_servicio) {
        this.horario_servicio = horario_servicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

}
