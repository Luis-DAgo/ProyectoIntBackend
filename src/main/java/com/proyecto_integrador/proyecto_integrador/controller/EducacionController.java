package com.proyecto_integrador.proyecto_integrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_integrador.proyecto_integrador.model.Educacion;
import com.proyecto_integrador.proyecto_integrador.service.EducacionService;


@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/educacion")
public class EducacionController {
	 @Autowired
	    EducacionService service;
	    @GetMapping
	    public List<Educacion>listar(){
	        return service.listar();
	    }
	    @PostMapping
	    public Educacion agregar(@RequestBody Educacion e) {
	    	return service.add(e);
	    }
	    @GetMapping(path= {"/{id}"})
		public Educacion listarId(@PathVariable("id")int id) {
			return service.listarId(id);
		}
		
		@PutMapping(path= {"/{id}"})
		public Educacion editar(@RequestBody Educacion e,@PathVariable("id")int id) {
			return service.edit(e);
		}
		@DeleteMapping(path= {"/{id}"})
		public Educacion delete(@PathVariable("id")int id) {
			return service.delete(id);
		}

}
