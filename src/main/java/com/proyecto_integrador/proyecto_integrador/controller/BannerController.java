package com.proyecto_integrador.proyecto_integrador.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_integrador.proyecto_integrador.model.Banner;
import com.proyecto_integrador.proyecto_integrador.service.BannerService;

@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/banner"})

public class BannerController {
    @Autowired
    BannerService service;
    @GetMapping
    public List<Banner>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Banner agregar(@RequestBody Banner b) {
    	return service.add(b);
    }
    @GetMapping(path= {"/{id}"})
	public Banner listarId(@PathVariable("id")int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/{id}"})
	public Banner editar(@RequestBody Banner b,@PathVariable("id")int id) {
		return service.edit(b);
	}
	@DeleteMapping(path= {"/{id}"})
	public Banner delete(@PathVariable("id")int id) {
		return service.delete(id);
	}

}