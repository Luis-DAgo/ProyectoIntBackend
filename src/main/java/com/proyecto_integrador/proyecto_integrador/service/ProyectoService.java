package com.proyecto_integrador.proyecto_integrador.service;

import java.util.List;
import com.proyecto_integrador.proyecto_integrador.model.Proyecto;


public interface ProyectoService {
	List<Proyecto>listar();
	Proyecto listarId(int id);
	Proyecto add(Proyecto p);
	Proyecto edit(Proyecto p);
	Proyecto delete(int id);
}
