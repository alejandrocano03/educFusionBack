package com.educfusion.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "categoria_centros_educativos")
public class CategoriaCentroEducativo {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Categoria")
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Descripcion_Breve")
    private String descripcionBreve;

    @Column(name = "Subcategorias")
    private String subcategorias;
    
    //Getters y Setters
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionBreve() {
		return descripcionBreve;
	}

	public void setDescripcionBreve(String descripcionBreve) {
		this.descripcionBreve = descripcionBreve;
	}

	public String getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(String subcategorias) {
		this.subcategorias = subcategorias;
	}
}
