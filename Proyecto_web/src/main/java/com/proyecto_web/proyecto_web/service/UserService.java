package com.proyecto_web.proyecto_web.service;
import com.proyecto_web.proyecto_web.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
/**
 *
 * @author jose
 */
public class UserService implements UserDetailsService {

    @Autowired
    public IUsuariosService usuariosService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.usuariosService.findByNombre(username);
        UserPrincipal userprincipal = new UserPrincipal(usuario);
        return userprincipal;
    }
