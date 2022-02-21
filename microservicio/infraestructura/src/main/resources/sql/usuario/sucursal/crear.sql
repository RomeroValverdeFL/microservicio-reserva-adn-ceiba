INSERT INTO SUCURSAL(
    nombre,
    descripcion,
    pais,
    ciudad,
    direccion,
    dimension,
    numero_pisos,
    numero_habitaciones,
    imagen_portada,
    tarifa_por_noche,
    status
)VALUES (
    :nombre,
    :descripcion,
    :pais,
    :ciudad,
    :direccion,
    :dimension,
    :numeroPisos,
    :numeroHabitaciones,
    :imagenPortada,
    :tarifaPorNoche,
    :status
)