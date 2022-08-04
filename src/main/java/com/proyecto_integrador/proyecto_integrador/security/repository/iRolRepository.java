package com.proyecto_integrador.proyecto_integrador.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto_integrador.proyecto_integrador.security.entity.Rol;
import com.proyecto_integrador.proyecto_integrador.security.enums.RolNombre;

@Repository
public interface iRolRepository extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
