package com.proyecto_integrador.proyecto_integrador.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_integrador.proyecto_integrador.model.Banner;
import com.proyecto_integrador.proyecto_integrador.repository.BannerRepository;
import com.proyecto_integrador.proyecto_integrador.service.BannerService;

@Service
public class BannerServiceImp implements BannerService {
    @Autowired
    private BannerRepository repositorio;
    
    @Override
    public List<Banner>listar(){
       return repositorio.findAll(); 
    }

    @Override
    public Banner listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Banner edit(Banner b) {
        return repositorio.save(b);
    }
    
    @Override
    public Banner add(Banner b) {
        return repositorio.save(b);
    }

    @Override
    public Banner delete(int id) {
        Banner b=repositorio.findById(id);
        if(b!=null) {
        	repositorio.delete(b);
        }
       return b;
    }
}