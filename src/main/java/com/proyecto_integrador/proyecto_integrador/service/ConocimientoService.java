package com.proyecto_integrador.proyecto_integrador.service;

import java.util.List;

import com.proyecto_integrador.proyecto_integrador.model.Conocimiento;

public interface ConocimientoService {
	List<Conocimiento>listar();
	Conocimiento listarId(int id);
	Conocimiento add(Conocimiento c);
	Conocimiento edit(Conocimiento c);
	Conocimiento delete(int id);
}
