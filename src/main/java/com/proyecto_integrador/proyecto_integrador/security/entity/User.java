package com.proyecto_integrador.proyecto_integrador.security.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

public class User {
	@Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column
	private String nombre;
	@Column(unique=true)
	private String nombreusuario;
	@Column
	private String email;
	@Column
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="usuario_rol", joinColumns = @JoinColumn(name="usuario_id"),inverseJoinColumns = @JoinColumn(name="rol_id"))
	private Set<Rol> roles = new HashSet<>();

	public User() {
	}
	
	public User(String nombre, String nombreusuario, String email, String password) {
		this.nombre = nombre;
		this.nombreusuario = nombreusuario;
		this.email = email;
		this.password = password;
	}

	public User(String nombre, String nombreusuario, String email, String password, Set<Rol> roles) {
		this.nombre = nombre;
		this.nombreusuario = nombreusuario;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

}
