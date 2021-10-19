package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registro2 {
	
	@Id
	private int id;
	
	
	private String apellidos;
	private String correo;
	private String direccion;
	private Long identificacion;
	private Long movil;	
	private String nombres;
	private String nombre_municipio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}
	public Long getMovil() {
		return movil;
	}
	public void setMovil(Long movil) {
		this.movil = movil;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNombre_municipio() {
		return nombre_municipio;
	}
	public void setNombre_municipio(String nombre_municipio) {
		this.nombre_municipio = nombre_municipio;
	}
	@Override
	public String toString() {
		return "Registro2 [id=" + id + ", apellidos=" + apellidos + ", correo=" + correo + ", direccion=" + direccion
				+ ", identificacion=" + identificacion + ", movil=" + movil 
				+ ", nombres=" + nombres + ", nombre_municipio=" + nombre_municipio + "]";
	}
	

}
