package com.proyecto_integrador.proyecto_integrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_integrador.proyecto_integrador.model.Experiencia;
import com.proyecto_integrador.proyecto_integrador.service.ExperienciaService;


@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
	 @Autowired
	    ExperienciaService service;
	    @GetMapping
	    public List<Experiencia>listar(){
	        return service.listar();
	    }
	    @PostMapping
	    public Experiencia agregar(@RequestBody Experiencia e) {
	    	return service.add(e);
	    }
	    @GetMapping(path= {"/{id}"})
		public Experiencia listarId(@PathVariable("id")int id) {
			return service.listarId(id);
		}
		
		@PutMapping(path= {"/{id}"})
		public Experiencia editar(@RequestBody Experiencia e,@PathVariable("id")int id) {
			return service.edit(e);
		}
		@DeleteMapping(path= {"/{id}"})
		public Experiencia delete(@PathVariable("id")int id) {
			return service.delete(id);
		}
}
