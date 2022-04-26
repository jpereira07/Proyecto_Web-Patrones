package com.proyecto_web.proyecto_web.service;

import java.util.List;
import com.proyecto_web.proyecto_web.entity.Reserva;

/**
 *
 * @author jose
 */
public interface IReservaService {

    public List<Reserva> listReserve();

    public List<Reserva> getAllReserve();

    public void saveReserve(Reserva reserva);

    public void delete(long id);

    public Reserva getReserveByID(long id);

    public Reserva findByNumber(String idReserva);
}
