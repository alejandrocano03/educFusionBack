package com.educfusion.demo.models;

import jakarta.persistence.*;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mapa_interactivo")
public class MapaInteractivo {
	 	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Mapa")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ID_Centro")
	private CentroEducativo centro;

	@Column(name = "Coordenadas_Geograficas")
	private String coordenadasGeograficas;

	@Column(name = "Parametros_Zoom")
	private String parametrosZoom;

	@Column(name = "Parametros_Centro")
	private String parametrosCentro;

	@Column(name = "Capas_Detalles")
	private String capasDetalles;
	
	
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

	public String getCoordenadasGeograficas() {
		return coordenadasGeograficas;
	}

	public void setCoordenadasGeograficas(String coordenadasGeograficas) {
		this.coordenadasGeograficas = coordenadasGeograficas;
	}

	public String getParametrosZoom() {
		return parametrosZoom;
	}

	public void setParametrosZoom(String parametrosZoom) {
		this.parametrosZoom = parametrosZoom;
	}

	public String getParametrosCentro() {
		return parametrosCentro;
	}

	public void setParametrosCentro(String parametrosCentro) {
		this.parametrosCentro = parametrosCentro;
	}

	public String getCapasDetalles() {
		return capasDetalles;
	}

	public void setCapasDetalles(String capasDetalles) {
		this.capasDetalles = capasDetalles;
	}	
}
