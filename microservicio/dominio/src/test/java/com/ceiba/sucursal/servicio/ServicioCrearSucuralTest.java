package com.ceiba.sucursal.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;
import com.ceiba.sucursal.servicio.testdatabuilder.SucursalTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCrearSucuralTest {

    @Test
    @DisplayName("Deberia lanzar una excepecion cuando la longitud del nombre sea menor a 2")
    void deberiaLanzarUnaExepcionCuandoLaLongitudDelNombreSeaMenorADos() {
        // arrange
        SucursalTestDataBuilder sucursalTestDataBuilder = new SucursalTestDataBuilder().conNombre("A");
        // act - assert
        BasePrueba.assertThrows(sucursalTestDataBuilder::build, ExcepcionLongitudValor.class, "El nombre debe tener una longitud mayor o igual a 2");
    }

    @Test
    @DisplayName("Deberia lanzar una exepcion cuando se valide la existencia de la sucursal")
    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDeLaSucursal() {
        // arrange
        Sucursal sucursal = new SucursalTestDataBuilder().build();
        RepositorioSucursal repositorioSucursal = Mockito.mock(RepositorioSucursal.class);
        Mockito.when(repositorioSucursal.existeSucursalPorNombreYDireccion(Mockito.anyString(),Mockito.anyString())).thenReturn(true);
        ServicioCrearSucursal servicioCrearSucursal = new ServicioCrearSucursal(repositorioSucursal);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearSucursal.ejecutar(sucursal), ExcepcionDuplicidad.class,"La sucursal ya existe en el sistema");
    }

    @Test
    @DisplayName("Deberia Crear la sucursal de manera correcta")
    void deberiaCrearLaSucursalDeManeraCorrecta() {
        // arrange
        Sucursal sucursal = new SucursalTestDataBuilder().build();
        RepositorioSucursal repositorioSucursal = Mockito.mock(RepositorioSucursal.class);
        Mockito.when(repositorioSucursal.existeSucursalPorNombreYDireccion(Mockito.anyString(),Mockito.anyString())).thenReturn(false);
        Mockito.when(repositorioSucursal.crear(sucursal)).thenReturn(1L);
        ServicioCrearSucursal servicioCrearSucursal = new ServicioCrearSucursal(repositorioSucursal);
        // act
        Long idSucursal = servicioCrearSucursal.ejecutar(sucursal);
        //- assert
        assertEquals(1L,idSucursal);
        Mockito.verify(repositorioSucursal, Mockito.times(1)).crear(sucursal);
    }
}
