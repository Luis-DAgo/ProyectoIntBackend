package com.proyecto_integrador.proyecto_integrador.security.controller;

import java.util.*;
import java.util.HashSet;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto_integrador.proyecto_integrador.security.dto.JwtDto;
import com.proyecto_integrador.proyecto_integrador.security.dto.LoginUsuario;
import com.proyecto_integrador.proyecto_integrador.security.dto.NuevoUsuario;
import com.proyecto_integrador.proyecto_integrador.security.entity.Rol;
import com.proyecto_integrador.proyecto_integrador.security.entity.User;
import com.proyecto_integrador.proyecto_integrador.security.enums.RolNombre;
import com.proyecto_integrador.proyecto_integrador.security.jwt.JwtProvider;
import com.proyecto_integrador.proyecto_integrador.security.service.RolService;
import com.proyecto_integrador.proyecto_integrador.security.service.UsuarioService;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
	@Autowired
	PasswordEncoder passwordEncorder;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	RolService rolService;
	@Autowired
	JwtProvider jwtProvider;

	@PostMapping("/nuevo")
	public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult){
		if(bindingResult.hasErrors())
			return new ResponseEntity(new Mensaje("Campo mal puesto o email invalido"),HttpStatus.BAD_REQUEST);
		if(usuarioService.existsByNombreUsuario(nuevoUsuario.getNombreUsuario()))
			return new ResponseEntity(new Mensaje("Este nombre de usuario ya existe"),HttpStatus.BAD_REQUEST);
		if(usuarioService.existsByEmail(nuevoUsuario.getEmail()))
			return new ResponseEntity(new Mensaje("Este email ya existe"),HttpStatus.BAD_REQUEST);
		
		User usuario = new User(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(),
				nuevoUsuario.getEmail(), passwordEncorder.encode(nuevoUsuario.getPassword()));
		
		Set<Rol> roles = new HashSet<>();
		roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
		
		if(nuevoUsuario.getRoles().contains("Admin")) {
			roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
			usuario.setRoles(roles);
			usuarioService.save(usuario);
		}
		return new ResponseEntity(new Mensaje("Usuario guardado"),HttpStatus.CREATED);
	} 
	
	@PostMapping("/login")
	public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
			if(bindingResult.hasErrors())
				return new ResponseEntity(new Mensaje("Campos mal puestos"),HttpStatus.BAD_REQUEST);
			
			Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			String jwt = jwtProvider.GenerateToken(authentication);
			
			UserDetails userDetails = (UserDetails) authentication.getPrincipal(); 
			
			JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
			
			return new ResponseEntity(jwtDto, HttpStatus.OK); 
	}
}
