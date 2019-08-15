package com.ejemplo.rest.rest.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Assert Solutions S.A.S <info@assertsolutions.com> <br/>
 *         Date: 10/04/2018 9:04:30 a.m.
 *
 */
@JsonAutoDetect
@JsonSerialize
public class RequestDTO implements Serializable {

	private static final long serialVersionUID = 6872117570224011584L;

	@JsonProperty(required = true)
	private String nombre;
	@JsonProperty
	private String apellido;
	@JsonProperty
	private String username;
	@JsonProperty
	private String contrasena;

	public RequestDTO() {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
