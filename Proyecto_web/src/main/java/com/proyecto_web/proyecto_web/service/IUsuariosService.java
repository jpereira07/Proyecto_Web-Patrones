package com.proyecto_web.proyecto_web.service;
import com.proyecto_web.proyecto_web.entity.Usuario;
import java.util.List;

public interface IUsuariosService {

    public List<Usuario> getAllUser();

    public void savePerson(Usuario usuario);

    public void delete(long id);

    public Usuario getPersonByID(long id);

    public Usuario findByNombre(String nombre);
}
