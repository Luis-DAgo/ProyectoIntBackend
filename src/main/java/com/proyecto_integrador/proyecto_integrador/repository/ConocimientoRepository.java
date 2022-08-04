package com.proyecto_integrador.proyecto_integrador.repository;
import java.util.List;
import org.springframework.data.repository.Repository;
import com.proyecto_integrador.proyecto_integrador.model.Conocimiento;

public interface ConocimientoRepository  extends Repository<Conocimiento, Integer>{
	List<Conocimiento>findAll();
	Conocimiento findById(int id);
	Conocimiento save(Conocimiento c);
    void delete(Conocimiento c);
}

