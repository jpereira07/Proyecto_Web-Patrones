package com.proyecto_web.proyecto_web.repository;

import com.proyecto_web.proyecto_web.entity.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva,Long> {

    public Reserva findByNumber(String idreservas);
    
}
