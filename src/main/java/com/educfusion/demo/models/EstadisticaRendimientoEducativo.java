package com.educfusion.demo.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estadistica_rendimiento_educativo")
public class EstadisticaRendimientoEducativo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Estadistica")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_Centro")
    private CentroEducativo centro;

    @Column(name = "Año_Academico")
    private Integer anoAcademico;

    @Column(name = "Nivel_Educativo")
    private String nivelEducativo;

    @Column(name = "Numero_Alumnos")
    private Integer numeroAlumnos;

    @Column(name = "Promedio_Calificaciones")
    private Double promedioCalificaciones;

    @Column(name = "Numero_Alumnos_NEEs")
    private Integer numeroAlumnosNEEs;

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

	public Integer getAnoAcademico() {
		return anoAcademico;
	}

	public void setAnoAcademico(Integer anoAcademico) {
		this.anoAcademico = anoAcademico;
	}

	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}

	public Integer getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(Integer numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	public Double getPromedioCalificaciones() {
		return promedioCalificaciones;
	}

	public void setPromedioCalificaciones(Double promedioCalificaciones) {
		this.promedioCalificaciones = promedioCalificaciones;
	}

	public Integer getNumeroAlumnosNEEs() {
		return numeroAlumnosNEEs;
	}

	public void setNumeroAlumnosNEEs(Integer numeroAlumnosNEEs) {
		this.numeroAlumnosNEEs = numeroAlumnosNEEs;
	}

	public String getDatosEspecificosRendimiento() {
		return datosEspecificosRendimiento;
	}

	public void setDatosEspecificosRendimiento(String datosEspecificosRendimiento) {
		this.datosEspecificosRendimiento = datosEspecificosRendimiento;
	}

    
}
