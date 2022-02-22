package com.ceiba.sucursal.consulta;

import com.ceiba.sucursal.modelo.dto.DtoSucursal;
import com.ceiba.sucursal.puerto.dao.DaoSucursal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarSucursales {
    private final DaoSucursal daoSucursal;

    public ManejadorListarSucursales(DaoSucursal daoSucursal){
        this.daoSucursal = daoSucursal;
    }

    public List<DtoSucursal> ejecutarListar(){ return this.daoSucursal.listar(); }

    public List<DtoSucursal> ejecutarPorPais(String pais){
        return daoSucursal.listarPorPais(pais);
    }
}
