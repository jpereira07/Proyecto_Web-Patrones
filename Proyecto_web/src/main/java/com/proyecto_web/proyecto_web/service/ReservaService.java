package com.proyecto_web.proyecto_web.service;

import com.proyecto_web.proyecto_web.entity.Reserva;
import com.proyecto_web.proyecto_web.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_web.proyecto_web.repository.ReservaRepository;

@Service
public class ReservaService implements IReservaService {

    @Autowired
    private ReservaRepository reservasRepository;

    @Override
    public List<Reserva> listReserve() {
        return (List<Reserva>) reservasRepository.findAll();
    }

    @Override
    public List<Reserva> getAllReserve() {
        return (List<Reserva>) reservasRepository.findAll();
    }

    @Override
    public void saveReserve(Reserva reserva) {
        reservasRepository.save(reserva);
    }

    @Override
    public void delete(long id) {
        reservasRepository.deleteById(id);
    }

    @Override
    public Reserva getReserveByID(long id) {
        return reservasRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva findByNumber(String idreservas) {
        return reservasRepository.findByNumber(idreservas);
    }

}
