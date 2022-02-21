package com.ceiba.sucursal.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;
import com.ceiba.sucursal.puerto.dao.DaoSucursal;

public class ServicioCrearSucursal {
    private static final String LA_SUCURSAL_YA_EXISTE_EN_EL_SITEMA = "El comparendo ya existe en el sistema";
    private final RepositorioSucursal repositorioSucursal;
    private final DaoSucursal daoSucursal;

    public ServicioCrearSucursal(RepositorioSucursal repositorioSucursal, DaoSucursal daoSucursal) {
        this.repositorioSucursal = repositorioSucursal;
        this.daoSucursal = daoSucursal;
    }

    public Long ejecutar(Sucursal sucursal){
        this.validarExistenciaSucursal(sucursal);
        return repositorioSucursal.crear(sucursal);
    }
    private void validarExistenciaSucursal(Sucursal sucursal) {
        Boolean existe = this.repositorioSucursal.existeSucursalPorNombreYDireccion(sucursal.getNombre(),sucursal.getDireccion());
        if(existe) {
            throw new ExcepcionDuplicidad(LA_SUCURSAL_YA_EXISTE_EN_EL_SITEMA);
        }
    }
}
