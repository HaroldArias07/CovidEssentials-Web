package com.essentials.demo.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.essentials.demo.models.dao.IUsuarioDAO;
import com.essentials.demo.models.entity.Usuarios;
import com.essentials.demo.models.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	public Usuarios findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}
	
	@Override
	public Usuarios registrar(Usuarios u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return usuarioDao.save(u);
	}
}
