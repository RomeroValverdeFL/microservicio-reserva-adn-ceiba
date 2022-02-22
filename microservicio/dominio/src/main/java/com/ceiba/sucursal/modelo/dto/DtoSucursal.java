package com.ceiba.sucursal.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoSucursal {
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
    private Double tarifaPorNoche;
    private String status;
}
