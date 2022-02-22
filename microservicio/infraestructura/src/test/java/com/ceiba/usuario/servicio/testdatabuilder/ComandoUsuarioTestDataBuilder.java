package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.ComandoUsuario;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComandoUsuarioTestDataBuilder {

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

    public ComandoUsuarioTestDataBuilder() {
        nombre = UUID.randomUUID().toString();
        clave = "1234";
        fechaCreacion = LocalDateTime.now();
    }

    public ComandoUsuarioTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoUsuario build() {
        return new ComandoUsuario(id,nombre,email,telefono, ocupacion,clave,tipoTarjeta,
                nombrePropietarioTarjeta,
                numeroTarjeta,
                fechaExpiracionTarjeta,
                cvvTarjeta,
                fechaCreacion);
    }
}
