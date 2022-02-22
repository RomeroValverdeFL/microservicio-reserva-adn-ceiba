package com.ceiba.sucursal.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.usuario.controlador.ConsultaControladorUsuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ConsultaControladorSucursal.class)
@ContextConfiguration(classes= ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ConsultaControladorSucursalTest {
    @Autowired
    private MockMvc mocMvc;

    @Test
    @DisplayName("Deberia listar sucursales")
    void deberiaListarSucursales() throws Exception {
        // arrange
        // act - assert
        mocMvc.perform(get("/sucursales")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].nombre", is("A1000")))
                .andExpect(jsonPath("$[0].descripcion", is("Departamento duplex seccion A")))
                .andExpect(jsonPath("$[0].pais", is("Colombia")))
                .andExpect(jsonPath("$[0].ciudad", is("Medellín")))
                .andExpect(jsonPath("$[0].direccion", is("Ca. Palmeras 123")))
                .andExpect(jsonPath("$[0].dimension", is(110)))
                .andExpect(jsonPath("$[0].numeroPisos", is(2)))
                .andExpect(jsonPath("$[0].numeroHabitaciones", is(4)))
                .andExpect(jsonPath("$[0].imagenPortada", is("")))
                .andExpect(jsonPath("$[0].tarifaPorNoche", is(250.00)))
                .andExpect(jsonPath("$[0].status", is("ACTIVO")))
        ;

    }

    @Test
    @DisplayName("Deberia listar sucursales por país")
    void deberiaListarSucursalesPorPais() throws Exception {
        // arrange
        String pais = "Colombia";
        // act - assert
        mocMvc.perform(get("/sucursales/pais/{pais}",pais)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].nombre", is("A1000")))
                .andExpect(jsonPath("$[0].descripcion", is("Departamento duplex seccion A")))
                .andExpect(jsonPath("$[0].pais", is("Colombia")))
                .andExpect(jsonPath("$[0].ciudad", is("Medellín")))
                .andExpect(jsonPath("$[0].direccion", is("Ca. Palmeras 123")))
                .andExpect(jsonPath("$[0].dimension", is(110)))
                .andExpect(jsonPath("$[0].numeroPisos", is(2)))
                .andExpect(jsonPath("$[0].numeroHabitaciones", is(4)))
                .andExpect(jsonPath("$[0].imagenPortada", is("")))
                .andExpect(jsonPath("$[0].tarifaPorNoche", is(250.00)))
                .andExpect(jsonPath("$[0].status", is("ACTIVO")))
        ;

    }
}
