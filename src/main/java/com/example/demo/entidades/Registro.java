package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.demo.servicios.RegistroService;

@Entity
public class Registro {
	
	@Id
	private int id;
	
	
	private String apellidos;
	private String correo;
	private String direccion;
	private Long identificacion;
	private Long movil;
	private Integer municipio_id;
	private String nombres;
	
	
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
	public Integer getMunicipio_id() {
		return municipio_id;
	}
	public void setMunicipio_id(Integer municipio_id) {
		this.municipio_id = municipio_id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	@Override
	public String toString() {
		return "Registro [id=" + id + ", apellidos=" + apellidos + ", correo=" + correo + ", direccion=" + direccion
				+ ", identificacion=" + identificacion + ", movil=" + movil + ", municipio_id=" + municipio_id
				+ ", nombres=" + nombres + "]";
	}
	
	

}
