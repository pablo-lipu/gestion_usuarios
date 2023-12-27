package com.usuarios.Dtos;

public class UsuarioDto {

	private String correo;
	private String pass;

	public UsuarioDto() {
		super();
	}

	public UsuarioDto(String correo, String pass) {

		this.correo = correo;
		this.pass = pass;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UsuarioDto [correo=" + correo + ", pass=" + pass + "]";
	}

}
