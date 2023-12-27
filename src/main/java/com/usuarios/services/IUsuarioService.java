package com.usuarios.services;

import java.util.List;

import com.usuarios.Dtos.UsuarioCreateDto;
import com.usuarios.Dtos.UsuarioDtoList;

public interface IUsuarioService {
	
	public UsuarioCreateDto crearUsuario(UsuarioCreateDto nuevoUsuario);
	
	public List<UsuarioDtoList> listarUsuarios();
	
}
