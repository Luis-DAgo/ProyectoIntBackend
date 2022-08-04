package com.proyecto_integrador.proyecto_integrador.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.proyecto_integrador.proyecto_integrador.model.Proyecto;


public interface ProyectoRepository extends Repository<Proyecto, Integer>  {
	List<Proyecto>findAll();
	Proyecto findById(int id);
	Proyecto save(Proyecto p);
    void delete(Proyecto p);
}
