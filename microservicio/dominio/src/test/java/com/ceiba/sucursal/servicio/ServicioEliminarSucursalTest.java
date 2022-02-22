package com.ceiba.sucursal.servicio;

import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioEliminarSucursalTest {
    @Test
    @DisplayName("Deberia eliminar la sucursal llamando al repositorio")
    void deberiaEliminarLaSucursalLlamandoAlRepositorio() {
        RepositorioSucursal repositorioSucursal = Mockito.mock(RepositorioSucursal.class);
        ServicioEliminarSucursal servicioEliminarSucursal = new ServicioEliminarSucursal(repositorioSucursal);

        servicioEliminarSucursal.ejecutar(1l);

        Mockito.verify(repositorioSucursal, Mockito.times(1)).eliminar(1l);

    }
}
