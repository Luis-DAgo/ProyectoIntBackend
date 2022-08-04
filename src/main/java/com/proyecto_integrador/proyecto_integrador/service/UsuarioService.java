package com.proyecto_integrador.proyecto_integrador.service;

import java.util.List;
import com.proyecto_integrador.proyecto_integrador.model.Usuario;

public interface UsuarioService {
    
    List<Usuario>listar();
    Usuario listarId(int id);
    Usuario add(Usuario u);
    Usuario edit(Usuario u);
    Usuario delete(int id);
}

