package com.ceiba.sucursal.controlador;

import com.ceiba.sucursal.consulta.ManejadorListarSucursales;
import com.ceiba.sucursal.modelo.dto.DtoSucursal;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
@Api(tags={"Controlador consulta sucursal"})
public class ConsultaControladorSucursal {
    private final ManejadorListarSucursales manejadorListarSucursales;

    public ConsultaControladorSucursal(ManejadorListarSucursales manejadorListarSucursales) {
        this.manejadorListarSucursales = manejadorListarSucursales;
    }

    @GetMapping
    @ApiOperation("Listar Sucursales")
    public List<DtoSucursal> listar() {
        return this.manejadorListarSucursales.ejecutarListar();
    }

    @GetMapping(value="/pais/{pais}")
    @ApiOperation("Listar Sucursal por país")
    public List<DtoSucursal> listarPorPais(@PathVariable String pais){
        return this.manejadorListarSucursales.ejecutarPorPais(pais);
    }

}
