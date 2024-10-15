package com.educfusion.demo.models;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "informe")
public class Informe {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Informe")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_Centro")
    private CentroEducativo centro;

    @Column(name = "Tipo_Informe")
    private String tipoInforme;

    @Column(name = "Datos_Incluidos")
    private String datosIncluidos;

    @Column(name = "Fecha_Generacion")
    @Temporal(TemporalType.DATE)
    private Date fechaGeneracion;

    @ManyToOne
    @JoinColumn(name = "Autor_Informe")
    private Usuario autorInforme;
    
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

	public String getTipoInforme() {
		return tipoInforme;
	}

	public void setTipoInforme(String tipoInforme) {
		this.tipoInforme = tipoInforme;
	}

	public String getDatosIncluidos() {
		return datosIncluidos;
	}

	public void setDatosIncluidos(String datosIncluidos) {
		this.datosIncluidos = datosIncluidos;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public Usuario getAutorInforme() {
		return autorInforme;
	}

	public void setAutorInforme(Usuario autorInforme) {
		this.autorInforme = autorInforme;
	}
    
    
}
