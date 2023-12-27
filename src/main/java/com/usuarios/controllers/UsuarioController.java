package com.usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.Dtos.UsuarioCreateDto;
import com.usuarios.Dtos.UsuarioDto;
import com.usuarios.services.IUsuarioService;

@RestController // http://localhost:8090/api/v1/usuarios
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

	@Autowired
	IUsuarioService usuarioService;

	@PostMapping("crear-usuario") // http://localhost:8090/api/v1/usuarios/crear-usuario
	public UsuarioCreateDto crearUsuario(@RequestBody UsuarioCreateDto usuario) {

		// esta pendiente el desarrollo de la interfaz de servicio
		UsuarioCreateDto response = usuarioService.crearUsuario(usuario);

		System.out.println(usuario.toString());
		return usuario;
	}

	@PostMapping("/login") // http://localhost:8090/api/v1/usuarios/login
	public String crearUsuario(@RequestBody UsuarioDto usuarioLogin) {
		System.out.println(usuarioLogin.toString());
		return "usuario resibido correctamente dejame evaluarlo.";
	}
}
