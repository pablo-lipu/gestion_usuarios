package com.usuarios.Dtos;

public class UsuarioCreateDto {

	private String nombre;
	private String apellidoMat;
	private String apellidoPat;
	private String email;
	private String nombreUsuario;
	private String contraseña;

	public UsuarioCreateDto() {

	}

	public UsuarioCreateDto(String nombre, String apellidoMat, String apellidoPat, String email, String nombreUsuario,
			String contraseña) {
		this.nombre = nombre;
		this.apellidoMat = apellidoMat;
		this.apellidoPat = apellidoPat;
		this.email = email;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "UsuarioCreateDto [nombre=" + nombre + ", apellidoMat=" + apellidoMat + ", apellidoPat=" + apellidoPat
				+ ", email=" + email + ", nombreUsuario=" + nombreUsuario + ", contraseña=" + contraseña + "]\n";
	}

}
