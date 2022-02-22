package com.ceiba.sucursal.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.sucursal.servicio.ServicioEliminarSucursal;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarSucursal implements ManejadorComando<Long> {
    private final ServicioEliminarSucursal servicioEliminarSucursal;

    public ManejadorEliminarSucursal(ServicioEliminarSucursal servicioEliminarSucursal) {
        this.servicioEliminarSucursal = servicioEliminarSucursal;
    }

    public void ejecutar(Long idSucursal) {
        this.servicioEliminarSucursal.ejecutar(idSucursal);
    }
}
