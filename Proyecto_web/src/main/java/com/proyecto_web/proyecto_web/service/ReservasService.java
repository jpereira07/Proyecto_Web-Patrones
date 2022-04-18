package com.proyecto_web.proyecto_web.service;

import com.proyecto_web.proyecto_web.entity.Reserva;
import com.proyecto_web.proyecto_web.repository.ReservasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservasService implements IReservasService {

    @Autowired
    private ReservasRepository reservasRepository;

    @Override
    public List<Reserva> listReserve() {
        return (List<Reserva>) reservasRepository.findAll();
    }

}
