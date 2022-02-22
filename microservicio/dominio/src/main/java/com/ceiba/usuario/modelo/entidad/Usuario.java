package com.ceiba.usuario.modelo.entidad;


import lombok.Getter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarLongitud;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Usuario {

    private static final String SE_DEBE_INGRESAR_LA_FECHA_CREACION = "Se debe ingresar la fecha de creación";
    private static final String LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A = "La clave debe tener una longitud mayor o igual a %s";
    private static final String SE_DEBE_INGRESAR_LA_CLAVE = "Se debe ingresar la clave";
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "Se debe ingresar el nombre de usuario";

    private static final int LONGITUD_MINIMA_CLAVE = 4;

    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String ocupacion;
    private String clave;
    private String tipoTarjeta;
    private String nombrePropietarioTarjeta;
    private String numeroTarjeta;
    private String fechaExpiracionTarjeta;
    private String cvvTarjeta;
    private LocalDateTime fechaCreacion;

    public Usuario(Long id, String nombre, String email, String telefono, String ocupacion, String clave, String tipoTarjeta, String nombrePropietarioTarjeta, String numeroTarjeta, String fechaExpiracionTarjeta, String cvvTarjetaa,LocalDateTime fechaCreacion) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        validarObligatorio(clave, SE_DEBE_INGRESAR_LA_CLAVE);
        validarLongitud(clave, LONGITUD_MINIMA_CLAVE, String.format(LA_CLAVE_DEBE_TENER_UNA_LONGITUD_MAYOR_O_IGUAL_A,LONGITUD_MINIMA_CLAVE));
        validarObligatorio(fechaCreacion, SE_DEBE_INGRESAR_LA_FECHA_CREACION);
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.clave = clave;
        this.tipoTarjeta = tipoTarjeta;
        this.nombrePropietarioTarjeta = nombrePropietarioTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracionTarjeta = fechaExpiracionTarjeta;
        this.cvvTarjeta = cvvTarjetaa;
        this.fechaCreacion = fechaCreacion;
    }


}
