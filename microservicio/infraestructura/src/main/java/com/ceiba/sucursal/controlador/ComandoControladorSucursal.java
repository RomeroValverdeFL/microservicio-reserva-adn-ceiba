package com.ceiba.sucursal.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.sucursal.comando.ComandoSucursal;
import com.ceiba.sucursal.comando.manejador.ManejadorActualizarSucursal;
import com.ceiba.sucursal.comando.manejador.ManejadorCrearSucursal;
import com.ceiba.sucursal.comando.manejador.ManejadorEliminarSucursal;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sucursales")
@Api(tags = { "Controlador comando sucursal"})
public class ComandoControladorSucursal {
    private final ManejadorCrearSucursal manejadorCrearSucursal;
    private final ManejadorEliminarSucursal manejadorEliminarSucursal;
    private final ManejadorActualizarSucursal manejadorActualizarSucursal;

    @Autowired
    public ComandoControladorSucursal(ManejadorCrearSucursal manejadorCrearSucursal,
                                      ManejadorEliminarSucursal manejadorEliminarSucursal,
                                      ManejadorActualizarSucursal manejadorActualizarSucursal) {
        this.manejadorCrearSucursal = manejadorCrearSucursal;
        this.manejadorEliminarSucursal = manejadorEliminarSucursal;
        this.manejadorActualizarSucursal = manejadorActualizarSucursal;
    }

    @PostMapping
    @ApiOperation("Crear Sucursal")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoSucursal comandoSucursal) {
        return manejadorCrearSucursal.ejecutar(comandoSucursal);
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation("Eliminar sucursal")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarSucursal.ejecutar(id);
    }

    @PutMapping(value="/{id}")
    @ApiOperation("Actualizar Sucursal")
    public void actualizar(@RequestBody ComandoSucursal comandoSucursal,@PathVariable Long id) {
        comandoSucursal.setId(id);
        manejadorActualizarSucursal.ejecutar(comandoSucursal);
    }
}
