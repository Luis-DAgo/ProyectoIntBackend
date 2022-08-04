package com.proyecto_integrador.proyecto_integrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_integrador.proyecto_integrador.model.Conocimiento;
import com.proyecto_integrador.proyecto_integrador.service.ConocimientoService;

@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/conocimiento")
public class ConocimientoController {
	 @Autowired
	    ConocimientoService service;
	    @GetMapping
	    public List<Conocimiento>listar(){
	        return service.listar();
	    }
	    @PostMapping
	    public Conocimiento agregar(@RequestBody Conocimiento c) {
	    	return service.add(c);
	    }
	    @GetMapping(path= {"/{id}"})
		public Conocimiento listarId(@PathVariable("id")int id) {
			return service.listarId(id);
		}
		
		@PutMapping(path= {"/{id}"})
		public Conocimiento editar(@RequestBody Conocimiento c,@PathVariable("id")int id) {
			return service.edit(c);
		}
		@DeleteMapping(path= {"/{id}"})
		public Conocimiento delete(@PathVariable("id")int id) {
			return service.delete(id);
		}

}
