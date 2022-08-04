package com.proyecto_integrador.proyecto_integrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_integrador.proyecto_integrador.model.Proyecto;
import com.proyecto_integrador.proyecto_integrador.service.ProyectoService;


@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	 @Autowired
	    ProyectoService service;
	    @GetMapping
	    public List<Proyecto>listar(){
	        return service.listar();
	    }
	    @PostMapping
	    public Proyecto agregar(@RequestBody Proyecto p) {
	    	return service.add(p);
	    }
	    @GetMapping(path= {"/{id}"})
		public Proyecto listarId(@PathVariable("id")int id) {
			return service.listarId(id);
		}
		
		@PutMapping(path= {"/{id}"})
		public Proyecto editar(@RequestBody Proyecto p,@PathVariable("id")int id) {
			return service.edit(p);
		}
		@DeleteMapping(path= {"/{id}"})
		public Proyecto delete(@PathVariable("id")int id) {
			return service.delete(id);
		}
}
