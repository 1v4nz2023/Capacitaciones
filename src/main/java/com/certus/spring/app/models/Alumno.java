package com.certus.spring.app.models;

import java.util.List;

public class Alumno extends Persona {
	
	private String codAlumno;
	private List<Programa> programas;
	private List<Curso> curso;
	private boolean activo;
	public String getCodAlumno() {
		return codAlumno;
	}
	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}
	public List<Programa> getProgramas() {
		return programas;
	}
	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}
	public List<Curso> getCurso() {
		return curso;
	}
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

}
