package com.certus.spring.app.models;

import java.util.Date;
import java.util.List;

public class Programa extends Frecuencia{

	
	private String nombrePrograma;
	private int duracion;
	private int nroVacantes;
	private Date fechaInicio;
	private Date fechaFin;
	private Double promedioFinal;
	private boolean entregarDiploma;
	private List<Curso> curso;
	private List<Alumno> alumnos;
	private List<String> reseñas;
	private Double costoPrograma;
	public String getNombrePrograma() {
		return nombrePrograma;
	}
	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getNroVacantes() {
		return nroVacantes;
	}
	public void setNroVacantes(int nroVacantes) {
		this.nroVacantes = nroVacantes;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Double getPromedioFinal() {
		return promedioFinal;
	}
	public void setPromedioFinal(Double promedioFinal) {
		this.promedioFinal = promedioFinal;
	}
	public boolean isEntregarDiploma() {
		return entregarDiploma;
	}
	public void setEntregarDiploma(boolean entregarDiploma) {
		this.entregarDiploma = entregarDiploma;
	}
	public List<Curso> getCurso() {
		return curso;
	}
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public List<String> getReseñas() {
		return reseñas;
	}
	public void setReseñas(List<String> reseñas) {
		this.reseñas = reseñas;
	}
	public Double getCostoPrograma() {
		return costoPrograma;
	}
	public void setCostoPrograma(Double costoPrograma) {
		this.costoPrograma = costoPrograma;
	}
	
	
	
}
