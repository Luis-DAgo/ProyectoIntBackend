package com.proyecto_integrador.proyecto_integrador.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import exception.UserNotFoundException;
import com.proyecto_integrador.proyecto_integrador.model.Usuario;
import com.proyecto_integrador.proyecto_integrador.repository.UsuarioRepository;
import com.proyecto_integrador.proyecto_integrador.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
    @Autowired
    private UsuarioRepository repositorio;
    
    @Override
    public List<Usuario>listar(){
       return repositorio.findAll(); 
    }

    @Override
    public Usuario listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuario add(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario edit(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario delete(int id) {
        Usuario u=repositorio.findById(id);
        if(u!=null) {
        	repositorio.delete(u);
        }
       return u;
    }
}
