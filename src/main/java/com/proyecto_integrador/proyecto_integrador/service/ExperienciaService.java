package com.proyecto_integrador.proyecto_integrador.service;

import java.util.List;

import com.proyecto_integrador.proyecto_integrador.model.Experiencia;


public interface ExperienciaService {
	List<Experiencia>listar();
	Experiencia listarId(int id);
	Experiencia add(Experiencia e);
	Experiencia edit(Experiencia e);
	Experiencia delete(int id);
}
