package com.essentials.demo.models.service;

import com.essentials.demo.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario registrar(Usuario u);
}
