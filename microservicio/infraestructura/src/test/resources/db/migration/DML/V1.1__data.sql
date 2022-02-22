insert into usuario(
id,
nombre,
email,
telefono,
ocupacion,
clave,
tipo_tarjeta,
nombre_propietario_tarjeta,
numero_tarjeta,
fecha_expiracion_tarjeta,
cvv_tarjeta,
fecha_creacion
) values(
1,
'test',
'test@ceiba.com.co',
'958797188',
'desarrollador',
'1234',
'credito',
'test',
'1234123412341234',
'06/2026',
'123',
now()
)