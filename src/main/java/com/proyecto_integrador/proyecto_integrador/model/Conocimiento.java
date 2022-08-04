package com.proyecto_integrador.proyecto_integrador.model;

import javax.persistence.*;

@Entity
@Table(name="conocimiento")
public class Conocimiento {
	@Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column
	private int porcentaje;
	@Column
	private String imagencon;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getImagencon() {
		return imagencon;
	}
	public void setImagencon(String imagencon) {
		this.imagencon = imagencon;
	}

	
}
