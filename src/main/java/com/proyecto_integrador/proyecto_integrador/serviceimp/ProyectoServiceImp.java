package com.proyecto_integrador.proyecto_integrador.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_integrador.proyecto_integrador.model.Proyecto;
import com.proyecto_integrador.proyecto_integrador.repository.ProyectoRepository;
import com.proyecto_integrador.proyecto_integrador.service.ProyectoService;


@Service
public class ProyectoServiceImp implements ProyectoService {
	@Autowired
    private ProyectoRepository repositorio;
    
    @Override
    public List<Proyecto>listar(){
       return repositorio.findAll(); 
    }

    @Override
    public Proyecto listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Proyecto add(Proyecto p) {
        return repositorio.save(p);
    }

    @Override
    public Proyecto edit(Proyecto p) {
        return repositorio.save(p);
    }

    @Override
    public Proyecto delete(int id) {
    	Proyecto p=repositorio.findById(id);
        if(p!=null) {
        	repositorio.delete(p);
        }
       return p;
    }
}
