package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.entidad.Usuario;
import org.springframework.stereotype.Component;

import com.ceiba.usuario.comando.ComandoUsuario;

@Component
public class FabricaUsuario {

    public Usuario crear(ComandoUsuario comandoUsuario) {
        return new Usuario(
                comandoUsuario.getId(),
                comandoUsuario.getNombre(),
                comandoUsuario.getEmail(),
                comandoUsuario.getTelefono(),
                comandoUsuario.getOcupacion(),
                comandoUsuario.getClave(),
                comandoUsuario.getTipoTarjeta(),
                comandoUsuario.getNombrePropietarioTarjeta(),
                comandoUsuario.getNumeroTarjeta(),
                comandoUsuario.getFechaExpiracionTarjeta(),
                comandoUsuario.getCvvTarjeta()
        );
    }

}
