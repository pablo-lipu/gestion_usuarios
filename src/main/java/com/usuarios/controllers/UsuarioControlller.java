package com.usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.Dtos.UsuarioCreateDto;

import com.usuarios.services.IUsuarioService;

@RestController // http://localhost:8090/api/usuarios/btener-nombre
@RequestMapping("/api/usuarios")
public class UsuarioControlller {

	@Autowired
	IUsuarioService usuarioService;

	@PostMapping("create-usuario") // http://localhost:8090/api/usuarios/create-usuario
	public UsuarioCreateDto crearUsuario(@RequestBody UsuarioCreateDto usuario) {
		
		UsuarioCreateDto response = usuarioService.crearUsuario(usuario);

		System.out.println(usuario.toString());
		return usuario;
	}
}
