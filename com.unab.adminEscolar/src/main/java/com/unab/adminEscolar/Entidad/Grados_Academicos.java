package com.unab.adminEscolar.Entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "grados_academicos")
public class Grados_Academicos implements Serializable{

	private static final long serialVersionUID=1L;
	
	public Long getIdGradoAcademico() {
		return idGradoAcademico;
	}
	public void setIdGradoAcademico(Long idGradoAcademico) {
		this.idGradoAcademico = idGradoAcademico;
	}
	public String getNombre_GradoAcad() {
		return Nombre_GradoAcad;
	}
	public void setNombre_GradoAcad(String nombre_GradoAcad) {
		Nombre_GradoAcad = nombre_GradoAcad;
	}
	public Date getUltima_Modificacion() {
		return Ultima_Modificacion;
	}
	public void setUltima_Modificacion(Date ultima_Modificacion) {
		Ultima_Modificacion = ultima_Modificacion;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGradoAcademico;
	
	private String Nombre_GradoAcad;
	private Date Ultima_Modificacion;
	private int Estado;
	
	
	
	
}
