package com.ceiba.sucursal.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sucursal {
    private Long id;
    private String nombre;
    private String descripcion;
    private String pais;
    private String ciudad;
    private String direccion;
    private Integer dimension;
    private Integer numeroPisos;
    private Integer numeroHabitaciones;
    private String imagenPortada;
    private Float tarifaPorNoche;
    private String status;

    public Sucursal(Long id, String nombre, String descripcion, String pais, String ciudad, String direccion, Integer dimension, Integer numeroPisos, Integer numeroHabitaciones, String imagenPortada, Float tarifaPorNoche, String status) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dimension = dimension;
        this.numeroPisos = numeroPisos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.imagenPortada = imagenPortada;
        this.tarifaPorNoche = tarifaPorNoche;
        this.status = status;
    }
}
