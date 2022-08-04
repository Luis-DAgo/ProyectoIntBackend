package com.proyecto_integrador.proyecto_integrador.model;

import javax.persistence.*;

@Entity
@Table(name="educacion")
public class Educacion {
	@Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column
	private String tituloedu;
	@Column
	private String institucionedu;
	@Column
	private String fechaedu;
	@Column
	private String imagenedu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTituloedu() {
		return tituloedu;
	}
	public void setTituloedu(String tituloedu) {
		this.tituloedu = tituloedu;
	}
	public String getInstitucionedu() {
		return institucionedu;
	}
	public void setInstitucionedu(String institucionedu) {
		this.institucionedu = institucionedu;
	}
	public String getFechaedu() {
		return fechaedu;
	}
	public void setFechaedu(String fechaedu) {
		this.fechaedu = fechaedu;
	}
	public String getImagenedu() {
		return imagenedu;
	}
	public void setImagenedu(String imagenedu) {
		this.imagenedu = imagenedu;
	}
	
}
