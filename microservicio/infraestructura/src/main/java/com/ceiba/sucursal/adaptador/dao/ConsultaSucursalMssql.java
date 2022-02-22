package com.ceiba.sucursal.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.sucursal.modelo.dto.DtoSucursal;
import com.ceiba.sucursal.puerto.dao.DaoSucursal;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsultaSucursalMssql implements DaoSucursal {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    public ConsultaSucursalMssql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @SqlStatement(namespace= "sucursal", value="listarPorPais")
    private static String sqlListarPorPais;

    @SqlStatement(namespace= "sucursal", value="listar")
    private static String sqlListar;

    @Override
    public List<DtoSucursal> listarPorPais(String pais) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("pais", pais);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorPais,mapSqlParameterSource, new MapeoSucursal());
    }

    @Override
    public List<DtoSucursal> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoSucursal());
    }
}
