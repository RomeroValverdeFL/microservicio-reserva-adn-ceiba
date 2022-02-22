package com.ceiba.sucursal.servicio;

import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;


public class ServicioEliminarSucursal {
    private final RepositorioSucursal repositorioSucursal;

    public ServicioEliminarSucursal(RepositorioSucursal repositorioSucursal) {
        this.repositorioSucursal = repositorioSucursal;
    }

    public void ejecutar(Long id) {
        this.repositorioSucursal.eliminar(id);
    }
}
