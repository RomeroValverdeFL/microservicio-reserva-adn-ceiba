package com.ceiba.sucursal.puerto.respositorio;

import com.ceiba.sucursal.modelo.entidad.Sucursal;

public interface RepositorioSucursal {
    /**
     * Permite crear una sucursal
     * @param sucursal
     * @return el id generado
     */
    Long crear(Sucursal sucursal);

    /**
     * Permite actualizar una sucursal
     * @param sucursal
     */
    void actualizar(Sucursal sucursal);

    /**
     * Permite eliminar un sucursal
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe una sucursal por nombre y direccion.
     * @return si existe o no
     */
    boolean existeSucursalPorNombreYDireccion(String nombre, String direccion);
}
