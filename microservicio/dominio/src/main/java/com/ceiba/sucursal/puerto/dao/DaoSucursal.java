package com.ceiba.sucursal.puerto.dao;

import com.ceiba.sucursal.modelo.dto.DtoSucursal;
import com.ceiba.usuario.modelo.dto.DtoUsuario;

import java.util.List;

public interface DaoSucursal {
    /**
     * Permite listar sucursales
     * @return los sucursales
     */
    List<DtoSucursal> listarPorPais(String pais);

    /**
     * Permite listar sucursales
     * @return los sucursales
     */
    List<DtoSucursal> listar();
}
