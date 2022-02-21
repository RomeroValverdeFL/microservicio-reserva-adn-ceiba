package com.ceiba.sucursal.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoSucursal  implements RowMapper<Sucursal>, MapperResult {
    @Override
    public Sucursal mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long id = rs.getLong("id");
        String nombre = rs.getString("nombre");
        String descripcion = rs.getString("descripcion");
        String pais = rs.getString("pais");
        String ciudad = rs.getString("ciudad");
        String direccion = rs.getString("direccion");
        Integer dimension = rs.getInt("dimension");
        Integer numeroPisos = rs.getInt("numero_pisos");
        Integer numeroHabitaciones = rs.getInt("numero_habitaciones");
        String imagenPortada = rs.getString("imagen_portada");
        Float tarifaPorNoche = rs.getFloat("tarifa_por_noche");
        String status = rs.getString("status");
        return new Sucursal(id,nombre,descripcion,pais,ciudad,direccion,dimension,numeroPisos,
                numeroHabitaciones,imagenPortada,tarifaPorNoche,status);
    }
}
