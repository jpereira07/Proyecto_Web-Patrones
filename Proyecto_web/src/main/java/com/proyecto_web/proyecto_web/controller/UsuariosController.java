package com.proyecto_web.proyecto_web.controller;
import com.proyecto_web.proyecto_web.entity.Usuario;
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
        model.addAttribute("usuarios", new Usuario());
        return "modificarUsuario";
    }
    @PostMapping("/save")
    public String guardarUser(@ModelAttribute Usuario usuario){
        usuariosService.saveUser(usuario);
        return "redirect:/usuarios";
    }
    @GetMapping("/delete/{idusuarios}")
    public String eliminarUser(@PathVariable("idusuarios") Long idUsuarios){
        usuariosService.delete(idUsuarios);
        return "redirect:/usuarios";
    }
}

