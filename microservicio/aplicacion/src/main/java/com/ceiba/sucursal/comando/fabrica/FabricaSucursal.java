package com.ceiba.sucursal.comando.fabrica;

import com.ceiba.sucursal.comando.ComandoSucursal;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import org.springframework.stereotype.Component;

@Component
public class FabricaSucursal {
    public Sucursal crear(ComandoSucursal comandoSucursal) {
        return new Sucursal(
                comandoSucursal.getId(),
                comandoSucursal.getNombre(),
                comandoSucursal.getDescripcion(),
                comandoSucursal.getPais(),
                comandoSucursal.getCiudad(),
                comandoSucursal.getDireccion(),
                comandoSucursal.getDimension(),
                comandoSucursal.getNumeroPisos(),
                comandoSucursal.getNumeroHabitaciones(),
                comandoSucursal.getImagenPortada(),
                comandoSucursal.getTarifaPorNoche(),
                comandoSucursal.getStatus()

        );
    }
}
