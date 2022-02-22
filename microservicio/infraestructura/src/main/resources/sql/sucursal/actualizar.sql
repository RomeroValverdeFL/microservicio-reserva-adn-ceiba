UPDATE sucursal
    set nombre = :nombre
    , descripcion = :descripcion
    , pais = :pais
    , ciudad= :ciudad
    , direccion= :direccion
    , dimension= :dimension
    , numero_pisos= :numeroPisos
    , numero_habitaciones= :numeroHabitaciones
    , imagen_portada= :imagenPortada
    , tarifa_por_noche= :tarifaPorNoche
    , status = :status
    where id = :id