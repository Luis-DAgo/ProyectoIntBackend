package com.proyecto_integrador.proyecto_integrador.model;

import javax.persistence.*;

@Entity
@Table(name="banner")
public class Banner {
	@Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String img;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
    
    

}
