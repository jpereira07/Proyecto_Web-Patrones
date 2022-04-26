package com.proyecto_web.proyecto_web.controller;
import com.proyecto_web.proyecto_web.entity.Reserva;
import com.proyecto_web.proyecto_web.service.IReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jose
 */
@Controller
public class ReservaController {

    @Autowired
    private IReservaService reservasService;

    @GetMapping("/reserva")
    public String index(Model model) {
        List<Reserva> listaReservas = reservasService.getAllReserve();
        model.addAttribute("titulo", "usuarios");
        model.addAttribute("reserva", listaReservas);
        return "reservas";
    }

    @GetMapping("/reservaNueva")
    public String crearReserva(Model model) {
        model.addAttribute("reservas", new Reserva());
        return "modificarReserva";
    }

    @PostMapping("/save")
    public String guardarUser(@ModelAttribute Reserva reserva) {
        reservasService.saveReserve(reserva);
        return "redirect:/usuarios";
    }

    @GetMapping("/delete/{idreservas}")
    public String eliminarUser(@PathVariable("idreservas") Long idreservas) {
        reservasService.delete(idreservas);
        return "redirect:/usuarios";
    }
}
