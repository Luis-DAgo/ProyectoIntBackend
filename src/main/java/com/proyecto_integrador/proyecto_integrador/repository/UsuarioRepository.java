package com.proyecto_integrador.proyecto_integrador.repository;

import java.util.List;
import com.proyecto_integrador.proyecto_integrador.model.Usuario;
import org.springframework.data.repository.Repository;

public interface UsuarioRepository extends Repository<Usuario, Integer>{
    List<Usuario>findAll();
    Usuario findById(int id);
    Usuario save(Usuario u);
    void delete(Usuario u);
}
