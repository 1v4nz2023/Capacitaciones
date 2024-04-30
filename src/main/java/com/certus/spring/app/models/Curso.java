package com.certus.spring.app.models;

import java.util.List;

public class Curso {
	private String nombreCurso;
	private Integer duracion;
	private List<String>  temas;
	private Double calificacion;
	private Double costoCurso;
	
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public List<String> getTemas() {
		return temas;
	}
	public void setTemas(List<String> temas) {
		this.temas = temas;
	}
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public Double getCostoCurso() {
		return costoCurso;
	}
	public void setCostoCurso(Double costoCurso) {
		this.costoCurso = costoCurso;
	}
    
}
