package com.educfusion.demo.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resultado_academico")
public class ResultadoAcademico {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Resultado")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_Centro")
    private CentroEducativo centro;

    @Column(name = "Año_Academico")
    private Integer añoAcademico;

    @Column(name = "Nivel_Educativo")
    private String nivelEducativo;

    @Column(name = "Datos_Especificos_Rendimiento")
    private String datosEspecificosRendimiento;

    //Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CentroEducativo getCentro() {
		return centro;
	}

	public void setCentro(CentroEducativo centro) {
		this.centro = centro;
	}

	public Integer getAñoAcademico() {
		return añoAcademico;
	}

	public void setAñoAcademico(Integer añoAcademico) {
		this.añoAcademico = añoAcademico;
	}

	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}

	public String getDatosEspecificosRendimiento() {
		return datosEspecificosRendimiento;
	}

	public void setDatosEspecificosRendimiento(String datosEspecificosRendimiento) {
		this.datosEspecificosRendimiento = datosEspecificosRendimiento;
	}
    
    
}
