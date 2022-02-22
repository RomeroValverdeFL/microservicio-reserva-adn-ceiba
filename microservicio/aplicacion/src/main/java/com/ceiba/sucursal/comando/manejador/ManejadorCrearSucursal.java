package com.ceiba.sucursal.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.sucursal.comando.ComandoSucursal;
import com.ceiba.sucursal.comando.fabrica.FabricaSucursal;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.servicio.ServicioCrearSucursal;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearSucursal implements ManejadorComandoRespuesta<ComandoSucursal, ComandoRespuesta<Long>> {

    private final FabricaSucursal fabricaSucursal;
    private final ServicioCrearSucursal servicioCrearSucursal;

    public ManejadorCrearSucursal(FabricaSucursal fabricaSucursal, ServicioCrearSucursal servicioCrearSucursal) {
        this.fabricaSucursal = fabricaSucursal;
        this.servicioCrearSucursal = servicioCrearSucursal;
    }
    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoSucursal comando) {
        Sucursal sucursal = this.fabricaSucursal.crear(comando);
        return new ComandoRespuesta<>(this.servicioCrearSucursal.ejecutar(sucursal));
    }
}
