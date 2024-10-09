package com.keepcoding.appweb.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 50)
	private String nombre;
	@Column(nullable = false, length = 50)
	private String apellido;
	@Column(nullable = false, length = 50, unique = true)
	private String email;
	@Column(nullable = false, length = 50, unique = true)
	private int telefono;
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int teléfono) {
		this.telefono = teléfono;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
