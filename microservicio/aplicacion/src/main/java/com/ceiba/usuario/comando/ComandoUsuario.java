package com.ceiba.usuario.comando;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoUsuario{
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
}
