package com.proyecto_web.proyecto_web.service;
import com.proyecto_web.proyecto_web.entity.Usuario;
import com.proyecto_web.proyecto_web.repository.UsuariosRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuariosService implements IUsuariosService{

    @Autowired
    private UsuariosRepository usuarioRepository;
    @Override
    public List<Usuario> getAllUser() {
        return(List<Usuario>)usuarioRepository.findAll();
    }

    @Override
    public void saveUser(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void delete(long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario getPersonByID(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario findByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }
    
}
