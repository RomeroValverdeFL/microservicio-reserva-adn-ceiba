package com.ceiba.sucursal.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.servicio.testdatabuilder.SucursalTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SucursalTest {
    @Test
    @DisplayName("Deberia crear correctamente la sucursal")
    void deberiaCrearCorrectamenteLaSucursal() {
        // arrange
        //act
        Sucursal sucursal = new SucursalTestDataBuilder().conId(1L).build();
        //assert
        assertEquals(1, sucursal.getId());
        assertEquals("A1000", sucursal.getNombre());
        assertEquals("Departamento duplex seccion A", sucursal.getDescripcion());
        assertEquals("Colombia", sucursal.getPais());
        assertEquals("Medellín", sucursal.getCiudad());
        assertEquals("Ca. Palmeras 123", sucursal.getDireccion());
        assertEquals(110, sucursal.getDimension());
        assertEquals(2, sucursal.getNumeroPisos());
        assertEquals(4, sucursal.getNumeroHabitaciones());
        assertEquals("", sucursal.getImagenPortada());
        assertEquals(250.00, sucursal.getTarifaPorNoche());
        assertEquals("ACTIVO", sucursal.getStatus());

    }
    @Test
    void deberiaFallarSinNombreDeSucursal() {

        //Arrange
        SucursalTestDataBuilder sucursalTestDataBuilder = new SucursalTestDataBuilder().conNombre(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    sucursalTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el nombre de sucursal");
    }
    @Test
    void deberiaFallarSinTamanioNombre() {

        //Arrange
        SucursalTestDataBuilder sucursalTestDataBuilder = new SucursalTestDataBuilder().conNombre("A").conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    sucursalTestDataBuilder.build();
                },
                ExcepcionLongitudValor.class, "El nombre debe tener una longitud mayor o igual a 2");
    }
    @Test
    void deberiaFallarSinPais() {

        //Arrange
        SucursalTestDataBuilder sucursalTestDataBuilder = new SucursalTestDataBuilder().conPais(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    sucursalTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el país de sucursal");
    }

}
