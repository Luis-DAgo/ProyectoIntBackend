package com.proyecto_integrador.proyecto_integrador.repository;

import java.util.List;
import com.proyecto_integrador.proyecto_integrador.model.Banner;

import org.springframework.data.repository.Repository;

public interface BannerRepository extends Repository<Banner, Integer>{
    List<Banner>findAll();
    Banner findById(int id);
    Banner save(Banner b);
    void delete(Banner b);
}
