create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 email varchar(100) null,
 telefono varchar(100) null,
 ocupacion varchar(100) null,
 clave varchar(45) not null,
 tipo_tarjeta varchar(15) null,
 nombre_propietario_tarjeta varchar(100) null,
 numero_tarjeta varchar(100) null,
 fecha_expiracion_tarjeta varchar(100) null,
 cvv_tarjeta varchar(100) null,
 fecha_creacion datetime null,
 primary key (id)
);

create table sucursal (
 id int(11) not null auto_increment,
 nombre varchar(5) not null,
 descripcion varchar(500) not null,
 pais varchar(100) not null,
 ciudad varchar(100) not null,
 direccion varchar(250) not null,
 dimension int(5) not null,
 numero_pisos int(2) not null,
 numero_habitaciones int(2) not null,
 imagen_portada varchar(250) null,
 tarifa_por_noche decimal(15,2) UNSIGNED NOT NULL,
 status varchar(15) null,
 primary key (id)
);