package com.proyecto_web.proyecto_web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author jose
 */
@Controller
public class LoginController {
    @GetMapping({"/","hotel"})
    public String index(){
        return "index";
    }
}
