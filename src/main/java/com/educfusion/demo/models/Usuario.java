package com.educfusion.demo.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Usuario")
	private Integer id;

	@Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Apellido", nullable = false)
    private String apellido;

    @Column(name = "Correo_Electronico", unique = true, nullable = false)
    private String correoElectronico;

    @Column(name = "Contraseña_Cifrada", nullable = false)
    private String contraseñaCifrada;

    @Column(name = "Rol", nullable = false)
    private String rol;

    @Column(name = "Fecha_Registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @Column(name = "Ultima_Fecha_Acceso")
    @Temporal(TemporalType.DATE)
    private Date ultimaFechaAcceso;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContraseñaCifrada() {
		return contraseñaCifrada;
	}

	public void setContraseñaCifrada(String contraseñaCifrada) {
		this.contraseñaCifrada = contraseñaCifrada;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getUltimaFechaAcceso() {
		return ultimaFechaAcceso;
	}

	public void setUltimaFechaAcceso(Date ultimaFechaAcceso) {
		this.ultimaFechaAcceso = ultimaFechaAcceso;
	}

	

    
}
