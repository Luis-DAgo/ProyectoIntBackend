package com.proyecto_integrador.proyecto_integrador.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_integrador.proyecto_integrador.model.Conocimiento;
import com.proyecto_integrador.proyecto_integrador.repository.ConocimientoRepository;
import com.proyecto_integrador.proyecto_integrador.service.ConocimientoService;

@Service
public class ConocimientoServiceImp implements ConocimientoService {
	  @Autowired
	    private ConocimientoRepository repositorio;
	    
	    @Override
	    public List<Conocimiento>listar(){
	       return repositorio.findAll(); 
	    }

	    @Override
	    public Conocimiento listarId(int id) {
	        return repositorio.findById(id);
	    }

	    @Override
	    public Conocimiento add(Conocimiento c) {
	        return repositorio.save(c);
	    }

	    @Override
	    public Conocimiento edit(Conocimiento c) {
	        return repositorio.save(c);
	    }

	    @Override
	    public Conocimiento delete(int id) {
	    	Conocimiento c=repositorio.findById(id);
	        if(c!=null) {
	        	repositorio.delete(c);
	        }
	       return c;
	    }
}
