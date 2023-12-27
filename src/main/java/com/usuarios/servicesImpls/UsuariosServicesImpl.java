package com.usuarios.servicesImpls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.usuarios.Dtos.UsuarioCreateDto;
import com.usuarios.Dtos.UsuarioDtoList;
import com.usuarios.services.IUsuarioService;

@Service
public class UsuariosServicesImpl implements IUsuarioService{

	@Override
	public UsuarioCreateDto crearUsuario(UsuarioCreateDto nuevoUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioDtoList> listarUsuarios() {
		// Aqui va la logica para desarrollar y conectarnos a la Db para traer todos los usuarios
		return null;
	}

}
