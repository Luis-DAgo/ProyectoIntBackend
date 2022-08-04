package com.proyecto_integrador.proyecto_integrador.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.proyecto_integrador.proyecto_integrador.model.Experiencia;


public interface ExperienciaRepository extends Repository<Experiencia, Integer> {
	List<Experiencia>findAll();
	Experiencia findById(int id);
	Experiencia save(Experiencia e);
    void delete(Experiencia e);
}
