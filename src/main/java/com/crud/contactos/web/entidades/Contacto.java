package com.crud.contactos.web.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactos")
public class Contacto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "correo", nullable = false, length = 50, unique = true)
	private String correo;

	@Column(name = "fono", nullable = false, length = 13)
	private String fono;

	public Contacto() {

	}

	public Contacto(Long id, String nombre, String correo, String fono) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.fono = fono;
	}

	public Contacto(String nombre, String correo, String fono) {
		this.nombre = nombre;
		this.correo = correo;
		this.fono = fono;
	}

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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", fono=" + fono + "]";
	}


}
