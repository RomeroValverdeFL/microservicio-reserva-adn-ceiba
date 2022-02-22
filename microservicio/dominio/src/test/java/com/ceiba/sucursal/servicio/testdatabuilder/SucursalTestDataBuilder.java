package com.ceiba.sucursal.servicio.testdatabuilder;

import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.usuario.servicio.testdatabuilder.UsuarioTestDataBuilder;

public class SucursalTestDataBuilder {
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
    public SucursalTestDataBuilder(){
        nombre = "A1000";
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
    public SucursalTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }
    public SucursalTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public SucursalTestDataBuilder conPais(String pais) {
        this.pais = pais;
        return this;
    }
    public Sucursal build() {
        Sucursal sucursal = new Sucursal(
                id,nombre,descripcion,pais,ciudad,direccion,dimension,numeroPisos,numeroHabitaciones,
                imagenPortada,tarifaPorNoche,status
        );
        return sucursal;
    }
}
