package com.proyecto_integrador.proyecto_integrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_integrador.proyecto_integrador.model.Usuario;
import com.proyecto_integrador.proyecto_integrador.service.UsuarioService;

@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/usuario"})

public class UsuarioController {
    @Autowired
    UsuarioService service;
    @GetMapping
    public List<Usuario>listar(){
        return service.listar();
    }
    @PostMapping
    public Usuario agregar(@RequestBody Usuario u) {
    	return service.add(u);
    }
    @GetMapping(path= {"/{id}"})
	public Usuario listarId(@PathVariable("id")int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/{id}"})
	public Usuario editar(@RequestBody Usuario u,@PathVariable("id")int id) {
		return service.edit(u);
	}
	@DeleteMapping(path= {"/{id}"})
	public Usuario delete(@PathVariable("id")int id) {
		return service.delete(id);
	}

}
