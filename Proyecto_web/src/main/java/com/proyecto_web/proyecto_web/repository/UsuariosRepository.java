package com.proyecto_web.proyecto_web.repository;
import com.proyecto_web.proyecto_web.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuariosRepository extends CrudRepository<Usuario,Long> {
    Usuario findByNombre(String nombre);

}
