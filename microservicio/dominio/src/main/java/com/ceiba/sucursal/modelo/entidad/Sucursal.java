package com.ceiba.sucursal.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import static com.ceiba.dominio.ValidadorArgumento.validarLongitud;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class Sucursal {
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE = "Se debe ingresar el nombre de sucursal";
    private static final String SE_DEBE_INGRESAR_EL_PAIS = "Se debe ingresar el país de sucursal";
    private static final String EL_NOMBRE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A = "El nombre debe tener una longitud mayor o igual a %s";
    private static final int LONGITUD_MINIMO_NOMBRE = 2;
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

    public Sucursal(Long id, String nombre, String descripcion, String pais, String ciudad, String direccion, Integer dimension, Integer numeroPisos, Integer numeroHabitaciones, String imagenPortada, Double tarifaPorNoche, String status) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE);
        validarObligatorio(pais, SE_DEBE_INGRESAR_EL_PAIS);
        validarLongitud(nombre, LONGITUD_MINIMO_NOMBRE, String.format(EL_NOMBRE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A,LONGITUD_MINIMO_NOMBRE));
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
