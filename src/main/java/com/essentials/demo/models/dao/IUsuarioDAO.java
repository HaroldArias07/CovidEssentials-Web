package com.essentials.demo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.essentials.demo.models.entity.Usuarios;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuarios, Long>{
	public Usuarios findByUsername(String username);
}
