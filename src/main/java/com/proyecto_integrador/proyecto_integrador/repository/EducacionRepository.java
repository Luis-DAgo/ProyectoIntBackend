package com.proyecto_integrador.proyecto_integrador.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import com.proyecto_integrador.proyecto_integrador.model.Educacion;


public interface EducacionRepository extends Repository<Educacion, Integer> {
	List<Educacion>findAll();
	Educacion findById(int id);
	Educacion save(Educacion e);
    void delete(Educacion e);
}

