package com.ceiba.sucursal.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;

public class ServicioActualizarSucursal {
    private static final String LA_SUCURSAL_NO_EXISTE_EN_EL_SISTEMA = "La sucursal no existe en el sistema";

    private final RepositorioSucursal repositorioSucursal;

    public ServicioActualizarSucursal(RepositorioSucursal repositorioSucursal) {
        this.repositorioSucursal = repositorioSucursal;
    }

    public void ejecutar(Sucursal sucursal) {
        validarExistenciaSucursal(sucursal);
        this.repositorioSucursal.actualizar(sucursal);
    }


    private void validarExistenciaSucursal(Sucursal sucursal) {
        Boolean existe = this.repositorioSucursal.existeSucursalPorNombreYDireccion(sucursal.getNombre(),sucursal.getDireccion());
        if(!existe) {
            throw new ExcepcionDuplicidad(LA_SUCURSAL_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
}
