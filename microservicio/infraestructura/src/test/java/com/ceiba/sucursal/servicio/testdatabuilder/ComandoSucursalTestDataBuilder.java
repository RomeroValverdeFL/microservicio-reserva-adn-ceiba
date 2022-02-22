package com.ceiba.sucursal.servicio.testdatabuilder;

import com.ceiba.sucursal.comando.ComandoSucursal;
public class ComandoSucursalTestDataBuilder {
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

    public ComandoSucursalTestDataBuilder(){
        nombre = "A1001";
        descripcion = "Departamento duplex seccion A";
        pais = "Colombia";
        ciudad = "Medellín";
        direccion = "Ca. Palmeras 123";
        dimension = 110;
        numeroPisos = 2;
        numeroHabitaciones = 4;
        imagenPortada = "";
        tarifaPorNoche = 250.00;
        status = "ACTIVO";
    }
    public ComandoSucursalTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoSucursal build() {
        return new ComandoSucursal(id,nombre,descripcion,pais,ciudad,direccion,dimension,numeroPisos,numeroHabitaciones,
                imagenPortada,tarifaPorNoche,status);
    }
}
