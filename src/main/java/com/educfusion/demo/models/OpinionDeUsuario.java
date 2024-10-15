package com.educfusion.demo.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "opinion_de_usuario")
public class OpinionDeUsuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Opinion")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_Usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_Centro")
    private CentroEducativo centro;

    @Column(name = "Fecha_Opinion")
    @Temporal(TemporalType.DATE)
    private Date fechaOpinion;

    @Column(name = "Comentario")
    private String comentario;

    @Column(name = "Valoracion")
    private Integer valoracion;

    @Column(name = "Ubicacion_Comentario")
    private String ubicacionComentario;

    //Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public CentroEducativo getCentro() {
		return centro;
	}

	public void setCentro(CentroEducativo centro) {
		this.centro = centro;
	}

	public Date getFechaOpinion() {
		return fechaOpinion;
	}

	public void setFechaOpinion(Date fechaOpinion) {
		this.fechaOpinion = fechaOpinion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	public String getUbicacionComentario() {
		return ubicacionComentario;
	}

	public void setUbicacionComentario(String ubicacionComentario) {
		this.ubicacionComentario = ubicacionComentario;
	}    
}
