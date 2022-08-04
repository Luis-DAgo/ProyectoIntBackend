package com.proyecto_integrador.proyecto_integrador.service;

import java.util.List;

import com.proyecto_integrador.proyecto_integrador.model.Educacion;


public interface EducacionService {

	List<Educacion>listar();
	Educacion listarId(int id);
	Educacion add(Educacion e);
	Educacion edit(Educacion e);
	Educacion delete(int id);
}
