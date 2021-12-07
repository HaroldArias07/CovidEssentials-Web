package com.essentials.demo.models.service;

import com.essentials.demo.models.entity.Usuarios;

public interface IUsuarioService {
	public Usuarios findByUsername(String username);
	public Usuarios registrar(Usuarios u);
}
