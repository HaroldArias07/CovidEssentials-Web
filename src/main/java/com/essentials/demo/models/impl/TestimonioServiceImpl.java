package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.ITestimonioDAO;
import com.essentials.demo.models.entity.Testimonios;
import com.essentials.demo.models.service.ITestimonioService;

@Service
public class TestimonioServiceImpl implements ITestimonioService {

	@Autowired
	private ITestimonioDAO testimonioDao;
		
	@Override
	public List<Testimonios> listar() {
		return (List<Testimonios>)testimonioDao.findAll();
	}

	@Override
	public Optional<Testimonios> listarId(int id_testimonio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Testimonios ts) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id_testimonio) {
		// TODO Auto-generated method stub
		
	}

}
