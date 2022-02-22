package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Usuario;

import java.time.LocalDateTime;

public class UsuarioTestDataBuilder {

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
    private LocalDateTime fecha;

    public UsuarioTestDataBuilder() {
        nombre = "1234";
        clave = "1234";
    }

    public UsuarioTestDataBuilder conClave(String clave) {
        this.clave = clave;
        return this;
    }

    public UsuarioTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public UsuarioTestDataBuilder conFechaCreacion(LocalDateTime fechaCreacion) {
        this.fecha = fechaCreacion;
        return this;
    }

    public UsuarioTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Usuario build() {
        return new Usuario( id,  nombre,  email,  telefono,  ocupacion,  clave,  tipoTarjeta,  nombrePropietarioTarjeta,  numeroTarjeta,  fechaExpiracionTarjeta,  cvvTarjeta, fecha);
    }
}
