package com.proyecto_integrador.proyecto_integrador.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_integrador.proyecto_integrador.model.Experiencia;
import com.proyecto_integrador.proyecto_integrador.repository.ExperienciaRepository;
import com.proyecto_integrador.proyecto_integrador.service.ExperienciaService;


@Service
public class ExperienciaServiceImp implements ExperienciaService {
	  @Autowired
	    private ExperienciaRepository repositorio;
	    
	    @Override
	    public List<Experiencia>listar(){
	       return repositorio.findAll(); 
	    }

	    @Override
	    public Experiencia listarId(int id) {
	        return repositorio.findById(id);
	    }

	    @Override
	    public Experiencia add(Experiencia e) {
	        return repositorio.save(e);
	    }

	    @Override
	    public Experiencia edit(Experiencia e) {
	        return repositorio.save(e);
	    }

	    @Override
	    public Experiencia delete(int id) {
	    	Experiencia e=repositorio.findById(id);
	        if(e!=null) {
	        	repositorio.delete(e);
	        }
	       return e;
	    }
}
