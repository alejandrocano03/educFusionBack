package com.educfusion.demo.models;

import jakarta.persistence.*;
import lombok.*;
import com.educfusion.demo.models.CategoriaCentroEducativo;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "centro_educativo")
public class CentroEducativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Centro")
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Tipo_Centro")
    private String tipoCentro;

    @Column(name = "Numero_Alumnos")
    private Integer numeroAlumnos;

    @Column(name = "Numero_Maestros")
    private Integer numeroMaestros;

    @Column(name = "Niveles_Educativos_Ofrecidos")
    private String nivelesEducativosOfrecidos;

    @Column(name = "Coordenadas_Geograficas")
    private String coordenadasGeograficas;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria")
    private CategoriaCentroEducativo categoria;

    @Column(name = "Datos_Rendimiento_Academico")
    private String datosRendimientoAcademico;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoCentro() {
		return tipoCentro;
	}

	public void setTipoCentro(String tipoCentro) {
		this.tipoCentro = tipoCentro;
	}

	public Integer getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(Integer numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

	public Integer getNumeroMaestros() {
		return numeroMaestros;
	}

	public void setNumeroMaestros(Integer numeroMaestros) {
		this.numeroMaestros = numeroMaestros;
	}

	public String getNivelesEducativosOfrecidos() {
		return nivelesEducativosOfrecidos;
	}

	public void setNivelesEducativosOfrecidos(String nivelesEducativosOfrecidos) {
		this.nivelesEducativosOfrecidos = nivelesEducativosOfrecidos;
	}

	public String getCoordenadasGeograficas() {
		return coordenadasGeograficas;
	}

	public void setCoordenadasGeograficas(String coordenadasGeograficas) {
		this.coordenadasGeograficas = coordenadasGeograficas;
	}

	public CategoriaCentroEducativo getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaCentroEducativo categoria) {
		this.categoria = categoria;
	}

	public String getDatosRendimientoAcademico() {
		return datosRendimientoAcademico;
	}

	public void setDatosRendimientoAcademico(String datosRendimientoAcademico) {
		this.datosRendimientoAcademico = datosRendimientoAcademico;
	}
    
    
}
