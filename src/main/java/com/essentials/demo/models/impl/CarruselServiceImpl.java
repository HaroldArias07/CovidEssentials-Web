package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.ICarruselDAO;
import com.essentials.demo.models.entity.Carrusels;
import com.essentials.demo.models.service.ICarruselService;

@Service
public class CarruselServiceImpl implements ICarruselService {

	@Autowired
	private ICarruselDAO carruselDao;
		
	@Override
	public List<Carrusels> listar() {
		return (List<Carrusels>)carruselDao.findAll();
	}

	@Override
	public Optional<Carrusels> listarId(int id_carrusel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Carrusels c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id_carrusel) {
		// TODO Auto-generated method stub
		
	}

}
