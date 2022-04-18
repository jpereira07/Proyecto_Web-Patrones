package com.proyecto_web.proyecto_web.controller;
import com.proyecto_web.proyecto_web.entity.Reservas;
import com.proyecto_web.proyecto_web.entity.Usuarios;
import com.proyecto_web.proyecto_web.service.IReservasService;
import com.proyecto_web.proyecto_web.service.IUsuariosService;
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
public class UsuariosController {
    
    @Autowired
    private IReservasService reservasService;
    @Autowired
    private IUsuariosService usuariosService;
    
    @GetMapping("/usuario")
    public String index(Model model){
        List<Usuario> listaUsuarios=usuariosService.getAllUser();
        model.addAttribute("titulo","usuarios");
        model.addAttribute("usuarios",listaUsuarios);
        return "usuarios";
    }
    @GetMapping("/usuarioNuevos")
    public String crearUsuario(Model model){
        List<Reservas> listaReservas = reservasService.listReserves();
        model.addAttribute("usuarios", new Usuarios());
        model.addAttribute("reservas", listaReservas);
        return "modificarUsuario";
    }
    @PostMapping("/save")
    public String guardarUser(@ModelAttribute Usuarios Usuarios){
        usuariosService.saveUser(usuarios);
        return "redirect:/usuarios";
    }
    @GetMapping("/delete/{id}")
    public String eliminarUser(@PathVariable("id") Long idUsuarios){
        usuariosService.delete(idUsuarios);
        return "redirect:/usuarios";
    }
    @GetMapping("/editUsuario/{id}")
    public String editUser(@PathVariable{"id"} Long idUsuarios, Model model){
        Usuarios usuarios = usuariosService.getUsuariosById(idUsuarios);
        List<Reservas> listaReservas = reservasService.listReserves();
        model.addAttribute("usuario", usuarios);
        model.addAttribute("reservas", listaReservas);
        return "modificarUsuario";
    }
}

