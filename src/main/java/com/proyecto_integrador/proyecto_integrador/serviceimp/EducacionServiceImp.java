package com.proyecto_integrador.proyecto_integrador.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_integrador.proyecto_integrador.model.Educacion;
import com.proyecto_integrador.proyecto_integrador.repository.EducacionRepository;
import com.proyecto_integrador.proyecto_integrador.service.EducacionService;

@Service
public class EducacionServiceImp implements EducacionService{
	  @Autowired
	    private EducacionRepository repositorio;
	    
	    @Override
	    public List<Educacion>listar(){
	       return repositorio.findAll(); 
	    }

	    @Override
	    public Educacion listarId(int id) {
	        return repositorio.findById(id);
	    }

	    @Override
	    public Educacion add(Educacion e) {
	        return repositorio.save(e);
	    }

	    @Override
	    public Educacion edit(Educacion e) {
	        return repositorio.save(e);
	    }

	    @Override
	    public Educacion delete(int id) {
	    	Educacion e=repositorio.findById(id);
	        if(e!=null) {
	        	repositorio.delete(e);
	        }
	       return e;
	    }
}
