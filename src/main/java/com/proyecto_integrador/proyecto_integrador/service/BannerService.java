package com.proyecto_integrador.proyecto_integrador.service;

import java.util.List;
import com.proyecto_integrador.proyecto_integrador.model.Banner;

public interface BannerService {
    
    List<Banner>listar();
    Banner add(Banner b);
    Banner listarId(int id);
    Banner edit(Banner b);
    Banner delete(int id);
}
