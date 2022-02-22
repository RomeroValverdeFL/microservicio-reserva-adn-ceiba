package com.ceiba.sucursal.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.sucursal.modelo.entidad.Sucursal;
import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class RepositorioSucursalMssql implements RepositorioSucursal {

    @SqlStatement(namespace="sql/sucursal", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace="sql/sucursal", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace="sql/sucursal", value="eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace="sql/sucursal", value="existeSucursalPorNombreYDireccion")
    private static String sqlExisteSucursalPorNombreYDireccion;

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;
    public RepositorioSucursalMssql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Sucursal sucursal) {
        return this.customNamedParameterJdbcTemplate.crear(sucursal,sqlCrear);
    }

    @Override
    public void actualizar(Sucursal sucursal) {
        this.customNamedParameterJdbcTemplate.actualizar(sucursal, sqlActualizar);
    }

    @Override
    public void eliminar(Sucursal sucursal) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("idSucursal", sucursal.getId());
        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
    }

    @Override
    public boolean existeSucursalPorNombreYDireccion(String nombre, String direccion) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("nombreSucursal", nombre);
        paramSource.addValue("direccionSucursal", direccion);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteSucursalPorNombreYDireccion,paramSource,Boolean.class);
    }
}
