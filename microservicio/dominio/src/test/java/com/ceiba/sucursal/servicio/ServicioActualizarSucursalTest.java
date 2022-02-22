package com.ceiba.sucursal.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;
import com.ceiba.sucursal.servicio.testdatabuilder.SucursalTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioActualizarSucursalTest {
    @Test
    @DisplayName("Deberia validar la existencia previa de la sucursal")
    void deberiaValidarLaExistenciaPreviaDeLaSucursal() {
        // arrange
        Sucursal sucursal = new SucursalTestDataBuilder().conId(1L).build();
        RepositorioSucursal repositorioSucursal = Mockito.mock(RepositorioSucursal.class);
        Mockito.when(repositorioSucursal.existeSucursalPorNombreYDireccion(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
        ServicioActualizarSucursal servicioActualizarSucursal = new ServicioActualizarSucursal(repositorioSucursal);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarSucursal.ejecutar(sucursal), ExcepcionDuplicidad.class,"La sucursal no existe en el sistema");
    }

    @Test
    @DisplayName("Deberia actualizar correctamente en el repositorio")
    void deberiaActualizarCorrectamenteEnElRepositorio() {
        // arrange
        Sucursal sucursal = new SucursalTestDataBuilder().conId(1L).build();
        RepositorioSucursal repositorioSucursal = Mockito.mock(RepositorioSucursal.class);
        Mockito.when(repositorioSucursal.existeSucursalPorNombreYDireccion(Mockito.anyString(),Mockito.anyString())).thenReturn(true);
        ServicioActualizarSucursal servicioActualizarSucursal = new ServicioActualizarSucursal(repositorioSucursal);
        // act
        servicioActualizarSucursal.ejecutar(sucursal);
        //assert
        Mockito.verify(repositorioSucursal,Mockito.times(1)).actualizar(sucursal);
    }
}
