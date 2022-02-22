package com.ceiba.configuracion;

import com.ceiba.sucursal.puerto.respositorio.RepositorioSucursal;
import com.ceiba.sucursal.servicio.ServicioActualizarSucursal;
import com.ceiba.sucursal.servicio.ServicioCrearSucursal;
import com.ceiba.sucursal.servicio.ServicioEliminarSucursal;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import com.ceiba.usuario.servicio.ServicioCrearUsuario;
import com.ceiba.usuario.servicio.ServicioEliminarUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearUsuario servicioCrearUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioCrearUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioEliminarUsuario servicioEliminarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioEliminarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioActualizarUsuario servicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioActualizarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioCrearSucursal servicioCrearSucursal(RepositorioSucursal repositorioSucursal) {
        return new ServicioCrearSucursal(repositorioSucursal);
    }

    @Bean
    public ServicioEliminarSucursal servicioEliminarSucursal(RepositorioSucursal repositorioSucursal) {
        return new ServicioEliminarSucursal(repositorioSucursal);
    }

    @Bean
    public ServicioActualizarSucursal servicioActualizarSucursal(RepositorioSucursal repositorioSucursal) {
        return new ServicioActualizarSucursal(repositorioSucursal);
    }

}
