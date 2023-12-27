package com.usuarios.Dtos;

public class UsuarioDtoList {

	private String nombre;
	private String email;
	private String nombreUsuario;
	private int edad;

	public UsuarioDtoList() {

	}

	public UsuarioDtoList(String nombre, String email, String nombreUsuario, int edad) {

		this.nombre = nombre;
		this.email = email;
		this.nombreUsuario = nombreUsuario;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "UsuarioDtoList [nombre=" + nombre + ", email=" + email + ", nombreUsuario=" + nombreUsuario + ", edad="
				+ edad + "]";
	}

}
