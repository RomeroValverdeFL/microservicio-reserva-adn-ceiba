package com.ceiba.sucursal.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.sucursal.comando.ComandoSucursal;
import com.ceiba.sucursal.comando.fabrica.FabricaSucursal;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.servicio.ServicioActualizarSucursal;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarSucursal implements ManejadorComando<ComandoSucursal> {
    private final FabricaSucursal fabricaSucursal;
    private final ServicioActualizarSucursal servicioActualizarSucursal;

    public ManejadorActualizarSucursal(FabricaSucursal fabricaSucursal, ServicioActualizarSucursal servicioActualizarSucursal) {
        this.fabricaSucursal = fabricaSucursal;
        this.servicioActualizarSucursal = servicioActualizarSucursal;
    }

    public void ejecutar(ComandoSucursal comandoSucursal) {
        Sucursal sucursal = this.fabricaSucursal.crear(comandoSucursal);
        this.servicioActualizarSucursal.ejecutar(sucursal);
    }
}
