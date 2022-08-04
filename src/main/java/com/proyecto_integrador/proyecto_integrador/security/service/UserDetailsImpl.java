package com.proyecto_integrador.proyecto_integrador.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.proyecto_integrador.proyecto_integrador.security.entity.User;
import com.proyecto_integrador.proyecto_integrador.security.entity.UsuarioPrincipal;

public class UserDetailsImpl implements UserDetailsService{
	@Autowired
	UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		User usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
		return UsuarioPrincipal.build(usuario);
	}

}
