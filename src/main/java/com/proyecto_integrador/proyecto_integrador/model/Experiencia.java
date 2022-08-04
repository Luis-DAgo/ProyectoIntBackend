package com.proyecto_integrador.proyecto_integrador.model;

import javax.persistence.*;

@Entity
@Table(name="experiencia")
public class Experiencia {
	@Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column
	private String empleador;
	@Column
	private String titulopuesto;
	@Column
	private String descripcionpuesto;
	@Column
	private String periodo;
	@Column
	private String imagenemp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpleador() {
		return empleador;
	}
	public void setEmpleador(String empleador) {
		this.empleador = empleador;
	}
	public String getTitulopuesto() {
		return titulopuesto;
	}
	public void setTitulopuesto(String titulopuesto) {
		this.titulopuesto = titulopuesto;
	}
	public String getDescripcionpuesto() {
		return descripcionpuesto;
	}
	public void setDescripcionpuesto(String descripcionpuesto) {
		this.descripcionpuesto = descripcionpuesto;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getImagenemp() {
		return imagenemp;
	}
	public void setImagenemp(String imagenemp) {
		this.imagenemp = imagenemp;
	}
	
	

}
