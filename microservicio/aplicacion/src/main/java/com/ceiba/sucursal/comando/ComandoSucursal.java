package com.ceiba.sucursal.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoSucursal {
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
